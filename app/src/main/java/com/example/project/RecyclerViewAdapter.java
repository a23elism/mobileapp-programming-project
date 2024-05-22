package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList <Color> Colors;
    public RecyclerViewAdapter(Context context, ArrayList<Color> Colors){
        this.context =context;
        this.Colors=Colors;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.recycler_layout, parent, false);

        return new RecyclerViewAdapter.MyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.textview.setText(Colors.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return Colors.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textview = itemView.findViewById(R.id.color);
        }
    }
}


