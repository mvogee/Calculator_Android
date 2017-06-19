package com.matthewvogee.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.Console;

public class CalcActivity extends Activity
{

    public enum Operation
    {
        ADD,
        SUBTRACT,
        DIVIDE,
        MULTIPLY,
        EQUAL
    }

    Operation currentOperation = null;
    String runningNumber = "";
    String rightValueStr = "";
    String leftValueStr = "";
    long result = 0;

    TextView Display_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        button_listeners();
    }

    void button_listeners()
    {
        Display_Text = (TextView)findViewById(R.id.textView_Display);
        ImageButton btnDivide = (ImageButton)findViewById(R.id.imageButton_divide);
        ImageButton btnMult = (ImageButton)findViewById(R.id.imageButton_multiply);
        ImageButton btnAdd = (ImageButton)findViewById(R.id.imageButton_addition);
        ImageButton btnSub = (ImageButton)findViewById(R.id.imageButton_subtract);
        ImageButton btnequ = (ImageButton)findViewById(R.id.imageButton_equal);
        Button btnclear = (Button)findViewById(R.id.button_clear);
        Button[] numbers = new Button[10];

        numbers[0] = (Button)findViewById(R.id.button_0); // all these need the actionlistener set
        numbers[1] = (Button)findViewById(R.id.button_1);
        numbers[2] = (Button)findViewById(R.id.button_2);
        numbers[3] = (Button)findViewById(R.id.button_3);
        numbers[4] = (Button)findViewById(R.id.button_4);
        numbers[5] = (Button)findViewById(R.id.button_5);
        numbers[6] = (Button)findViewById(R.id.button_6);
        numbers[7] = (Button)findViewById(R.id.button_7);
        numbers[8] = (Button)findViewById(R.id.button_8);
        numbers[9] = (Button)findViewById(R.id.button_9);

        Display_Text.setText("");
        numbers[0].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                numberPressed(0);
            }
        });
        numbers[1].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(1);
            }
        });
        numbers[2].setOnClickListener(new View.OnClickListener()
        {
           @Override
            public void onClick(View v){
               numberPressed(2);
           }
        });
        numbers[3].setOnClickListener(new View.OnClickListener()
        {
           @Override
            public void onClick(View v){
               numberPressed(3);
           }
        });
        numbers[4].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(4);
            }
        });
        numbers[5].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(5);
            }
        });
        numbers[6].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(6);
            }
        });
        numbers[7].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(7);
            }
        });
        numbers[8].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(8);
            }
        });
        numbers[9].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                numberPressed(9);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                operatorPressed(Operation.ADD);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                operatorPressed(Operation.DIVIDE);
            }
        });
        btnequ.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                operatorPressed(Operation.EQUAL);
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                operatorPressed(Operation.MULTIPLY);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operatorPressed(Operation.SUBTRACT);
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rightValueStr = "";
                leftValueStr = "";
                runningNumber = "";
                result = 0;
                currentOperation = null;
                Display_Text.setText("");
            }
        });
    }
    void numberPressed(int numPressed)
    {
        runningNumber += String.valueOf(numPressed);
        Display_Text.setText(runningNumber);
    }

    void operatorPressed(Operation op)
    {
        if (currentOperation != null)
        {
            if (runningNumber != "") {
                rightValueStr = runningNumber;
                runningNumber = "";

                switch (currentOperation) {
                    case ADD:
                        result = Long.parseLong(leftValueStr) + Long.parseLong(rightValueStr);
                        break;
                    case SUBTRACT:
                        result = Long.parseLong(leftValueStr) - Long.parseLong(rightValueStr);
                        break;
                    case DIVIDE:
                        result = Long.parseLong(leftValueStr) / Long.parseLong(rightValueStr);
                        break;
                    case MULTIPLY:
                        result = Long.parseLong(leftValueStr) * Long.parseLong(rightValueStr);
                        break;
                }
                leftValueStr = String.valueOf(result);
                Display_Text.setText(leftValueStr);
            }
        }
        else
        {
            leftValueStr = runningNumber;
            runningNumber = "";
        }
        currentOperation = op;
    }
}
