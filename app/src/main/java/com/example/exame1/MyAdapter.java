package com.example.exame1;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MyAdapter extends RecyclerView.Adapter {

    RecyclerView recyclerView;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return recyclerView.findViewHolderForLayoutPosition(R.layout.itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //holder.getAdapterPosition(),position
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
