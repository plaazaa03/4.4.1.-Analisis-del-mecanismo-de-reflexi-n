package es.ieslosmontecillos.micontrol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private MiControl rpgControl;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onMouseClicado(MouseEvent mouseEvent) {
        welcomeText.setText("Has pinchado en el cuadro rojo!");
    }
}