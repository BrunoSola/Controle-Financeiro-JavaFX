package sola.bruno.projetocontrolefinanceiro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
        System.out.println("onMenuItemAboutAction");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }
}