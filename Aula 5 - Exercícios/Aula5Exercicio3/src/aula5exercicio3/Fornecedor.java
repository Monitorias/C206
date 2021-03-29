package aula5exercicio3;


public class Fornecedor {
    
    String tipo;
    int quantidade;
    
    Fornecedor(String tipo, int quantidade){
        this.tipo = tipo;
        this.quantidade = quantidade;
    }
    
    void exibirInfos(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade: " + quantidade);
    }
}
