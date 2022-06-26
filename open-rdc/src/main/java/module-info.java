module com.openrdc.openrdc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.openrdc.openrdc to javafx.fxml;
    exports com.openrdc.openrdc;
    exports com.openrdc.openrdc.controller;
    opens com.openrdc.openrdc.controller to javafx.fxml;
}