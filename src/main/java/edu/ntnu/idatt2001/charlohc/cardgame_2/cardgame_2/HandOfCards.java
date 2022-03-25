package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandOfCards {
    private ArrayList<PlayingCard> cards = new ArrayList<>();

    public HandOfCards(DeckOfCards d, int n){
        cards = d.dealHand(n);
    }

    public HandOfCards(ArrayList<PlayingCard> cardArrayList){
        cards = cardArrayList;
    }

    public HandOfCards() {

    }

//TODO: handOfCards.sort((a,b) -> a.getSuit().compareTo(b.getSuit()));

    public boolean hasFlush(int n){
        return this.cards.stream()
                .collect(Collectors.groupingBy(PlayingCard::getSuit,Collectors.counting()))
                .values()
                .stream()
                .allMatch(count -> count >= n);
    }

    public int sumOfCards(int n){
        return this.cards.stream()
                .mapToInt(PlayingCard::getFace)
                .sum();
    }

    public List<PlayingCard> onlyHearts(int n){
        return this.cards.stream()
                .filter(card -> card.getSuit() == '❤')
                .toList();
    }

    public boolean hasQueenOfSpades(int n){
        return this.cards.stream()
                .filter(card -> card.getSuit() == '♠')
                .anyMatch(card -> card.getFace()== 12);
    }

    @Override
    public String toString() {
        return "HandOfCards{" +
                "cards=" + cards +
                '}';
    }
}

