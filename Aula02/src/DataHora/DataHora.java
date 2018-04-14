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
public class DataHora {
    Data data;
    Hora hora;
    
    public DataHora(Data data, Hora hora){
        this.data = data;
        this.hora = hora;
    }
    
    public void imprimirDataHora(){
        System.out.println(data.stringData() + ", " + hora.stringHora());
    }
    
    public String nomeMes(){
        int mes = data.mes;
        
        switch(mes){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Inválido!";
        }
        
    }
}
