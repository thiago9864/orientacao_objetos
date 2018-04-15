/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e4;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class CalculadoraSeguro {
    
    private String marca, modelo, estadoCivil;
    private int anoFabricacao, idade;
    private float franquia, valorTabelaFIPE, aliquota;
    
    public CalculadoraSeguro(){
        aliquota = 0.06f;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFranquia(float franquia) {
        this.franquia = franquia;
    }

    public void setValorTabelaFIPE(float valorTabelaFIPE) {
        this.valorTabelaFIPE = valorTabelaFIPE;
    }
    
    private void corrigeValores(){
        valorTabelaFIPE -= valorTabelaFIPE * ( (2018 - anoFabricacao) * 0.05 );
    
        if (idade <= 25) {
            aliquota += 0.05;
        }
        if (estadoCivil.equalsIgnoreCase("SOLTEIRO")){
            aliquota += 0.04;
        }
        if (franquia <= 1000){
            aliquota += 0.03;
        }
    }
    
    public float valorAvistaCorrigido(){
        return valorTabelaFIPE * aliquota;
    }
    public float valorParceladoCorrigido(int numParcelas){
        return valorAvistaCorrigido() / numParcelas;
    }
}
