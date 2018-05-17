/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 */

public class TestaVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Votacao v = new Votacao();
        
        int numVotos = v.computaVotos();
        v.apurarEleicao(v.getVotos(), numVotos);
    }
    
}
