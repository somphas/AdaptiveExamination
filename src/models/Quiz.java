package models;

import java.util.List;

public class Quiz {
    private float total_time;
    private float remaining_time;
    private String category;
    private List<Question> questions;

    public Quiz(float total_time, float remaining_time, String category, List<Question> questions) {
        this.total_time = total_time;
        this.remaining_time = remaining_time;
        this.category = category;
        this.questions = questions;
    }

    public float getTotal_time() {
        return total_time;
    }

    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }

    public float getRemaining_time() {
        return remaining_time;
    }

    public void setRemaining_time(int remaining_time) {
        this.remaining_time = remaining_time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question q)
    {
        this.questions.add(q);
    }
    public  void  removeQuestion(Question q)
    {
        this.questions.remove(q);
    }
}
