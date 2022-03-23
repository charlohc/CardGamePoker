package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    @FXML
    private Button deal;

    @FXML
    private Text text;

    @FXML
    private Text face1;

    @FXML
    private Text suit1;

    @FXML
    private Text suit11;

    private DeckOfCards deck;
    private ArrayList<PlayingCard> handOfCards;
    private PlayingCard playingCard;

    public void initialize() {

    }

    @FXML
    public void DealHand(){
        deck =new DeckOfCards();
        handOfCards = deck.dealHand(5);
        face1.setText(String.valueOf(handOfCards.get(0).getFace()));

        String viewSuit1= String.valueOf(handOfCards.get(0).getSuit());
        suit1.setText(viewSuit1);
        suit11.setText(viewSuit1);

    }

}
