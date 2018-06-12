/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author ice
 */
public class TestePrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Quadrado q = new Quadrado(2);
        Retangulo r = new Retangulo(2, 6);
        Circulo c = new Circulo(3);
        
        imprimeFigura(q);
        imprimeFigura(r);
        imprimeFigura(c);
    }
    
    
    public static void imprimeFigura(Figura f){
        
        if(f instanceof Quadrado){
            Quadrado q = (Quadrado)f;
            System.out.println("\n*** Quadrado ***");
            System.out.println("X: " + q.getX());
            System.out.println("Y: " + q.getY());
            System.out.println("Area: " + q.calcularArea());
            System.out.println("Perimetro: " + q.calcularPerimetro());
        }
        
        if(f instanceof Retangulo){
            Retangulo r = (Retangulo)f;
            System.out.println("\n*** Retangulo ***");
            System.out.println("X: " + r.getX());
            System.out.println("Y: " + r.getY());
            System.out.println("Area: " + r.calcularArea());
            System.out.println("Perimetro: " + r.calcularPerimetro());
        }
        
        if(f instanceof Circulo){
            Circulo c = (Circulo)f;
            System.out.println("\n*** Circulo ***");
            System.out.println("X: " + c.getX());
            System.out.println("Y: " + c.getY());
            System.out.println("Area: " + c.calcularArea());
            System.out.println("Perimetro: " + c.calcularPerimetro());
        }
        
        
    }
    
}
