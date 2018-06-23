/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thiagoalmeida
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista_par = new LinkedList<Integer>();
        List<Integer> lista_impar = new LinkedList<Integer>();
        
        //gera pares
        for(int i=0; i<10; i++){
            lista_par.add(i*2);
        }
        
        //gera impares
        for(int i=0; i<10; i++){
            lista_impar.add(i*2 + 1);
        }
        
        System.out.println("Listas antes");
        imprime(lista_par);
        imprime(lista_impar);
        
        List<Integer> lista_mesclada = ListaMerge.merge(lista_par, lista_impar);
        
        System.out.println("Lista combinada:");
        imprime(lista_mesclada);
 
    }

    private static void imprime(List<Integer> lista) {
         for(Integer i : lista){
             System.out.printf("%2d ", i);
         }
         System.out.println("\n");
    }
    
}
