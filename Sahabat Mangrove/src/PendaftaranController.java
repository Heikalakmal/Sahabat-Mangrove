import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class PendaftaranController {
    
    @FXML
    private TextField usernameField;

    @FXML
    private TextField namaField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button loginButton;

    @FXML
    private void saveUserDataToXML(String username, String password, String tanggalLahir, String nama, String email) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Path relatif ke file users.xml dalam folder yang sama dengan controller
            String xmlFilePath = "users.xml";
            Document doc;
            File file = new File(xmlFilePath);
            
            if (file.exists()) {
                doc = builder.parse(file);
            } else {
                doc = builder.newDocument();
                Element rootElement = doc.createElement("users");
                doc.appendChild(rootElement);
            }
    
            Element root = doc.getDocumentElement();
            Element user = doc.createElement("user");
    
            Element usernameElement = doc.createElement("username");
            usernameElement.setTextContent(username);
            user.appendChild(usernameElement);
    
            Element passwordElement = doc.createElement("password");
            passwordElement.setTextContent(password);
            user.appendChild(passwordElement);
    
            Element tanggalLahirElement = doc.createElement("tanggalLahir");
            tanggalLahirElement.setTextContent(tanggalLahir);
            user.appendChild(tanggalLahirElement);
    
            Element namaElement = doc.createElement("nama");
            namaElement.setTextContent(nama);
            user.appendChild(namaElement);
    
            Element emailElement = doc.createElement("email");
            emailElement.setTextContent(email);
            user.appendChild(emailElement);
    
            root.appendChild(user);
    
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(xmlFilePath));
            transformer.transform(source, result);
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            errorLabel.setText("Error saving user data: " + e.getMessage());
            errorLabel.setVisible(true);
        }
    }
    
    @FXML
private void handleBuatAkunButton(ActionEvent event) {
    String username = usernameField.getText();
    String password = passwordField.getText();
    String nama = namaField.getText();
    String email = emailField.getText();
    String tanggalLahir = datePicker.getValue().toString();

    if (username.isEmpty() || password.isEmpty() || nama.isEmpty() || email.isEmpty() || tanggalLahir.isEmpty()) {
        errorLabel.setText("Harap isi semua kolom.");
        errorLabel.setVisible(true);
    } else {
        try {
            saveUserDataToXML(username, password, tanggalLahir, nama, email);
            errorLabel.setText("Akun berhasil dibuat!");
            errorLabel.setVisible(true);
            loadLoginScene(event);
        } catch (Exception e) {
            errorLabel.setText("Error creating account: " + e.getMessage());
            errorLabel.setVisible(true);
        }
    }
}
    
    private void loadLoginScene(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading Login.fxml: " + e.getMessage());
        }
    }
}
