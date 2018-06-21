/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author thiagoalmeida
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        TreeSet<String> arvore = new TreeSet<String>();
        
        String recebido = s.next();;
        
        while(!recebido.equals("sair")){
            System.out.println("Digite um primeiro nome, digite 'sair' para interromper");
            arvore.add(recebido);
            recebido = s.next();
        }
        
        System.out.println("Arvore");
        System.out.println(arvore.toString());
        
        System.out.println("Digite um primeiro nome para procurar:");
        String buscar = s.next();
        
        /*
        podia ter usado o contains, mas tenho usado pouco o Iterator 
        */
        Iterator<String> i = arvore.iterator();
        
        while(i.hasNext()){
            String nome = i.next();
            if(nome.equals(buscar)){
                System.out.printf("Nome '%s' foi encontrado", nome);
                break;
            }
        }
    }
    
}
