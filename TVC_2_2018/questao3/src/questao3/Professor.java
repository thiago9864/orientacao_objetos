/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Professor extends Funcionario {
    private ArrayList<String> disciplinas;
    private String horarioAtendimento;
    private final int numMaxCopias = 300;

    public Professor(String horarioAtendimento, int matricula, String unidade, String depto, String nome, String dataNascimento, char sexo) {
        super(matricula, unidade, depto, nome, dataNascimento, sexo);
        this.horarioAtendimento = horarioAtendimento;
        disciplinas = new ArrayList<>();
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public int getNumMaxCopias() {
        return numMaxCopias;
    }
    
    /*
    metodos
    */
    
    public void adicionaDisciplina(String nome){
        if(nome != null){
            disciplinas.add(nome);
        }
    }
}
