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
    
    public static float calculaSalarioMes(Funcionario func){
         float valorHoraTrabalhada = func.getSalarioBase() / (30 * 8);
         float salarioMes = func.getSalarioBase();
         
         //desconta faltas
         salarioMes -= valorHoraTrabalhada * 8.0f * func.getNumFaltas();
         
         //conta horas extras
         salarioMes += valorHoraTrabalhada * 1.0f * func.getNumHorasExtras();
         
         return salarioMes;
    }
    
    public static float calculaSalarioMes(FuncAdministrativo adm){
         float valorHoraTrabalhada = adm.getSalarioBase() / (30 * 8);
         float salarioMes = adm.getSalarioBase();
         
         //desconta faltas
         salarioMes -= valorHoraTrabalhada * 8.0f * adm.getNumFaltas();
         
         //conta horas extras
         salarioMes += valorHoraTrabalhada * 1.5f * adm.getNumHorasExtras();
         
         return salarioMes;
    }
    
    public static float calculaSalarioMes(FuncProfessor prof){
         float valorHoraTrabalhada = prof.getSalarioBase() / (12 * 8);
         float salarioMes = prof.getSalarioBase();
         
         //conta horas extras
         salarioMes += valorHoraTrabalhada * 2.5f * prof.getNumHorasExtras();
         
         return salarioMes;
    }
    
    public void geraFolhaPagamento(){
        System.out.println("\n**** Folha de Pagamento ****");
        float total = 0;
        
        for(Funcionario f : funcionarios){
            System.out.println("\nFuncionario: " + f.getNome());
            
            if(f instanceof FuncAdministrativo){
                System.out.println("Funcao: Administrativo");
                System.out.println("Salario: R$" + Arredondamento.arredonda(calculaSalarioMes((FuncAdministrativo)f), 2));
                total += calculaSalarioMes((FuncAdministrativo)f);
            }
            
            if(f instanceof FuncProfessor){
                System.out.println("Funcao: Professor");
                System.out.println("Salario: R$" + Arredondamento.arredonda(calculaSalarioMes((FuncProfessor)f), 2));
                total += calculaSalarioMes((FuncProfessor)f);
            }
            
            
        }
        
         System.out.println("\nTotal: R$" + Arredondamento.arredonda(total, 2));
    }
    
}
