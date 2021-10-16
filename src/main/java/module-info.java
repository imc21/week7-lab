module com.mycompany.week7_lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week7_lab2 to javafx.fxml;
    exports com.mycompany.week7_lab2;
}
