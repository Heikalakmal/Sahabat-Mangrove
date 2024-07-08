import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AlurProjek implements Initializable {

    @FXML
    private AnchorPane APAlurProjek;

    @FXML
    private AnchorPane APButton;

    @FXML
    private Button ButtonAlurProjek;

    @FXML
    private Button ButtonBlog;

    @FXML
    private Button ButtonDonasi;

    @FXML
    private Button ButtonLogo;

    @FXML
    private Button ButtonProjek;

    @FXML
    private Button ButtonTentangKami;

    @FXML
    private ImageView IVAlurProjek;

    @FXML
    private ImageView IVButtonLogo;

    @FXML
    private TextField SearchBar;

    @FXML
    private void handleBlogButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BlogPage.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ButtonBlog.getScene().getWindow();
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
            Stage stage = (Stage) ButtonBlog.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
