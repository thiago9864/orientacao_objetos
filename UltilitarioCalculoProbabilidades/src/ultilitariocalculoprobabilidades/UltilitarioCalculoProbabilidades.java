/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultilitariocalculoprobabilidades;

/**
 *
 * @author Thiago
 */
public class UltilitarioCalculoProbabilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prob p = new Prob();
        
        int n = 10;
        double acumulada = 0.0;
        double probab_sucesso = 0.2;
        
        int suporte_count = 2;
        
        //System.out.printf("combinacao = %f\n", Math.pow(15.0, 2.0));
        
        for(int x = 0; x <= suporte_count; x++){
            double v = p.Binomial(n, x, probab_sucesso);
            acumulada += v;
            System.out.printf("X=%d -> X~Bin(%d;%f) = %f\n", x, n, probab_sucesso, v);
        }
        
        System.out.printf("acumulada = %f\n", acumulada);
        
    }
    
}
