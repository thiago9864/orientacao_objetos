/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */

/*
b) Classe Casa:
ok • Atributos: array de eletrodomésticos e um atributo estático para contagem
de eletrodomésticos da casa;
ok • Construtor da classe;
ok • Um método para adicionar um eletrodoméstico na casa;
ok • Um método para calcular o consumo total de energia da casa no mês;
• Um método para imprimir o consumo total da casa no mês e o consumo
relativo de cada eletrodoméstico no mês (% consumo eletrodoméstico /
consumo total da casa).
*/
public class Casa {
    private ArrayList<Eletrodomestico> arEletro;
    private static int numEletro = 0;
    private int[] diasMes = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    
    public Casa(){
        arEletro = new ArrayList<>();
    }

    public static int getNumEletro() {
        return numEletro;
    }
    
    public void addEletrodomestico(Eletrodomestico eletro) {
        if(eletro != null){
            arEletro.add(eletro);
            numEletro++;
        }
    }
    
    public int consumoTotalNoMes(int numMes){
        int consumoMes = 0;
        
        for(Eletrodomestico e : arEletro){
            consumoMes += e.calculaConsumoMensal(diasMes[numMes]);
        }
        
        return consumoMes;
    }
    
    public void imprimeConsumoTotalNoMes(int numMes){
        int consumoTotal = consumoTotalNoMes(numMes);
        
        System.out.println("*** Relatorio do mes " + numMes + " ***\n");
        
        System.out.println("Consumo total:  " + consumoTotal + " kwh");
        
        for(Eletrodomestico e : arEletro){
            float consumoMes = e.calculaConsumoMensal(diasMes[numMes]);
            int consRelativo = (int)((consumoMes / (float)consumoTotal) * 100);
            System.out.println("Consumo relativo do eletrodomestico '" + e.getNome() + "': " + consRelativo + "%");
        }
    }

}