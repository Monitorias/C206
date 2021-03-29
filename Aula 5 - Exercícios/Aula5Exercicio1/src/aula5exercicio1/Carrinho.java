package aula5exercicio1;


public class Carrinho {
    
    public double total;
    public Produto[] produtos;
    
    public Carrinho(Produto[] produtos){
        this.produtos = produtos;
    }
    
    public void exibirInfo(){
        for (int i = 0; i < produtos.length; i++)
            if(produtos[i] != null){
                System.out.println("-----------------");
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Descrição: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preço: " + produtos[i].preco);
            }
    }
    
    public double calculaTotal(){
        for (int i = 0; i < produtos.length; i++)
            if(produtos[i] != null)
                total += produtos[i].preco;
        return total;
    }

}
