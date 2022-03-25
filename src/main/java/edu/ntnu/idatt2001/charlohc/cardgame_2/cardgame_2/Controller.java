package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;

public class Controller {
       @FXML
    private Text face1;

    @FXML
    private Text face2;

    @FXML
    private Text face3;

    @FXML
    private Text face4;

    @FXML
    private Text face5;


    @FXML
    private Text suit1;

    @FXML
    private Text suit2;

    @FXML
    private Text suit3;

    @FXML
    private Text suit4;

    @FXML
    private Text suit5;

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


//TODO: find a better methode to do DealHand() methode, only assign one face and suit, for loop, etc
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

        String viewSuit1= String.valueOf(handOfCards.get(0).getSuit());
        String viewSuit2= String.valueOf(handOfCards.get(1).getSuit());
        String viewSuit3= String.valueOf(handOfCards.get(2).getSuit());
        String viewSuit4= String.valueOf(handOfCards.get(3).getSuit());
        String viewSuit5= String.valueOf(handOfCards.get(4).getSuit());
        suit1.setText(viewSuit1);
        suit2.setText(viewSuit2);
        suit3.setText(viewSuit3);
        suit4.setText(viewSuit4);
        suit5.setText(viewSuit5);

    }

    @FXML
    public void CheckHand(){
        HandOfCards checkHand = new HandOfCards(handOfCards);
        sumOfFaces.setText(String.valueOf(checkHand.sumOfCards(5)));

        if(checkHand.onlyHearts(5).isEmpty()){
            cardsOfHeart.setText("No hearts");
        }else {
            cardsOfHeart.setText(String.valueOf(checkHand.onlyHearts(5).toString()));
        }

        if(checkHand.hasFlush(5)){
            flush.setSelected(true);
        }

        if(checkHand.hasQueenOfSpades(5)){
            queenOfSpades.setSelected(true);
        }

    }

}















