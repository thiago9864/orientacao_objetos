/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author thiagoalmeida
 */
public class LaudoMedico {
    private String descricaoLaudo;
    private String status;
    private Medico medicoEmissor;
    private Docente medicoRevisor;
    private ResultadoExame resultadoExame;

    public LaudoMedico(){
        this.status = "provisorio";
    }
    public LaudoMedico(String descricaoLaudo, Medico medicoEmissor, ResultadoExame resultadoExame) {
        this.descricaoLaudo = descricaoLaudo;
        this.status = "provisorio";
        this.medicoEmissor = medicoEmissor;
        this.resultadoExame = resultadoExame;
    }
    
    public void emitirLaudo(String descricaoLaudo, Medico medicoEmissor, ResultadoExame resultadoExame) {
        this.descricaoLaudo = descricaoLaudo;
        this.status = "provisorio";
        this.medicoEmissor = medicoEmissor;
        this.resultadoExame = resultadoExame;
    }

    public String getDescricaoLaudo() {
        return descricaoLaudo;
    }

    public void setDescricaoLaudo(String descricaoLaudo) {
        this.descricaoLaudo = descricaoLaudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Medico getMedicoEmissor() {
        return medicoEmissor;
    }

    public void setMedicoEmissor(Medico medicoEmissor) {
        this.medicoEmissor = medicoEmissor;
    }

    public Docente getMedicoRevisor() {
        return medicoRevisor;
    }

    public void setMedicoRevisor(Docente medicoRevisor) {
        this.medicoRevisor = medicoRevisor;
    }

    public ResultadoExame getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(ResultadoExame resultadoExame) {
        this.resultadoExame = resultadoExame;
    }
    
    public void revisarLaudo(Docente docente, String status){
        this.medicoRevisor = docente;
        this.status = status;
    }
    
    public void gerarLaudoMedicoPDF() {
        PedidoExame pedido = resultadoExame.getPedido();
        
        System.out.println("\n***** Laudo Medico *****\n");
        System.out.println("Pedido #" + pedido.getNumeroPedido());
        System.out.println("Cod Exame: " + pedido.getCodExame());
        System.out.println("Nome Exame: " + pedido.getNomeExame());
        System.out.println("Data Realização: " + pedido.getDataRealizacao());
        System.out.println("CID: " + pedido.getCID());
        System.out.println("Paciente: " + pedido.getPaciente().getNome());   
        System.out.println("Medico: " + pedido.getMedico().getNome());
        System.out.println("Equipamento: " + resultadoExame.getEquipamento());
        System.out.println("Resultado: " + resultadoExame.getResultado());
        System.out.println("Descricao Laudo: " + descricaoLaudo);
        
        if(medicoRevisor == null){
            System.out.println("**Revisao: Laudo não revisado");
        } else {
            System.out.println("**Revisao: Laudo revisado");
             System.out.println("Medico Revisor: " + medicoRevisor.getNome());
             System.out.println("CRM: " + medicoRevisor.getCRM());
        }
        
        System.out.println("Status: " + status);
    }
    
}
