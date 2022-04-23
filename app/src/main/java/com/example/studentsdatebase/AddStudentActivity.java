package com.example.studentsdatebase;

import static com.example.studentsdatebase.ChooseGroupActivity.groupsList;
import static com.example.studentsdatebase.ChooseStudentActivity.studentsList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddStudentActivity extends AppCompatActivity {
    EditText name,surname,LastName,BirthDate;
    Button addStudent;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.Surname);
        LastName = findViewById(R.id.LastName);
        BirthDate = findViewById(R.id.BirthDate);
        addStudent = findViewById(R.id.AddStudent);

        addStudent.setOnClickListener(view -> {
            Intent intent = new Intent(AddStudentActivity.this, ChooseStudentAdapter.class);
            intent.putExtra("NameStudent", name.getText().toString());
            intent.putExtra("SurnameStudent", surname.getText().toString());
            intent.putExtra("LastNameStudent", LastName.getText().toString());
            intent.putExtra("BirthDateStudent", BirthDate.getText().toString());

            Intent intent1 = new Intent(AddStudentActivity.this, ChooseGroupActivity.class);
            count++;
            studentsList.add(new StudentModel(name.getText().toString(), surname.getText().toString(), LastName.getText().toString(), BirthDate.getText().toString()));
            startActivity(intent1);
        });
    }
}