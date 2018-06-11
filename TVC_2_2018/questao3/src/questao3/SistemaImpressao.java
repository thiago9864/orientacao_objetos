/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author ice
 */
public class SistemaImpressao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno a1 = new Aluno(2017123456, "Ciencia Da Computacao", "Fulano", "12/05/1996", 'm');
        Aluno a2 = new Aluno(2017123557, "Ciencia Da Computacao", "Jane Doe", "02/09/1998", 'f');
        
        Professor p = new Professor("12:00", 2011454745, "JF", "DCC", "Siclano", "22/05/1981", 'm');
        p.adicionaDisciplina("Orientacao A Objetos");
        
        Secretario s = new Secretario("08:00 as 18:00", 12313132, "JF", "ICE", "Beltrano", "14/08/1975", 'm');
        
        PedidoImpressao p1 = new PedidoImpressao();
        PedidoImpressao p2 = new PedidoImpressao();
        PedidoImpressao p3 = new PedidoImpressao();
        
        p1.setPagamento(new Pagamento("Dinheiro"));
        p2.setPagamento(new Pagamento("Dinheiro"));
        p3.setPagamento(new Pagamento("Dinheiro"));
        
        p1.emitirPedido(a1, "Aula01.pdf", 12, "21/05/2018", "Preto");
        p2.emitirPedido(a2, "Aula03.pdf", 60, "21/05/2018", "Preto");
        p3.emitirPedido(p, "TVC-02-2018.1.pdf", 800, "21/05/2018", "Preto");

        p1.registraPedido(s, "HP 1001", "Solicitado", "21/05/2018");
        p2.registraPedido(s, "HP 1001", "Pago", "21/05/2018");
        p3.registraPedido(s, "HP 1001", "Entregue", "21/05/2018");
        
        
        p1.imprimePedido();
        p2.imprimePedido();
        p3.imprimePedido();
    }

}
