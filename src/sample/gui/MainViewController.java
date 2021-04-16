package sample.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartament;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSeller() {
        System.out.println("onMenuItemSeller");
    }

    public void onMenuItemDepartament() {
        System.out.println("onMenuItemDepartament");
    }

    public void onMenuItemAbout() {
        System.out.println("onMenuItemAbout");
    }




    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }
}
