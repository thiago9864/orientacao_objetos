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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MatrizInteiros m1 = new MatrizInteiros(3, 3);
        
        m1.inserirElemento(5, 0, 0);
        m1.inserirElemento(6, 0, 1);
        m1.inserirElemento(4, 1, 0);
        m1.inserirElemento(9, 2, 1);
        
        if(m1.eQuadrada()){
            System.out.println("A matriz é quadrada");
        } else {
            System.out.println("A matriz não é quadrada");
        }
        
        System.out.println("Soma dos valores dos elementos da matriz: " + m1.somaValor());
        
        int[] pos = m1.encontraValor(4);
        
        if(pos[0] == -1){
            System.out.println("Numero 4 não encontrado");
        } else {
            System.out.println("Numero 4 encontrado na posicao: (" + pos[0] + ", " + pos[1] + ")");
        }
        
        pos = m1.encontraValor(12);
        
        if(pos[0] == -1){
            System.out.println("Numero 12 não encontrado");
        } else {
            System.out.println("Numero 12 encontrado na posicao: (" + pos[0] + ", " + pos[1] + ")");
        }
    }
    
}
