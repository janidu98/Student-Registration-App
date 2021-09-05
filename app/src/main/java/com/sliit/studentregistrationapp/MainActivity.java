package com.sliit.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private EditText editTextStudentName;
    //private int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        editTextStudentName = findViewById(R.id.editTextStudentName);

       // textView.setText("Student  Information");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("INFO","clicked");
                //textView.setText("Student Information : " + i);
                //i++;
                String val = editTextStudentName.getText().toString();
               // textView.setText("Student Information : " + val);
            }
        });
    }
}