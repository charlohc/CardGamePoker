package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class HandOfCars
 * Contains checks, that shows characteristics of the hand of card
 */
public class HandOfCards {
    private ArrayList<PlayingCard> cards = new ArrayList<>();

    /**
     * Constructor used for testing, when want to declare cards manually instead of random
     * @param d, object of class deckOfCards
     * @param n, int that describes how many cards there is in the hand of cards
     */
    public HandOfCards(DeckOfCards d, int n){
        cards = d.dealHand(n);
    }

    /**
     * Constructor used for retaining the arraylist of random cards, declared in the class deckOfCards
     * @param cardArrayList, arraylist with random cards
     */
    public HandOfCards(ArrayList<PlayingCard> cardArrayList){
        cards = cardArrayList;
    }



    /**
     * Methode hasFlush(int n)
     * Checks if the hand of cards has flush
     * It has flush if every card has the same suit
     * @param n, int that describes how many cards there is in the hand of cards
     * @return boolean true or false, dependent on if the hand of card has flush or not
     */
    public boolean hasFlush(int n){
        return this.cards.stream()
                .collect(Collectors.groupingBy(PlayingCard::getSuit,Collectors.counting()))
                .values()
                .stream()
                .allMatch(count -> count >= n);
    }

    /**
     * Methode SumOfCards(), gets and returns the sum of all faces
     * @return an int that represents the sum of all faces
     */
    public int sumOfCards(){
        return this.cards.stream()
                .mapToInt(PlayingCard::getFace)
                .sum();
    }

    /**
     * Methode onlyHearts() filters through all cards and adds those with heart as suit to a proper list
     * @return a list of all playing cards that has heart as suit
     */
    public List<PlayingCard> onlyHearts(){
        return this.cards.stream()
                .filter(card -> card.getSuit() == '❤')
                .toList();
    }

    /**
     * Methode hasQueenOfSpades(), filters through the list of cards and returns boolean true or false
     * @return boolean true or false, dependent on if the list of cards contains 12 of spades or not
     */
    public boolean hasQueenOfSpades(){
        return this.cards.stream()
                .filter(card -> card.getSuit() == '♠')
                .anyMatch(card -> card.getFace()== 12);
    }

    /**
     * Methode toString
     * @return String with information about the hand of card
     */
    @Override
    public String toString() {
        return "HandOfCards{" +
                "cards=" + cards +
                '}';
    }
}

