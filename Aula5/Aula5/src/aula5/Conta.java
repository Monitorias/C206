package aula5;


public class Conta {
    
    public String nome;
    public double saldo;
    
    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}
