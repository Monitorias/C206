package aula5exercicio2;


public class Contato {
    
    String nome;
    String email;
    String telefone;
    String dataNascimento;
    
    Contato(String nome, String email, String telefone, String dataNascimento){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    
    void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

}
