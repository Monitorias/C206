package aula5;

public class Aula5 {

    
    public static void main(String[] args) {
        
        //CRIANDO UM ARRAY DE CONTAS
        Conta[] contas = new Conta[5];
        
        //INSTANCIANDO DUAS CONTAS
        Conta c1 = new Conta("Gabriel", 500);
        Conta c2 = new Conta("Timóteo", 200);
        
        //ATRIBUINDO AS CONTAS CRIADAS ÀS POSIÇÕES DO ARRAY
        contas[0] = c1;
        contas[1] = c2;
        
        //ALTERNATIVAMENTE, É POSSÍVEL INSTANCIAR O OBJETO NO ARRAY
        contas[2] = new Conta("Fernanda", 1000);
        contas[3] = new Conta("Tadeu", 30);
        
        //ACESSANDO AS INFORMAÇÕES DOS OBJETOS DO ARRAY
        /*
        System.out.println("Nome: " + contas[0].nome);
        System.out.println("Saldo: " + contas[0].saldo);
        
        
        System.out.println("Nome: " + contas[1].nome);
        System.out.println("Saldo: " + contas[1].saldo);
        */
        
        //ACESSANDO AS INFORMAÇÕES ATRAVÉS DE UM FOR
        /*
        for (int i = 0; i < contas.length; i++) {
            System.out.println("Nome: " + contas[i].nome);
            System.out.println("Saldo: " + contas[i].saldo);
        }
        */
        
//        for (int i = 0; i < contas.length; i++)
//            System.out.println(contas[i]);

        //PARA SOLUCIONAR O PROBLEMA DE NULL POINTER EXCEPTION, PODEMOS:
        
        //VERIFICAR SE A POSIÇÃO DO ARRAY NÃO É NULA:
        /*
        for (int i = 0; i < contas.length; i++) 
            if(contas[i] != null){
                System.out.println("Nome: " + contas[i].nome);
                System.out.println("Saldo: " + contas[i].saldo);
            }
        */
        
        for (int i = 0; i < contas.length; i++)
            if(contas[i] != null)
                contas[i].exibirDados();
    }

}