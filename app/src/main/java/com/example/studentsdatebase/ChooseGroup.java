package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ChooseGroup extends AppCompatActivity {
    RecyclerView rec;
//    groupNameAdapter groupNameAdapter;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_group);

        List<String> groupList = new ArrayList<>();
        groupList.add(getIntent().getStringExtra("group_name"));
        btn = findViewById(R.id.button);
        btn.setText(getIntent().getStringExtra("group_name"));
//        setfilmRecycler(groupList);

    }
//    private void setfilmRecycler(List<String> groupList) {
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
//        rec = findViewById(R.id.rec);
//        rec.setLayoutManager(layoutManager);
//
//        groupNameAdapter = new groupNameAdapter(this, groupList);
//        rec.setAdapter(groupNameAdapter);
//    }
}