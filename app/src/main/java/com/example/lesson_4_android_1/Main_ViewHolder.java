package com.example.lesson_4_android_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Main_ViewHolder extends RecyclerView.ViewHolder {

    TextView textView;


    public Main_ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_view);
    }
}
