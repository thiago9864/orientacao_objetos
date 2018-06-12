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
public class TransporteDuasRodas extends Personagem {

    private int capacidade = 3;
    
    public TransporteDuasRodas(String nome){
        super(nome);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public void andar(int numCasas) {
       super.addNumCasas(numCasas * capacidade);
    }
    
}
