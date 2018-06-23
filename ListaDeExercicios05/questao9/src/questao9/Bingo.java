/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Thiago
 */
public class Bingo {
    private List<Jogador> jogadores = new LinkedList<>();
    private List<Integer> numSorteados = new LinkedList<>();
    private Jogador vencedor;
    
    public static final int numMinimo = 1;
    public static final int numMax = 50;
    
    public void addJogador(String nome){
        jogadores.add(new Jogador(nome));
    }
    
    private Integer random(){
        return (int)(Math.random() * ((numMax + 1) - numMinimo)) + numMinimo;
    }
    
    private boolean atualizaCartelas(Integer numero){
        for(Jogador j : jogadores){
            j.marcarNumero(numero);
            if(j.ganhou()){
                vencedor = j;
                return true;
            }
        }
        return false;
    }

    
    public void sortear(){
        TreeSet numeros = new TreeSet();
        boolean alguemGanhou = false;
        int quantidade = (numMax - numMinimo) + 1;
        
        System.out.println("Sorteio inciado");
        
        while(!alguemGanhou && numeros.size() < quantidade){
            Integer num = random();
            
            if(numeros.add(num)){
                alguemGanhou = atualizaCartelas(num);
            }
        }
        
        if(alguemGanhou){
            System.out.println("Jogador vencedor: " + vencedor.getNome());
        } else {
            System.out.println("Não houve vencedor");
        }
    }
    
}
