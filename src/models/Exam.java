package models;

import java.util.ArrayList;

public class Exam {
    private static final float TOTAL_TIME = 15;
    private float remaining_time;
    private ArrayList<Quiz> quizzes = new ArrayList<Quiz>();

    public Exam(float remaining_time, ArrayList<Quiz> quizzes) {
        this.remaining_time = remaining_time;
        this.quizzes = quizzes;
    }

    public static float getTotalTime() {
        return TOTAL_TIME;
    }

    public float getRemaining_time() {
        return remaining_time;
    }

    public void setRemaining_time(float remaining_time) {
        this.remaining_time = remaining_time;
    }

    public void addQuiz(Quiz q){
        this.quizzes.add(q);
    }
    public void removeQuiz(Quiz q) {this.quizzes.remove(q);}

    //testing method
    public void print(){
        System.out.println(" =========== Debug ==========");
        System.out.println(" Question: ");
//        for
        System.out.println(this.quizzes.size());
        System.out.println(this.quizzes.get(0).getQuestions().get(0).getQuery());
        System.out.println(this.quizzes.get(1).getQuestions().get(1).getQuery());


    }
    }
