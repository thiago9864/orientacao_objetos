/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author thiagoalmeida
 */
public class ContaPoupanca extends Conta {

    @Override
    public void atualizarSaldo(float taxa) {
        super.atualizarSaldo(taxa * 3);
    }
    
}
