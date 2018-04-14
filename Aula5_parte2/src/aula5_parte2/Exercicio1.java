/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5_parte2;

/**
 *
 * @author Thiago
 */
public class Exercicio1 {
    
    private int[] freq = new int[6];
    private final int NUM_FACES = 6;
    
    public Exercicio1() {
        //inicia o array
        for(int i=0; i < NUM_FACES; i++){
            freq[i] = 0;
        }
        
        //simula 6000 jogadas do dado
        for(int i=0; i < 6000; i++){
            int face = geraRandom();
            freq[face] = freq[face] + 1;
        }
    }
    
    private int geraRandom(){
        return (int)(Math.random() * NUM_FACES);
    }
    
    
    public void imprimeFrequencias(){
        System.out.println("Face   Frequecia");
        for(int i=0; i < NUM_FACES; i++){
             System.out.println((i+1) + "      " + freq[i]);
        }
    }
}
