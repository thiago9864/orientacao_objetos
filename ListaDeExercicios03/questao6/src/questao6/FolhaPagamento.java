/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.util.ArrayList;

/**
 *
 * @author thiagoalmeida
 */
public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void geraFolhaPagamento(){
        System.out.println("\n**** Folha de Pagamento ****");
        float total = 0;
        
        for(Funcionario f : funcionarios){
            System.out.println("\nFuncionario: " + f.getNome());
            
            if(f instanceof FuncAdministrativo){
                System.out.println("Funcao: Administrativo");
            }
            
            if(f instanceof FuncProfessor){
                System.out.println("Funcao: Professor");
            }
            
            System.out.println("Salario: R$" + Arredondamento.arredonda(f.calculaSalarioMes(), 2));
            
            total += f.calculaSalarioMes();
        }
        
         System.out.println("\nTotal: R$" + Arredondamento.arredonda(total, 2));
    }
    
}
