/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Thiago
 */
public class Amigo extends Pessoa {
    private String diaAniversario;

    public Amigo() {}

    public Amigo(String diaAniversario, String nome, char sexo, int idade) {
        super(nome, sexo, idade);
        this.diaAniversario = diaAniversario;
    }    
    
}
