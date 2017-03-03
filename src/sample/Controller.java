package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField userName;
    @FXML
    private TextField surname;
    @FXML
    private Label response;

    public void submitAccount(ActionEvent event){
        //response.setText("Labs, " + userName.getText() + " " + surname.getText());
        String message = "Labs, " + userName.getText() + " " + surname.getText();
        Alert.AlertType alert = Alert.AlertType.INFORMATION;

        if (userName.getText().length() < 3 || surname.getText().length() < 3) {
            message = "pailgink";
        }
        createAlert(alert, message );
    }
    private void createAlert(Alert.AlertType type, String message){
        Alert alert = new Alert(type);
        alert.setContentText(message);
        alert.show();
    }
}
