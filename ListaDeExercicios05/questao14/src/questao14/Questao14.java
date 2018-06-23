/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao14;

/**
 *
 * @author Thiago
 */
public class Questao14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            TesteException teste = new TesteException();
        } catch (SomeException e){
            System.out.println(e.getMessage());
        }
    }

    
    
}
