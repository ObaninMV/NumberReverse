package com.example.controlwork1;

import androidx.appcompat.app.AppCompatActivity;

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

    public void convert(View view) {

        EditText firstNum = findViewById(R.id.Number);

        int num = Integer.parseInt(firstNum.getText().toString());

        int len = firstNum.length();
        int useless = 0;
        int result = 0;
        for (int i = 0; i < len; i++) {
           useless = num % 10;
           result += useless;
           if(i != len - 1) {
               result = result * 10;
           }
           num = num/10;
        }

        TextView outputNum = findViewById(R.id.output);
        firstNum.setText(Integer.toString(result));
    }

}