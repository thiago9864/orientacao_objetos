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

/*
d) Classe Circulo como subclasse de Figura, que inclua um construtor
implementado com herança e os métodos calcularArea() e
calcularPerimetro() para cálculos desses valores para círculos;
*/
public class Circulo extends Figura {

    public Circulo(int raio) {
        super(raio, raio);
    }
    
    @Override
    public float calcularArea(){
        return  (float)(Math.PI * Math.pow(super.getX(), 2));
    }
    
    @Override
    public float calcularPerimetro(){
        return (float)(2 * Math.PI * super.getX());
    }
}
