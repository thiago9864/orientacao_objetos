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
public class Secretario extends Funcionario {
    private String horarioDeTrabalho;

    public Secretario(String horarioDeTrabalho, int matricula, String unidade, String depto, String nome, String dataNascimento, char sexo) {
        super(matricula, unidade, depto, nome, dataNascimento, sexo);
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    
    
}
