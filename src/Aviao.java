import java.util.ArrayList;

public class Aviao extends Aeronave {
    
    private int capacidade;
    private String prefixo;

    private int id_companhia;
    
    public static ArrayList<Aviao> avioes = new ArrayList<>();
    
    public Aviao(
        int id,
        String modelo,
        String marca,
        int capacidade2,
        String prefixo,
        Companhia companhia

    ){
        super(id, modelo, marca);
        this.capacidade = capacidade2;
        this.prefixo = prefixo;
       
      this.id_companhia = companhia.getId();
        
        avioes.add(this);
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    
    public static Aviao getAviaoById(int id) throws Exception{
        for(Aviao aviao : avioes){
            if(aviao.getId() == id){
                return aviao;
            }
        }
        throw new Exception("Avião não encontrado no sistema");
    }
    
    public static void excluir(int id) throws Exception{
        Aviao aviao = getAviaoById(id);
        avioes.remove(aviao);
    }
    
   @Override 
   public String toString(){
       return "Modelo: " + super.getModelo() + "\n"
               + "Marca: " + super.getmarca() + "\n"
               + "Capacidade: " + capacidade + "\n"
               + "Prefixo: " + prefixo + "\n"
               + "Companhia: " + this.id_companhia + "\n";
   }
}