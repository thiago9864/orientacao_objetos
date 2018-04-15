/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e3;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locadora locadora = new Locadora();
        
        //loja cod 0
        locadora.adicionarLoja(new Loja("JF Locadora", "Juiz de Fora", 2000));
        //loja cod 1
        locadora.adicionarLoja(new Loja("RJ Locadora", "Rio de Janeiro", 2000));
        
        locadora.setTotalDisponivel(0, 1620);
        locadora.setTotalDisponivel(1, 1710);
        
        locadora.mostraTotalFilmesAlugados();
    }
    
}
