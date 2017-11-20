package com.example.user.cardgame;

import java.util.ArrayList;

/**
 * Created by user on 17/11/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }


    public int getTotalValueOfCards() {
        int totalValue = 0;

        for(Card card : this.cards) {
            totalValue += card.getValue();
        }

        return totalValue;
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }

    public void takeCard(Card card){
        this.cards.add(card);
    }

    public String getHand(){
        String hands = "";

        for (Card card : cards){
            String value = card.getRank().toString() + " : ";
            hands += value;
        }

        return hands;
    }






}
