package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String tentativa;
        String senha = "2002";
        
        System.out.println("Digite a senha: ");
        tentativa = input.nextLine();
        
        while(!tentativa.equals(senha)){
            System.out.println("Senha Inválida!");
            
            System.out.println("Digite a senha: ");
            tentativa = input.nextLine();
        }
        
        System.out.println("Acesso permitido!");
    }

}
