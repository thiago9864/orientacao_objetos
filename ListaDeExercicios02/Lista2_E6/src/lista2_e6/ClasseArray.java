/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e6;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class ClasseArray {
    
    public static int procurar(int[] vetor, int tamanho, int procurar){
        
        for(int i=0; i < tamanho; i++){
            if(vetor[i] == procurar){
                return i;
            }
        }
        
        return -1;
    }
    
}
