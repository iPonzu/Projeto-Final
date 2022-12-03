public class Companhia {
    
    private int id;
    private String nome;
    private String cnpj;

    public Companhia(
        int id,
        String nome,
        String cnpj
    ){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override 
    public String toString(){
        return "ID: " + id + "\n"
        + "Nome: " + nome + "\n"
        + "CNPJ: " + cnpj + "\n";
    }
}
