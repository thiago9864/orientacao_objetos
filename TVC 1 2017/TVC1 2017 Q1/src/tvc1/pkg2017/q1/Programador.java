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
public class Programador {
    private String matricula;
    private String CPF; 
    private String nome; 
    private int idade;
    private char sexo; 
    private float salario; 
    private String endereco;
    
    public Programador(){
        this.salario = 1200.0f;
    }

    public Programador(String nome, String CPF, int idade, char sexo) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Programador(String matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void imprimeAtributos(){
        System.out.println("--- Atributos do programador ---");
        System.out.println("Matricula: " + matricula);
        System.out.println("CPF: " + CPF);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salário: " + salario);
        System.out.println("Endereço: " + endereco);
    }
}
