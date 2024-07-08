import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class LineChartController implements Initializable {

    XYChart.Series<String, Integer> series = new XYChart.Series();

    @FXML
    private Label kata;

    @FXML
    private LineChart grafikGaris;

    @FXML
    private Button tombolHapus;

    @FXML
    private Button tombolTambah;

    @FXML
    private void handleTombolHapus(ActionEvent event) {
        series.getData().remove(3);
        grafikGaris.setAnimated(false);
    }

    @FXML
    private void handleTombolTambah(ActionEvent event) {
        series.getData().add(new XYChart.Data<>("Kimia", 80));
        grafikGaris.setAnimated(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        series.getData().add(new XYChart.Data<>("Informatika", 200));
        series.getData().add(new XYChart.Data<>("Mesin", 100));
        series.getData().add(new XYChart.Data<>("Industri", 150));

        grafikGaris.getData().add(series);
    }
}
