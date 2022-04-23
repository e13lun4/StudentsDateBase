package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChooseStudentActivity extends AppCompatActivity {
    private RecyclerView chooseStudentRecyclerView;
    public static List<StudentModel> studentsList = new ArrayList<>();
    public static int sStudentI = 0;
    private ChooseStudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_student);

        chooseStudentRecyclerView = findViewById(R.id.chooseStudentRecyclerView);

        viewStudents();
    }
    private void viewStudents(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(ChooseStudentActivity.this,RecyclerView.VERTICAL, false);
        chooseStudentRecyclerView.setLayoutManager(layoutManager);

        adapter = new ChooseStudentAdapter(studentsList);
        chooseStudentRecyclerView.setAdapter(adapter);
    }

}