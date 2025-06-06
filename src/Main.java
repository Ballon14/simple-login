import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/user.login.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            primaryStage.setTitle("Sistem Informasi XYZ");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();

            primaryStage.show();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Error loading application: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}