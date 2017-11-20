package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/11/2017.
 */

public class TestGame {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void setUp(){
        player1 = new Player("Zack");
        player2 = new Player("Finn");
        game = new Game(player1, player2);

    }

    @Test
    public void canGetplayer(){
        assertEquals("Zack", player1.getName());
    }

    @Test
    public void canGetCards(){
        Deck deck = new Deck();
        deck.generateDeck();
        game.dealCards();

        assertEquals(2, player1.getNumberOfCards());
    }
}
