/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5_parte1;

/**
 *
 * @author Thiago
 */
public class Exemplo1 {
    private int tamanho = 1440;
    private float[] temperaturas = new float[tamanho];
    
    public Exemplo1(){
        for(int i=0; i < tamanho; i++){
            temperaturas[i] = geraRandom();
        }
    }
    
    private float geraRandom(){
        Double rnd = Math.random() * 100;
        return rnd.floatValue();
    }
    
    
    public void imprimeTemperaturas(){
        for(int i=0; i < tamanho; i++){
             System.out.print(temperaturas[i]);
             if(i%10 == 0 && i != 0){
                 System.out.println();
             } else {
                 System.out.print(" | ");
             }
        }
    }
    
}
