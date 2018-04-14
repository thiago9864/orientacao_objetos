/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvc1.pkg2017.q1;

/**
 *
 * @author Thiago
 */
public class TestePrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Programador p1 = new Programador();
        p1.imprimeAtributos();
        
        Programador p2 = new Programador("Fulano", "98734632011", 30, 'M');
        p2.setMatricula("2011338844");
        p2.setEndereco("Rua Sexta Feira 13, Juiz de Fora - MG");
        p2.setSalario(1200.04f);
    }
    
}
