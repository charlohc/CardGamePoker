module edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ntnu.idatt2001.charlohc.cardgame to javafx.fxml;
    exports edu.ntnu.idatt2001.charlohc.cardgame;
}