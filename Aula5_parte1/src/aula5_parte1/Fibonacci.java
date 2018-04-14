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
public class Fibonacci {
    
    private int[] sequencia;
    private int numElementos;
    
    public Fibonacci(){}
    
    public void gerarSequencia(int numElementos){
        this.numElementos = numElementos;
        
        sequencia = new int[this.numElementos];
        
        sequencia[0] = 1;
        sequencia[1] = 1;
        
        for(int i=2; i < this.numElementos; i++){
            int soma = sequencia[i-2] + sequencia[i-1];
            sequencia[i] = soma;
        }
    }
    
    public void imprimir(){
        for(int i=0; i < this.numElementos; i++){
            if(i!=0){
               System.out.print(","); 
            }
             System.out.print(sequencia[i]);
        }
         System.out.println();
    }
}
