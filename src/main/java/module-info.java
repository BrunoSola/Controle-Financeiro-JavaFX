module sola.bruno.projetocontrolefinanceiro {
    requires javafx.controls;
    requires javafx.fxml;

    exports sola.bruno.projetocontrolefinanceiro;
    opens sola.bruno.projetocontrolefinanceiro to javafx.fxml;
    exports sola.bruno.projetocontrolefinanceiro.model.entities;
    opens sola.bruno.projetocontrolefinanceiro.model.entities to javafx.fxml;
}