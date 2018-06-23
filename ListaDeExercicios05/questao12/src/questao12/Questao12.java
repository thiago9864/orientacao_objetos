/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao12;

import java.io.EOFException;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Thiago
 */
public class Questao12 {

    /**
     * @param args the command line arguments
     */
    
    /*
     * O Que o programa faz?
     * O programa dispara quatro excessoes diferentes aleatoriamente por um Random() no parametro do metodo
     * switch() que gera numeros aleatorios de 1 a 4. Nesse switch dependendo do numero gerado ele dispara a excessao.
     * Cada excessao esta sendo tratada em um bloco diferente, menos a IOException que e a excessao fatal que nao pode 
     * ser tratada.
     *
     * Por que a classe main() tem em seu cabeçalho uma referência para a exceção IOException?
     * Porque esse tipo de erro nao vai ser pego em nenhum try catch. Assim o metodo main()
     * vai ter que delegar o tratamento desse erro pro metodo superior. Sendo um erro nao tratavel e 
     * a maquina virtual do Java quem chama esse metodo, ela para o programa.
     *
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Bloco 1"); 
        try {
            System.out.println("Bloco 2"); 
            try {
                System.out.println("Bloco 3"); 
                try {
                    switch(Math.abs(new Random().nextInt())%4+1){
                        default: 
                        case 1:
                            throw new EOFException(); 
                        case 2:
                            throw new NullPointerException(); 
                        case 3:
                            throw new NumberFormatException(); 
                        case 4:
                            throw new IOException(); 
                    } 
                } catch (NumberFormatException e) {
                    System.out.println("Trata no bloco 3"); 
                } 
            } catch (NullPointerException e) { 
                System.out.println("Trata no bloco 2"); 
            }
        } catch (EOFException e){ 
            System.out.println("Trata no bloco 1"); 
        }
    }

}
