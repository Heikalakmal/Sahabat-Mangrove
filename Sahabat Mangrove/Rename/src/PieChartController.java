import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;


public class PieChartController implements Initializable {

    ObservableList<PieChart.Data> diagram =
            FXCollections.observableArrayList();

    @FXML
    private Label kata;

    @FXML
    private PieChart grafikBulat;

    @FXML
    private Button tombolHapus;

    @FXML
    private Button tombolTambah;

    @FXML
    private void handleTombolHapus(ActionEvent event) {
        diagram.remove(3);
    }

    @FXML
    private void handleTombolTambah(ActionEvent event) {
        diagram.add(new PieChart.Data("Panda", 8));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        diagram.add(new PieChart.Data("Badak Hitam", 13));
        diagram.add(new PieChart.Data("Gajah", 10));
        diagram.add(new PieChart.Data("Komodo", 2));

        grafikBulat.setData(diagram);
    }
}
