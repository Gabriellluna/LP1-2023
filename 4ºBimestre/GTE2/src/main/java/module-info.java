module br.igor.gte2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.igor.gte2 to javafx.fxml;
    exports br.igor.gte2;
}