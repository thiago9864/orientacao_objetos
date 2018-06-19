/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.List;

/**
 *
 * @author thiagoalmeida
 */
public class ListaMerge {
    public static Integer merge(List<Integer> lista, int pos1, int pos2){
        int menor_indice = 0;
        Integer objCombinado = -1;
        
        //combina na menor posicao informada
        if(pos1 <= pos2){
            menor_indice=pos1;
        }else{
            menor_indice=pos1;
        }
        
        try 
        {
            objCombinado = lista.get(pos1) + lista.get(pos2);
            lista.add(menor_indice, objCombinado);
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
        return objCombinado;
        
    }
}
