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
                //    cadastrarAviao(scan);
                break; 
                case 2:
                //    listarAviao(scan);
                break;   
            }
        } while(op!=0);
        scan.close();
    }
}
