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
public class Hora {
    int hora, minuto, segundo;
    
    public Hora (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String stringHora(){
        return hora + ":" + minuto + ":" + segundo;
    }
}
