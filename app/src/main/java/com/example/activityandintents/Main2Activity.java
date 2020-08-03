package com.example.activityandintents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int mCount = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0);
        TextView mCountTextView = findViewById(R.id.count_text);
        mCountTextView.setText(String.valueOf(mCount));
    }
}
