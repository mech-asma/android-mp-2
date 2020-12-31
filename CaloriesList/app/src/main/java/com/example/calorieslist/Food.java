package com.example.calorieslist;

public class Food {
    private String name;
    private double serving;
    private double calories;
    private int img;

    public Food(String name, double serving, double calories, int img) {
        this.name = name;
        this.serving = serving;
        this.calories = calories;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getServing() {
        return serving;
    }

    public void setServing(double serving) {
        this.serving = serving;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
