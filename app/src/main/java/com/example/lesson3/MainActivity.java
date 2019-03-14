package com.example.lesson3;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.Toast;

public class MainActivity extends ParentActivity {
    private ConstraintLayout whatsAppConstraintLayout;
    @Override
    public void showStartToast() {
        Toast.makeText(this, "MainToast", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app2);

        whatsAppConstraintLayout = findViewById(R.id.whatsApp2);
        CustomRect();

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

    public void CustomRect(){
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        CustomView rect1 = new CustomView(this);
        whatsAppConstraintLayout.addView(rect1, params);
    }

}
