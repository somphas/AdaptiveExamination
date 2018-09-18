package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.StudentModel;

import javax.security.sasl.RealmChoiceCallback;
import java.util.Random;

public class StudentController {

    @FXML private TextField txtID;
    @FXML private TextField txtName;
    @FXML private TextField txtSchool;
    @FXML private TextArea txtareaTerm;
    @FXML private CheckBox chTermCon;
    @FXML private Label lblValidation;
    @FXML private Button btnNext;


    StudentModel mStudent;
   //StudentModel mStudent1;

    public StudentController() {

    }


    @FXML
    public void acceptTerm()
    {
        if(chTermCon.isSelected())
        {
            btnNext.setDisable(false);

        }
        else {
            btnNext.setDisable(true);
        }

    }
    private boolean validateForm()
    {
        if(txtID.getText().equals("")){
            lblValidation.setVisible(true);
            lblValidation.setText("ID field is empty");
            return false;
        }
        if(txtName.getText().equals(""))
        {
            lblValidation.setVisible(true);
            lblValidation.setText("Name field is empty");
            return false;
        }
        if(txtSchool.getText().equals(""))
        {
            lblValidation.setVisible(true);
            lblValidation.setText("School field is empty");
            return false;
        }
        return true;
    }

    @FXML
    private void enterMainScreen()
    {
        while(!validateForm()) return;

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../MainView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();

            stage.setX(bounds.getMinX());
            stage.setY(bounds.getMinY());
            stage.setWidth(bounds.getWidth());
            stage.setHeight(bounds.getHeight());

            Stage rootstage = (Stage) btnNext.getScene().getWindow();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);

            //set student Information
            mStudent=setStudentModel();
            MainController cMain=fxmlLoader.getController();
            cMain.setStudent(mStudent);


            rootstage.close();




            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }





    public StudentModel setStudentModel()
    {
        return new StudentModel(Integer.parseInt(txtID.getText()),txtName.getText(),txtSchool.getText(),0,chTermCon.isSelected());
    }
}
