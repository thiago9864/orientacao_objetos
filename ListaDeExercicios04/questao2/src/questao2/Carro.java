/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Thiago
 */
public class Carro extends Personagem {

    private int capacidade = 12;
    private int nivelCombustivel;
    
    public Carro(String nome){
        super(nome);
    }
    
    @Override
    public void andar(int numCasas) {
       super.addNumCasas(numCasas);
    }
    
    
}
