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
import java.util.ArrayList;
import java.util.List;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField nimField;

    @FXML
    private Button registerButton;

    @FXML
    private Button backButton;

    private static List<User> registeredUsers = new ArrayList<>();

    public static class User {
    
        private String username;
        private String password;
        private String fullName;
        private String nim;

        public User(String username, String password, String fullName, String nim) { 
            this.username = username;
            this.password = password;
            this.fullName = fullName;
            this.nim = nim;
        }

        public String getUsername(){
            return username;
        }

        public String getPassword(){
            return password;
        }

        public String getFullName(){
            return fullName;
        }

        public String getNim(){
            return nim;
        }
    }

    @FXML
    private void handleRegister(ActionEvent event){
        String username = usernameField.getText();
        String password = passwordField.getText();
        String fullName = fullNameField.getText();
        String nim = nimField.getText();

        User newUser = new User(username, password, fullName, nim);
        registeredUsers.add(newUser);

        clearForm();

        handleBackToLogin(event); 
    }

    @FXML
    private void handleBackToLogin(ActionEvent event){ 
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/user/login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login - Sistem Informasi XYZ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearForm(){
        usernameField.clear();
        passwordField.clear();
        fullNameField.clear(); 
        nimField.clear();
    }

    public static List<User> getRegisteredUsers() {
        return registeredUsers;
    }
}