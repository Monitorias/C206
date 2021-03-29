package aula5exercicio2;


public class Empresa {
    
    String cnpj;
    String endereco;
    Contato[] contatos = new Contato[2];
    
    Empresa(String cnpj, String endereco){
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    
    void exibirInfos(){
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereco: " + endereco);
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null)
                contatos[i].exibirInfos();
        }
    }

}
