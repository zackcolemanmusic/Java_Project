package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/11/2017.
 */

public class TestPlayer {

    Player player;
    Card card;

    @Before
    public void setup() {
        player = new Player("Zack");
        card = new Card(Rank.NINE);
    }

    @Test
    public void playerCanGetTotalValue() {
        Card otherCard = new Card(Rank.FIVE);
        player.takeCard(otherCard);
        player.takeCard(card);

        assertEquals(14, player.getTotalValueOfCards());
    }

    @Test
    public void canGetName() {
        assertEquals("Zack", player.getName());
    }

    @Test
    public void playerStartsWithZeroCards() {
        assertEquals(0, player.getNumberOfCards());
    }

    @Test
    public void canTakeCard() {
        player.takeCard(card);
        assertEquals(1, player.getNumberOfCards());
    }
}
