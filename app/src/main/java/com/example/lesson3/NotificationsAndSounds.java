package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class NotificationsAndSounds extends AppCompatActivity {
    private Switch switchPrivate;
    private Switch switchGroups;
    private Switch switchChannels;
    private TextView vibrate;
    private TextView ringtone;
    private TextView channelsGray;
    private TextView groupsGray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications_and_sounds);

        switchPrivate = findViewById(R.id.switch_private);
        switchGroups = findViewById(R.id.switch_groups);
        switchChannels = findViewById(R.id.switch_channels);
        vibrate = findViewById(R.id.vibrate);
        ringtone = findViewById(R.id.ringtone);
        channelsGray = findViewById(R.id.channels_gray);
        groupsGray = findViewById(R.id.groups_gray);

        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long mills = 1000L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(mills);
                }
            }
        });

        ringtone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity2.startActivity(NotificationsAndSounds.this);
            }
        });

        switchChannels.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    switchGroups.setChecked(false);
                    switchPrivate.setChecked(false);
                    channelsGray.setText(R.string.channels_gray);
                } else {
                    channelsGray.setText(R.string.channels_gray_off);
                }
            }
        });

        switchGroups.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    switchPrivate.setChecked(false);
                    switchChannels.setChecked(false);
                    groupsGray.setText(R.string.groups_gray);
                } else {
                    groupsGray.setText(R.string.groups_gray_off);
                }
            }
        });

        switchPrivate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    switchGroups.setChecked(false);
                    switchChannels.setChecked(false);
                }
            }
        });


    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, NotificationsAndSounds.class);
        context.startActivity(intent);
    }
}
