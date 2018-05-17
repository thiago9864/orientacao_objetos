/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author Thiago
 */

/*
a) Classe Eletrodoméstico:
• Atributos: nome, potência (em quilowatts) e tempo diário de
funcionamento (em horas)
• Construtor(es) da classe;
• Método para obter o nome do eletrodoméstico;
• Método para calcular o consumo mensal de um eletrodoméstico(kw/h);
*/
public class Eletrodomestico {
    private String nome;
    private float potencia;
    private float tempoFuncionamentoDiario;
    
    public Eletrodomestico(String nome, float potencia, float tempoFuncionamentoDiario) {
        this.nome = nome;
        this.potencia = potencia;
        this.tempoFuncionamentoDiario = tempoFuncionamentoDiario;
    }

    public String getNome() {
        return nome;
    }
    
    public float calculaConsumoMensal(int diasMes){
        return potencia * tempoFuncionamentoDiario * diasMes;
    }
}
