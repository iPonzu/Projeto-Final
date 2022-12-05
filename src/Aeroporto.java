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
                    removerAviao(scan);
                    break;
                case 4:
                    cadastrarHelicoptero(scan);
                    break;
                case 5:
                    listarHelicoptero();
                    break;
                case 6:
                    removerHelicoptero(scan);
                    break;    
                case 7:
                    removerAviao(scan);
                    break;
                case 8:
                    cadastrarJato(scan);
                    break;
                case 9:
                    listarJato();
                    break;
                case 10:
                    removerJato(scan);
                    break;
                case 11: 
                    cadastrarCompanhia(scan);
                    break;        
                case 12:
                    listarCompanhia();
                    break;
                case 13:
                    removerCompanhia(scan);
                    break;
                case 14:
                    cadastrarVoo(scan);
                    break;
                case 15:
                    listarVoo();
                    break;
                case 16:
                    removerVoo(scan);
                    break;    
                case 17:
                    cadastrarHangar(scan);
                    break;
                case 18:
                    listarHangar();
                    break;
                case 19:
                    removerHangar(scan);
                    break;
                case 20:
                    cadastrarPista(scan);
                    break;
                case 21:
                    listarPista();
                    break;                
                case 22:
                    removerPista(scan);
                    break;
                }       
        } while(op!=0);
        scan.close();
    }
    
    public static void cadastrarAviao(Scanner scanner){
        try{
            System.out.println("Cadastro de Avião");
            System.out.println("Digite o ID do avião: ");
            int id = scanner.nextInt();
            System.out.println("Digite o modelo do avião: ");
            String modelo = scanner.next();
            System.out.println("Digite a marca do avião: ");
            String marca = scanner.next();
            System.out.println("Digite a capacidade do avião: ");
            String capacidade = scanner.next();
            System.out.println("Digite o prefixo do avião: ");
            String prefixo = scanner.next();
            
            new Aviao(id, modelo, marca, capacidade, prefixo, null);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o Avião");
        }
    }
    public static void listarAviao(){
        System.out.println("Listar Avião");
        for(Aviao aviao : Aviao.avioes){
            System.out.println(aviao);
        }
    }

    public static void removerAviao(Scanner scanner){
        try{
            System.out.println("Digite o ID do carro: ");
            int id = scanner.nextInt();
            Aviao.remover(id);
            System.out.println("Avião excluído com êxito!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarHelicoptero(Scanner scanner){
        try{
            System.out.println("Cadastro de Helicoptero");
            System.out.println("Digite o ID do helicoptero: ");
            int id = scanner.nextInt();
            System.out.println("Digite o modelo do helicoptero: ");
            String modelo = scanner.next();
            System.out.println("Digite a marca do helicoptero: ");
            String marca = scanner.next();
            System.out.println("Digite a capacidade do helicoptero: ");
            int capacidade = scanner.nextInt();
            System.out.println("Digite a cor do helicoptero: ");
            String cor = scanner.next();

            new Helicoptero(id, marca, modelo, capacidade, cor);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar helicoptero");
        }
    }    
    public static void listarHelicoptero(){
        System.out.println("Listar Helicoptero");
        for(Helicoptero helicoptero : Helicoptero.helicopteros){
            System.out.println(helicoptero);
        }
    }       
    public static void removerHelicoptero(Scanner scanner){
        try{
            System.out.println("Digite o ID do Helicoptero: ");
            int id = scanner.nextInt();
            Helicoptero.remover(id);
            System.out.println("Helicoptero excluído com êxito!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }    
    }
    public static void cadastrarJato(Scanner scanner) {
        try{
            System.out.println("Cadastro de Jato");
            System.out.println("Digite o ID do jato: ");
            int id = scanner.nextInt();
            System.out.println("Digite o modelo do jato: ");
            String modelo = scanner.next();
            System.out.println("Digite a marca do jato: ");
            String marca = scanner.next();
            System.out.println("Digite a velocidade do jato: ");
            int velocidade = scanner.nextInt();
            System.out.println("Digite a cor do jato: ");
            String cor = scanner.next();
            
            new Jato(id, modelo, marca, velocidade, cor);
        }catch(Exception e) {
            System.out.println("Erro ao cadastrar o jato");
        }
    }

    public static void listarJato(){
        System.out.println("Listar Jato");
        for(Jato jato : Jato.jatos){
            System.out.println(jato);
        }
    }

    public static void removerJato(Scanner scanner){
        try{
            System.out.println("Digite o ID do jato: ");
            int id = scanner.nextInt();
            Jato.remover(id);
            System.out.println("Jato excluído com êxito!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarCompanhia(Scanner scanner){
        try{
            System.out.println("Cadastro de Companhia");
            System.out.println("Digite o ID do companhia: ");
            int id = scanner.nextInt();
            System.out.println("Digite o nome da companhia: ");
            String nome = scanner.next();
            System.out.println("Digite o CNPJ da companhia: ");
            String cnpj = scanner.next();

            new Companhia(id, nome, cnpj);
    }catch (Exception e){
        System.out.println("Erro ao cadastrar o companhia");
    }
}

    public static void listarCompanhia(){
        System.out.println("Listar Companhia");
        for(Companhia companhia : Companhia.companhias){
            System.out.println(companhia);
        }
    }

    public static void removerCompanhia(Scanner scanner){
         try{
             System.out.println("Digite o ID da companhia: ");
             int id = scanner.nextInt();
             Companhia.remover(id);
             System.out.println("Companhia excluída com êxito!!");
         }catch (Exception e){
            System.out.println(e.getMessage());
         }
     }

    public static void cadastrarVoo(Scanner scanner){
        try{
            System.out.println("Cadastro de Voo");
            System.out.println("Digite o ID do voo: ");
            int id = scanner.nextInt();
            System.out.println("Digite o número do voo: ");
            String numero = scanner.next();
            System.out.println("Digite a data do voo: ");
            String data = scanner.next();
            System.out.println("Digite a origem do voo: ");
            String origem = scanner.next();
            System.out.println("Digite o destino do voo: ");
            String destino = scanner.next();
            System.out.println("Digite qual o piloto do voo: ");
            String piloto = scanner.next();
            System.out.println("Digite qual o copiloto do voo: ");
            String copiloto = scanner.next();
            System.out.println("Digite a observação do voo: ");
            String obsevacao = scanner.next();
            
           new Voo(id, numero, data, origem, destino, piloto, copiloto, obsevacao, null, null, null, null);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o Voo");
        }
    }

    public static void listarVoo(){
        System.out.println("Listar Voo");
        for(Voo voo : Voo.voos){
            System.out.println(voo);
        }
    }
    
    public static void removerVoo(Scanner scanner){
        try{
            System.out.println("Digite o ID do voo: ");
            int id = scanner.nextInt();
            Voo.remover(id);
            System.out.println("Voo excluído com êxito!!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarHangar(Scanner scanner){
        try{
            System.out.println("Cadastro de Hangar");
            System.out.println("Digite o ID do hangar: ");
            int id = scanner.nextInt();
            System.out.println("Digite o local do hangar: ");
            String local = scanner.next();
            
            new Hangar(id, local, null);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o Hangar!!");
        }
    }

    public static void listarHangar(){
        System.out.println("Listar Hangar");
        for(Hangar hangar : Hangar.hangares){
            System.out.println(hangar);
        }
    }

    public static void removerHangar(Scanner scanner){
        try{
            System.out.println("Digite o ID do hangar");
            int id = scanner.nextInt();
            Hangar.remover(id);
            System.out.println("Avião excluído com êxito!!");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarPista(Scanner scanner){
        try{
            System.out.println("Cadastro de Pista");
            System.out.println("Digite o ID da pista: ");
            int id = scanner.nextInt();
            System.out.println("Digite o numero da pista: ");
            String numero = scanner.next();
            
             new Pista(id, numero);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar a pista");
        }
    }

    public static void listarPista(){
        System.out.println("Listar Pista");
        for(Pista pista : Pista.pistas){
            System.out.println(pista);
        }
    }

    public static void Pista(Scanner scanner){
        try{
            System.out.println("Digite o ID da pista: ");
            int id = scanner.nextInt();
            Pista.remover(id);
            System.out.println("Pista excluída com êxito!!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
