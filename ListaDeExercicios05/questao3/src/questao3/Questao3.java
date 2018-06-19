/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thiagoalmeida
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = new LinkedList<Integer>();
        Integer num=0;
        Integer soma=0;
        Float media=0.0f;
        
        while(lista.size()<25){
            num = (int)(Math.random() * 100);
            lista.add(num);
        }
        
        Collections.sort(lista);
        
        System.out.println("Lista ordenada");
        imprime(lista);
        
        for(int i=0; i < lista.size(); i++){
            soma += lista.get(i);
        }
        media = (float)soma / lista.size();
        
        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Media: %f\n", media);
        
    }
    
    private static void imprime(List<Integer> lista) {
         for(Integer i : lista){
             System.out.printf("%2d ", i);
         }
         System.out.println("\n");
    }
}
