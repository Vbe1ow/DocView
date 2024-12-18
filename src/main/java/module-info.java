module com.documentviewer.documentviewer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.apache.tika.parsers;
    requires org.apache.tika.core;
    requires com.google.common;


    opens com.documentviewer.documentviewer to javafx.fxml;
    exports com.documentviewer.documentviewer;
}