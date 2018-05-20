/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

/**
 *
 * @author thiagoalmeida
 */
public class PessoaJuridica extends Pessoa  {
    private int CNPJ;

    public PessoaJuridica(int CNPJ, float rendaBruta) {
        super(rendaBruta);
        this.CNPJ = CNPJ;
    }
    
    public void calculaImposto(){
        System.out.println("*** Imposto de Pessoa Juridica ***");
        System.out.println("CNPJ: " + CNPJ);
        super.calculaImpostoPessoa();
    }
}
