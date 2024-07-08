import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

public class LoginController {

    @FXML
    private Button tombolLogin;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField loginEmail;

    @FXML
    private AnchorPane halamanLogin;

    @FXML
    private void handleLoginButton(ActionEvent event) {
        String email = loginEmail.getText();
        String password = loginPassword.getText();

        if (validateLoginCredentials(email, password)) {
            errorLabel.setText("Login berhasil!");
            errorLabel.setVisible(true);
            // Lakukan pengalihan halaman atau tindakan sesuai kebutuhan setelah login berhasil
        } else {
            errorLabel.setText("Email atau password salah.");
            errorLabel.setVisible(true);
        }
    }

    private boolean validateLoginCredentials(String email, String password) {
        try {
            File file = new File("users.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("user");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String storedEmail = element.getElementsByTagName("email").item(0).getTextContent();
                    String storedPassword = element.getElementsByTagName("password").item(0).getTextContent();

                    if (email.equals(storedEmail) && password.equals(storedPassword)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}
