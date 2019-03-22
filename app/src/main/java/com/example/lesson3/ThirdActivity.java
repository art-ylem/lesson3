package com.example.lesson3;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends ParentActivity {

    @Override
    public void showStartToast() {
        Toast.makeText(this, "ThirdToast", Toast.LENGTH_SHORT).show();
    }

    public static void launchActivity(Context context, String s){
        Intent intent = new Intent(context,ThirdActivity.class);
        intent.putExtra("launch_one",s);
        context.startActivity(intent);
    }

    public void finishActivityWithResult(String res){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("finish_one",res);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthActivity.startActivity(ThirdActivity.this);
            }
        });
    }
}
