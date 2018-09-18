import controllers.MathController;
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

import java.awt.*;
import java.util.ArrayList;

public class Main extends Application {
    static MathController m;
    @Override
    public void start(Stage primaryStage) throws Exception{

        //testing
        Answer a1 = new Answer("Median", true);
        Answer a2 = new Answer("Mode", false);
        Answer a3 = new Answer("Mean", false);
        Answer a4 = new Answer("None", false);

        ArrayList<Answer> listOfAnswer = new ArrayList<Answer>();
        listOfAnswer.add(a1);
        listOfAnswer.add(a2);
        listOfAnswer.add(a3);
        listOfAnswer.add(a4);

        Question questionMath1 = new Question("In statistics, the middle value of an ordered set of values is called what?",listOfAnswer, "tough", 1);
        Question questionMath2 = new Question("how long from home to market?",listOfAnswer, "2", 1);
        ArrayList<Question> listOfQuestion = new ArrayList<Question>();
        listOfQuestion.add(questionMath1);
        listOfQuestion.add(questionMath2);

        Quiz math = new Quiz(3,0,"math",listOfQuestion);
        Quiz writing = new Quiz(3,0,"writing",listOfQuestion);
        ArrayList<Quiz> quizzes=new ArrayList<>();
        quizzes.add(math);
        quizzes.add(writing);

        quizzes.get(0).getQuestions().get(0);
        Exam exam1 = new Exam(0,quizzes);
      //  exam1.print();
/*
        Parent root = FXMLLoader.load(getClass().getResource("StudentInformation.fxml"));
        primaryStage.setTitle("Student Information");
        primaryStage.setScene(new Scene(root,560 , 530));
        primaryStage.setResizable(false);
        primaryStage.show();*/



        FXMLLoader loader= new FXMLLoader(getClass().getResource("views/MathTestView.fxml"));
        Parent root = (Parent) loader.load();
        m=(MathController)loader.getController();
        m.test(quizzes);
        primaryStage.setTitle("Student Information");
        primaryStage.setScene(new Scene(root,560 , 530));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
