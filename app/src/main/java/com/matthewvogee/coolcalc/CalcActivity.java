package com.matthewvogee.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.Console;

public class CalcActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        button_listeners();
    }

    void button_listeners() {
        long Total;
        TextView Display_Text = (TextView)findViewById(R.id.textView_Display);
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

        numbers[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        numbers[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("1");
            }
        });
        numbers[2].setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               System.out.println("2");
           }
        });
        numbers[3].setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v){
               System.out.println("3");
           }
        });
        numbers[4].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("4");
            }
        });
        numbers[5].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("5");
            }
        });
        numbers[6].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("6");
            }
        });
        numbers[7].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("7");
            }
        });
        numbers[8].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("8");
            }
        });
        numbers[9].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("add");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("divide");
            }
        });
        btnequ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("equals");
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("multiply");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("subtract");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("clear");
            }
        });
    }
}
