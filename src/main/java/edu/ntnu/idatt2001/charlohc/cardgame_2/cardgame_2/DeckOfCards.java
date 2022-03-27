package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;
import java.util.ArrayList;

//TODO: make check to make sure that doesn't add the same card twice

/**
 * DeckOfCard class
 * A deck consist of 52 playing cards
 */
public class DeckOfCards {

    private ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
    int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    char[] suits = {'♠', '❤', '♢', '♣'};

    /**
     * Constructor where each suit gets assigned to a number
     */
    public DeckOfCards(){
        for (int face: faces){
            for(char suit: suits){
            deck.add(new PlayingCard(suit,face));
        }
    }
}

    /**
     * Methode dealHand(int n)
     * A Methode that declares n new random playing cards, and puts them in a new arraylist
     * @param n an int that decides how many cards will be put in the arraylist
     * @return ArrayList dealerCards, that contains new random playing cards
     */
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
