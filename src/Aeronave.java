public abstract class Aeronave {
    
    private int id;
    private String modelo;
    private String marca;

    protected Aeronave(
     int id,
     String modelo,
     String marca
    ) {
        this.setId(id);
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }
    public void setId( int id){
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getmarca() {
        return marca;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" +
               "Marca: " + marca + "\n";
    }
}
