package com.example.lesson3.javaExample;


public class Car extends Machine{
    int score = 0;
    String carName;

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

    public void driving(){
        methodPublic();
        methodDefault();
        methodProtected();

    }




}
