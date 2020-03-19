package com.example.lesson_4_android_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Main_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new Main_Adapter();
        recyclerView.setAdapter(adapter);

        Button button = findViewById(R.id.button);

    }

    public void onClick2(View view) {
        startActivityForResult(new Intent(this, AddNameActivity.class), 101);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == RESULT_OK && data != null) {
            String nam = data.getStringExtra("key");
            String nam1 = data.getStringExtra("key1");
            String nam2 = data.getStringExtra("key2");
            adapter.addText(nam);
            adapter.addText(nam1);
            adapter.addText(nam2);
        }
    }
}
