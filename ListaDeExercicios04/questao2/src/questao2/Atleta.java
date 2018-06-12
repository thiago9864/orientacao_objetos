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
public class Atleta extends Homem {    

    public Atleta(String nome) {
        super(nome);
        super.setCapacidade(2);
    }

    @Override
    public void andar(int numCasas) {
        super.andar(numCasas * super.getCapacidade()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
