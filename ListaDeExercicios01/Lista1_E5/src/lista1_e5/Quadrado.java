/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e5;

/**
 *
 * @author Thiago
 */
public class Quadrado {
    int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    public int calcularArea(){
        return lado * lado;
    }
    
    public int calcularPerimetro(){
        return lado * 4;
    }
}
