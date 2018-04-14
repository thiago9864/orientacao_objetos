/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e6;

/**
 *
 * @author Thiago
 */
public class Lista1_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Retangulo  R1 = new Retangulo();
        Retangulo  R2 = new Retangulo();
        Retangulo  R3 = new Retangulo();
        Retangulo  R4 = new Retangulo();
        
        R1.setAltura(2.0f);
        R1.setLargura(4.0f);
        
        R2.setAltura(2.2f);
        R2.setLargura(4.7f);
        
        R3.setAltura(20.1f);
        R3.setLargura(14.0f);
        
        R4.setAltura(55.0f);
        R4.setLargura(45.0f);
        
        System.out.println("Retangulo R1, Area: " + R1.area() + " Perimetro: " + R1.perimetro());
        System.out.println("Retangulo R2, Area: " + R2.area() + " Perimetro: " + R2.perimetro());
        System.out.println("Retangulo R3, Area: " + R3.area() + " Perimetro: " + R3.perimetro());
        System.out.println("Retangulo R4, Area: " + R4.area() + " Perimetro: " + R4.perimetro());
    }
    
}
