package com.example.lesson3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.lesson3.javaExample.Airplane;
import com.example.lesson3.javaExample.Car;
import com.example.lesson3.javaExample.Machine;

public class MainActivity extends ParentActivity {

    @Override
    public void showStartToast() {
        Toast.makeText(this, "MainToast", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.startActivity(MainActivity.this);
            }
        });

        Car sportCar = new Car(){
            @Override
            public void startEngine() {
                Log.d(TAG, "startEngine: OOOOOOOOOOOOOOOOOOO");
            }
        };

        Machine mach1 = new Car();
        Car mach2 = new Car();
        int y = 0;
        y++;
        Machine.Detail mach3 = new Machine.Detail("name");

        Machine[] machines = {new Car(), new Car(), new Airplane(), sportCar};

        for(int i = 0; i < machines.length; i++ ){
            machines[i].startEngine();
        }

    }

}
