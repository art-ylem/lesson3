package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    String TAG = "Third Activity";
    public static void startActivity(Context activity) {
        Intent intent = new Intent(activity, ThirdActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.e(TAG, "onCreate: third activity создана");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthActivity.startActivity(ThirdActivity.this);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: third activity запущена ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume: third activity активна");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause: third activity видна, но не активна");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG, "onStop: third activity остановлена, но еще существует");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: third activity не сушествует");
    }

}
