package controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;
import models.StudentModel;


public class MainController {

    private StudentModel mStudent;

    @FXML private Button btnStart;
    @FXML
    private void logIn() throws ClassNotFoundException {


        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../views/Login.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            LoginController l= fxmlLoader.getController();

            l.initialStudentModel(this.mStudent);
            Stage stage = new Stage();
            stage.setScene(new Scene(root2,560 , 530));
            stage.setResizable(false);
            stage.show();
            btnStart.setDisable(true);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void setStudent(StudentModel mStudent)
    {
        this.mStudent=mStudent;

    }

}
