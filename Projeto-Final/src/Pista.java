import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pista {

    private int id;
    private String numero;
    
    
    
    public Pista(
        int id,
        String numero
    )throws SQLException{
        this.id = id;
        this.numero = numero;
        
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Pista (id, numero ) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero);
        stmt.execute();
        stmt.close();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public static void listarPistas() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Pistas;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
               "Numero: " + rs.getString("numero")
               
            );
        }
    }

    public static void updatePistas(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Pista SET numero = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 1006);
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deletePistas(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Pistas WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
    

    @Override
       public String toString(){
            return "ID: " + id + "\n"
            + "Número: " + numero + "\n";
        }

        @Override 
        public boolean equals (Object object){
            if(object == null || !(object instanceof Pista)){
                return false;
            }
            final Pista other = (Pista) object;
    
            return this.getId() == other.getId();
        }
}