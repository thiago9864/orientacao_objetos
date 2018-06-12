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
public class FuncAdministrativo extends Funcionario {

    public FuncAdministrativo(float salarioBase, String nome) {
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
   
    public void imprime(){
        System.out.println("\n*Administrativo*");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Faltas: " + super.getNumFaltas());
        System.out.println("Horas Extra: " + super.getNumHorasExtras());
        System.out.println("Salario Base: " + super.getSalarioBase());
        System.out.println("Salario: R$" + Arredondamento.arredonda(FolhaPagamento.calculaSalarioMes(this), 2));
    }
}
