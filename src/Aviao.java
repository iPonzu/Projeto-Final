public class Aviao {
    
    private String modelo;
    private String companhia;

        public Aviao(
            String modelo,
            String companhia

        ){
            this.modelo = modelo;
            this.companhia = companhia;
            
        }

        public String getModelo(){
            return modelo;
        }
        public String getCompanhia(){
            return companhia;
        }
        
        public void setModelo(String modelo) {
            this.modelo = modelo;
            
        }
        public void setCompanhia(String companhia) {
            this.companhia = companhia;
        }
        @Override
        public String toString(){
            return "modelo: " + this.getModelo() + "\n"
            + "companhia: " + this.getCompanhia() + "\n";
        }

}
// class aviao