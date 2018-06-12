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
public class Bicicleta extends TransporteDuasRodas {

    public Bicicleta(String nome) {
        super(nome);
    }

    @Override
    public void andar(int numCasas) {
        super.andar(numCasas * super.getCapacidade()); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
