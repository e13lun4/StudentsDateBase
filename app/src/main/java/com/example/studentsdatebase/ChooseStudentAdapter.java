package com.example.studentsdatebase;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChooseStudentAdapter extends RecyclerView.Adapter<ChooseStudentAdapter.ViewHolder> {
    private List<StudentModel> studentList;


    public ChooseStudentAdapter(List<StudentModel> studentList) {
        this.studentList = studentList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new ChooseStudentAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String student_name = String.valueOf(studentList.get(position).getName());
        String student_surname = String.valueOf(studentList.get(position).getSurname());
        holder.viewData(student_name, student_surname, position, this);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView sName, sSurname;
        private ImageView dBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sName = itemView.findViewById(R.id.studentItemName);
            sSurname = itemView.findViewById(R.id.studentItemSurname);
            dBtn = itemView.findViewById(R.id.studentItemDelete);

        }

        private void viewData(String studentN, String studentS, int pos, ChooseStudentAdapter adapter){
            sName.setText(studentN);
            sSurname.setText(studentS);

            itemView.setOnClickListener(view -> {
                ChooseStudentActivity.sStudentI = pos;
                //TODO
//                Intent intent = new Intent(context, MainActivity2.class);
//                itemView.getContext().startActivity(intent);
            });

            dBtn.setOnClickListener(view -> {
//                deleteGroup(pos, itemView.getContext(), adapter);
            });

        }

    }
}
