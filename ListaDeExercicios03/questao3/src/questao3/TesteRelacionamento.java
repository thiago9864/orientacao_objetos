/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author Thiago
 */
public class TesteRelacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produto p1 = new Produto("Geladeira", 1200.0f);
        Produto p2 = new Produto("Telefone", 125.56f);
        
        Pessoa pessoa1 = new Pessoa("Fulano", "Rua Local", "São Pedro", "Juiz de Fora", 1234);
        Pessoa pessoa2 = new Pessoa("Siclano", "Avenida Itamar Franco", "Centro", "Juiz de Fora", 987);
        
        Compra c1 = new Compra("18/05/2018", pessoa1);
        c1.adicionarProduto(p1);
        c1.adicionarProduto(p2);
    }
    
}
