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
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        PessoaJuridica PJ = new PessoaJuridica("Fulano1", "1122334455", 6589.25f);
        
        PessoaFisica PF1 = new PessoaFisica("Fulano2", "12134165465", 900.42f);
        PessoaFisica PF2 = new PessoaFisica("Fulano3", "02252625221", 2000.24f);
        PessoaFisica PF3 = new PessoaFisica("Fulano4", "18678564542", 2757.00f);
        PessoaFisica PF4 = new PessoaFisica("Fulano5", "09772381759", 3558.81f);
        PessoaFisica PF5 = new PessoaFisica("Fulano6", "03453454345", 12384.22f);
        
        PJ.calculaImposto();
        
        PF1.calculaImposto();
        PF2.calculaImposto();
        PF3.calculaImposto();
        PF4.calculaImposto();
        PF5.calculaImposto();
    }
    
}
