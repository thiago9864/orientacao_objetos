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
public class ContaPoupanca extends Conta implements Tributavel {

    @Override
    public void atualizarSaldo(float taxa) {
        float saldo = super.getSaldo();
        float taxaAplicar = taxa * 3;
        saldo *= (1.0f + taxaAplicar);
        super.setSaldo(saldo);
    }
    
    @Override
    public void calcularTributo() {
        float saldo = super.getSaldo();
        saldo *= 50.0f; //tributo fixo 50 reais
        super.setSaldo(saldo);
    }
    
}
