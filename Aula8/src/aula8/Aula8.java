/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author Thiago
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Soma soma = new Soma(2.0f, 3.0f);
        System.out.println("Soma: " + soma.calcular());
        
        Subtracao subtracao = new Subtracao(2.0f, 3.0f);
        System.out.println("Subtracao: " + subtracao.calcular());
        
        Multiplicacao multiplicacao = new Multiplicacao(2.0f, 3.0f);
        System.out.println("Multiplicacao: " + multiplicacao.calcular());
        
        Divisao divisao = new Divisao(2.0f, 3.0f);
        System.out.println("Divisao: " + divisao.calcular());
    }
    
}
