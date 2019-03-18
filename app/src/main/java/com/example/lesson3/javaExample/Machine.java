package com.example.lesson3.javaExample;

import android.util.Log;

public class Machine {

    int koleso = 0;
    int score;

    public static class Detail {
        public Detail() {
        }

        private String detailNum;

        public Detail(String detailNum) {
            this.detailNum = detailNum;
        }

        public String getDetailNum() {
            return detailNum;
        }

        public void setDetailNum(String detailNum) {
            this.detailNum = detailNum;
        }
    }

    public void startEngine(){
        Log.d("AAAAA", "startEngine: machine");
    }


    public void finishEngine(){

    };

}


