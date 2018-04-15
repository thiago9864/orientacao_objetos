/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e4;

import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        CalculadoraSeguro calc = new CalculadoraSeguro();
        
        //Ler as informações necessárias
        System.out.println("*** Programa para calculo de seguro de veiculo ***");
        System.out.println("Marca do veiculo = ");
        calc.setMarca(s.next());
        System.out.println("Modelo do veiculo = ");
        calc.setModelo(s.next());
        System.out.println("Ano de fabricacao = ");
        calc.setAnoFabricacao(s.nextInt());
        System.out.println("Valor na tabela FIPE = ");
        calc.setValorTabelaFIPE(s.nextFloat());
        System.out.println("Idade do segurado = ");
        calc.setIdade(s.nextInt());
        System.out.println("Estado civil do segurado = ");
        calc.setEstadoCivil(s.next());
        System.out.println("Valor da franquia = ");
        calc.setFranquia(s.nextFloat());
        
        System.out.println("");
        
        System.out.println("Valor do Seguro A Vista = R$ " + calc.valorAvistaCorrigido());
        System.out.println("Valor Parcelado em 5 vezes no boleto R$ " + calc.valorParceladoCorrigido(5));
    }
    
}
