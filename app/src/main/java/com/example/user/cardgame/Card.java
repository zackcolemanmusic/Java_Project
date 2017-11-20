package com.example.user.cardgame;

/**
 * Created by user on 17/11/2017.
 */

public class Card {


    Rank rank;

    public Card( Rank rank) {
        this.rank = rank;
    }


    public Rank getRank() {
        return rank;
    }

    public int getValue(){
        return this.rank.getValue();
    }

}