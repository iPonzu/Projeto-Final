public class Helicoptero {
    
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;

    public Helicoptero(
        int id,
        String marca,
        String modelo,
        String cor,
        int capacidade
    ){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade =  capacidade;
    }
    public int getId(){
        return id;
    }
    public String getMarca(){
        return marca;
    }
    
}
