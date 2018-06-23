/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thiagoalmeida
 */
public class ListaConcatenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Character> lista1 = new LinkedList<Character>(); 
        List<Character> lista2 = new LinkedList<Character>(); 
        
        lista1.add('a');
        lista1.add('b');
        lista1.add('c');
        
        lista2.add('d');
        lista2.add('e');
        lista2.add('f');
        
        concatenar(lista1, lista2);
        
        imprime(lista1);
    }

    private static void concatenar(List<Character> lista1, List<Character> lista2) {
        lista1.addAll(lista2);
    }
    
    private static void imprime(List<Character> lista) {
         for(Character i : lista){
             System.out.printf("%2c ", i);
         }
         System.out.println("\n");
    }
    
}
