/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e10;

import empresa.*;

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
        
        Empresa empresa = new Empresa("123456-9999");
        
        Funcionario fn1 = new Funcionario("Fulano", 980.0f);
        Funcionario fn2 = new Funcionario("Siclano", 1280.0f);
        Funcionario fn3 = new Funcionario("Beltrano", 2260.0f);
        
        empresa.add(fn1);
        empresa.add(fn2);
        empresa.add(fn3);
        
        empresa.imprimeDadosEmpresa();
        
    }
    
}
