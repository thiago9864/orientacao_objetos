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
        List<Integer> lista = new LinkedList<Integer>();
        
        for(int i=0; i<25; i++){
            lista.add(i*2+1);
        }
        
        System.out.println("Lista antes");
        imprime(lista);
        
        System.out.printf("Obj combinado: %d\n\n", ListaMerge.merge(lista, 0, 1));
        
        System.out.println("Lista depois");
        imprime(lista);
    }

    private static void imprime(List<Integer> lista) {
         for(Integer i : lista){
             System.out.printf("%2d ", i);
         }
         System.out.println("\n");
    }
    
}
