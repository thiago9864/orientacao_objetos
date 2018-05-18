/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente d = new Docente(1234, 1, "Doutor Siclano");
        Residente r = new Residente(6, 1, "Doutor Estranho");
        Paciente p = new Paciente(123, "Beltrano", "23/05/1990", "Masculino");
        PedidoExame pe = new PedidoExame();
        ArrayList<PedidoExame> arrayPedidoExame = new ArrayList<PedidoExame>();
        
        //pedido emitido pelo docente
        arrayPedidoExame.add(pe.emitirPedido(1, "Hemograma", "14/05/2018", "Z00", p, d));
        
        //pedido emitido pelo residente
        arrayPedidoExame.add(pe.emitirPedido(2, "Tomografia", "17/05/2018", "B15", p, r));
    }
    
}
