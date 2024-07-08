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
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage  {

    @FXML
    private AnchorPane APButton;

    @FXML
    private AnchorPane APHomePage;

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
    private Line GarisHitam;

    @FXML
    private ImageView IVButtonLogo;

    @FXML
    private ImageView IVHomePage;

    @FXML
    private ImageView IVLogoHomePage;

    @FXML
    private ImageView Ilustrasi;

    @FXML
    private Text KalimatPanjang;

    @FXML
    private Text KalimatSelamat;

    @FXML
    private ImageView MotifPutih;

    @FXML
    private Pane PaneHomePage;

    @FXML
    private TextField SearchBar;

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ButtonBlog.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

