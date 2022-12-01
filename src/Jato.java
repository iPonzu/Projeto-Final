public class Jato {
    
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int velocidade;

    public Jato(
        int id,
        String marca,
        String modelo,
        String cor,
        int velocidade
    ){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

}

