package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String RESULT = "com.example.android.calculator.RESULT";
    EditText first, second;
    Button add, subtract, multiply, divide;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                first = (EditText) findViewById(R.id.first);
                int number1 = Integer.parseInt(first.getText().toString());
                second = (EditText) findViewById(R.id.second);
                int number2 = Integer.parseInt(second.getText().toString());
                result = number1 + number2;
                openResultActivity();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                first = (EditText) findViewById(R.id.first);
                int number1 = Integer.parseInt(first.getText().toString());
                second = (EditText) findViewById(R.id.second);
                int number2 = Integer.parseInt(second.getText().toString());
                result = number1 - number2;
                openResultActivity();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                first = (EditText) findViewById(R.id.first);
                int number1 = Integer.parseInt(first.getText().toString());
                second = (EditText) findViewById(R.id.second);
                int number2 = Integer.parseInt(second.getText().toString());
                result = number1 * number2;
                openResultActivity();
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                first = (EditText) findViewById(R.id.first);
                int number1 = Integer.parseInt(first.getText().toString());
                second = (EditText) findViewById(R.id.second);
                int number2 = Integer.parseInt(second.getText().toString());
                result = number1 / number2;
                openResultActivity();
            }
        });

    }
    public void openResultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(RESULT, result);
        startActivity(intent);
    }
}