package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 17/11/2017.
 */

public class TestGame {

    Game game;
    Game spyGame;
    Player player1;
    Player player2;

    @Before
    public void setUp(){
        player1 = new Player("Zack");
        player2 = new Player("Finn");
        game = new Game(player1, player2);
        spyGame = Mockito.spy(game);
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

    @Test
    public void canShuffleDeck(){
        Deck deck = new Deck();
        game.shuffleDeck();
        assertNotNull(deck.cards);

    }

    @Test
    public void canGetWinner(){

        Player player1 = new Player("Darren");
        player1 = Mockito.spy(player1);

        Player player2 = new Player("Zack");
        player2 = Mockito.spy(player2);

        Mockito.when(player1.getTotalValueOfCards()).thenReturn(15);
        Mockito.when(player2.getTotalValueOfCards()).thenReturn(10);

        spyGame = new Game(player1, player2);

        Player winner = spyGame.getWinner();

        assertEquals(player1, winner);

    }


}
