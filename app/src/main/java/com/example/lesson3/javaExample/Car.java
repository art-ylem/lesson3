package com.example.lesson3.javaExample;


import android.util.Log;

public class Car extends Machine {
    int score = 0;

    String carName;


    @Override
    public void startEngine() {
        super.startEngine();
        Log.d("AAAAA", "startEngine: car");
    }

    @Override
    void finishEngine() {
        Log.d("AAAAA", "finishEngine: car");
    }

    public Car() {
    }

    public Car(int score) {
        this.score = score;

    }

    public Car(int score, String carName) {
        this.score = score;
        this.carName = carName;
    }

    public Car(String nam) {
        this.carName = nam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        this.score = score;
    }

    public void driving() {
    }
}
