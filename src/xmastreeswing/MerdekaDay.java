package xmastreeswing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MerdekaDay extends Application {

    @Override
    public void start(Stage mainStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        mainStage.setTitle("Celebrate Malaysia Independence Day!");
        mainStage.setScene(new Scene(root, 920, 600));
        mainStage.setMaximized(false);
        mainStage.setResizable(false);

        mainStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
