package models;

public class MathModel {
    private String question;
    private String answer;

    /*public MathModel(float each_total_time,float each_remaining_time,float each_elapsed_time,int each_mark, String category, String question, String answer) {
        super(each_total_time,each_remaining_time,each_elapsed_time,each_mark,category);
        this.question = question;
        this.answer = answer;
    }*/

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
