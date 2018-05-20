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
public class PessoaEspecial extends Pessoa {
    private int numeroSocial;

    public PessoaEspecial(int numeroSocial, float rendaBruta) {
        super(rendaBruta);
        this.numeroSocial = numeroSocial;
    }
    
    public void calculaImposto(){
        System.out.println("*** Imposto de Pessoa Especial ***");
        System.out.println("Numero Social: " + numeroSocial);
        super.calculaImpostoPessoa();
    }
}
