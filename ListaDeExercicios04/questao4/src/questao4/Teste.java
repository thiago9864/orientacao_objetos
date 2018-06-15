/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

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
        
        //Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        AtualizadorContas a = new AtualizadorContas(0.01f);
        
        //b.adicionaConta(c);
        b.adicionaConta(cc);
        b.adicionaConta(cp);
        
        System.out.println("Teste");
        
        b.getConta(0).depositar(1000.0f);
        b.getConta(1).depositar(1000.0f);
        //b.getConta(2).depositar(1000.0f);
        
        //a.addConta(c);
        a.addConta(cc);
        a.addConta(cp);
        a.atualiza();
        
        //System.out.printf("Saldo conta: R$%.2f\n", c.getSaldo());
        System.out.printf("Saldo conta corrente: R$%.2f\n", cc.getSaldo());
        System.out.printf("Saldo conta poupanca: R$%.2f\n", cp.getSaldo());
    }
    
}

/****** Respostas as perguntas da questao *********
 * 
 * a) Quais métodos poderiam ser abstratos? Transforme-os em abstratos.
 * -> O metodo  atualizarSaldo() da classe Conta foi transformado em abstrato.
 * 
 * b) Qual o efeito da conversão da classe Conta para abstrata
 *    nos métodos main() implementados?
 * -> Não foi possivel instanciar diretamente a classe Conta.
 * 
 * c) Convertendo a classe Conta para abstrata como fica o método
 *    atualizar() da classe AtualizadorContas?
 * -> Continuou funcionando normalmente
 * 
 * d) Remova o método atualizarSaldo() da classe ContaPoupanca. O que acontece com a aplicação?
 * -> Como eu coloquei esse metodo como abstrato, o programa da erro de compilacao porque o metodo
 * -> nao foi implementado.
 * 
 * e) Para que o método atualizarSaldo deve existir na classe Conta? E se ele 
 *    existisse apenas nas classes filhas?
 * -> Retirando o metodo da classe conta deu erro de compilacao na classe AtualizadorContas
 * -> porque a classe abstrata nao tem mais o metodo e na classe AtualizadorContas esta sendo
 * -> usada uma referencia direta do tipo Conta
 */