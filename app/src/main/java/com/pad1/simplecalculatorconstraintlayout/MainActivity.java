package com.pad1.simplecalculatorconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double firstInput;
    double scndInput;
    Button add;
    Button sub;
    Button times;
    Button divide;
    TextView finalResult;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.subtraction);
        times = findViewById(R.id.times);
        divide = findViewById(R.id.divide);
        finalResult = findViewById(R.id.result);
        add = findViewById(R.id.add);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        firstInput = 0.0;
        scndInput = 0.0;

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                try{
                    String val1 = editText1.getText().toString();
                    firstInput = Double.parseDouble(val1);

                }
                catch (NumberFormatException e){
                    firstInput = 0;
                }
                try{
                    String val2 = editText2.getText().toString();
                    scndInput = Double.parseDouble(val2);

                }
                catch (NumberFormatException e){
                    scndInput = 0;
                }
                double operations = firstInput + scndInput;
                finalResult.setText(Double.toString(operations));
            }

        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                try{
                    String val1 = editText1.getText().toString();
                    firstInput = Double.parseDouble(val1);

                }
                catch (NumberFormatException e){
                    firstInput = 0;
                }
                try{
                    String val2 = editText2.getText().toString();
                    scndInput = Double.parseDouble(val2);

                }
                catch (NumberFormatException e){
                    scndInput = 0;
                }
                double operations = firstInput - scndInput;
                finalResult.setText(Double.toString(operations));
            }});
        times.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                try{
                    String val1 = editText1.getText().toString();
                    firstInput = Double.parseDouble(val1);

                }
                catch (NumberFormatException e){
                    firstInput = 0;
                }
                try{
                    String val2 = editText2.getText().toString();
                    scndInput = Double.parseDouble(val2);

                }
                catch (NumberFormatException e){
                    scndInput = 0;
                }
                double operations = firstInput * scndInput;
                finalResult.setText(Double.toString(operations));
            }});
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                try{
                    String val1 = editText1.getText().toString();
                    firstInput = Double.parseDouble(val1);

                }
                catch (NumberFormatException e){
                    firstInput = 0;
                }
                try{
                    String val2 = editText2.getText().toString();
                    scndInput = Double.parseDouble(val2);

                }
                catch (NumberFormatException e){
                    scndInput = 0;
                }
                double operations = firstInput / scndInput;
                finalResult.setText(Double.toString(operations));
            }});

    }





}