package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class HandOfCardsTest {
PlayingCard card1,card2,card3,card4;
ArrayList<PlayingCard> flushList;
HandOfCards handOfCards;


    @BeforeEach
    public void reset(){
         card1 = new PlayingCard('❤',1);
         card2 = new PlayingCard('❤',2);
         card3 = new PlayingCard('❤',3);
         card4 = new PlayingCard('♢',2);
        flushList = new ArrayList<>();
        flushList.add(card1);
        flushList.add(card2);
        flushList.add(card3);

         handOfCards = new HandOfCards(flushList);
    }

    @Test
    public void hasFlushTrue(){
        Assertions.assertTrue(handOfCards.hasFlush(3));

    }
    @Test
    public void hasFlushFalse(){
        flushList.add(card4);
        Assertions.assertFalse(handOfCards.hasFlush(4));

    }

    @Test
    public void sumOfCardsTest(){
        Assertions.assertEquals(6,handOfCards.sumOfCards());
    }

    @Test
    public void onlyHeartsTrue(){
        flushList.add(new PlayingCard('♢',3));
        Assertions.assertEquals(3,handOfCards.onlyHearts().size());
    }

    @Test
    public void hasQueenOfSpadesFalse(){
        Assertions.assertFalse(handOfCards.hasQueenOfSpades());
    }

    @Test
    public void hasQueenOfSpadesTrue(){
        flushList.add(new PlayingCard('♠',12));
        Assertions.assertTrue(handOfCards.hasQueenOfSpades());
    }
}