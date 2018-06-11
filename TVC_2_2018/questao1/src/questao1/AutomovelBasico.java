/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author ice
 */

/*

Classe AutomovelBasico que é subclasse de Automovel e encapsula os
dados de um automóvel básico à venda:
1. atributos privados e booleanos da classe: retrovisorPassageiro,
limpadorTraseiro, rádioAMFM e métodos get e set para manipulá-
los;
2. 2 construtores para a classe, sendo um para inicializar todos os
dados de um automóvel básico e outro para inicializar apenas os
atributos desta subclasse;
3. método quantoCusta() que retorna o preço do automóvel usando o
método da superclasse e acrescentando o valor dos itens básicos;
4. método imprimeDados() para mostrar na tela os atributos de um
automóvel básico, usando também o método da superclasse;

*/

public class AutomovelBasico extends Automovel {
    private boolean retrovisorPassageiro, limpadorTraseiro;
    private boolean radioAMFM;
    
    //valores dos itens
    private static final float valorRetrovisorPassageiro=450.0f;
    private static final float valorLimpadorTraseiro=3550.25f;
    private static final float valorRadioAMFM=1899.26f;
    
    public AutomovelBasico(){}
    
    public AutomovelBasico(boolean retrovisorPassageiro, boolean limpadorTraseiro, boolean rádioAMFM, String modelo, String cor, int tipoCombustivel) {
        super(modelo, cor, tipoCombustivel);
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.limpadorTraseiro = limpadorTraseiro;
        this.radioAMFM = rádioAMFM;
    }
    
    public AutomovelBasico(boolean retrovisorPassageiro, boolean limpadorTraseiro, boolean radioAMFM) {
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.limpadorTraseiro = limpadorTraseiro;
        this.radioAMFM = radioAMFM;
    }

    public boolean isRetrovisorPassageiro() {
        return retrovisorPassageiro;
    }

    public void setRetrovisorPassageiro(boolean retrovisorPassageiro) {
        this.retrovisorPassageiro = retrovisorPassageiro;
    }

    public boolean isLimpadorTraseiro() {
        return limpadorTraseiro;
    }

    public void setLimpadorTraseiro(boolean limpadorTraseiro) {
        this.limpadorTraseiro = limpadorTraseiro;
    }

    public boolean isRadioAMFM() {
        return radioAMFM;
    }

    public void setRadioAMFM(boolean rádioAMFM) {
        this.radioAMFM = rádioAMFM;
    }
    
    /*
    metodos
    */
    
    @Override
    public float quantoCusta() {
        float valor_base = super.quantoCusta();
        
        if(retrovisorPassageiro){
            valor_base += valorRetrovisorPassageiro;
        }
        if(limpadorTraseiro){
            valor_base += valorLimpadorTraseiro;
        }
        if(radioAMFM){
            valor_base += valorRadioAMFM;
        }
        
        return valor_base;
    }
    
    @Override
    public void imprimeDados() {        
        super.imprimeDados(false, true);
        
        System.out.println("Itens adicionais:");
        if(retrovisorPassageiro){
            System.out.println("Retrovisor Passageiro - Valor adicional: R$ "+ valorRetrovisorPassageiro);
        }
        if(limpadorTraseiro){
            System.out.println("Limpador Traseiro - Valor adicional: R$ "+ valorLimpadorTraseiro);
        }
        if(radioAMFM){
            System.out.println("Radio AM/FM - Valor adicional: R$ "+ valorRadioAMFM);
        }
        
        System.out.println("Valor do Automovel: R$ " + this.quantoCusta());
    }
    
    public void imprimeDados(boolean comPreco, boolean comPrestacoes) {        
        super.imprimeDados(false, comPrestacoes);
        
        System.out.println("Itens adicionais:");
        if(retrovisorPassageiro){
            System.out.println("Retrovisor Passageiro - Valor adicional: R$ "+ valorRetrovisorPassageiro);
        }
        if(limpadorTraseiro){
            System.out.println("Limpador Traseiro - Valor adicional: R$ "+ valorLimpadorTraseiro);
        }
        if(radioAMFM){
            System.out.println("Radio AM/FM - Valor adicional: R$ "+ valorRadioAMFM);
        }
        
        if(comPreco){
            System.out.println("Valor do Automovel: R$ " + this.quantoCusta());
        }
    }
    
}
