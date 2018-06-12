/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author thiagoalmeida
 */
public abstract class Contribuinte {
    private String nome;
    private float rendaBruta = 0;
    private float aliquota = 0.1f;//10%

    public Contribuinte(String nome, float rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public float getAliquota() {
        return aliquota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }
    
    public void calculaImpostoPessoa(){
        float imposto = rendaBruta * aliquota;
        System.out.println("Renda Bruta: R$" + Arredondamento.arredonda(rendaBruta, 2).toString());
        System.out.println("Aliquota: " + Arredondamento.arredonda(aliquota * 100, 2).toString() + "%");
        System.out.println("Imposto: R$" + imposto);
        System.out.println("");        
    }
    
}
