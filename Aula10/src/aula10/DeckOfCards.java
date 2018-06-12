/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class DeckOfCards {
    
    private List <Card> list;
    
    public DeckOfCards(){
        Card[] deck = new Card[52];
        int count = 0;

        for(Card.Suit suit : Card.Suit.values()){
            for(Card.Face face : Card.Face.values()){
                deck[count] = new Card(face, suit);
                count++;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }
    
    public void printCards(){
        for(int i=0; i < list.size(); i++){
            System.out.printf("%-19s%s", list.get(i), ((i+1)%4 == 0) ? "\n" : "");
        }
    }

}

