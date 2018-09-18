package controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import models.Answer;
import models.Question;
import models.Quiz;
import java.util.ArrayList;

public class MathController {


    @FXML private Label lblQnMath;
    @FXML private RadioButton option1;
    @FXML private RadioButton option2;
    @FXML private RadioButton option3;
    @FXML private RadioButton option4;
    ArrayList<Quiz> quizzes= new ArrayList<Quiz>();


    public void test(ArrayList<Quiz> quizzes) {
       // Question math=new Question();
        this.quizzes = quizzes;
        for (Quiz q: quizzes) {
            if(q.getQuestions().get(0).getLevel().equals("tough"))
            {
                lblQnMath.setText(quizzes.get(0).getQuestions().get(0).getQuery());
                option1.setText(quizzes.get(0).getQuestions().get(0).getAnswers().get(0).getAnswer());

                System.out.print("answer: "+quizzes.get(0).getQuestions().get(0).getAnswers().get(0).getAnswer());
            }
        }


    }
    @FXML
    public void pressBtnNext()
    {

    }
}
