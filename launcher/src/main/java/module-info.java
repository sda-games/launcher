module com.sdagames.launcher {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sdagames.launcher to javafx.fxml;
    exports com.sdagames.launcher;
}
