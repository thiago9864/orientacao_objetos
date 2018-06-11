/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class PedidoImpressao {
    private int numeroPedido;
    private String dataPedido;
    private String corImpressao;
    private String impressora;
    private String status;
    private String dataEntrega;
    private ArrayList<ItemImpressao> itenImpressao;
    private Pagamento pagamento;
    private Pessoa pessoa;
    private Secretario secretario;
    
    private static int count = 0;

    public PedidoImpressao(){
        itenImpressao = new ArrayList<>();
    }
    
    public PedidoImpressao(int numeroPedido, String dataPedido, String corImpressao, String impressora, String status, String dataEntrega) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.corImpressao = corImpressao;
        this.impressora = impressora;
        this.status = status;
        this.dataEntrega = dataEntrega;
        
        itenImpressao = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getCorImpressao() {
        return corImpressao;
    }

    public void setCorImpressao(String corImpressao) {
        this.corImpressao = corImpressao;
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
    /*
    metodos
    */
    
    public void emitirPedido(Pessoa p, String arquivo, int numCopias, String dataPedido, String corImpressao){
        adicionarItem(arquivo, numCopias);
        count++;
        this.numeroPedido = count;
        this.dataPedido = dataPedido;
        this.corImpressao = corImpressao;
        this.pessoa = p;
    }
    
    public void adicionarItem(String arquivo, int numCopias){
        itenImpressao.add(new ItemImpressao(arquivo, numCopias));
    }
    
    public void registraPedido(Secretario s, String impressora, String status, String dataEntrega){
        this.impressora = impressora;
        this.status = status;
        this.dataEntrega = dataEntrega;
        this.secretario = s;
    }
    
    public void registraPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }
    
    public void imprimePedido(){
        
        System.out.println("\n**** Pedido de Impressao ****");
                
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Data do Pedido: " + dataPedido);
        System.out.println("Cor da Impressão: " + corImpressao);
        System.out.println("Data de Entrega: " + dataEntrega);
        System.out.println("Nome do Solicitante: " + pessoa.getNome());
        System.out.println("Secretário responsável: " + secretario.getNome());

        float total = 0;
        int maxCopias = 0;
        
        if(pessoa instanceof Aluno){
            maxCopias = ((Aluno)pessoa).getNumMaxCopias();
        }
        if(pessoa instanceof Professor){
            maxCopias = ((Professor)pessoa).getNumMaxCopias();
        }
  
        
        for(ItemImpressao item : itenImpressao){
             System.out.println("Arquivo: " + item.getArquivo());
             System.out.println("Número de Cópias: " + item.getNumCopias());
             
             total += pagamento.calculaValor(item.getNumCopias(), maxCopias);
        }

        System.out.println("Valor total de pagamento: " + total);

    }
}
