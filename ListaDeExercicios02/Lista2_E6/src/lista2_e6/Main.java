/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e6;

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
        int[] vetor = {1, 3, 2, 9, 15, 42};
        
        int indice = ClasseArray.procurar(vetor, 5, 15);
        
        if(indice != -1){
            System.out.println("Numero 15 encontrado na posicao " + indice);
        } else {
            System.out.println("Numero 15 não foi encontrado");
        }

    }
    
}
