package aula5exercicio1;

public class Aula5Exercicio1 {

    
    public static void main(String[] args) {
        
        Produto[] produtos = new Produto[3];
        
        Produto p1 = new Produto("Galaxy S10", "Celular", "Samsung", 4000);
        Produto p2 = new Produto("PlayStation 5", "Video Game", "Sony", 4900);
        Produto p3 = new Produto("Dell Inspiron", "Notebook", "Dell", 2000);
        
        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;
        
        Carrinho c1 = new Carrinho(produtos);
        
        c1.exibirInfo();
        System.out.println("Total do carrinho: " + c1.calculaTotal());
    }

}
