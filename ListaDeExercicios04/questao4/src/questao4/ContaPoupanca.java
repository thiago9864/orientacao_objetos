/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author thiagoalmeida
 */
public class ContaPoupanca extends Conta {

    
    @Override
    public void atualizarSaldo(float taxa) {
        float saldo = super.getSaldo();
        float taxaAplicar = taxa * 3;
        saldo *= (1.0f + taxaAplicar);
        super.setSaldo(saldo);
    }
    
}
