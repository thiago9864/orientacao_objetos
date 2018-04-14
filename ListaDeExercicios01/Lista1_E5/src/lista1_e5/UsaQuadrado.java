/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_e5;

/**
 *
 * @author Thiago
 */
public class UsaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado q1, q2, q3;
        
        q1 = new Quadrado(1);
        q2 = new Quadrado(2);
        q3 = new Quadrado(4);
        
        System.out.println("Area do Q1: " + q1.calcularArea());
        System.out.println("Perimetro do Q1: " + q1.calcularPerimetro());
        
        System.out.println("Area do Q2: " + q2.calcularArea());
        System.out.println("Perimetro do Q2: " + q2.calcularPerimetro());
        
        System.out.println("Area do Q3: " + q3.calcularArea());
        System.out.println("Perimetro do Q3: " + q3.calcularPerimetro());
    }
    
}
