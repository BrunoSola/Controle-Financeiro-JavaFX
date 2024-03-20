package sola.bruno.projetocontrolefinanceiro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import sola.bruno.projetocontrolefinanceiro.util.Alerts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private MenuItem menuItemReceitasDespesas;
    @FXML
    private MenuItem menuItemRecorrentes;
    @FXML
    private MenuItem menuItemSaldo;
    @FXML
    private MenuItem menuItemTransacoes;
    @FXML
    private MenuItem menuItemPDF;
    @FXML
    private MenuItem menuItemXML;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemReceitasDespesasAction(){
        System.out.println("onMenuItemReceitasDespesasAction");
    }
    @FXML
    public void onMenuItemRecorrentesAction(){
        System.out.println("onMenuItemRecorrentesAction");
    }
    @FXML
    public void onMenuItemSaldoAction(){
        System.out.println("onMenuItemSaldoAction");
    }
    @FXML
    public void onMenuItemTransacoesAction(){
        System.out.println("onMenuItemTransacoesAction");
    }
    @FXML
    public void onMenuItemPDFAction(){
        System.out.println("onMenuItemPDFAction");
    }
    @FXML
    public void onMenuItemXMLAction(){
        System.out.println("onMenuItemXMLAction");
    }
    @FXML
    public void onMenuItemAboutAction(){
        loadView("About.fxml");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

    private synchronized void loadView(String absoluteName){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

        }catch (IOException e){
            Alerts.showAlert("IOException", "Error Loading View",e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}