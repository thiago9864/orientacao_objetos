/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

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
        Paciente p = new Paciente(123, "Beltrano", "23/05/1990", "Masculino");
        PedidoExame pe = new PedidoExame();
        
        pe.emitirPedido(2, "Hemograma", "14/05/2018", "Z00", p, d);
    }
    
}
