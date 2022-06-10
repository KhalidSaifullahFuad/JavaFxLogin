module com.exam.theoryfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exam.theoryfinal to javafx.fxml;
    exports com.exam.theoryfinal;
}