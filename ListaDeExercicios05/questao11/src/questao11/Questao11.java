/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questao11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Digite um inteiro:");
            int valor1 = s.nextInt();
            System.out.println("Digite um inteiro:");
            int valor2 = s.nextInt();
            
            System.out.printf("valor1: %d\n", valor1);
            System.out.printf("valor2: %d\n", valor2);
            
            float resultado = (float)valor1 / valor2;
            
            System.out.printf("Resutado: %f\n", resultado);
        }
        catch(NumberFormatException e){
            System.out.println("Tipo de numero informado nao e inteiro");
        }
        catch(InputMismatchException e){
            System.out.println("O valor digitado nao e um numero");
        }
        catch(ArithmeticException e){
            System.out.println("Divisao por zero.");
        }    
        //teste
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
