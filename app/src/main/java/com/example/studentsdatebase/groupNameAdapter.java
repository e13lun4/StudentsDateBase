//package com.example.studentsdatebase;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import java.util.List;
//
//public class groupNameAdapter extends RecyclerView.Adapter<groupNameAdapter.GroupViewHolder> {
//    Context context;
//    List<String> groups;
//
//    public groupNameAdapter(Context context, List<String> groups) {
//        this.context = context;
//        this.groups = groups;
//    }
//
//    @NonNull
//    @Override
//    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View groupitems = LayoutInflater.from(context).inflate(R.layout.activity_second, parent , false);
//        return new groupNameAdapter.GroupViewHolder(groupitems);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {
//        holder.group_name.getText().toString();
//        holder.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, ChooseGroup.class);
//                intent.putExtra("group_name",holder.group_name.getText().toString());
//                context.startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return groups.size();
//    }
//
//    public static final class GroupViewHolder extends RecyclerView.ViewHolder{
//        TextView group_name;
//        Button btn;
//        public GroupViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            group_name = itemView.findViewById(R.id.group_name);
//            btn = itemView.findViewById(R.id.button2);
//        }
//    }
//}
