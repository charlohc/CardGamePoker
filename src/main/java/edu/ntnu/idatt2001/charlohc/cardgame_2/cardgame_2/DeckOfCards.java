package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import java.util.ArrayList;
//TODO: make check to make sure that doesn't add the same card twice
public class DeckOfCards {
    private ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
    int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    char[] suits = {'♠', '❤', '♢', '♣'};

    public DeckOfCards(ArrayList<PlayingCard> deck) {
        this.deck = deck;
    }

    public DeckOfCards(){
        for (int face: faces){
            for(char suit: suits){
            deck.add(new PlayingCard(suit,face));
        }
    }
}

    public ArrayList<PlayingCard> dealHand(int n){
        ArrayList<PlayingCard> dealerCards = new ArrayList<>();
        for(int i = 1; i <= n;i++) {
            int range = deck.size();
            int random = (int) (Math.random() * range);
            PlayingCard randomCard =deck.get(random);
            dealerCards.add(randomCard);
        }

        return dealerCards;
    }

}
