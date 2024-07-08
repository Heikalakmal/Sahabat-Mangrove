import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class BarChartController implements Initializable {

    XYChart.Series<String, Integer> lanjutan = new XYChart.Series();

    @FXML
    private Label kata;

    @FXML
    private BarChart grafikBar;

    @FXML
    private Button tombolHapus;

    @FXML
    private Button tombolTambah;

    @FXML
    private void handleTombolHapus(ActionEvent event) {
        lanjutan.getData().remove(3);
        grafikBar.setAnimated(false);
    }

    @FXML
    private void handleTombolTambah(ActionEvent event) {
        lanjutan.getData().add(new XYChart.Data<>("Tablet", 250));
        grafikBar.setAnimated(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lanjutan.getData().add(new XYChart.Data<>("Laptop", 300));
        lanjutan.getData().add(new XYChart.Data<>("HandPhone", 800));
        lanjutan.getData().add(new XYChart.Data<>("Komputer", 150));

        grafikBar.getData().add(lanjutan);
    }
}
