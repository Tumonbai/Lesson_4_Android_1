package com.example.lesson_4_android_1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main_Adapter extends RecyclerView.Adapter<Main_ViewHolder> {

    ArrayList<String> data;

    public Main_Adapter() {
        data = new ArrayList<>();
    }

    public void addText(String t) {
        data.add(t);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Main_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent, false);
        return new Main_ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Main_ViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
