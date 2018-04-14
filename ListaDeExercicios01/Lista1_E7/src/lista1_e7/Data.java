/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e7;

/**
 *
 * @author Thiago
 */
public class Data {
    private int dia, mes, ano, diaAno;
    private String nomeMes;
    
    public Data(int dia, int mes, int ano){
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }
        if(ano > 0){
            this.ano = ano;
        }
    }
    public Data(int dia, String mes, int ano){
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }
        this.nomeMes = mes;
        if(ano > 0){
            this.ano = ano;
        }
    }
    public Data(int diaAno, int ano){
        if(diaAno >= 1 && diaAno <= 366){
            this.diaAno = diaAno;
        }
        if(ano > 0){
            this.ano = ano;
        }
    }
    
    private String formataNumero2(Integer num){
        if(num < 10){
            return "0" + num;
        }
        return num.toString();
    }
    private String formataNumero3(Integer num){
        if(num < 10)
        {
            return "00" + num;
        }
        else if(num < 100)
        {
            return "0" + num;
        }
        return num.toString();
    }
    
    //DD/MM/AAAA;
    public String gerarFormato1 (){
        return formataNumero2(dia) + "/" + formataNumero2(mes) + "/" + ano;
    }
    
    //Agosto 08, 2017;
    public String gerarFormato2 (){
        return nomeMes + " " + formataNumero2(dia) + ", " + ano;
    }
    
    //DDD AAAA
    public String gerarFormato3 (){
        return formataNumero3(diaAno) + " " + ano;
    }
    
}
