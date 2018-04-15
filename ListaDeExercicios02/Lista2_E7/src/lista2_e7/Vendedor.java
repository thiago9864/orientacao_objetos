/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e7;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Vendedor {
    private float valorBaseReceber, valorVendasBrutas;
    private float comissao;
    
    public Vendedor(){}

    public void setValorBaseReceber(float valorBaseReceber) {
        this.valorBaseReceber = valorBaseReceber;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    

    public void setValorVendasBrutas(float valorVendasBrutas) {
        this.valorVendasBrutas = valorVendasBrutas;
    }
    
    public float valorAreceber(){
        return valorBaseReceber + valorVendasBrutas * comissao;
    }
}
