package aula5exercicio2;

public class Aula5Exercicio2 {

    
    public static void main(String[] args) {
        
        Empresa e1 = new Empresa("12345", "Rua ABC");
        Contato c1 = new Contato("Douglas", "douglas@email.com", "(35)99999999", "25 de setembro");
        Contato c2 = new Contato("Mariana", "mariana@email.com", "(35)88888888", "10 de fevereiro");
        
        e1.contatos[0] = c1;
        e1.contatos[1] = c2;
        
        e1.exibirInfos();
        
    }

}
