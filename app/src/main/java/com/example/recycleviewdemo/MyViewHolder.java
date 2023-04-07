package com.example.recycleviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView nameview,emailview;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameview = itemView.findViewById(R.id.name);
        emailview = itemView.findViewById(R.id.email);
    }
}
