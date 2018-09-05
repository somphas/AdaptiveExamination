package models;

import java.util.ArrayList;

public class ExamModel {
    private static final int TOTAL_TIME = 15;
    private float total_remaining_time;
    private float total_time_elapsed;
    public float each_total_time;
    public float each_remaining_time;
    public float each_elapsed_time;
    private int total_mark;
    public int each_mark;
    private String category;
    private boolean status;

    public ExamModel(float total_remaining_time, float total_time_elapsed, float each_total_time, float each_remaining_time, float each_elapsed_time, int total_mark, int each_mark, String category) {
        this.total_remaining_time = total_remaining_time;
        this.total_time_elapsed = total_time_elapsed;
        this.each_total_time = each_total_time;
        this.each_remaining_time = each_remaining_time;
        this.each_elapsed_time = each_elapsed_time;
        this.total_mark = total_mark;
        this.each_mark = each_mark;
        this.category = category;
    }



    public static int getTotalTime() {
        return TOTAL_TIME;
    }
    public float getTotal_remaining_time() {
        return total_remaining_time;
    }

    public void setTotal_remaining_time(float total_remaining_time) {
        this.total_remaining_time = total_remaining_time;
    }

    public float getTotal_time_elapsed() {
        return total_time_elapsed;
    }

    public void setTotal_time_elapsed(float total_time_elapsed) {
        this.total_time_elapsed = total_time_elapsed;
    }

    public int getEach_mark() {
        return each_mark;
    }

    public void setEach_mark(int each_mark) {
        this.each_mark = each_mark;
    }

    public float getEach_total_time() {
        return each_total_time;
    }

    public void setEach_total_time(float each_total_time) {
        this.each_total_time = each_total_time;
    }

    public float getEach_remaining_time() {
        return each_remaining_time;
    }

    public void setEach_remaining_time(float each_remaining_time) {
        this.each_remaining_time = each_remaining_time;
    }

    public float getEach_elapsed_time() {
        return each_elapsed_time;
    }

    public void setEach_elapsed_time(float each_elapsed_time) {
        this.each_elapsed_time = each_elapsed_time;
    }

    public int getTotal_mark() {
        return total_mark;
    }

    public void setTotal_mark(int total_mark) {
        this.total_mark = total_mark;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    }
