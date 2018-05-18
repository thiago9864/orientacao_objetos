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
public class Pessoa {
    private String nome;
    private ArrayList<Endereco> endereco;

    public Pessoa(String nome, String rua, String bairro, String cidade, int numero) {
        this.nome = nome;
        
        this.endereco = new ArrayList<Endereco>();
        this.endereco.add(new Endereco(rua, bairro, cidade, numero));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void consultarEndereco(int pos) {
        if(pos >= 0 && pos < endereco.size()){
            Endereco e = endereco.get(pos);
            System.out.println("Consulta Endereco #" + pos);
            System.out.println("Rua: " + e.getRua());
            System.out.println("Numero: " + e.getNumero());
            System.out.println("Bairro: " + e.getBairro());
            System.out.println("Cidade: " + e.getCidade());
        }
    }
    public void alterarEndereco(int pos, String rua, String bairro, String cidade, int numero){{
        if(pos >= 0 && pos < endereco.size()){
            Endereco e = endereco.get(pos);
            e.setBairro(bairro);
            e.setCidade(cidade);
            e.setNumero(numero);
            e.setRua(rua);
        }
    }

    }
}
