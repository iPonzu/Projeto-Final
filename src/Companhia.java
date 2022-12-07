import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Companhia {
    
    private int id;
    private String nome;
    private String cnpj;

  
    
    public Companhia(
        int id,
        String nome,
        String cnpj
    )throws SQLException{
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Companhia (nome, cnpj ) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setString(3, nome);
        stmt.setString(4, cnpj);
        stmt.execute();
        stmt.close();
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public static void listarCompanhaia() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Companhia;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
                "Nome: " + rs.getInt("nome") +
                "CNPJ: " +  rs.getString("cnpj") 
                
            );
        }
    }

    public static void updateCompanhia(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Companhia SET nome = ?, CNPJ = ? WHERE id = ?;"
        );
        stmt.setString(1, "João");
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteCompanhia(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Companhia WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
    @Override 
   public boolean equals (Object object){
       if(object == null || !(object instanceof Companhia)){
           return false;
       }
       final Companhia other = (Companhia) object;

       return this.getId() == other.getId();
    }
    
    @Override 
    public String toString(){
        return "ID: " + id + "\n"
        + "Nome: " + nome + "\n"
        + "CNPJ: " + cnpj + "\n";
    }
}