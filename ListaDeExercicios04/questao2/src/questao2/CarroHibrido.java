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
public class CarroHibrido extends Carro {
    private int nivelBateria;

    public CarroHibrido(String nome, int nivelCombustivel, int nivelBateria) {
        super(nome, nivelCombustivel);
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void andar(int numCasas) {
        if(nivelBateria >= 2 || super.carroPodeAndar()){
            super.andar(numCasas);
        }
    }
    
    
}
