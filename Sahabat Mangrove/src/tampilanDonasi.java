import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class tampilanDonasi {
    @FXML
    private Button rp10kButton;
    @FXML
    private Button rp25kButton;
    @FXML
    private Button rp50kButton;
    @FXML
    private Button rp100kButton;
    @FXML
    private TextField donationAmountField;
    @FXML
    private Button selanjutnya;
    @FXML
    private Button alurProjek;
    @FXML
    private Button blog;
    @FXML
    private Button projek;
    
    @FXML
    private void initialize() {
        // Initialize the text field with a default value
        donationAmountField.setText("Rp. 0,-");
    }
    
    @FXML
    private void handleRp10kButtonAction(ActionEvent event) {
        donationAmountField.setText("Rp. 10.000,-");
        setSelectedButtonStyle((Button) event.getSource());
    }
    
    @FXML
    private void handleRp25kButtonAction(ActionEvent event) {
        donationAmountField.setText("Rp. 25.000,-");
        setSelectedButtonStyle((Button) event.getSource());
    }
    
    @FXML
    private void handleRp50kButtonAction(ActionEvent event) {
        donationAmountField.setText("Rp. 50.000,-");
        setSelectedButtonStyle((Button) event.getSource());
    }
    
    @FXML
    private void handleRp100kButtonAction(ActionEvent event) {
        donationAmountField.setText("Rp. 100.000,-");
        setSelectedButtonStyle((Button) event.getSource());
    }
    
    private void setSelectedButtonStyle(Button button) {
        // Remove the selected style from the previously selected button
        if (rp10kButton.getStyleClass().contains("selected")) {
            rp10kButton.getStyleClass().remove("selected");
        }
        if (rp25kButton.getStyleClass().contains("selected")) {
            rp25kButton.getStyleClass().remove("selected");
        }
        if (rp50kButton.getStyleClass().contains("selected")) {
            rp50kButton.getStyleClass().remove("selected");
        }
        if (rp100kButton.getStyleClass().contains("selected")) {
            rp100kButton.getStyleClass().remove("selected");
        }
    
        // Add the selected style to the currently selected button
        button.getStyleClass().add("selected");
    }
    
    @FXML
    private void handleSelanjutnyaButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FXMLDocument2.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleTentangKamiButton(ActionEvent event) {
        
    }
    @FXML
    private void handleAlurProjekButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AlurProjek.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) alurProjek.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleBlogButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BlogPage.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) blog.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleProjekButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProjekPage.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) projek.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}