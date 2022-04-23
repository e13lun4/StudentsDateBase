package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button addStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addStudent = findViewById(R.id.addStudent);
        addStudent.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, AddStudentActivity.class);
            startActivity(intent);
        });
    }
}