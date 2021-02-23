package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite E ou OU para prosseguir");
        
        String op = input.nextLine();
        
        switch(op){
            case "E":
                System.out.println("0 E 0 = 0");
                System.out.println("0 E 1 = 0");
                System.out.println("1 E 0 = 0");
                System.out.println("1 E 1 = 1");
                break;
                
            case "OU":
                System.out.println("0 OU 0 = 0");
                System.out.println("0 OU 1 = 1");
                System.out.println("1 OU 0 = 1");
                System.out.println("1 OU 1 = 1");
                break;
                
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
    
}
