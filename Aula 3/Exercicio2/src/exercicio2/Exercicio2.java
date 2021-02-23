package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double imc;
        double massa;
        double altura;
       
        System.out.println("Digite a massa: ");
        massa = input.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura = input.nextDouble();
        
        imc = massa/(altura * altura);
        
        System.out.println("IMC = " + imc);
        
        if(imc <= 18.5)
            System.out.println("Abaixo do peso!");
        else if(imc > 18.5 && imc <= 24.9)
            System.out.println("Peso ideal! Parabéns!");
        else if(imc > 24.9 && imc <= 29.9)
            System.out.println("Levemente acima do peso");
        else if(imc > 29.9 && imc <= 34.9)
            System.out.println("Obesidade grau 1");
        else if(imc > 34.9 && imc <= 39.9)
            System.out.println("Obesidade grau 2");
        else
            System.out.println("Obesidade grau 3");
            
        
        
    }
    
}
