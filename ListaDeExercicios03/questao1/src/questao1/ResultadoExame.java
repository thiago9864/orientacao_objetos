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
public class ResultadoExame {
    private PedidoExame pedido;
    private Residente medicoRegistrador;
    private String resultado;
    private String equipamento;

    public ResultadoExame(){}
    
    public ResultadoExame(PedidoExame pedido, Residente medicoRegistrador, String resultado, String equipamento) {
        this.pedido = pedido;
        this.medicoRegistrador = medicoRegistrador;
        this.resultado = resultado;
        this.equipamento = equipamento;
    }
    
    public void emitirResultadoExame(PedidoExame pedido, Residente medicoRegistrador, String resultado, String equipamento) {
        this.pedido = pedido;
        this.medicoRegistrador = medicoRegistrador;
        this.resultado = resultado;
        this.equipamento = equipamento;
    }

    public PedidoExame getPedido() {
        return pedido;
    }

    public void setPedido(PedidoExame pedido) {
        this.pedido = pedido;
    }

    public Medico getMedicoRegistrador() {
        return medicoRegistrador;
    }

    public void setMedicoRegistrador(Residente medicoRegistrador) {
        this.medicoRegistrador = medicoRegistrador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    
    public void gerarResExamePDF() {
        System.out.println("\n***** Resultado do Exame *****\n");
        System.out.println("Pedido #" + pedido.getNumeroPedido());
        System.out.println("Cod Exame: " + pedido.getCodExame());
        System.out.println("Nome Exame: " + pedido.getNomeExame());
        System.out.println("Data Realização: " + pedido.getDataRealizacao());
        System.out.println("CID: " + pedido.getCID());
        System.out.println("Paciente: " + pedido.getPaciente().getNome());   
        System.out.println("Medico: " + medicoRegistrador.getNome());
        System.out.println("Equipamento: " + equipamento);
        System.out.println("Resultado: " + resultado);
    }
}
