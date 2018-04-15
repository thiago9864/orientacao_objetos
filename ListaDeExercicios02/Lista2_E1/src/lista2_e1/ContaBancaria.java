/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e1;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class ContaBancaria {
    private String titular;
    private float saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }
    public ContaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Metodos
     */
    
    private boolean temSaldo(float valor_saque){
        if(saldo > 0 && saldo > valor_saque){
            return true;
        }
        return false;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    
    public void depositar(float valor){
        if(valor > 0){
            saldo += valor * 0.95;
        }
    }
    
    public float sacar(float valor){
        if(valor > 0 && temSaldo(valor)){
            return saldo -= valor;
        } else {
            System.out.println("** Saldo insuficiente! ***");
        }
        return 0;
    }
    
    public void imprimeDadosConta(){
        System.out.println("");
        System.out.println("----- Conta Bancaria -----");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
    }
}
