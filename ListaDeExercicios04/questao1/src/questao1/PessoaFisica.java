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
public class PessoaFisica extends Contribuinte  {
    private String CPF;

    public PessoaFisica(String nome, String CPF, float rendaBruta) {
        super(nome, rendaBruta);
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
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + CPF);
        
        if(super.getRendaBruta() <= 1400)
        {
            super.setAliquota(0);
        }
        else if(super.getRendaBruta() <= 2100)
        {
            super.setAliquota(0.1f);
        }
        else if(super.getRendaBruta() <= 2800)
        {
            super.setAliquota(0.15f);
        }
        else if(super.getRendaBruta() <= 3600)
        {
            super.setAliquota(0.25f);
        }
        else
        {
            super.setAliquota(0.30f);
        }
        
        super.calculaImpostoPessoa();
    }
}
