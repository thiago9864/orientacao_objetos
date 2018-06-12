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
public class PessoaJuridica extends Contribuinte  {
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ, float rendaBruta) {
        super(nome, rendaBruta);
        this.CNPJ = CNPJ;
    }
    
    public void calculaImposto(){
        System.out.println("*** Imposto de Pessoa Juridica ***");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CNPJ: " + CNPJ);
        super.calculaImpostoPessoa();
    }
}
