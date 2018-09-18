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




public class MainController {

    @FXML private Label lblter;
    @FXML private Button btnNext;
    @FXML private TextField txtName;

    @FXML
    private void logIn() throws ClassNotFoundException {


        try {
           /* Parent root = FXMLLoader.load(getClass().getResource("views/MainView.fxml"));
            primaryStage.setTitle("Adaptive Test");
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            primaryStage.setX(screenBounds.getMinX());
            primaryStage.setY(screenBounds.getMinY());
            primaryStage.setScene(new Scene(root,screenBounds.getWidth() , screenBounds.getHeight()));
            primaryStage.setResizable(false);
            primaryStage.show();*/
        }
        catch(Exception e){}
    }
    @FXML
    private void enterMainScreen()
    {
      //  txtValidation.setText("test");
        System.out.print("click button next");

    }
}
