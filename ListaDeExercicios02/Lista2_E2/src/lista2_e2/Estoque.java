/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e2;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Estoque {
    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        
        if(quantidadeAtual < 0){
            quantidadeAtual = 0;
        }
        if(quantidadeMinima < 0){
            quantidadeMinima = 0;
        }
        
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        
        if(quantidadeMinima < 0){
            quantidadeMinima = 0;
        }
        
        this.quantidadeMinima = quantidadeMinima;
    }

    public void reporEstoque(int quantidadeRepor) {
        this.quantidadeAtual = quantidadeRepor;
    }
    
    public void darBaixa(int quantidadeBaixar){
        if(this.quantidadeAtual >= quantidadeBaixar){
            this.quantidadeAtual -= quantidadeBaixar;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
    
    public void imprimeDadosProduto(){
        System.out.println("--- Dados do produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Qtd minima: " + quantidadeMinima);
        System.out.println("Qtd em estoque: " + quantidadeAtual);
    }
    
    public boolean precisaRepor(){
        return this.quantidadeAtual < this.quantidadeMinima;
    }
    
}
