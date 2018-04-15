/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_e1;

/**
 *
 * @author Thiago de Almeida Lopes, 201765556AC
 * Segunda Lista de Exercícios
 * 
 */
public class TestaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria conta1 = new ContaBancaria("Fulano", 0);
        ContaBancaria conta2 = new ContaBancaria("Siclano", 0);
        
        System.out.println("-> Deposita 800 reais na conta 1");
        conta1.depositar(800.0f);
        conta1.imprimeDadosConta();
        
        System.out.println("-> Deposita 200 reais na conta 1");
        conta1.depositar(200.0f);
        conta1.imprimeDadosConta();
        
        System.out.println("-> Deposita 500 reais na conta 2");
        conta2.depositar(500.0f);
        conta2.imprimeDadosConta();
        
        System.out.println("-> Deposita 500 reais na conta 2");
        conta2.depositar(500.0f);
        conta2.imprimeDadosConta();
        
        System.out.println("-> Sacar 200 reais da conta 1");
        conta1.sacar(200.0f);
        conta1.imprimeDadosConta();
        
        System.out.println("-> Sacar 400 reais da conta 1");
        conta1.sacar(400.0f);
        conta1.imprimeDadosConta();
        
        System.out.println("-> Sacar 600 reais da conta 2");
        conta2.sacar(600.0f);
        conta2.imprimeDadosConta();
        
        System.out.println("-> Sacar 900 reais da conta 2");
        conta2.sacar(900.0f);
        conta2.imprimeDadosConta();
        
        System.out.println("-> Atualiza nome da conta 1");
        conta1.setTitular("Fulano da Silva");
        conta1.imprimeDadosConta();
        
        System.out.println("-> Atualiza nome da conta 2");
        conta2.setTitular("Siclano de Almeida");
        conta2.imprimeDadosConta();
        
    }
    
}
