package com.example.weather11;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScreeenActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screeen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ScreeenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }


    public void Click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}