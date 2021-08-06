package com.example.timberdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import timber.log.Timber;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText num1, num2;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        num1 = findViewById(R.id.first_number);
        num2 = findViewById(R.id.second_number);
        answer = findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_number = Integer.parseInt(num1.getText().toString().trim());
                int second_number = Integer.parseInt(num2.getText().toString().trim());

                if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
                    num1.setError("Cannot be empty!!");

                }
                else{
                    int sum = first_number+second_number;
                    answer.setText(String.valueOf(sum));
                    Timber.v(answer.getText().toString());
                }
            }
        });


    }
}