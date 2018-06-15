/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author thiagoalmeida
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco b = new Banco();
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        AtualizadorContas a = new AtualizadorContas(0.01f);
        
        b.adicionaConta(c);
        b.adicionaConta(cc);
        b.adicionaConta(cp);
        
        System.out.println("Teste");
        
        b.getConta(0).depositar(1000.0f);
        b.getConta(1).depositar(1000.0f);
        b.getConta(2).depositar(1000.0f);
        
        a.addConta(c);
        a.addConta(cc);
        a.addConta(cp);
        a.atualiza();
        
        System.out.printf("Saldo conta: R$%.2f\n", c.getSaldo());
        System.out.printf("Saldo conta corrente: R$%.2f\n", cc.getSaldo());
        System.out.printf("Saldo conta poupanca: R$%.2f\n", cp.getSaldo());
        
    }
    
}
