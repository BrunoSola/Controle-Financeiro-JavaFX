package sola.bruno.projetocontrolefinanceiro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sola.bruno.projetocontrolefinanceiro.model.entities.Recorrente;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class RecorrenteListController implements Initializable {
    @FXML
    private TableView<Recorrente> tableViewRecorrente;
    @FXML
    private TableColumn<Recorrente, String> tableColumnAssinatura;
    @FXML
    private TableColumn<Recorrente, Double> tableColumnValor;
    @FXML
    private TableColumn<Recorrente, Date> tableColumnDataPagamento;

    @FXML
    private Button btNew;

    @FXML
    public void onBtNewAction(){
        System.out.println("Test: onBtNewAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnAssinatura.setCellValueFactory(new PropertyValueFactory<>("assinatura"));
        tableColumnValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        tableColumnDataPagamento.setCellValueFactory(new PropertyValueFactory<>("dataPagamento"));

        Stage stage = (Stage) Main.getMainScene().getWindow();
        tableViewRecorrente.prefHeightProperty().bind(stage.heightProperty());
    }
}
