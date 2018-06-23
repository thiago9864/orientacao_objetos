/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao13;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Thiago
 */
public class ValidaCPF {
    public String validar(String cpf){
        int peso = 10;
        int soma = 0;
        int digito1, digito2;
        String cpfMontado = "";
        
        //ciclo do primeiro digito
        for(int i=0; i < cpf.length(); i++){
            soma += (cpf.charAt(i)-48) * peso;
            peso--;
        }
        
        int resto = soma % 11;
        
        if(resto < 2){
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }
        
        //ciclo do segundo digito
        peso = 11;
        soma = 0;
        
        for(int i=0; i < cpf.length(); i++){
            soma += (cpf.charAt(i)-48) * peso;
            peso--;
        }
        
        soma += digito1 * peso;
        
        resto = soma % 11;
        
        if(resto < 2){
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }
        
        cpfMontado = String.format("%s%s%s", cpf, digito1, digito2);
        
        return cpfMontado;
    }
}
