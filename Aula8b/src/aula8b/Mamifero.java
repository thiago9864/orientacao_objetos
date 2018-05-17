/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8b;

/**
 *
 * @author Thiago
 */
public class Mamifero extends Animal {
    
    public Mamifero(){}
    
    public Mamifero(String nome, float comprimento, int numPatas, String cor, float velocidade){
        super(nome, comprimento, numPatas, cor, velocidade, "terra");
    }
    
    public Mamifero(String nome, float comprimento, int numPatas, String cor, float velocidade, String ambiente){
        super(nome, comprimento, numPatas, cor, velocidade, ambiente);
    }
    
    @Override
    public void imprime(){
        super.imprime();
    }
}
