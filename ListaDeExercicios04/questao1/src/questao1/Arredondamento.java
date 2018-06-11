/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author thiagoalmeida
 */
public class Arredondamento {
    static public Float arredonda(float valor, int casasDecimais){
         return Math.round(valor * (float)Math.pow(10, casasDecimais)) / (float)Math.pow(10, casasDecimais);
    }
}
