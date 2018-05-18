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
public class PedidoExame {
    private int numeroPedido;
    private int codExame;
    private String nomeExame;
    private String dataRealizacao;
    private String CID;
    private boolean impressao;
    private Paciente paciente;
    private Medico medico;
    private static int contador = 0;

    public PedidoExame(){}
    
    public PedidoExame(int numeroPedido, int codExame, String nomeExame, String dataRealizacao, String CID, boolean impressao, Paciente paciente, Medico medico) {
        this.numeroPedido = numeroPedido;
        this.codExame = codExame;
        this.nomeExame = nomeExame;
        this.dataRealizacao = dataRealizacao;
        this.CID = CID;
        this.impressao = impressao;
        this.paciente = paciente;
        this.medico = medico;
    }
    
    public void emitirPedido(int codExame, String nomeExame, String dataRealizacao, String CID, Paciente paciente, Medico medico) {
        this.numeroPedido = contador++;
        this.codExame = codExame;
        this.nomeExame = nomeExame;
        this.dataRealizacao = dataRealizacao;
        this.CID = CID;
        this.impressao = false;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getCodExame() {
        return codExame;
    }

    public void setCodExame(int codExame) {
        this.codExame = codExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    
    public void imprimir(){
        System.out.println("\n***** Pedido de Exame *****\n");
        System.out.println("Pedido #" + this.numeroPedido);
        System.out.println("Cod Exame: " + this.codExame);
        System.out.println("Nome Exame: " + this.nomeExame);
        System.out.println("Data Realização: " + this.dataRealizacao);
        System.out.println("CID: " + this.CID);
        System.out.println("Paciente: " + this.paciente.getNome());   
        System.out.println("Médico: " + this.medico.getNome());
         
        this.impressao = true;
    }
}
