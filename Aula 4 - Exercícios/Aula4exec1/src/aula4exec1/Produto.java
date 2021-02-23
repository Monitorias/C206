package aula4exec1;

public class Produto {

    public int codigoSerie;
    public String codigoProduto;
    public String nome;
    public String categoria;
    public int quantidade;
    
    public Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
    
    public void mostraInfo(){
        System.out.println("**************************");
        System.out.println("Código de série: " + this.codigoSerie);
        System.out.println("Código do produto: " + this.codigoProduto);
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Categoria do produto: " + this.categoria);
        System.out.println("Quantidade: " + this.quantidade);
    }
    
}