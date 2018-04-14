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
public class Lampada {
    private boolean ligada;
    
    public void ligar(){
        ligada = true;
    }    
    public void desligar(){
        ligada = false;
    }
    
    public String verificarEstado(){
        if(ligada){
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}
