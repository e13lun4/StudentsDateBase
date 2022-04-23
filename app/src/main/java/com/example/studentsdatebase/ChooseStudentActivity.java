package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChooseStudentActivity extends AppCompatActivity {
    private RecyclerView chooseStudentRecyclerView;
    public static List<GroupModel> studentsList = new ArrayList<>();
    public static int sGroupI = 0;
    private ChooseStudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_student);

        chooseStudentRecyclerView = findViewById(R.id.rec);

        viewStudents();
    }
    private void viewStudents(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(ChooseStudentActivity.this,RecyclerView.VERTICAL, false);
        chooseStudentRecyclerView.setLayoutManager(layoutManager);
//        groupsList.add(new GroupModel("1", "first"));
//        groupsList.add(new GroupModel("2", "second"));
        adapter = new ChooseStudentAdapter(studentsList,this);
        chooseStudentRecyclerView.setAdapter(adapter);
    }

}