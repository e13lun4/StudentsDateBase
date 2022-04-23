package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button addGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addGroup = findViewById(R.id.addGroup);
        addGroup.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddGroupActivity.class);
            startActivity(intent);
        });
    }
}