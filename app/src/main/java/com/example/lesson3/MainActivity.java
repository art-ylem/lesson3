package com.example.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WhatsAppActivity2.startActivity(MainActivity.this);


        //        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SecondActivity.startActivity(MainActivity.this);
//            }
//        });
//
//        Car sportCar = new Car(){
//            @Override
//            public void startEngine() {
//                Log.d(TAG, "startEngine: OOOOOOOOOOOOOOOOOOO");
//            }
//        };
//
//        Machine mach1 = new Car();
//        Car mach2 = new Car();
//        int y = 0;
//        y++;
//        Machine.Detail mach3 = new Machine.Detail("name");
//
//        Machine[] machines = {new Car(), new Car(), new Airplane(), sportCar};
//
//        for(int i = 0; i < machines.length; i++ ){
//            machines[i].startEngine();
//        }
    }


}
