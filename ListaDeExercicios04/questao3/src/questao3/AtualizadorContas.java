/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author thiagoalmeida
 */
public class AtualizadorContas {
    private float taxa;
    private ArrayList<Conta> contas;

    public AtualizadorContas(float taxa) {
        this.taxa = taxa;
        contas = new ArrayList<>();
    }
    
    public void addConta(Conta conta){
        contas.add(conta);
    }
    
    public void atualiza(){
        for(Conta c : contas){
            c.atualizarSaldo(taxa);
        }
    }
}
