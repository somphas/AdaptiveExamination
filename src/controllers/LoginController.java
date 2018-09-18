package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.StudentModel;

import java.util.Random;

public class LoginController {

    @FXML private TextField txtloginID;
    @FXML private TextField txtloginPIN;
    @FXML private Label lblvalidationlogin;
    @FXML private Button btnLogin;

    StudentModel mStudent;

    private boolean validateLogin()
    {
        if(txtloginID.getText().equals(""))
        {
            lblvalidationlogin.setVisible(true);
            lblvalidationlogin.setText("ID field is empty");
            return false;
        }
        if(txtloginPIN.getText().equals(""))
        {
            lblvalidationlogin.setVisible(true);
            lblvalidationlogin.setText("PIN field is empty");
            return false;
        }
        System.out.println("id:" +mStudent.getId()+" pin: "+mStudent.getPin());
        System.out.println("id:" +Integer.parseInt(txtloginID.getText())+" pin: "+Integer.parseInt(txtloginPIN.getText()));
        if(Integer.parseInt(txtloginID.getText())!=mStudent.getId() || Integer.parseInt(txtloginPIN.getText())!= mStudent.getPin())
        {
            lblvalidationlogin.setVisible(true);
            lblvalidationlogin.setText("ID or PIN is invalid");
            return false;
        }

        return true;
    }

    @FXML
    private void login()
    {
        while(!validateLogin()) return;

        System.out.println("log in success");


    }
    public void initialStudentModel(StudentModel mStudent){
        int pin=generatePIN("5");
        this.mStudent=mStudent;
        this.mStudent.setPin(pin);
        System.out.println("pin is :"+pin);
////       System.out.println(mStudent.getId());
    }
    public int generatePIN(String digit)
    {
        Random random = new Random();
        String pin="";
        pin= String.format("%0"+digit+"d", random.nextInt(10000));
        return Integer.parseInt(pin);
    }

}
