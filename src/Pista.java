public class Pista {
    
    public int id;
    public String numero;

    public Pista(
        int id,
        String numero
    ){
        this.id = id;
        this.numero = numero;
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
    public void setNumero(){
        this.numero = numero;
    }
}
