/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 *
 * @author thiagoalmeida
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        
        /*
        Exemplos para teste
        * arara
        * osso
        * ovo
        * radar
        * omissíssimo
        * afã
        */
        boolean palindromo = true;
        
        String palavra = deAccent(s.next()); 
      
        int meio = palavra.length() / 2;
        
        Stack<Character> pilha = new Stack<Character>();
        
        for(int i=0; i < meio; i++){
            System.out.printf("char: %c\n", palavra.charAt(i));
            pilha.add(palavra.charAt(i));
        }
        
        for(int i=1; i <= meio; i++){
            int pos = meio + i;
            
            Character cp = pilha.pop();
            Character cf = palavra.charAt(pos);
                    
            System.out.printf("(%d) pilha: %c, palavra: %c\n", i, cp, cf);
            
            if(!cp.equals(cf)){
                palindromo = false;
                break;
            }
        }
        
        if(palindromo){
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
        
        
    }
    
    /* 
    veio do Stack Overflow...
    Tem como fazer isso com a matéria dada até hoje? 
    */
    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
    
}
