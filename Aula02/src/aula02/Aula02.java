/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import DataHora.*;

/**
 *
 * @author Thiago
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data d = new Data(16, 3, 2018);
        Hora h = new Hora(17, 10, 5);
        
        DataHora dataHora = new DataHora(d, h);
        dataHora.imprimirDataHora();
        System.out.println(dataHora.nomeMes());
    }
    
}
