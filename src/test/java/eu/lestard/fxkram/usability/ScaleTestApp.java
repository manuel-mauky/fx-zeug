package eu.lestard.fxkram.usability;/**
 * @author manuel.mauky
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ScaleTestApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Scaling.enableMouseWheel(KeyCode.CONTROL);
        
        

        final URL resource = this.getClass().getResource("DpiScaleTest.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        final Parent root = fxmlLoader.load();
        
        final Scene scene = new Scene(root);
        
        Scaling.enableScaling(scene);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}