/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e4;

/**
 *
 * @author Thiago
 */
public class TesteLampada {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada lamp1 = new Lampada();
        Lampada lamp2 = new Lampada();
        
        lamp1.ligar();
        lamp2.desligar();
        
        System.out.println(lamp1.verificarEstado());
        System.out.println(lamp2.verificarEstado());
    }
    
}
