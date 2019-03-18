package com.example.lesson3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WhatsAppActivity extends AppCompatActivity {
    public static final int SCORE = 7;

    private ImageView backArrow;
    private TextView notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        backArrow = findViewById(R.id.back_arrow);
        notification = findViewById(R.id.notification_text);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationsAndSounds.startActivity(WhatsAppActivity.this);
            }
        });

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsAppActivity2.startActivity(WhatsAppActivity.this);
            }
        });

    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, WhatsAppActivity.class);
        context.startActivity(intent);

    }

}
