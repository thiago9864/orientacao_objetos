/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHora;

/**
 *
 * @author Thiago
 */
public class Data {
    int dia, mes, ano;
    
    public Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String stringData(){
        return dia + "/" + mes + "/" + ano;
    }
}
