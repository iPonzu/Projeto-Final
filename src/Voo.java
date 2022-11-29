public class Voo {
 
    private String companhia;
    private int voo;
    private String card_embarque;

    public Voo(
        String companhia,
        int voo,
        String card_embarque
    ){
        this.companhia = companhia;
        this.voo = voo;
        this.card_embarque = card_embarque;
    }
    public String getCompanhia(){
        return companhia;
    }
    public int getVoo(){
        return voo;
    }
    public String getCard_embarque(){
        return card_embarque;
    }
    public void setCompanhia(String companhia){
        this.companhia = companhia;
    }
    public void setVoo(int voo){
        this.voo = voo;
    }
    public void setCard_embarque(String card_embarque){
        this.card_embarque = card_embarque;
    }
    @Override
    public String toString(){
        return "companhia: " + this.getCompanhia() + "\n"
        + "voo: " + this.getVoo() + "\n"
        + "Cartão de Embarque" + this.getCard_embarque() + "\n";
    }

}
