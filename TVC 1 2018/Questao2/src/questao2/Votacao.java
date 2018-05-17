/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Thiago
 */

public class Votacao {
    private int[] votos;
    private int numVotos = 55;
    
    public Votacao(){
        votos = new int[numVotos];
    }

    public int[] getVotos() {
        return votos;
    }
    
    /*
     * Implementacao de metodos
     */
    
    private int geraVoto(){
        return (int)(Math.random() * 5);//gera numeros de 0 a 5
    }
    
    public int computaVotos(){
        
        //gerando os votos automaticamente
        for(int i=0; i < numVotos; i++){
            votos[i] = geraVoto();
        }
        
        return numVotos;
    }
    
    public void apurarEleicao(int[] votos, int numVotos){
        int [] resultado = new int[5];
        
        //inicializa o vetor resultado
        for(int i=0; i < 5; i++){
            resultado[i] = 0;
        }
        
        //Apura eleicao
        for(int i=0; i < numVotos; i++){
            int voto = votos[i];
            
            if(voto <= 3){
                //armazena qtd de votos em cada opção
                resultado[voto] += 1;
            } else {
                //armazena qtd de votos nulos
                resultado[4] += 1;
            }
        }
        
        //Imprime resultados
        System.out.println("*** Resultado da eleição ***\n");
        System.out.println("Votos no candidato 1: " + resultado[1]);
        System.out.println("Votos no candidato 2: " + resultado[2]);
        System.out.println("Votos no candidato 3: " + resultado[3] + "\n");
        System.out.println("Votos em branco: " + resultado[0]);
        System.out.println("Votos nulos: " + resultado[4]);
        System.out.println("Total de votos: " + numVotos);
    }
    
}
