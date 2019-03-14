package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends ParentActivity {

    @Override
    public void showStartToast() {
        Toast.makeText(this, "ThirdToast", Toast.LENGTH_SHORT).show();
    }
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

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthActivity.startActivity(ThirdActivity.this);
            }
        });
    }
}
