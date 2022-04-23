package com.example.studentsdatebase;

import static com.example.studentsdatebase.ChooseGroupActivity.groupsList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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

    public ChooseGroupAdapter(List<GroupModel> groupList) {
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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
        private void viewData(String name_id, int pos, ChooseGroupAdapter adapter){
            groupId.setText(name_id);

            itemView.setOnClickListener(view -> {
                ChooseGroupActivity.sGroupI = pos;
                Intent intent = new Intent(itemView.getContext(), MainActivity2.class);
                itemView.getContext().startActivity(intent);
            });

            dBtn.setOnClickListener(view -> {
                deleteGroup(pos, itemView.getContext(), adapter);
            });

        }

        @SuppressLint("NotifyDataSetChanged")
        private void deleteGroup(int id, Context context, ChooseGroupAdapter adapter){
            groupsList.remove(id);
            adapter.notifyDataSetChanged();
            Toast.makeText(context, "Группа удалена", Toast.LENGTH_SHORT).show();
        }

    }
}
