/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author ice
 */
public class Pagamento {
    private float valor;
    private String formaPgto;

    public Pagamento(float valor, String formaPgto) {
        this.valor = valor;
        this.formaPgto = formaPgto;
    }
    
    public Pagamento(String formaPgto) {
        this.valor = valor;
        this.formaPgto = formaPgto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }
    
    /*
    metodos
    */
    
    public float calculaValor(int numCopias, int maxCopias){
        if(numCopias <= maxCopias){
            return 0;
        }   
        return (numCopias - maxCopias) * 0.25f;
    }
}
