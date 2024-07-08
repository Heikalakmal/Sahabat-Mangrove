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
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BlogPage implements Initializable {

    @FXML
    private AnchorPane APBlog;

    @FXML
    private AnchorPane APButton;

    @FXML
    private ImageView BackgroundBlog;

    @FXML
    private Button ButtonAlurProjek;

    @FXML
    private Button ButtonBlog;

    @FXML
    private Button ButtonDonasi;

    @FXML
    private Button ButtonLihat1;

    @FXML
    private Button ButtonLihat2;

    @FXML
    private Button ButtonLihat3;

    @FXML
    private Button ButtonLogo;

    @FXML
    private Button ButtonProjek;

    @FXML
    private Button ButtonTentangKami;

    @FXML
    private ImageView IVButtonLogo;

    @FXML
    private ImageView Ilustrasi1;

    @FXML
    private ImageView Ilustrasi2;

    @FXML
    private ImageView Ilustrasi3;

    @FXML
    private Text JudulText1;

    @FXML
    private Text JudulText2;

    @FXML
    private Text JudulText3;

    @FXML
    private Text Kalimat1;

    @FXML
    private Text Kalimat2;

    @FXML
    private Text Kalimat3;

    @FXML
    private Text KalimatArtikel;

    @FXML
    private ImageView MotifPutihBlog;

    @FXML
    private Pane PaneArtikel1;

    @FXML
    private Pane PaneArtikel2;

    @FXML
    private Pane PaneArtikel3;

    @FXML
    private TextField SearchBar;

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
    @FXML
    private void handleAlurProjekButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AlurProjek.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ButtonAlurProjek.getScene().getWindow();
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
