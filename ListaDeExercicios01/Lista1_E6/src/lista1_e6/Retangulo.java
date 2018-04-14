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
public class Retangulo {
    private float altura = 1, largura = 1;
    
    public Retangulo(){}

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura > 0 && altura < 20.0f){
            this.altura = altura;
        }
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if(largura > 0 && largura < 20.0f){
            this.largura = largura;
        }
    }
    
    
    public float perimetro(){
        return (largura * 2) + (altura * 2);
    }
    
    public float area(){
        return largura * altura;
    }
}
