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

/*
Crie uma classe TesteContaPoupança que contenha o método void main()
para testar seu programa com os seguintes dados:
• Crie e instancie 2 objetos de ContaPoupança – poup1 e poup2 – com
saldos de R$ 2.000,00 e R$ 3.000,00, respectivamente.
• Invoque os métodos set() do nome do cliente e CPF para preencher
esses valores para poup1 e poup2. O método setCPF() deve invocar o
método geraDigitosCPF() para calcular 2 dígitos válidos para o CPF
passado como parâmetro sem esses 2 dígitos;
• Atribua 4% à taxaAnualJuros e, então, calcule o juro mensal de cada um
dos 12 meses, imprimindo os novos saldos para os dois poupadores;
• Atualize a taxaAnualJuros para 5%, calcule a taxa do próximo mês e
imprima os novos saldos para os dois poupadores.
*/
public class TesteContaPoupança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaPoupanca poup1 = new ContaPoupanca(1, 123, 44556, 2000.0f);
        ContaPoupanca poup2 = new ContaPoupanca(1, 123, 44556, 3000.0f);
        
        poup1.setNomeCliente("Fulano da Silva");
        poup1.setCpf("111444777");
        
        poup2.setNomeCliente("Siclano de Almeida");
        poup2.setCpf("112345667");
        
        //atualiza taxa de juros para todas as instancias de ContaPoupanca
        ContaPoupanca.atualizaTaxaJuros(0.04f);//4%
        
        /*** Era pra chamar as funções abaixo 12 vezes, uma pra cada mês **/
        
        //atualiza saldo da conta 1
        poup1.calculaJurosMensal();
        System.out.println("Cliente 1 cpf '" + poup1.getCpf() + "'");
        System.out.println("Saldo Atual Corrigido da conta 1: R$ " + poup1.getSaldoAtual());
        
        //atualiza saldo da conta 1
        poup2.calculaJurosMensal();
        System.out.println("Cliente 2 cpf '" + poup2.getCpf() + "'");
        System.out.println("Saldo Atual Corrigido da conta 2: R$ " + poup2.getSaldoAtual());
        
    }
    
}
