public class Voo{

    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;


    private int id_pista;
    private int id_aviao;
    private int id_helicoptero;
    private int id_jato;

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
    ){
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.id_aviao = aviao.getId();
        this.id_helicoptero = helicoptero.getId();
        this.id_jato = jato.getId();
        this.id_pista = pista.getId();
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
            + "Avião: " + this.id_aviao + "\n"
            + "Helicoptero: " + this.id_helicoptero + "\n"
            + "Jato: " + this.id_jato + "\n"
            + "Pista: " + this.id_pista + "\n";
    }
}
