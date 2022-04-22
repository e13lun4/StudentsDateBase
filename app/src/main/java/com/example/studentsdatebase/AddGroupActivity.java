package com.example.studentsdatebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddGroupActivity extends AppCompatActivity {
    private EditText groupId;
    private EditText groupName;
    private Button addGroupBtn;
    public static Intent id_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgroup);

        addGroupBtn = findViewById(R.id.addGroupButton);
        groupId = findViewById(R.id.groupId);
        groupName = findViewById(R.id.groupName);

        addGroupBtn.setOnClickListener(view -> {
            Intent intent = new Intent(AddGroupActivity.this, ChooseGroupAdapter.class);
            id_ = intent.putExtra("GROUP_ID", groupId.getText().toString());
            intent.putExtra("GROUP_NAME", groupName.getText().toString());
            Intent intent1 = new Intent(AddGroupActivity.this, ChooseGroupActivity.class);
            startActivity(intent1);
        });
    }
}