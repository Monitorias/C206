package aula4exec2;

public class Aula4exec2 {

    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("preto", "VolksWagen", "Fox", 200.5f, 20f, new Motor("50 cavalos", "Flex"));
        Carro c2 = new Carro("vermelho", "Ford", "Mustangue", 1000.5f, 10f, new Motor("300 cavalos", "Flex"));
        
        c1.ligar();
        c2.ligar();
        
        c1.acelerar();
        c2.acelerar();
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
