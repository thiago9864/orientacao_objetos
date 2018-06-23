/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Thiago
 */
public class Cartela {
    
    private int tamanho;
    private int ordemMatriz;
    private ArrayList<Integer> pedras;

    public Cartela(int ordemMatriz) {
        this.tamanho = ordemMatriz*ordemMatriz;
        this.ordemMatriz = ordemMatriz;
        
        pedras = new ArrayList<>();
        
        for(int i=0; i < tamanho; i++){
            pedras.add(random());
        }
        
        Collections.sort(pedras);
    }
    
    private int random(){
        return (int)(Math.random() * (Bingo.numMax - Bingo.numMinimo)) + Bingo.numMinimo;
    }
    
    public boolean checarNumero(Integer numSorteado){
        return pedras.contains(numSorteado);
    }
    
    public void imprime(){
        for(int i=0; i < tamanho; i++){
            if((i+1) % ordemMatriz == 0){
                System.out.println();
            }
        }
    }
}
