package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int op;
                
        float n1;
        float n2;
        
        boolean flag = true;
        
        while(flag){
            
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextFloat();
            
            System.out.println("Digite o segundo número: ");
            n2 = input.nextFloat();

            System.out.println("**ESCOLHA UMA OPÇÃO**");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            op = input.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("RESULTADO = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("RESULTADO = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("RESULTADO = " + (n1 * n2));
                    break;
                case 4:
                    if(n2 == 0)
                        System.out.println("Divisão inválida!");
                    else
                        System.out.println("RESULTADO = " + (n1 / n2));
                        break;
                case 5:
                    System.out.println("Saindo!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break; 
            }
        }
        
    }

}
