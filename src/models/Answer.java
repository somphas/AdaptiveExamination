package models;

public class Answer {
    private String answer;
    private boolean status; // if true mean it is the correct answer to question

    public Answer(String answer, boolean status) {
        this.answer = answer;
        this.status = status;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

