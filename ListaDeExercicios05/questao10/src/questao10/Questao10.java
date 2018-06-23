/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao10;

import questao10.CarroBomba.FogoException;
import questao10.CarroBomba.SuperAquecimentoException;

/**
 *
 * @author Thiago
 */
public class Questao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            CarroBomba c = new CarroBomba();
            
            try{
                c.ligar();
                c.mover();
            }
            catch(SuperAquecimentoException e)
            {
                System.out.println("Vai fundir o motor!!!");
            } 
            finally 
            {
                c.desligar();
            }
        }
        catch(FogoException e)
        {
            System.out.println("Vai explodir!!!");
        } 
    }
    
}
