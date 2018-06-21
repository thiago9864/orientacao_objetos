/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

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
        
        System.out.println("Digite uma linha de texto");
        
        String linha = s.nextLine();
        
        String palavras[] = linha.split(Pattern.quote(" "));//explode a string em palavras
        
        Stack<String> pilha = new Stack<String>();
        
        for(int i=0; i < palavras.length; i++){
            pilha.add(palavras[i]);//empilha palavra
        }
        
        linha = "";
        
        for(int i=0; i < palavras.length; i++){
           linha += pilha.pop() + " ";//desempilha palavra
        }
        
        System.out.printf("\nLinha Invertida: %s", linha);
    }
    
}
