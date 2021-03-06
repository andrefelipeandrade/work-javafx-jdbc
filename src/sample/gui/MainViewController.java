package sample.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import sample.Main;
import sample.gui.util.Alerts;

import java.io.IOException;
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
        loadView("/sample/gui/DepartmentList.fxml");
    }

    public void onMenuItemAbout() {
        loadView("/sample/gui/About.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    private synchronized void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Erro load view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }


}
