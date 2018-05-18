/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Compra {
    private String data;
    private Pessoa pessoa;
    private ArrayList<Produto> produto;
    
    public Compra(){
        produto = new ArrayList<Produto>();
    }

    public Compra(String data, Pessoa pessoa) {
        this.data = data;
        this.pessoa = pessoa;
        produto = new ArrayList<Produto>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }
    
    public void adicionarProduto(Produto produto){
        this.produto.add(produto);
    }
    
    public void comprar(){
        System.out.println("*** Compra Realizada ***\n");
        System.out.println("**Cliente**");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.consultarEndereco(0);
        System.out.println("\n**Produtos**");
        float total = 0;
        for(Produto p : produto){
            System.out.println("\nNome: " + p.getNome());
            System.out.println("Preco: R$" + p.getPreco());
            total += p.getPreco();
        }
        System.out.println("\nTotal: R$" + total);
        
    }
    
    public void verificarCompra(){
        //pra que serve esse metodo?
    }
}
