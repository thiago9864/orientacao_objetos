/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author ice
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String Curso;
    private final int numMaxCopias = 50;

    public Aluno(int matricula, String Curso, String nome, String dataNascimento, char sexo) {
        super(nome, dataNascimento, sexo);
        this.matricula = matricula;
        this.Curso = Curso;
    }
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getNumMaxCopias() {
        return numMaxCopias;
    }
    
    
}
