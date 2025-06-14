import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private void handleLogin(ActionEvent event){
        loadDashboard();
    };

    @FXML
    private void showRegisterForm(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/user/register.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) registerButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Register - Sistem Informasi XYZ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadDashboard(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/admin/adminDashboard.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Dashboard - Sistem Informasi XYZ");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}