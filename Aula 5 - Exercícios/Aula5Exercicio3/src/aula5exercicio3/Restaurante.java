package aula5exercicio3;


public class Restaurante {

    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores;
    
    Restaurante(String cnpj, String endereco, String nome, Fornecedor[] fornecedores){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        this.fornecedores = fornecedores;
    }
    
    void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        for (int i = 0; i < fornecedores.length; i++) {
            if(fornecedores[i] != null)
                fornecedores[i].exibirInfos();
        }
    }
    
}
