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
public class Funcionario extends Pessoa {
    private int matricula;
    private String unidade, depto;

    public Funcionario(int matricula, String unidade, String depto, String nome, String dataNascimento, char sexo) {
        super(nome, dataNascimento, sexo);
        this.matricula = matricula;
        this.unidade = unidade;
        this.depto = depto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
    
    
}
