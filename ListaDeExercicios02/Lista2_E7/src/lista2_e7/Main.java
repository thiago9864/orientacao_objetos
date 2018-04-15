/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e7;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa e = new Empresa();
        
        System.out.println("a) R$ 500 – R$ 510 (todos valores inteiros)");
        for(int i = 500; i <= 510; i++){
            e.setValorBrutoParaVendedor((float) i);
        }
        e.imprimeGanhosPessoalVendas();
        
        System.out.println("\nb) R$ 600, R$ 650, R$ 700, R$ 750, R$ 800, R$ 850");
        e.resetVendedores();
        for(int i = 600; i <= 850; i+=50){
            e.setValorBrutoParaVendedor((float) i);
        }
        e.imprimeGanhosPessoalVendas();
        
        System.out.println("\nc) R$ 401 – R$ 499 (apenas valores ímpares inteiros)");
        e.resetVendedores();
        for(int i = 401; i <= 499; i+=2){
            e.setValorBrutoParaVendedor((float) i);
        }
        e.imprimeGanhosPessoalVendas();
        
        System.out.println("\nd) R$ 1000, R$ 1500, R$ 2000, ......., R$ 3500, R$ 4000");
        e.resetVendedores();
        for(int i = 1000; i <= 4000; i+=500){
            e.setValorBrutoParaVendedor((float) i);
        }
        e.imprimeGanhosPessoalVendas();
    }
    
}
