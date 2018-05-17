/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 */

/*
ok a) Crie uma classe denominada ContaPoupança

ok b) Inclua como atributos privados da classe: código do banco, código da
agência, número da conta poupança, CPF e nome do cliente e saldo atual;

ok c) Implemente o construtor da classe preenchendo todos os atributos acima,
exceto CPF e nome do cliente (serão setados depois);

ok d) Declare métodos gets e sets para todos esses atributos;

ok e) Declare uma variável static taxaJurosAnual para armazenar a taxa de juros
anual para todos correntistas do banco;

ok f) Implemente o método calculaJurosMensal() para calcular os juros mensais
multiplicando saldo atual por taxaJurosAnual dividido por 12 – esses juros
devem ser adicionados ao saldo atual;

ok g) Forneça o método static atualizaTaxaJuros() que configure taxaJurosAnual
com um novo valor;

h) Implemente o método geraDigitosCPF() para gerar os 2 dígitos verificadores
de um CPF válido do cliente, conforme exemplo abaixo:
• Exemplo de CPF: 111.444.777-XX

• Pegue os 9 primeiros dígitos do CPF da esquerda para a direita e
multiplique-os pelos seguintes pesos: 10, 9, 8, 7, 6, 5, 4, 3, 2, nesta
ordem. Em seguida, calcule o somatório dos resultados, conforme
abaixo:
Ex.: 1*10 + 1*9 + 1*8 + 4*7 + 4*6 + 4*5 + 7*4 + 7*3 + 7*2 = 162

• Divida a soma resultante por 11 e obtenha o resto. Caso o resto da
divisão seja menor que 2 o dígito verificador será 0, senão será: 11 –
resto.
Ex.: 162 % 11 = 8, então 11 – 8 = 3 (primeiro dígito verificador)

• O cálculo do segundo dígito verificador é semelhante ao primeiro, cuja
única diferença é a inclusão do primeiro dígito verificador na conta e a
utilização de pesos a partir de 11.
Ex.: 1*11 + 1*10 + 1*9 + 4*8 + 4*7 + 4*6 + 7*5 + 7*4 + 7*3 + 3*2 = 204
204 % 11 = 6, então 11 – 6 = 5 (segundo dígito verificador)

• Exemplo CPF com dígitos calculados: 111.444.777-35
*/
public class ContaPoupanca {
    private int codBanco;
    private int codAgencia;
    private int numeroContaPoupanca;
    private String cpf;
    private String nomeCliente;
    private float saldoAtual;
    private static float taxaJurosAnual;

    public ContaPoupanca(int codBanco, int codAgencia, int numeroContaPoupanca, float saldoAtual) {
        this.codBanco = codBanco;
        this.codAgencia = codAgencia;
        this.numeroContaPoupanca = numeroContaPoupanca;
        this.saldoAtual = saldoAtual;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public int getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(int codAgencia) {
        this.codAgencia = codAgencia;
    }

    public int getNumeroContaPoupanca() {
        return numeroContaPoupanca;
    }

    public void setNumeroContaPoupanca(int numeroContaPoupanca) {
        this.numeroContaPoupanca = numeroContaPoupanca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = geraDigitosCPF(cpf);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    /*
     * Implementacao de metodos
     */
    
    public static void atualizaTaxaJuros(float taxaJuros){
        taxaJurosAnual = taxaJuros;
    }
    
    public void calculaJurosMensal(){
        saldoAtual += (saldoAtual * taxaJurosAnual) / 12;
    }
    
    private String geraDigitosCPF(String cpf){
        String cpf_s = cpf.toString();
        int soma_1 = 0;
        int mult = 10;
        
        for(int i = 0; i < cpf_s.length(); i++){
            char c = cpf_s.charAt(i);
            String s = String.valueOf(c);
            int digito = Integer.parseInt(s);
            
            soma_1 += digito * mult;
            mult--;            
        }
        
        int resto = soma_1 % 11;
        int primeiro_digito = 0;
        
        if(resto >= 2){
            primeiro_digito = 11 - resto;
        }
        
        mult = 11;
        soma_1 = 0;
        
        for(int i = 0; i < cpf_s.length(); i++){
            char c = cpf_s.charAt(i);
            String s = String.valueOf(c);
            int digito = Integer.parseInt(s);
            
            soma_1 += digito * mult;
            mult--;            
        }
        
        soma_1 += primeiro_digito * 2;
        
        int resto2 = soma_1 % 11;
        int segundo_digito = 11 - resto2;
        
 
        
        System.out.println(soma_1);
        cpf_s = cpf_s + "" + primeiro_digito + "" + segundo_digito;
        
        return cpf_s;
    }
}

/*
h) Implemente o método geraDigitosCPF() para gerar os 2 dígitos verificadores
de um CPF válido do cliente, conforme exemplo abaixo:
• Exemplo de CPF: 111.444.777-XX

• Pegue os 9 primeiros dígitos do CPF da esquerda para a direita e
multiplique-os pelos seguintes pesos: 10, 9, 8, 7, 6, 5, 4, 3, 2, nesta
ordem. Em seguida, calcule o somatório dos resultados, conforme
abaixo:
Ex.: 1*10 + 1*9 + 1*8 + 4*7 + 4*6 + 4*5 + 7*4 + 7*3 + 7*2 = 162

• Divida a soma resultante por 11 e obtenha o resto. Caso o resto da
divisão seja menor que 2 o dígito verificador será 0, senão será: 11 –
resto.
Ex.: 162 % 11 = 8, então 11 – 8 = 3 (primeiro dígito verificador)

• O cálculo do segundo dígito verificador é semelhante ao primeiro, cuja
única diferença é a inclusão do primeiro dígito verificador na conta e a
utilização de pesos a partir de 11.
Ex.: 1*11 + 1*10 + 1*9 + 4*8 + 4*7 + 4*6 + 7*5 + 7*4 + 7*3 + 3*2 = 204
204 % 11 = 6, então 11 – 6 = 5 (segundo dígito verificador)

• Exemplo CPF com dígitos calculados: 111.444.777-35
*/