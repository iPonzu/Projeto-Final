public class Hangar {
    
    private int id;
    private String local;
    
    private int id_aviao;

    public Hangar(
        int id,
        String local,
        Aviao aviao
    ){
        this.id = id;
        this.local = local;
        this.id_aviao = aviao.getId();
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

}