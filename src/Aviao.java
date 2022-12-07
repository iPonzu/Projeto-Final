import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aviao extends Aeronave {
    
    private int capacidade;
    private String prefixo;

    private int id_companhia;

    
    public Aviao(
        int id,
        String modelo,
        String marca,
        int capacidade,
        String prefixo,
        int idCompanhia 

    )throws SQLException{
        super(id, modelo, marca);
        this.capacidade = capacidade;
        this.prefixo = prefixo;
       
      this.id_companhia = id_companhia;

      PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Avião (capacidade, prefixo ) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setInt(2, capacidade);
        stmt.setString(3, prefixo);
        stmt.setString(4, modelo);
        stmt.setString(5, marca);
        stmt.execute();
        stmt.close();
        
        
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    public static void listarAvioes() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Avião;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
                "Capacidade: " + rs.getInt("capacidade") +
                "Prefixo: " +  rs.getString("prefixo") +
                "Marca: " + rs.getString("marca") + 
                "Modelo: " + rs.getString("modelo")
            );
        }
    }

    public static void updateAvioes(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Avião SET capacidade = ?, prefixo = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 200);
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteAvioes(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Aviões WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
    
    
   @Override 
   public String toString(){
       return "Modelo: " + super.getModelo() + "\n"
               + "Marca: " + super.getmarca() + "\n"
               + "Capacidade: " + capacidade + "\n"
               + "Prefixo: " + prefixo + "\n"
               + "Companhia: " + this.id_companhia + "\n";
   }
   
   @Override 
   public boolean equals (Object object){
       if(object == null || !(object instanceof Jato)){
           return false;
       }
       final Aviao other = (Aviao) object;

       return this.getId() == other.getId();
    }
}