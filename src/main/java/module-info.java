module sola.bruno.projetocontrolefinanceiro {
    requires javafx.controls;
    requires javafx.fxml;

    exports sola.bruno.projetocontrolefinanceiro;
    opens sola.bruno.projetocontrolefinanceiro to javafx.fxml;
}