/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

/**
 *
 * @author thiagoalmeida
 */
public class FuncProfessor extends Funcionario {

    public FuncProfessor(float salarioBase, String nome) {
        super(salarioBase, nome, 0, 0);
    }
    
    public int getNumFaltas() {
        return super.getNumFaltas();
    }

    public void setNumFaltas(int numFaltas) {
        super.setNumFaltas(numFaltas);
    }

    public int getNumHorasExtras() {
        return super.getNumHorasExtras();
    }

    public void setNumHorasExtras(int numHorasExtras) {
        super.setNumHorasExtras(numHorasExtras); ;
    }
    
    
    public float calculaSalarioMes(){
         float valorHoraTrabalhada = super.getSalarioBase() / (12 * 8);
         float salarioMes = super.getSalarioBase();
         
         //conta horas extras
         salarioMes += valorHoraTrabalhada * 2.5f * super.getNumHorasExtras();
         
         return salarioMes;
    }
    
    public void imprime(){
        System.out.println("\n*Professor*");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Faltas: " + super.getNumFaltas());
        System.out.println("Horas Extra: " + super.getNumHorasExtras());
        System.out.println("Salario Base: " + super.getSalarioBase());
        System.out.println("Salario: R$" + Arredondamento.arredonda(calculaSalarioMes(), 2));
    }
}
