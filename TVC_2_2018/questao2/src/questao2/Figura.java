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
a) Classe Figura com atributos privados X e Y, construtor, métodos get e set.
Inclua os métodos calcularArea() e calcularPerimetro() na classe Figura,
que serão sobrepostos por métodos de mesmo nome das subclasses;
*/
public class Figura {
    private int X, Y;

    public Figura(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    
    public float calcularArea(){
        return X * Y;
    }
    
    public float calcularPerimetro(){
        return (2 * X) + (2 * Y);
    }
    
}
