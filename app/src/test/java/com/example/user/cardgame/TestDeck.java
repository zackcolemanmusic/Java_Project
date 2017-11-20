package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/11/2017.
 */

public class TestDeck {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void canGenerateDeck(){
        assertEquals(13, deck.getCards().size());
    }

    @Test
    public void canGetCard(){
        Card card = deck.removeCard();
        assertEquals(Rank.KING, card.getRank());
    }
}