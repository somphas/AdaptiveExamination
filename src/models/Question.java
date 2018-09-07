package models;

import java.util.List;

public class Question {

    private String query;
    private List<Answer> answers;
    private String level;
    private int mark;

    public Question(String query, List<Answer> answers, String level, int mark) {
        this.query = query;
        this.answers = answers;
        this.level = level;
        this.mark = mark;
    }
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void addAnswer(Answer a)
    {
        this.answers.add(a);
    }
    public void removeAnswer(Answer a)
    {
        this.answers.remove(a);
    }
}

