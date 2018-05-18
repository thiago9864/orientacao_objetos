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
public class Funcionario {
    private float salarioBase;
    private String nome;
    private int numFaltas;
    private int numHorasExtras;
    private float multiplicadorHoraExtra = 0;

    public Funcionario(float salarioBase, String nome, int numFaltas, int numHorasExtras) {
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.numFaltas = numFaltas;
        this.numHorasExtras = numHorasExtras;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public int getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(int numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    public float getMultiplicadorHoraExtra() {
        return multiplicadorHoraExtra;
    }

    public void setMultiplicadorHoraExtra(float multiplicadorHoraExtra) {
        this.multiplicadorHoraExtra = multiplicadorHoraExtra;
    }
    
    public float calculaSalarioMes(){
         float valorHoraTrabalhada = salarioBase / (30 * 8);
         float salarioMes = salarioBase;
         
         //desconta faltas
         salarioMes -= valorHoraTrabalhada * 8.0f * numFaltas;
         
         //conta horas extras
         salarioMes += valorHoraTrabalhada * 1.5f * numHorasExtras;
         
         return salarioMes;
    }
    
    public void imprime(){
        System.out.println("*Funcionario*");
        System.out.println("Nome: " + nome);
        System.out.println("Faltas: " + numFaltas);
        System.out.println("Horas Extra: " + numHorasExtras);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario: R$" + Arredondamento.arredonda(calculaSalarioMes(), 2));
    }
    
}
