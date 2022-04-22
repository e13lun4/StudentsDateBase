package com.example.studentsdatebase;

import static com.example.studentsdatebase.ChooseGroupAdapter.g_id;

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

        chooseGroupRecyclerView = findViewById(R.id.chooseGroupRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(ChooseGroupActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        chooseGroupRecyclerView.setLayoutManager(layoutManager);

        viewGroups();
    }

    private void viewGroups(){
        groupsList.clear();
        groupsList.add(new GroupModel(g_id, "test"));
        groupsList.add(new GroupModel(g_id, "test2"));
        groupsList.add(new GroupModel(g_id, "test3"));
        adapter = new ChooseGroupAdapter(groupsList);
        chooseGroupRecyclerView.setAdapter(adapter);
    }

}