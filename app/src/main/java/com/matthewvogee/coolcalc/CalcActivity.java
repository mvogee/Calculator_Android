package com.matthewvogee.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
    }
}
