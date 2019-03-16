package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class WhatsAppActivity2 extends AppCompatActivity {

    private ConstraintLayout whatsAppConstraintLayout;
    private Switch switchMobile;
    private Switch switchWifi;
    private Switch switchRoaming;
    private TextView mobileDataGreyText;
    private TextView wifiGreyText;
    private TextView roamingGreyText;
    private TextView storageUsageText;
    private TextView dataUsageText;
    private TextView reset;



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
        reset = findViewById(R.id.reset);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Хочу чтобы при нажатии на reset сбрасывались все свичи
                switchMobile.setChecked(false);
                switchRoaming.setChecked(false);
                switchWifi.setChecked(false);

            }
        });

//        switchMobile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//            }
//        });

        switchMobile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mobileDataGreyText.setText(R.string.chenged_text);
                    reset.setTextColor(Color.RED);
                } else{
                    mobileDataGreyText.setText(R.string.mobile_data_grey);
                    reset.setTextColor(Color.BLACK);
                }
            }
        });

        switchWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    wifiGreyText.setText(R.string.chenged_text);
                    reset.setTextColor(Color.RED);
                } else{
                    wifiGreyText.setText(R.string.wifi_grey); 11
                    reset.setTextColor(Color.BLACK);
                }
            }
        });

        switchRoaming.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    roamingGreyText.setText(R.string.chenged_text);
                    reset.setTextColor(Color.RED);
                } else{
                    roamingGreyText.setText(R.string.roaming_gray);
                    reset.setTextColor(Color.BLACK);
                }
            }
        });

        storageUsageText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity.startActivity(WhatsAppActivity2.this);
                storageUsageText.setTextColor(Color.BLUE);
            }
        });

        dataUsageText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity.startActivity(WhatsAppActivity2.this);
                dataUsageText.setTextColor(Color.BLUE);

            }
        });

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
