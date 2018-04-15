/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e5;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Funcionario {
    private String matricula, nome, cargo;
    private int idade;
    private float salario;
    private static int numeroFuncionarios;
    
    public Funcionario(){
        salario = 1500.0f;
        numeroFuncionarios += 1;
    }
    public Funcionario(String nome, int idade){
        this.nome = nome;
        if(idade > 0){
            this.idade = idade;
        }       
        numeroFuncionarios += 1;
    }
    public Funcionario(String matricula, String nome, float salario){
        this.matricula = matricula;
        this.nome = nome;
        if(salario > 0){
            this.salario = salario;
        }
        numeroFuncionarios += 1;
    }
    public static int getTotalFuncionarios(){
        return numeroFuncionarios;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public void imprimirInformacoes(){
        System.out.println("----- Funcionário -----");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
    
}
