module com.agaafar.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.agaafar.studentmanagementsystem to javafx.fxml;
    exports com.agaafar.studentmanagementsystem;
}