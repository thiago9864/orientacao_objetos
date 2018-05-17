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
3) (10 pontos) Preocupada com o aumento dos valores da conta de energia, uma
família contratou os serviços de um programador para criar um sistema de controle
do consumo de energia da casa. Assuma a função de programador Java desta
família e desenvolva um programa que inclua as seguintes classes:

a) Classe Eletrodoméstico:
• Atributos: nome, potência (em quilowatts) e tempo diário de
funcionamento (em horas)
• Construtor(es) da classe;
• Método para obter o nome do eletrodoméstico;
• Método para calcular o consumo mensal de um eletrodoméstico(kw/h);

b) Classe Casa:
• Atributos: array de eletrodomésticos e um atributo estático para contagem
de eletrodomésticos da casa;
• Construtor da classe;
• Um método para adicionar um eletrodoméstico na casa;
• Um método para calcular o consumo total de energia da casa no mês;
• Um método para imprimir o consumo total da casa no mês e o consumo
relativo de cada eletrodoméstico no mês (% consumo eletrodoméstico /
consumo total da casa).

c) Classe TestePrograma:
• Deve incluir o método void main() para testar seu programa com 5
eletrodomésticos na casa e imprimir os consumos total e relativo.
*/
public class TestePrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa c = new Casa();
        
        c.addEletrodomestico(new Eletrodomestico("Geladeira", 0.22f, 8.0f));
        c.addEletrodomestico(new Eletrodomestico("Televisão", 0.11f, 7.0f));
        c.addEletrodomestico(new Eletrodomestico("Secador de Cabelo", 2.4f, 1.5f));
        c.addEletrodomestico(new Eletrodomestico("Computador", 0.095f, 6.5f));
        c.addEletrodomestico(new Eletrodomestico("Lampada Economica", 0.01f, 8.0f));
        
        c.imprimeConsumoTotalNoMes(3);
    }
    
}
