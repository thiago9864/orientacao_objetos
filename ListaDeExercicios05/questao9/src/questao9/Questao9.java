/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questao9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bingo bingo = new Bingo();
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o numero de jogadores: ");
        int numJogadores = s.nextInt();
        
        while(numJogadores > 0){
            System.out.printf("Digite o nome do jogador: ");
            bingo.addJogador(s.next());
            numJogadores--;
        }
        
        bingo.sortear();
        
    }
    
}
