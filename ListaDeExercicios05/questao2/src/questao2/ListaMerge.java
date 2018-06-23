/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thiagoalmeida
 */
public class ListaMerge {
    public static List<Integer> merge(List<Integer> lista_a, List<Integer> lista_b){
       
        List<Integer> lista_merge = new LinkedList<Integer>();
        int tamanho = lista_a.size() + lista_b.size();
        int a = 0, b = 0;
        
        for(int i=0; i < tamanho; i++){
            if(i%2 == 0){
                lista_merge.add(lista_a.get(a));
                a++;
            } else {
                lista_merge.add(lista_b.get(b));
                b++;
            }
        }
        
       
        return lista_merge;
        
    }
}
