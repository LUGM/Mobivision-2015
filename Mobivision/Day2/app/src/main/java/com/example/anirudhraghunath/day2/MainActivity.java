package com.example.anirudhraghunath.day2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    EditText operandOneEditText, operandTwoEditText;
    TextView operatorTextView, resultTextView;
    Button operatorAddButton, operatorSubButton, operatorMulButton, operatorDivButton, resultButton;

    String operandOne, operandTwo, operator, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operandOneEditText = (EditText)findViewById(R.id.operand1EditText);
        operandTwoEditText = (EditText)findViewById(R.id.operand2EditText);

        operatorTextView = (TextView)findViewById(R.id.operatorTextView);
        resultTextView = (TextView)findViewById(R.id.resultTextView);

        operatorAddButton = (Button)findViewById(R.id.operatorAddButton);
        operatorSubButton = (Button)findViewById(R.id.operatorSubButton);
        operatorMulButton = (Button)findViewById(R.id.operatorMulButton);
        operatorDivButton = (Button)findViewById(R.id.operatorDivButton);
        resultButton = (Button)findViewById(R.id.resultButton);


        operator = null;

        operatorAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                operatorTextView.setText(operator);
            }
        });
        operatorSubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                operatorTextView.setText(operator);
            }
        });
        operatorMulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";
                operatorTextView.setText(operator);
            }
        });
        operatorDivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                operatorTextView.setText(operator);
            }
        });


        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operandOne = operandOneEditText.getText().toString();
                operandTwo = operandTwoEditText.getText().toString();

                if(operator == null){

                } else{

                            try {
                                switch (operator) {

                                    case "+":
                                        result = Integer.toString((Integer.parseInt(operandOne) + Integer.parseInt(operandTwo)));
                                        break;
                                    case "-":
                                        result = Integer.toString((Integer.parseInt(operandOne) - Integer.parseInt(operandTwo)));
                                        break;
                                    case "*":
                                        result = Integer.toString((Integer.parseInt(operandOne) * Integer.parseInt(operandTwo)));
                                        break;
                                    case "/":
                                        result = Integer.toString((Integer.parseInt(operandOne) / Integer.parseInt(operandTwo)));

                                }
                            }catch (Exception e)
                            {
                                Snackbar.make(findViewById(android.R.id.content), "Divide by Zero Error.", Snackbar.LENGTH_SHORT)
                                        .setActionTextColor(Color.BLACK)
                                        .show();
                                e.printStackTrace();
                            }
                    resultTextView.setText(result);

                }


            }
        });
    }


}
