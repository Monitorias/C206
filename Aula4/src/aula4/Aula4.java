package aula4;

public class Aula4 {

    
    public static void main(String[] args) {
        
        //DECLARANDO OS OBJETOS
        Funcionario f1;
        Funcionario f2;
        
        //INSTANCIANDO OS OBJETOS
        f1 = new Funcionario();
        f2 = new Funcionario();
        
        //ALTERNATIVAMENTE
        Funcionario f3 = new Funcionario();
        
        Funcionario f4 = new Funcionario(23, 123, 200f, "Marcos");
        
        //DANDO VALORES AOS ATRIBUTOS DOS OBJETOS
        f1.nome = "Gabriel";
        f1.idade = 21;
        f1.cpf = 123456;
        f1.salario = 500f;
        
        f2.nome = "Joaquim";
        f2.idade = 50;
        f2.cpf = 654321;
        f2.salario = 600f;
        
        //PRINTANDO AS INFORMAÇÕES
        System.out.println("Funcionario: " + f1.nome + " Idade: " + f1.idade + " Salário: " + f1.salario);
        System.out.println("Funcionario: " + f2.nome + " Idade: " + f2.idade + " Salário: " + f2.salario);
        
        
        //VARIÁVEIS RECEBENDO OS VALORES RETORNADOS PELOS MÉTODOS DOS OBJETOS
        float salarioAnual1 = f1.calculaSalarioAnual();
        float salarioAnual2 = f2.calculaSalarioAnual();
        
        //ACESSANDO MÉTODO DOS OBJETOS
        f1.tiraFerias("Dezembro");
        f1.tiraFerias("Janeiro");
        
        System.out.println("Salário: " + f1.salario + " Salário anual:" + salarioAnual1);
        System.out.println("Salário: " + f2.salario + " Salário anual:" + salarioAnual2);
        
    }

}
