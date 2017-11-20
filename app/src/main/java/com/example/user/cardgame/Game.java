package com.example.user.cardgame;

/**
 * Created by user on 17/11/2017.
 */

public class Game {

    Deck deck;
    Player player1;
    Player player2;

    public Game(Player player1, Player player2){
        this.deck = new Deck();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void shuffleDeck(){
        deck.shuffle();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void dealCards(){
        deck.shuffle();
        Card card = deck.removeCard();
        player1.takeCard(card);
        card = deck.removeCard();
        player1.takeCard(card);

        card = deck.removeCard();
        player2.takeCard(card);
        card = deck.removeCard();
        player2.takeCard(card);

    }

    public Player getWinner() {
        int player1Value = player1.getTotalValueOfCards();
        int player2Value = player2.getTotalValueOfCards();


        if (player1Value > player2Value) {
            return player1;
        } else if (player1Value < player2Value) {
            return player2;
        } else return null;

    }






}
