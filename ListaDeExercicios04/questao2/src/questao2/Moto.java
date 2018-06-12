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
public class Moto extends TransporteDuasRodas {

    private int nivelCombustivel;
    private final int nivelMinimoCombustivel = 5;
    
    public Moto(String nome, int nivelCombustivel) {
        super(nome);        
        super.setCapacidade(6);
        this.nivelCombustivel = nivelCombustivel;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    @Override
    public void andar(int numCasas) {
        if(nivelCombustivel >= nivelMinimoCombustivel){
            super.andar(numCasas);
        }
    }
    
    
}
