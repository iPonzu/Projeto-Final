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
}
