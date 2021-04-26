package umn.ac.id.week11_28836;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    ArrayList<Model> postModels;

    public Adapter(ArrayList<Model> posts) {
        postModels = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.rvTitle.setText(postModels.get(position).getTitle());
        holder.rvBody.setText(postModels.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView rvTitle, rvBody;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rvTitle = itemView.findViewById(R.id.rvTitle);
            rvBody = itemView.findViewById(R.id.rvBody);
        }
    }
}