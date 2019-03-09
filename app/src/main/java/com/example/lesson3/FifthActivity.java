package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class FifthActivity extends AppCompatActivity {

    String TAG = "Fifth Activity";
    public static void startActivity(Context activity) {
        Intent intent = new Intent(activity, FifthActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivth);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.e(TAG, "onCreate: fifth activity создана");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: fifth activity запущена ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume: fifth activity активна");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause: fifth activity видна, но не активна");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG, "onStop: fifth activity остановлена, но еще существует");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: fifth activity не сушествует");
    }


}
