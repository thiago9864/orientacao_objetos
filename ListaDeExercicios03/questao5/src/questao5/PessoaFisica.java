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
public class PessoaFisica extends Pessoa  {
    private String CPF;

    public PessoaFisica(String CPF, float rendaBruta) {
        super(rendaBruta);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    public void calculaImposto(){
        System.out.println("*** Imposto de Pessoa Fisica ***");
        System.out.println("CPF: " + CPF);
        
        if(super.getRendaBruta() <= 1500)
        {
            super.setAliquota(0);
        }
        else if(super.getRendaBruta() <= 2500)
        {
            super.setAliquota(0.075f);
        }
        else if(super.getRendaBruta() <= 3750)
        {
            super.setAliquota(0.1f);
        }
        else if(super.getRendaBruta() <= 4500)
        {
            super.setAliquota(0.15f);
        }
        else
        {
            super.setAliquota(0.22f);
        }
        
        super.calculaImpostoPessoa();
    }
}
