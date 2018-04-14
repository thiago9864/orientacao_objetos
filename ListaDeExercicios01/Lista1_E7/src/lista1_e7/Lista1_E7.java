/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e7;

/**
 *
 * @author Thiago
 */
public class Lista1_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Data D1 = new Data(24, 3, 2018);
        System.out.println("Data: " + D1.gerarFormato1());
        
        Data D2 = new Data(24, "Março", 2018);
        System.out.println("Data: " + D2.gerarFormato2());
        
        Data D3 = new Data(83, 2018);
        System.out.println("Data: " + D3.gerarFormato3());
    }
    
}
