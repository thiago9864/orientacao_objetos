/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8b;

/**
 *
 * @author Thiago
 */
public class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private float velocidade;
    private String ambiente;
    
    public Animal(){};

    public Animal(String nome, float comprimento, int numPatas, String cor, float velocidade, String ambiente) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.velocidade = velocidade;
        this.ambiente = ambiente;
    }
    
    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + "cm");
        System.out.println("Num Patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade+ "m/s");
        System.out.println("Ambiente: " + ambiente);
    }
    
    
}
