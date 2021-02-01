package packagename;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = new FXMLLoader(new File("src/packagename/Main.fxml").toURI().toURL()).load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}
