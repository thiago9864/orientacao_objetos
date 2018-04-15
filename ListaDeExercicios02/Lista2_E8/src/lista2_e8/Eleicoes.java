/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Eleicoes {
    private ArrayList<Integer> votos;
    private Scanner s;
    
    public Eleicoes(){
        s = new Scanner(System.in);
        votos = new ArrayList<>();
    }
    
    public void lerVotos(){
        System.out.println("*** Leitura de votos ***");
        int voto = 9;
        
        while(voto >= 0){
            System.out.print("Digite o numero do candidato: ");
            voto = s.nextInt();
            System.out.print("\n");
            
            if(voto >= 0){
                votos.add(voto);
            }
        }
        
    }
    
    public void imprimeResultado(){
        System.out.println("*** Resultado das eleições ***");
        
        int[] tipoVotos = new int[6];
        for(int i=0; i<6; i++){
            tipoVotos[i] = 0;
        }
        
        for(Integer voto : votos){
            if(voto > 4){
                tipoVotos[5] += 1;
            } else {
                tipoVotos[voto] += 1; 
            }
        }
        
        System.out.println("Votos no candidato 1: " + tipoVotos[1]);
        System.out.println("Votos no candidato 2: " + tipoVotos[2]);
        System.out.println("Votos no candidato 3: " + tipoVotos[3]);
        System.out.println("Votos no candidato 4: " + tipoVotos[4]);
        System.out.println("\nVotos em branco: " + tipoVotos[0]);
        System.out.println("Votos em nulos: " + tipoVotos[0]);

    }
}
