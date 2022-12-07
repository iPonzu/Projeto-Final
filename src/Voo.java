import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Voo {
    
    private int id;
    private String numero;
    private String data;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;

    private int idAviao;
    private int idPista;
    private int idHelicoptero;
    private int idJato;
    
    

    public Voo(
        int id,
        String numero,
        String data,
        String origem,
        String destino,
        String piloto,
        String copiloto,
        String observacao,
        Aviao aviao,
        Pista pista,
        Helicoptero helicoptero,
        Jato jato
    )throws SQLException{
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idAviao = aviao.getId();
        this.idPista = pista.getId();
        this.idHelicoptero = helicoptero.getId();
        this.idJato = jato.getId();
        
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Jato (velocidade, cor ) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero);
        stmt.setString(3, data);
        stmt.setString(4, origem);
        stmt.setString(5, destino);
        stmt.setString(6, piloto);
        stmt.setString(7, copiloto);
        stmt.setString(8, observacao);
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
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getOrigem(){
        return origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getPiloto(){
        return piloto;
    }
    public void setPiloto(String piloto){
        this.piloto = piloto;
    }
    public String getCopiloto(){
        return copiloto;
    }
    public void setCopiloto(String copiloto){
        this.copiloto = copiloto;
    }
    public String getObservacao(){
        return observacao;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public static void listarVoo() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Voo;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
                "Numero: " + rs.getInt("Numero") +
                "Data: " +  rs.getString("Data") +
                "Origem: " + rs.getString("Origem") + 
                "Destino: " + rs.getString("Destino") + 
                "Piloto: " + rs.getString("Piloto") +
                "Copiloto: " + rs.getString("Copiloto")

            );
        }
    }

    public static void updateVoo(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Voo SET cor = ?, velocidade = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 100);
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteVoo(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Voo WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
   
    
    
    @Override
    public String toString(){
        return "Id: " + id + "\n"
            + "Número: " + numero + "\n"
            + "Data: " + data + "\n"
            + "Origem: " + origem + "\n"
            + "Destino: " + destino + "\n"
            + "Piloto: " + piloto + "\n"
            + "Copiloto: " + copiloto + "\n"
            + "Observação: " + observacao + "\n"
            + "Avião: " + this.idAviao + "\n"
            + "Helicoptero: " + this.idHelicoptero + "\n"
            + "Jato: " + this.idJato + "\n"
            + "Pista: " + this.idPista + "\n";
    }
    @Override 
    public boolean equals (Object object){
        if(object == null || !(object instanceof Voo)){
            return false;
        }
        final Voo other = (Voo) object;

        return this.getId() == other.getId();
    }
}