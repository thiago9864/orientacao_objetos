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
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    
    /*
    1. 1 instância da classe Automovel, a impressão dos seus dados,
    quanto custa e quantas prestações;

    2. 1 instância da classe AutomovelBasico, a impressão dos seus dados,
    quanto custa e quantas prestações;

    3. 1 instância da classe AutomovelLuxo, a impressão dos seus dados,
    quanto custa e quantas prestações.
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovel auto = new Automovel("Corsa", "Verde", 4);
        
        System.out.println("*** Automovel ***");
        auto.imprimeDados(true, true);
        
        
        AutomovelBasico auto_basico = new AutomovelBasico(true, false, true, "Gol", "Preto", 2);
        
        System.out.println("\n*** Automovel Basico ***");
        auto_basico.imprimeDados();
        
        AutomovelLuxo auto_luxo = new AutomovelLuxo(true, true, true, true, true, true, "Honda Civic", "Cinza", 1);
        
        System.out.println("\n*** Automovel de Luxo ***");
        auto_luxo.imprimeDados();
    }
    
}
