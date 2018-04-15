/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e9;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class MatrizInteiros {
    private int matriz[][];
    private int L, C;
    
    public MatrizInteiros(int L, int C){
        this.L = L;
        this.C = C;
        matriz = new int[L][C];
        
        for(int i=0; i < L; i++){
            for(int j=0; j < C; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    public void inserirElemento(int elemento, int i, int j){
        if(i >= 0 && i < L && j >= 0 && j < C){
            matriz[i][j] = elemento;
        } else {
            System.out.println("Posicao fornecida está fora dos limites da matriz");
        }
    }
    
    public boolean eQuadrada(){
        if(L>0 && C>0 && L==C){
            return true;
        }
        return false;
    }
    
    public int somaValor(){
        int soma = 0;
        for(int i=0; i < L; i++){
            for(int j=0; j < C; j++){
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    
    public int[] encontraValor (int valor){
        
        for(int i=0; i < L; i++){
            for(int j=0; j < C; j++){
                if(matriz[i][j] == valor){
                    int[] retArray = new int[2];
                    retArray[0] = i;
                    retArray[1] = j;
                    return retArray;
                };
            }
        }
        
        int[] retArray = new int[1];
        retArray[0] = -1;
        return retArray;
    }
}
