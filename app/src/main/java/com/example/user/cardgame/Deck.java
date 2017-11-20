package com.example.user.cardgame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 17/11/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        generateDeck();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void generateDeck(){
        for (Rank rank : Rank.values()){
                cards.add(new Card(rank));
            }
    }


    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card removeCard(){
        return cards.remove(0);
    }
}