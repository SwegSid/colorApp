package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count;
    @SuppressLint("SetTextI18n")
    public void click(View view){
        count++;
        TextView end = findViewById(R.id.textView3);
        EditText name = findViewById(R.id.editTextTextPersonName);

        end.setText(""+name + " clicked " + count +" times");
    }
//sid is cute:)
}