import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import models.Answer;
import models.Exam;
import models.Question;
import models.Quiz;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

/*
        //testing
        Answer a1 = new Answer("10 km", true);
        Answer a2 = new Answer("11 km", false);
        Answer a3 = new Answer("12 km", false);
        Answer a4 = new Answer("13 km", false);

        ArrayList<Answer> listOfAnswer = new ArrayList<Answer>();
        listOfAnswer.add(a1);
        listOfAnswer.add(a2);
        listOfAnswer.add(a3);
        listOfAnswer.add(a4);

        Question questionMath1 = new Question("how long from home to city?",listOfAnswer, "2", 1);
        Question questionMath2 = new Question("how long from home to market?",listOfAnswer, "2", 1);
        ArrayList<Question> listOfQuestion = new ArrayList<Question>();
        listOfQuestion.add(questionMath1);
        listOfQuestion.add(questionMath2);

        Quiz math = new Quiz(3,0,"math",listOfQuestion);
        Quiz writing = new Quiz(3,0,"writing",listOfQuestion);
        ArrayList<Quiz> quizzes=new ArrayList<>();
        quizzes.add(math);
        quizzes.add(writing);

        Exam exam1 = new Exam(0,quizzes);
        exam1.print();*/

        Parent root = FXMLLoader.load(getClass().getResource("StudentInformation.fxml"));
        primaryStage.setTitle("Student Information");
        primaryStage.setScene(new Scene(root,560 , 530));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
