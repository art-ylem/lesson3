package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ParentActivity {
    private ConstraintLayout whatsAppConstraintLayout;
    private Switch switchMobile;
    private Switch switchWifi;
    private Switch switchRoaming;
    private TextView mobileDataGreyText;
    private TextView wifiGreyText;
    private TextView roamingGreyText;
    private TextView storageUsageText;
    private TextView dataUsageText;

    @Override
    public void showStartToast() {
        Toast.makeText(this, "MainToast", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app2);

        whatsAppConstraintLayout = findViewById(R.id.whatsApp2);
        switchMobile = findViewById(R.id.switchMobile);
        switchWifi = findViewById(R.id.switchWifi);
        switchRoaming = findViewById(R.id.switchRoaming);
        mobileDataGreyText = findViewById(R.id.mobileDataGray);
        wifiGreyText = findViewById(R.id.wifiGray);
        roamingGreyText = findViewById(R.id.roamingGray);
        storageUsageText = findViewById(R.id.storageUsage);
        dataUsageText = findViewById(R.id.dataUsage);


        switchMobile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mobileDataGreyText.setText(R.string.chenged_text);
                } else{
                    mobileDataGreyText.setText(R.string.mobile_data_grey);
                }
            }
        });

        switchWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    wifiGreyText.setText(R.string.chenged_text);
                } else{
                    wifiGreyText.setText(R.string.wifi_grey);
                }
            }
        });

        switchRoaming.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    roamingGreyText.setText(R.string.chenged_text);
                } else{
                    roamingGreyText.setText(R.string.roaming_gray);
                }
            }
        });

        storageUsageText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity.startActivity(MainActivity.this);
            }
        });

        dataUsageText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity.startActivity(MainActivity.this);
            }
        });

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

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, WhatsAppActivity2.class);
        context.startActivity(intent);
    }


    public void customText(){
        CustomTextView cusText1 = new CustomTextView(this);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        whatsAppConstraintLayout.addView(cusText1, params);

    }

    public void customRect(){
        CustomView rect1 = new CustomView(this);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        whatsAppConstraintLayout.addView(rect1, params);
    }


}
