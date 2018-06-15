/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

/**
 *
 * @author thiagoalmeida
 */
public class ContaCorrente extends Conta implements Tributavel {
    
    @Override
    public void atualizarSaldo(float taxa) {
        float saldo = super.getSaldo();
        float taxaAplicar = taxa * 2;
        saldo *= (1.0f + taxaAplicar);
        super.setSaldo(saldo);
    }

    @Override
    public void depositar(float valor) {
        super.depositar(valor - 0.1f); //desconta R$ 0,10
    }

    @Override
    public void calcularTributo() {
        float saldo = super.getSaldo();
        saldo *= 0.99f; //tributo 1%
        super.setSaldo(saldo);
    }
    
    
    
}
