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
Classe Retangulo como subclasse de Figura, que inclua um construtor
implementado com herança e os métodos calcularArea() e
calcularPerimetro() para cálculos desses valores para retângulos;
*/
public class Retangulo extends Figura {

    public Retangulo(int X, int Y) {
        super(X, Y);
    }
    
    @Override
    public float calcularArea(){
        return super.getX() * super.getY();
    }
    
    @Override
    public float calcularPerimetro(){
        return (2 * super.getX()) + (2 * super.getY());
    }
}
