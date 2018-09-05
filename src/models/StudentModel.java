package models;

public class StudentModel {
    private int id;
    private String name;
    private String school;
    private int pin;
    private boolean term_condition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isTerm_condition() {
        return term_condition;
    }

    public void setTerm_condition(boolean term_condition) {
        this.term_condition = term_condition;
    }
}
