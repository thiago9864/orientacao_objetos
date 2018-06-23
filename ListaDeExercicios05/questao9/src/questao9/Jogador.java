/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

/**
 *
 * @author Thiago
 */
public class Jogador {
    private String nome;
    private Cartela cartela;
    private int acertos = 0;
    private int ordemMatrizCartela = 3;

    public Jogador(String nome) {
        this.nome = nome;
        this.cartela = new Cartela(ordemMatrizCartela);
        this.cartela.imprime();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cartela getCartela() {
        return cartela;
    }
    
    public void marcarNumero(Integer numero){
        if(cartela.checarNumero(numero)){
            acertos++;
        } 
    }
    
    public boolean ganhou(){
        int quantidade = ordemMatrizCartela * ordemMatrizCartela;
        return acertos >= (quantidade-1);
    }
    
}
