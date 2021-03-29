package aula5exercicio3;

public class Aula5Exercicio3 {

    
    public static void main(String[] args) {
        
        Fornecedor[] fornecedores = new Fornecedor[2];
        fornecedores[0] = new Fornecedor("Carne", 20);
        fornecedores[1] = new Fornecedor("Temperos", 25);
        
        Restaurante r1 = new Restaurante("12345", "Rua 15", "Restaurante Galinha Assada", fornecedores);
        
        r1.exibirInfos();
        
        
    }

}
