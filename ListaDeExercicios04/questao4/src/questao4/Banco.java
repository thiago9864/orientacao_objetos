/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.ArrayList;

/**
 *
 * @author thiagoalmeida
 */
public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }
    
    public void adicionaConta(Conta conta){
        contas.add(conta);
    }
    public Conta getConta(int indice){
        return contas.get(indice);
    }
    public int getTotalContas(){
        return contas.size();
    }
    
    
}
