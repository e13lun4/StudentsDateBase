package com.example.studentsdatebase;

import static com.example.studentsdatebase.ChooseGroupActivity.groupsList;
import static com.example.studentsdatebase.AddGroupActivity.id_;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChooseGroupAdapter extends RecyclerView.Adapter<ChooseGroupAdapter.ViewHolder> {
    private List<GroupModel> groupList;
    public static String g_id;
    private Context context;

    public ChooseGroupAdapter(List<GroupModel> groupList, Context context) {
        this.groupList = groupList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        String g_id = groupList.get(position).getId();
//        String g_id = "text";
//        String g_id = id_.getStringExtra("GROUP_ID");
        String group_id = String.valueOf(groupList.get(position).getId());
        holder.viewData(group_id, position, this);
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView dBtn;
        private TextView groupId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            groupId = itemView.findViewById(R.id.groupItemId);
            dBtn = itemView.findViewById(R.id.groupItemDelete);

        }
        private void viewData(String id, int pos, ChooseGroupAdapter adapter){
            groupId.setText(id);

            itemView.setOnClickListener(view -> {
                ChooseGroupActivity.sGroupI = pos;
                //TODO
                Intent intent = new Intent(context, AddStudentActivity.class);
                itemView.getContext().startActivity(intent);
            });

            dBtn.setOnClickListener(view -> {
                deleteGroup(pos, itemView.getContext(), adapter);
            });

        }

        @SuppressLint("NotifyDataSetChanged")
        private void deleteGroup(int id, Context context, ChooseGroupAdapter adapter){
            Toast.makeText(context, "Группа удалена", Toast.LENGTH_SHORT).show();
            groupsList.remove(id);
            adapter.notifyDataSetChanged();
        }

    }




}
