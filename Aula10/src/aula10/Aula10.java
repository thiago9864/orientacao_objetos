/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Thiago
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    
    
                
    public static void main(String[] args) {
        // TODO code application logic here
        //DeckOfCards cards = new DeckOfCards();
        //cards.printCards();
        
        //exercicio set
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List %s\n", list);
        
        printNonDuplicates(list);
    }

    private static void printNonDuplicates(List<String> values) {
        Set<String> set = new TreeSet<>(values);
        System.out.printf("\nNao duplicados sao: ", values);
        
        for(String item : values){
            System.out.printf("%s ", item);
        }
        
        System.out.println();
    }
    
}
