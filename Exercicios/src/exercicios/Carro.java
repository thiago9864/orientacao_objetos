/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Thiago
 */
public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int portas;
    float velocidade;
    double valorAtual;
    int anoFabricacao;
    
    public void mudaCor(String novaCor){
        cor = novaCor;
    }
    
    public void acelerar(float velo){
        velocidade += velo;
    }
    
    public void frear(float velo){
        velocidade -= velo;
    }
    
    public double desvalorizacao(int anoFabrica, float valorCompra, int ano){    
        anoFabricacao = anoFabrica;
        valorAtual = valorCompra - ((ano - anoFabricacao) * (valorCompra * 0.004));
        
        return valorAtual;
    }
    
    public void imprimeDados(){
        System.out.println("Dados do carro: ");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("N. de portas: " + portas);
        System.out.println("Velocidade: " + velocidade);
    }
}

