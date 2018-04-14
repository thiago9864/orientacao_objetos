/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
/**
 *
 * @author Thiago
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c = new Carro();
        Scanner input = new Scanner(System.in);
        System.out.println("Dados iniciais do carro: ");
        
        c.imprimeDados();
        
        System.out.println("Digite o fabricante: ");
        c.fabricante = input.next();
        
        System.out.println("Digite o modelo: ");
        c.modelo = input.next();
        
        System.out.println("Digite o numero de portas: ");
        c.portas = input.nextInt();
        
        System.out.println("Digite a cor: ");
        c.fabricante = input.next();
        
        System.out.println("Digite a velocidade de aceleracao: ");
        c.acelerar(input.nextFloat());
        c.frear(30);
        c.desvalorizacao(2015, 37000, 2018);
        c.imprimeDados();
        
    }
    
}
