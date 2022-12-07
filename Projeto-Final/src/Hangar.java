import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hangar {
    
    private int id;
    private String local;

    private int idAviao;
    

    public Hangar(
        int id,
        String local,
        Aviao aviao
   )throws SQLException{
        this.id = id;
        this.local = local;

        this.idAviao = aviao.getId();
        
     PreparedStatement stmt = DAO.createConnection().prepareStatement(
        "INSERT INTO Hanfar (id, local) VALUES (?, ?)"
    );
    stmt.setInt(1, id);
    stmt.setString(2, local);
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public static void listarHangar() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Hangar;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") +
                "local: " +  rs.getString("local") 
              
            );
        }
    }

    public static void updateHangar(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Hangar SET local = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setString(2, "Casa Branca");
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteLocal(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Hangar WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
        + "Local: " + local + "\n"
        + "Avião: " + this.idAviao + "\n";
 
   }
   
   @Override 
   public boolean equals (Object object){
       if(object == null || !(object instanceof Hangar)){
           return false;
       }
       final Hangar other = (Hangar) object;

       return this.getId() == other.getId();
   }
}