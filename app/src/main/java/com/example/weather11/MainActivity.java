package com.example.weather11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void onClickBsk (View view) {
        Intent intent = new Intent(MainActivity.this, BskActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClickMsk (View view) {
        Intent intent = new Intent(MainActivity.this, MskActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClickTmb (View view) {
        Intent intent = new Intent(MainActivity.this, TmbActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClickSar (View view) {
        Intent intent = new Intent(MainActivity.this, SarActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClickVlg (View view) {
        Intent intent = new Intent(MainActivity.this, VlgActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClickVn (View view) {
        Intent intent = new Intent(MainActivity.this, VrnActivity.class);
        startActivity(intent);
        finish();
    }
}