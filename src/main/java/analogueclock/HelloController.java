package analogueclock;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public  class HelloController {
    @FXML
    private Label welcomeText;
    int size;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Programming Gurlz");
    }
}