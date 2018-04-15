/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e3;

import java.util.ArrayList;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Locadora {
    private ArrayList<Loja> lojas;

    public Locadora() {
        lojas = new ArrayList<>();
    }
    
    public void adicionarLoja(Loja loja){
        lojas.add(loja);
    }
    
    public void setTotalDisponivel(int loja, int totalDisponivel){
        if(loja >= 0 && loja < lojas.size()){
            lojas.get(loja).setTotalDisponivel(totalDisponivel);
        }
    }
    
    public void mostraTotalFilmesAlugados(){
        int total = 0;
        System.out.println("*** Filmes Alugados ***\n");
        for (int i=0; i < lojas.size(); i++){
            Loja loja = lojas.get(i);
            System.out.println("Loja: " + loja.getNome() + " - " + loja.getCidade());
            System.out.println("Filmes alugados: " + loja.getTotalFilmesAlugados());
            System.out.println("Porcentagem alugada: " + loja.getPorcentagemAlugada() + "%");
            System.out.println("");
            total += loja.getTotalFilmesAlugados();
        }
        System.out.println("Total de filmes alugados: " + total);
        System.out.println("");
    }
    
}
