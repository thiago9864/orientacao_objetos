/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Thiago
 */
public class Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //String palavras[] = linha.split(Pattern.quote(" "));//explode a string em palavras
        List<String> lista = new LinkedList<String>();
        TreeSet<String> arvore = new TreeSet<String>();
        
        System.out.println("Digite uma frase");
        String linha = s.nextLine();
        String palavra = "";
        
        StringTokenizer st = new StringTokenizer(linha);
        
        while (st.hasMoreTokens()) {
            palavra = st.nextToken();
            lista.add(palavra);
            arvore.add(palavra);
        }
        
        //System.out.println(lista.toString());
        
        System.out.println("Imprime palavras duplicadas");
        while(!arvore.isEmpty()) {
            palavra = arvore.pollFirst();
            int freq = Collections.frequency(lista, palavra);
            
            if(freq >= 2){
                System.out.printf("Frequencia da palavra duplicada \"%s\": %d\n", palavra, freq);
            }
        }

        
   
    }
    
}
