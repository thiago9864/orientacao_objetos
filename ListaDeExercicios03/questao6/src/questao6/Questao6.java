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
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FuncProfessor p1 = new FuncProfessor(1200.0f, "Fulano da Silva");
        FuncProfessor p2 = new FuncProfessor(1310.0f, "Jane Doe");
        
        FuncAdministrativo a1 = new FuncAdministrativo(5500.0f, "Siclano de Almeida");
        FuncAdministrativo a2 = new FuncAdministrativo(8900.0f, "Beltrano Barbosa");
        
        p1.setNumFaltas(0);
        p1.setNumHorasExtras(6);
        p1.imprime();
        
        p2.setNumFaltas(1);
        p2.setNumHorasExtras(8);
        p2.imprime();
        
        a1.setNumFaltas(4);
        a1.setNumHorasExtras(2);
        a1.imprime();
        
        a2.setNumFaltas(6);
        a2.setNumHorasExtras(0);
        a2.imprime();
        
        FolhaPagamento folha = new FolhaPagamento();
        
        folha.addFuncionario(p1);
        folha.addFuncionario(p2);
        folha.addFuncionario(a1);
        folha.addFuncionario(a2);
        
        folha.geraFolhaPagamento();
    }
    
}
