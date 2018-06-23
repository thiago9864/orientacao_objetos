/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao13;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Thiago
 */
public class Questao13 {

    /**
     * @param args the command line arguments
     */
    
    /* Observacoes
    
    a) Que os números informados sejam sempre do tipo inteiro;
       Ok, usei InputMismatchException
    b) Que o divisor da soma dos valores pelos pesos seja diferente de zero
       o divisor é sempre 11, nunca vai ser 0, e pela maneira como eu fiz o tratamento aqui na main
       nao vai dar erro na classe.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        ValidaCPF vcpf = new ValidaCPF();
        
        System.out.println("Digite os 9 primeiros digitos do CPF");
        
        try {
            String cpf = s.nextLine();
            
            if(cpf.length() != 9){
                throw new InputMismatchException();
            } else {
                cpf = vcpf.validar(cpf);

                if(cpf.isEmpty()){
                    System.out.println("CPF Inválido");
                } else {
                    System.out.printf("CPF: %s\n", cpf);
                }
            }
        
        } catch (InputMismatchException e){
            System.out.println("Digite o cpf corretamente");
        }
    }
    
}
