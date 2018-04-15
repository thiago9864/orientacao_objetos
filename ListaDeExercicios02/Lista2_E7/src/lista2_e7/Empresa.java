/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e7;

import java.util.ArrayList;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Empresa {
    private ArrayList<Vendedor> vendedores;
    private float valorBaseVendedores = 200.0f;
    private float comissao = 0.09f; // 9%
    
    public Empresa(){
        vendedores = new ArrayList<>();
    }
    
    public void resetVendedores(){
        vendedores.clear();
    }
    
    public void setValorBrutoParaVendedor(float valorBruto){
        Vendedor v = new Vendedor();
        
        v.setValorBaseReceber(valorBaseVendedores);
        v.setValorVendasBrutas(valorBruto);
        v.setComissao(comissao);
        
        vendedores.add(v);
    }
    
    public void imprimeGanhosPessoalVendas(){
        float ganhos = 0;
        for (Vendedor v : vendedores){
            ganhos += v.valorAreceber();
        }
        System.out.println("Ganhos dos vendedores para o intervalo: R$ " + ganhos);
    }
}
