/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Thiago
 */
public abstract class Personagem {
    private String nome;
    private int numCasas;
    
    public Personagem(){}

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }
    
    public void addNumCasas(int numCasas) {
        this.numCasas += numCasas;
    }
   
    public abstract void andar(int numCasas);
}
