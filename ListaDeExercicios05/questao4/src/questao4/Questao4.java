/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author thiagoalmeida
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //String palavras[] = linha.split(Pattern.quote(" "));//explode a string em palavras
        Stack<String> pilha = new Stack<String>();
        
        System.out.println("Digite uma linha de texto");
        String linha = s.nextLine();
        
        StringTokenizer st = new StringTokenizer(linha);
        
        while (st.hasMoreTokens()) {
            pilha.add(st.nextToken());
         }
        
        linha = "";
        
        while(!pilha.isEmpty()){
            linha += pilha.pop() + " ";//desempilha palavra
        }
        
        System.out.printf("\nLinha Invertida: %s", linha);
    }
    
}
