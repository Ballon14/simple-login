import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class AdminDashboardController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private void initialize() {
        welcomeLabel.setText("Dashboard di Buka");
    }

    public void handleLogout(){
        redirectToLogin();
    }

    public void showRegisteredUsers(){
        StringBuilder userList = new StringBuilder();
        userList.append("Registered Users: \n\n");

        if (RegisterController.getRegisteredUsers().isEmpty()){
            userList.append("Tidak ada user teregistrasi.");
        } else {
            int count = 1;
            for (RegisterController.User user : RegisterController.getRegisteredUsers()){
                userList.append(count).append("Username:").append(user.getUsername()).append(" | Nama:").append(user.getFullName()).append(" | NIM:").append(user.getNim()).append("\n");
                count++;
            }
        }

        System.out.println(userList.toString());
    }

    public void showSystemInfo(){
        String systemInfo = "Sistem Informasi XYZ\n" + "Version 1.0.0\n" + "Copyright © 2025 Sistem Informasi XYZ. All rights reserved.";

        System.out.println(systemInfo);
    }

    private void redirectToLogin(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/user.login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) welcomeLabel.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login - Sistem Informasi XYZ");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}