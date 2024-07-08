import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    private Button loginButton;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private AnchorPane halamanLogin;

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("password")) {
            try {
                AnchorPane halaman = FXMLLoader.load(getClass().getResource("FXMLDocument1.fxml"));
                Stage stage = (Stage) loginButton.getScene().getWindow();
                Scene scene = new Scene(halaman);
                stage.setScene(scene);
            } catch (Exception e) {
                System.out.println("Error loading FXMLDocument1: " + e.getMessage());
            }
        } else {
            errorLabel.setText("Username/Sandi anda salah");
            errorLabel.setVisible(true);
        }
    }
}