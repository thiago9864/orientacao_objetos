/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8b;

/**
 *
 * @author Thiago
 */
public class Peixe extends Animal{
   
    private int numBarbatanas;
    private boolean cauda;
    
    public Peixe(){}
    
    public Peixe(String nome, float comprimento, float velocidade, int numBarbatanas, boolean cauda){
        super(nome, comprimento, 0, "Cinzenta", velocidade, "mar");
        this.numBarbatanas = numBarbatanas;
        this.cauda = cauda;
    }
    
    public Peixe(String nome, float comprimento, String cor, String ambiente, float velocidade, int numBarbatanas, boolean cauda){
        super(nome, comprimento, 0, cor, velocidade, ambiente);
        this.numBarbatanas = numBarbatanas;
        this.cauda = cauda;
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Num Barbatanas: " + numBarbatanas);
        System.out.println("Tem Cauda? : " + cauda);
    }
}
