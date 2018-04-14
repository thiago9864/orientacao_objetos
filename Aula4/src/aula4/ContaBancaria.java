/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Thiago
 */
public class ContaBancaria {

    private int agencia;
    private int conta;
    private int CPF;
    private String nomeCliente;
    private String tipoConta;
    private float saldo;
    private static int totalContas;
    
    public ContaBancaria(){
        totalContas += 1;
    }
    public ContaBancaria(int agencia, int conta, int CPF, String nomeCliente, String tipoConta){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }
    
    public void sacar(float valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
    }
    
    public void depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }
    
    public void imprimirDados(){
        
    }
    
    public static int getTotalContas(){
        return totalContas;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getConta(){
        return this.conta;
    }
    public int getCPF() {
        return CPF;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public float getSaldo() {
        return saldo;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setConta(int conta){
        this.conta = conta;
    }
}
