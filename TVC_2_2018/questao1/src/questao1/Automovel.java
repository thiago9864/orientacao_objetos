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
Classe Automovel que encapsula os dados de um automóvel à venda:
1. atributos privados da classe: modelo, cor, tipo de combustível;
2. 1 construtor para inicializar esses atributos e métodos get e set para
manipulá-los;
3. 5 atributos estáticos e finais: movidoGasolina (valor = 1),
movidoAlcool (valor = 2), movidoDiesel (valor = 3), movidoGas
(valor = 4), maximoPrestacoes (valor = 24);
4. método quantoCusta() que retorna o preço do automóvel, calculado
de acordo com o preço do combustível. Atribua valores diferentes de
preço para cada tipo de combustível;
5. método quantasPrestacoes() que retorna o número máximo de
prestações para o tipo de automóvel;
6. método imprimeDados() para mostrar na tela os atributos de
automóvel e o tipo de combustível;
*/
public class Automovel {
    private String modelo, cor;
    private int tipoCombustivel;
    
    private static final int movidoGasolina=1;
    private static final int movidoAlcool=2;
    private static final int movidoDiesel=3;
    private static final int movidoGas=4;
    
    private static final int maximoPrestacoes=24;

    public Automovel(){}
    
    public Automovel(String modelo, String cor, int tipoCombustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    /*
    metodos
    */
    
    public float quantoCusta() {
        float preco_carro = 25000.0f;
        
        if(this.tipoCombustivel == movidoGasolina){
            preco_carro = 37521.00f;
        }
        if(this.tipoCombustivel == movidoAlcool){
            preco_carro = 25521.75f;
        }
        if(this.tipoCombustivel == movidoDiesel){
            preco_carro = 42544.15f;
        }
        if(this.tipoCombustivel == movidoGas){
            preco_carro = 30015.75f;
        }  
        
        return preco_carro;
    }
    
    public int quantasPrestacoes() {
        return maximoPrestacoes;
    }
    
    public void imprimeDados() {
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        
        if(this.tipoCombustivel == movidoGasolina){
            System.out.println("TipoCombustivel: Gasolina");
        }
        if(this.tipoCombustivel == movidoAlcool){
            System.out.println("TipoCombustivel: Alcool");
        }
        if(this.tipoCombustivel == movidoDiesel){
            System.out.println("TipoCombustivel: Diesel");
        }
        if(this.tipoCombustivel == movidoGas){
            System.out.println("TipoCombustivel: Gas");
        }  
        
    }
    
    public void imprimeDados(boolean comPreco, boolean comPrestacoes) {
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        
        if(this.tipoCombustivel == movidoGasolina){
            System.out.println("TipoCombustivel: Gasolina");
        }
        if(this.tipoCombustivel == movidoAlcool){
            System.out.println("TipoCombustivel: Alcool");
        }
        if(this.tipoCombustivel == movidoDiesel){
            System.out.println("TipoCombustivel: Diesel");
        }
        if(this.tipoCombustivel == movidoGas){
            System.out.println("TipoCombustivel: Gas");
        }  

        if(comPrestacoes){
            System.out.println("Maximo Prestacoes: " + this.maximoPrestacoes); 
        }
        if(comPreco){
            System.out.println("Valor do Automovel: R$ " + this.quantoCusta());
        }
    }
    
    
}
