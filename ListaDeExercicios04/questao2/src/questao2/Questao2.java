/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Personagem> personagens = new ArrayList<>();
        
        personagens.add(new Atleta("Atleta"));
        personagens.add(new Bicicleta("Bicicleta"));
        personagens.add(new Carro("Carro Comum", 50));
        personagens.add(new CarroHibrido("Carro Hibrido", 50, 100));
        personagens.add(new Moto("Motocicleta", 25));
        
        int numCasasDestino = 200;
        boolean temVencedor = false;
        int rodada = 1;
        
        while(!temVencedor){
            System.out.println("\nRodada #" + rodada++);
            for(Personagem p : personagens){
               p.andar(jogarDado());
               System.out.printf("Personagem %s esta na casa %d\n", p.getNome(), p.getNumCasas());
               
               if(p.getNumCasas() > numCasasDestino){
                   temVencedor = true;
                   System.out.printf("Personagem %s venceu o jogo\n", p.getNome());
                   break;
               }
            }
        }
        
    }

    private static int jogarDado() {
        return (int)(Math.random() * 6) + 1;
    }
    
}
