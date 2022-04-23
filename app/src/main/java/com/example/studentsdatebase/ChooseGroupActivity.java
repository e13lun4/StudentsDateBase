package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChooseGroupActivity extends AppCompatActivity {
    private RecyclerView chooseGroupRecyclerView;
    public static List<GroupModel> groupsList = new ArrayList<>();
    public static int sGroupI = 0;
    private ChooseGroupAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_group);

        chooseGroupRecyclerView = findViewById(R.id.chooseGroupRecyclerView);

        viewGroups();
    }

    private void viewGroups(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(ChooseGroupActivity.this,RecyclerView.VERTICAL, false);
        chooseGroupRecyclerView.setLayoutManager(layoutManager);

        adapter = new ChooseGroupAdapter(groupsList);
        chooseGroupRecyclerView.setAdapter(adapter);
    }

}