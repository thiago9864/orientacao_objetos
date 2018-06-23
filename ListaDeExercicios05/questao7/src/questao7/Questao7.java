/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Thiago
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        TreeSet<String> arvore = new TreeSet<String>();
        
        StringTokenizer st = new StringTokenizer(s.nextLine());
        
        while (st.hasMoreTokens()) {
            arvore.add(st.nextToken());
        }
        
        System.out.println("Arvore");
        System.out.println(arvore.toString());
    }
    
}
