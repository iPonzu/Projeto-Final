import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int op = 0;

        System.out.println("Seja Bem vindo ao Aeroporto Jatinho Feliz");
        System.out.println("Escolha uma das opções abaixo :) ");

        do{
            System.out.println("==========================");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Avião: ");
            System.out.println("2 - Listar Avião: ");
            System.out.println("3 - Remover Avião: ");
            System.out.println("4 - Cadastrar Helicoptero: ");
            System.out.println("5 - Listar Helicoptero: ");
            System.out.println("6 - Remover Helicoptero: ");
            System.out.println("7 - Cadastrar Jato: ");
            System.out.println("8 - Listar Jato: ");
            System.out.println("9 - Remover Jato: ");
            System.out.println("10 - Cadastrar Companhia: ");
            System.out.println("11 - Listar Companhia: ");
            System.out.println("12 - Remover Companhia: ");
            System.out.println("13 - Cadastrar Voo: ");
            System.out.println("14 - Listar Voo: ");
            System.out.println("15 - Remover Voo: ");
            System.out.println("16 - Cadastrar Hangar: ");
            System.out.println("17 - Listar Hangar: ");
            System.out.println("18 - Remover Hangar: ");
            System.out.println("19 - Cadastrar Pista: ");
            System.out.println("20 - Listar Pista: ");
            System.out.println("21 - Remover Pista: ");
            System.out.println("==========================");
       
            try {
                op = scan.nextInt();
            } catch (Exception e) {
                op = 0;
            }

            switch (op){
                case 1:
                    cadastrarAviao(scan);
                break; 
                case 2:
                    listarAviao();
                    break;  
                case 3:
                    removeAviao(scan);
                    break;
                case 4:
                    cadastrarHelicoptero(scan);
                    break;
                case 5:
                    listarHelicoptero();
                    break;
                case 6:
                    removeAviao(scan);
                    break;
                case 7:
                    cadastrarJato(scan);
                    break;
                case 8:
                    listarJato();
                    break;
                case 9:
                    removerJato(scan);
                    break;
                case 10: 
                    cadastrarCompanhia(scan);
                    break;        
                case 11:
                    listarCompanhia();
                    break;
                case 12:
                    removeCompanhia(scan);
                    break;
                case 13:
                    cadastrarVoo(scan);
                    break;
                case 14:
                    listarVoo();
                    break;
                case 15:
                    removeVoo(scan);
                    break;    
                case 16:
                    cadastrarHangar(scan);
                    break;
                case 17:
                    listarHangar();
                    break;
                case 18:
                    removeHangar(scan);
                    break;
                case 17:
                    cadastrarPista(scan);
                    break;
                case 18:
                    listarPista();
                    break;                
                case 19:
                    removePista(scan);
                    break;
                }       
        } while(op!=0);
        scan.close();
    }
        public static void cadastrarAviao(Scanner scan){
            try {
                System.out.println("Cadastre o Avião: ");
                System.out.println("Digite o ID do avião: ");
                int id = scan.nextInt();
                System.out.println("Digite seu modelo: ");
                String modelo = scan.next();
                System.out.println("Digite a marca: ");
                String marca = scan.next();
                System.out.println("Digite sua capacidade: ");
                String capacidade = scan.next();
                System.out.println("Digite o prefixo da aeronave: ");
                String prefixo = scan.next();


                new Aviao(id, modelo, marca, capacidade, prefixo, null);
            } catch (Exception e) {
                System.out.println("Erro, tente novamente");
            }
            
            public static void listarAviao(){
                for(Aviao aviao : Aviao.avioes){
                    System.out.println(aviao);
                }
            }

            public static void removeAviao(Scanner scan) {
                System.out.println("Remover Avião");
                System.out.println("Digite seu ID: ");

                int id = scan.nextInt();
                try {
                    Aviao.removeAviao(id_aviao);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
        
}
