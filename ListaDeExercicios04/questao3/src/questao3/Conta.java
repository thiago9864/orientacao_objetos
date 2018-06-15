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
public class Conta {
    private float saldo;

    public Conta(){}
    
    public float getSaldo(){
        return saldo;
    } 
    public void depositar(float valor){
        this.saldo += valor;
    }
    public void sacar(float valor){
        if(valor >= saldo){
            saldo -= valor;
        }
    } 
    public void atualizarSaldo(float taxa){
        saldo *= (1.0f + taxa);
    } 
}
