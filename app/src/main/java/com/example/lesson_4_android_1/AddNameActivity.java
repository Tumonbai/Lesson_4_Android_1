package com.example.lesson_4_android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddNameActivity extends AppCompatActivity {

    private EditText editText, ed, ed1;
    private Bundle savedInstanceState;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name);
        editText = findViewById(R.id.edit_text);
        ed = findViewById(R.id.edit_text1);
        ed1 = findViewById(R.id.edit_text2);
    }

    public void onClick(View view) {
        Intent intent = getIntent();
        intent.putExtra("key", ed.getText().toString());
        intent.putExtra("key1", ed1.getText().toString());
        intent.putExtra("key2", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}