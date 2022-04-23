package com.example.studentsdatebase;

import static com.example.studentsdatebase.AddGroupActivity.id_;
import static com.example.studentsdatebase.ChooseGroupAdapter.g_id;
import static com.example.studentsdatebase.AddGroupActivity.count;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

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
//        groupsList.add(new GroupModel(g_id, "test"));
//        groupsList.add(new GroupModel(g_id, "test2"));
//        groupsList.add(new GroupModel(g_id, "test3"));
        chooseGroupRecyclerView = findViewById(R.id.chooseGroupRecyclerView);



        viewGroups();
    }

    private void viewGroups(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(ChooseGroupActivity.this,RecyclerView.VERTICAL, false);
        chooseGroupRecyclerView.setLayoutManager(layoutManager);
//        groupsList.add(new GroupModel("1", "first"));
//        groupsList.add(new GroupModel("2", "second"));
        adapter = new ChooseGroupAdapter(groupsList,this);
        chooseGroupRecyclerView.setAdapter(adapter);
    }

}