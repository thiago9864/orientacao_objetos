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
c) Classe AutomovelLuxo que é subclasse de AutomovelBasico e encapsula
os dados de um automóvel de luxo à venda:

1. atributos privados e booleanos da classe: direcaoHidraulica,
cambioAutomatico, vidrosEtravasEletricos e métodos get e set
para manipulá-los;

2. 1 variável estática e final maximoPrestacoes (valor = 36);

3. 2 construtores para a classe, sendo um para inicializar todos os
dados de um automóvel de luxo e outro para inicializar apenas os
atributos desta subclasse;

4. método quantoCusta() que retorna o preço do automóvel usando o
método da superclasse e acrescentando o valor dos itens de luxo;

5. método imprimeDados() para mostrar na tela os atributos de um
automóvel de luxo, usando também o método da superclasse;

6. método quantasPrestacoes() que retorna o número máximo de
prestações para o tipo de automóvel;
*/

public class AutomovelLuxo extends AutomovelBasico {
    private boolean direcaoHidraulica, cambioAutomatico;
    private boolean vidrosEtravasEletricos;
    
    //valores dos itens
    private static final float valorDirecaoHidraulica=2450.0f;
    private static final float valorCambioAutomatico=7550.25f;
    private static final float valorVidrosEtravasEletricos=3199.26f;
    
    private static final int maximoPrestacoes=36;

    public AutomovelLuxo(boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidrosEtravasEletricos, boolean retrovisorPassageiro, boolean limpadorTraseiro, boolean rádioAMFM, String modelo, String cor, int tipoCombustivel) {
        super(retrovisorPassageiro, limpadorTraseiro, rádioAMFM, modelo, cor, tipoCombustivel);
        this.direcaoHidraulica = direcaoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
        this.vidrosEtravasEletricos = vidrosEtravasEletricos;
    }

    public AutomovelLuxo(boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidrosEtravasEletricos) {
        this.direcaoHidraulica = direcaoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
        this.vidrosEtravasEletricos = vidrosEtravasEletricos;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isVidrosEtravasEletricos() {
        return vidrosEtravasEletricos;
    }

    public void setVidrosEtravasEletricos(boolean vidrosEtravasEletricos) {
        this.vidrosEtravasEletricos = vidrosEtravasEletricos;
    }
    
    /*
    metodos
    */
    
    @Override
    public int quantasPrestacoes() {
        return maximoPrestacoes;
    }
    
    @Override
    public float quantoCusta() {
        float valor_base = super.quantoCusta();
        
        if(direcaoHidraulica){
            valor_base += valorDirecaoHidraulica;
        }
        if(cambioAutomatico){
            valor_base += valorCambioAutomatico;
        }
        if(vidrosEtravasEletricos){
            valor_base += valorVidrosEtravasEletricos;
        }
        
        return valor_base;
    }
    
    @Override
    public void imprimeDados() {
        
        super.imprimeDados(false, false);
        
        System.out.println("Itens adicionais:");
        if(direcaoHidraulica){
            System.out.println("Direcao Hidraulica - Valor adicional: R$ "+ valorDirecaoHidraulica);
        }
        if(cambioAutomatico){
            System.out.println("Cambio Automatico - Valor adicional: R$ "+ valorCambioAutomatico);
        }
        if(vidrosEtravasEletricos){
            System.out.println("Vidros e Travas Eletricos - Valor adicional: R$ "+ valorVidrosEtravasEletricos);
        }
        
        System.out.println("Maximo Prestacoes: " + this.maximoPrestacoes); 
        System.out.println("Valor do Automovel: R$ " + this.quantoCusta());
    }
    
}
