/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author Thiago
 */
public class OperacaoMatematica {
    protected float operando1;
    protected float operando2;
    
    public OperacaoMatematica(){}
    
    protected void ajustaValores(float operando1, float operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    } 
}
