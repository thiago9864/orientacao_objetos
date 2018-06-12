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

    public CarroHibrido(String nome, int nivelBateria) {
        super(nome);
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
        if(super.g >= 5){
            super.andar(numCasas * super.getCapacidade());
        } else {
            System.out.println("Moto sem combustivel");
        }
    }
    
    
}
