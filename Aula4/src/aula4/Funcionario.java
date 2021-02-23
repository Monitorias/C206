package aula4;

public class Funcionario {
    
    int idade;
    int cpf;
    float salario;
    String nome;
    
    Funcionario(int idade, int cpf, float salario, String nome){
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
    }
    
    Funcionario(){
        System.out.println("Funcionário Efetivado!");
    }
    
    void tiraFerias(String mes){
        System.out.println(nome + " vai tirar férias em " + mes);
    }
    
    float calculaSalarioAnual(){
        return salario * 12;
    }
    
    float calculaSalarioAnual(float decimoTerceiro){
        float salarioAnual = salario*12;
        salarioAnual += decimoTerceiro;
        return salarioAnual;
    }
    
    
}
