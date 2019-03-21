package com.example.lesson3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ParentActivity {
    private FloatingActionButton fab;
    private TextView text;


    @Override
    public void showStartToast() {
        Toast.makeText(this, "SecondToast", Toast.LENGTH_SHORT).show();
    }

    public static void launchActivity(Context context, String value) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("EXTRA_SESSION_ID", value);
        context.startActivity(intent);

    }

    public void finishActivityWithResult(String result){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", result);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fab = findViewById(R.id.fab);
        text = findViewById(R.id.text);
        text.setText(getIntent().getStringExtra("EXTRA_SESSION_ID"));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sessionId = getIntent().getStringExtra("EXTRA_SESSION_ID");
                finishActivityWithResult(sessionId);
                text.setText(sessionId);
            }
        });



    }
}
