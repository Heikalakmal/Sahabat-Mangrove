import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class OpenScene {
    private Pane halaman;
    public Pane getPane(String fileName){
        try{
            URL fileHalaman=MSProject.class.getResource(fileName+".fxml");
            if (fileHalaman==null) {
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            halaman=new FXMLLoader().load(fileHalaman);
        }catch (Exception e) {
            System.out.println("Tidak ditemukan halaman tersebut");
        }
        return halaman;
    }
}
