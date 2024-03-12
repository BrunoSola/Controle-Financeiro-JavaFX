module sola.bruno.projetocontrolefinanceiro {
    requires javafx.controls;
    requires javafx.fxml;


    opens sola.bruno.projetocontrolefinanceiro to javafx.fxml;
    exports sola.bruno.projetocontrolefinanceiro;
}