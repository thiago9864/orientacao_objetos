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
public class Multiplicacao extends OperacaoMatematica  {
    
    public Multiplicacao(float valor1, float valor2){
        super.ajustaValores(valor1, valor2);
    }
    
    public float calcular(){
        return super.operando1 * super.operando2;
    }
}
