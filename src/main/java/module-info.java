module com.cadastro.cadastrodeclientes {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    // NOMES CORRIGIDOS PARA OS MÓDULOS HTTPCLIENT
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;


    opens com.cadastro.cadastrodeclientes to javafx.fxml, com.google.gson;
    exports com.cadastro.cadastrodeclientes;
}