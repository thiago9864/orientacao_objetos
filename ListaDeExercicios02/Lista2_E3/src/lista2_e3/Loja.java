/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e3;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Loja {
    private String nome;
    private String cidade;
    private int totalAcervo;
    private int totalDisponivel;

    public Loja(String nome, String cidade, int totalAcervo) {
        this.nome = nome;
        this.cidade = cidade;
        this.totalAcervo = totalAcervo;
        
        totalDisponivel = this.totalAcervo;
    }

    public void setTotalDisponivel(int totalDisponivel) {
        this.totalDisponivel = totalDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getTotalAcervo() {
        return totalAcervo;
    }

    public int getTotalDisponivel() {
        return totalDisponivel;
    }  
    
    public int getTotalFilmesAlugados(){
        return totalAcervo - totalDisponivel;
    }
    
    public int getPorcentagemAlugada(){
        float prcAlugada = getTotalFilmesAlugados() / (float)totalAcervo;
        return (int)(prcAlugada * 100);
    }
    
}
