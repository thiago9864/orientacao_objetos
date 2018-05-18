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
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PessoaJuridica PJ = new PessoaJuridica(1122334455, 6589.25f);
        PessoaEspecial PE = new PessoaEspecial(895468, 1388.14f);
        
        PessoaFisica PF1 = new PessoaFisica("12134165465", 900.42f);
        PessoaFisica PF2 = new PessoaFisica("02252625221", 1688.24f);
        PessoaFisica PF3 = new PessoaFisica("18678564542", 3200.00f);
        PessoaFisica PF4 = new PessoaFisica("09772381759", 4458.81f);
        PessoaFisica PF5 = new PessoaFisica("03453454345", 12384.22f);
        
        PJ.calculaImposto();
        PE.calculaImposto();
        
        PF1.calculaImposto();
        PF2.calculaImposto();
        PF3.calculaImposto();
        PF4.calculaImposto();
        PF5.calculaImposto();
    }
    
}
