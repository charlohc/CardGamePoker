package edu.ntnu.idatt2001.charlohc.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;

/**
 * Controller class
 * contains methods used in JavaFxml file
 */

public class Controller {

    @FXML
    private Text face1,face2,face3,face4,face5;

    @FXML
    private Text suit1,suit2,suit3,suit4,suit5;

    @FXML
    private TextField sumOfFaces;

    @FXML
    private TextField cardsOfHeart;

    @FXML
    private CheckBox flush;

    @FXML
    private CheckBox queenOfSpades;

    private DeckOfCards deck = new DeckOfCards();

    private ArrayList<PlayingCard> handOfCards;

    /**
     * Method DealHand()
     * Uses methode dealHand in DeckOfCards class to get five random cards, gets the face and suit of these five cards
     * and displays them
     */

    @FXML
    public void DealHand(){
        sumOfFaces.clear();
        cardsOfHeart.clear();
        flush.setSelected(false);
        queenOfSpades.setSelected(false);


        handOfCards = deck.dealHand(5);


            face1.setText(String.valueOf(handOfCards.get(0).getFace()));
            face2.setText(String.valueOf(handOfCards.get(1).getFace()));
            face3.setText(String.valueOf(handOfCards.get(2).getFace()));
            face4.setText(String.valueOf(handOfCards.get(3).getFace()));
            face5.setText(String.valueOf(handOfCards.get(4).getFace()));

            String viewSuit1 = String.valueOf(handOfCards.get(0).getSuit());
            String viewSuit2 = String.valueOf(handOfCards.get(1).getSuit());
            String viewSuit3 = String.valueOf(handOfCards.get(2).getSuit());
            String viewSuit4 = String.valueOf(handOfCards.get(3).getSuit());
            String viewSuit5 = String.valueOf(handOfCards.get(4).getSuit());

            suit1.setText(viewSuit1);
            suit2.setText(viewSuit2);
            suit3.setText(viewSuit3);
            suit4.setText(viewSuit4);
            suit5.setText(viewSuit5);

    }


    /**
     * Method CheckHand()
     * Contains several checks, first it retains the five random cards that has been set earlier
     * Calculates the sum of faces, and returns it in a text
     * Checks if the hand of cards contains any hearts, if it does it prints out a string with those cards
     * Checks if the hand contains the queen of spades, or it has flush, if so, the checkboxes are marked as selected
     */
    @FXML
    public void CheckHand(){
        HandOfCards checkHand = new HandOfCards(handOfCards);
        sumOfFaces.setText(String.valueOf(checkHand.sumOfCards()));

        if(checkHand.onlyHearts().isEmpty()){
            cardsOfHeart.setText("No hearts");
        }else {
            cardsOfHeart.setText(checkHand.onlyHearts().toString().replace("[", "").replace("]", ""));
        }

        if(checkHand.hasFlush(5)){
            flush.setSelected(true);
        }

        if(checkHand.hasQueenOfSpades()){
            queenOfSpades.setSelected(true);
        }

    }

}















