/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author Thiago
 */
public class Docente extends Medico {
    private int CRM;

    public Docente(int CRM, int cod, String nome) {
        super(cod, nome);
        this.CRM = CRM;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }
    
}
