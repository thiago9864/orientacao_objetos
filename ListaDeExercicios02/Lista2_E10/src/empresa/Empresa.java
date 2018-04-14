/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Empresa {
    private String CNPJ;
    private ArrayList <Funcionario> funcionarios;

    
    public Empresa(String CNPJ) {
        this.CNPJ = CNPJ;
        this.funcionarios = new ArrayList<>();
    }
    public Empresa(String CNPJ, ArrayList<Funcionario> funcionarios) {
        this.CNPJ = CNPJ;
        this.funcionarios = funcionarios;
    }   
    
    
    /**
     * Metodos
     */
    
    
    public void add(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void imprimeDadosEmpresa(){
        System.out.println("****** Empresa ******");
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("");
        System.out.println("--- Lista de funcionários ---");
        System.out.println("");
        
        for(Funcionario funcionario : funcionarios){
            funcionario.imprimeDados();
        }
    }
}
