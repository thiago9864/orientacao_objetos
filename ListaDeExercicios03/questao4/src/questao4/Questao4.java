/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author Thiago
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", 2.0f, "Terra");
        Peixe tubarao = new Peixe("Tubarão", 300, "Cinzento", "Mar", 1.5f, 1, true);
        Urso ursoCanada = new Urso("Urso do Canadá", 180, 4, "Vermelho", "Terra", 0.5f);
        
        camelo.imprime();
        
        System.out.println("");
        tubarao.imprime();
        
        System.out.println("");
        ursoCanada.imprime();
        
    }
    
}
