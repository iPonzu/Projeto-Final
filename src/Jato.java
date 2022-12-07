import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jato extends Aeronave{

    private int velocidade;
    private String cor;
    

    public Jato(

    int id,
    String marca,
    String modelo,
    int velocidade,
    String cor
    )throws SQLException{
        super(id, marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Jato (velocidade, cor ) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setInt(2, velocidade);
        stmt.setString(3, cor);
        stmt.setString(4, modelo);
        stmt.setString(5, marca);
        stmt.execute();
        stmt.close();

    }

    public int getVelocidade(){
        return velocidade;
    }
    public String getCor(){
        return cor;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public static void listarJatos() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Jato;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
                "Velocidade: " + rs.getInt("velocidade") +
                "Cor: " +  rs.getString("cor") +
                "Marca: " + rs.getString("marca") + 
                "Modelo: " + rs.getString("modelo")
            );
        }
    }

    public static void updateJatos(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Jato SET cor = ?, velocidade = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 100);
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteJatos(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Jatos WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
   
    
    @Override
    public String toString(){
        return "ID: " + super.getId() + "\n"
        + "Marca: " + super.getmarca() + "\n"
        + "Modelo: " + super.getModelo() + "\n"
        + "Velocidade: " + velocidade + "\n"
        + "Cor: " + cor;
    }

    @Override 
    public boolean equals (Object object){
        if(object == null || !(object instanceof Jato)){
            return false;
        }
        final Jato other = (Jato) object;

        return this.getId() == other.getId();
    }
}