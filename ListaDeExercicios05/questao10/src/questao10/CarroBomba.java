/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao10;

import java.util.Random;

/**
 *
 * @author Thiago
 */
public class CarroBomba {
    class SuperAquecimentoException extends Exception{}
    class FogoException extends Exception{}
    private Random r = new Random();
    
    public void ligar(){
        System.out.println("Ligou o carro.");
    }
    
    public void mover() throws SuperAquecimentoException, FogoException {
        Float temp = r.nextFloat() * 200.0f;
        
        if(temp > 100.0f){
            throw new SuperAquecimentoException();
        }
        throw new FogoException();
    }
    
    public void desligar(){
        System.out.println("Desligar o motor.");
    }
}
