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
    private final int nivelMinimoCombustivel = 10;
    
    public Carro(String nome, int nivelCombustivel){
        super(nome);
        this.nivelCombustivel = nivelCombustivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public boolean carroPodeAndar() {
        return nivelMinimoCombustivel >= nivelMinimoCombustivel;
    }
    
    @Override
    public void andar(int numCasas) {
        if(carroPodeAndar()){
            //System.out.printf("numCasas: %d, capacidade: %d\n", numCasas, capacidade);
            super.addNumCasas(numCasas * capacidade);
        }
    }
    
    
}
