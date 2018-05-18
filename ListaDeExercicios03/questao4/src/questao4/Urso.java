/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author Thiago
 */
public class Urso extends Mamifero {
    private String alimentoPreferido = "mel";
    
    public Urso(){}
    
    public Urso(String nome, float comprimento, int numPatas, float velocidade){
        super(nome, comprimento, numPatas, "Castanho", velocidade);
    }
    
    public Urso(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidade){
        super(nome, comprimento, numPatas, cor, velocidade, ambiente);
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Alimento Preferido: " + alimentoPreferido);
    }
}
