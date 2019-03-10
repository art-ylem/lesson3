package com.example.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ParentActivity extends AppCompatActivity {
    String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: first activity создана");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: main activity запущена ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume: main activity активна");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause: main activity видна, но не активна");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG, "onStop: main activity остановлена, но еще существует");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: main activity не сушествует");
    }

}
