import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    private Button donasi;

    @FXML
    private Button alurProjek;

    @FXML
    private Button blog;

    @FXML
    private Button toDonasi;

    @FXML
    private ImageView gambarDonasi;

    @FXML
    private void handleDonasiButtonAction(ActionEvent event) {
        try {
            AnchorPane halaman = FXMLLoader.load(getClass().getResource("FXMLDocument1.fxml"));
            Stage stage = (Stage) donasi.getScene().getWindow();
            Scene scene = new Scene(halaman);
            stage.setScene(scene);
        } catch (Exception e) {
            System.out.println("Error loading FXMLDocument1: " + e.getMessage());
        }
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
    private void handleDeskripsiButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("deskripsiProjek.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) toDonasi.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}