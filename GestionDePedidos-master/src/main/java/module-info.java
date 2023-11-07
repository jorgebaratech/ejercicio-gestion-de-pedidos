module com.example.gestiondepedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.sql;


    opens com.example.gestiondepedidos to javafx.fxml;
    exports com.example.gestiondepedidos;
    exports com.example.gestiondepedidos.controllers;
    opens com.example.gestiondepedidos.controllers to javafx.fxml;
    exports com.example.gestiondepedidos.pedido;
    opens com.example.gestiondepedidos.pedido to javafx.fxml;
    exports com.example.gestiondepedidos.item;
    opens com.example.gestiondepedidos.item to javafx.fxml;

}