/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e2;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class TesteEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estoque produto1 = new Estoque("Impressora Jato de tinta", 13, 6);
        Estoque produto2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque produto3 = new Estoque("Mouse óptico", 6, 2);
        
        produto1.darBaixa(5);
        produto2.reporEstoque(7);
        produto3.darBaixa(4);
        
        System.out.println("Produto 1 precisa repor estoque? "+ produto1.precisaRepor());
        System.out.println("Produto 2 precisa repor estoque? "+ produto2.precisaRepor());
        System.out.println("Produto 3 precisa repor estoque? "+ produto3.precisaRepor());
        
        produto1.imprimeDadosProduto();
        produto2.imprimeDadosProduto();
        produto3.imprimeDadosProduto();
        
    }
    
}