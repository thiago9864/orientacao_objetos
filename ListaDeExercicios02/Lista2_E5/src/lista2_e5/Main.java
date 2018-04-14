/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e5;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario Fa = new Funcionario();
        Fa.setNome("Beltrano");
        Fa.setMatricula("199901A");
        Fa.setCargo("Programador");
        Fa.setIdade(32);
        Fa.imprimirInformacoes();
        
        Funcionario Fb = new Funcionario("Fulano", 42);
        Fb.setMatricula("219901Y");
        Fb.setCargo("Faxineiro");
        Fb.setSalario(1928.05f);
        Fb.imprimirInformacoes();
        
        Funcionario Fc = new Funcionario("778601Z", "Siclano", 2215.34f);
        Fc.setCargo("Publicitario");
        Fc.setIdade(25);
        Fc.imprimirInformacoes();
        
        System.out.println("Total de funcionários: " + Funcionario.getTotalFuncionarios());
    }
    
}
