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
        
        PedidoExame pe1 = new PedidoExame();
        PedidoExame pe2 = new PedidoExame();
        
        ResultadoExame re = new ResultadoExame();
        LaudoMedico lm = new LaudoMedico();
        
        ArrayList<PedidoExame> arrayPedidoExame = new ArrayList<>();
        
        //pedido emitido pelo docente
        pe1.emitirPedido(1, "Hemograma", "14/05/2018", "Z00", p, d);
        pe1.imprimir();
        
        //pedido emitido pelo residente
        pe2.emitirPedido(2, "Tomografia", "17/05/2018", "B15", p, r);
        pe2.imprimir();
        
        //residente emite resultado do exame
        re.emitirResultadoExame(pe2, r, "Normal", "MAQ123");
        re.gerarResExamePDF();
        
        //residente emite laudo do exame
        lm.emitirLaudo("Descricao da tomografia", r, re);
        lm.gerarLaudoMedicoPDF();
        
        //docente revisa o laudo
        lm.revisarLaudo(d, "aprovado");
        lm.gerarLaudoMedicoPDF();
    }
    
}
