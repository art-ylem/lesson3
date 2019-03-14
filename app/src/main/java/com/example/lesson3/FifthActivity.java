package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class FifthActivity extends ParentActivity {
    @Override
    public void showStartToast() {
        Toast.makeText(this, "FifthToast", Toast.LENGTH_SHORT).show();
    }

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

    }
}
