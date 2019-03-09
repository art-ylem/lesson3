package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    String TAG = "Second Activity";
    public static void startActivity(Context activity) {
        Intent intent = new Intent(activity, SecondActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.e(TAG, "onCreate: second activity создана");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdActivity.startActivity(SecondActivity.this);
            }
        }); 
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: second activity запущена ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume: second activity активна");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause: second activity видна, но не активна");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG, "onStop: second activity остановлена, но еще существует");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: second activity не сушествует");
    }

}
