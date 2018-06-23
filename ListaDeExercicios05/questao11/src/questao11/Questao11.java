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
            String s1 = s.next();
            
            //se tiver qualquer coisa diferente de numeros, gera uma InputMismatchException
            if(!s1.matches("[0-9]+")){
                throw new InputMismatchException();
            }
            
            int valor1 = Integer.valueOf(s1);//isso gera um NumberFormatException
            
            System.out.println("Digite um inteiro:");
            String s2 = s.next();
            
            //se tiver qualquer coisa diferente de numeros, gera uma InputMismatchException
            if(!s1.matches("[0-9]+")){
                throw new InputMismatchException();
            }
            
            int valor2 = Integer.valueOf(s2);//isso gera um NumberFormatException

            System.out.printf("valor1: %d\n", valor1);
            System.out.printf("valor2: %d\n", valor2);
            
            int resultado = valor1 / valor2;
            
            System.out.printf("Resutado: %d\n", resultado);
        }
        catch(InputMismatchException e){
            System.out.println("O valor digitado nao e um numero");
        }
        catch(NumberFormatException e){
            System.out.println("Tipo de numero informado nao e inteiro");
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
