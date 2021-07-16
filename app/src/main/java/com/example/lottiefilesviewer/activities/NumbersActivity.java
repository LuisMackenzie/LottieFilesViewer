package com.example.lottiefilesviewer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.lottiefilesviewer.R;

public class NumbersActivity extends AppCompatActivity {

    private Button b1,b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private Button b_equal, b_multi, b_divide, b_add, b_sub, b_clear, b_dot, b_para1, b_para2;
    private TextView t1, t2;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private final char EXTRA = '@';
    private final char MODULUS = '%';
    private char ACTION;
    private double val1 = Double.NaN, val2;
    private LottieAnimationView numView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        viewSetup();
        // numView.setAnimation(R.raw.num00);


       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ifErrorOnOutput();
                // exceedLength();
                // numView.setAnimation(R.raw.numcolor01);
                // t1.setText(t1.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ifErrorOnOutput();
                // exceedLength();
                // t1.setText(t1.getText().toString() + "2");
            }
        });*/

    }

    private void viewSetup() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);
        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        b_para1 = findViewById(R.id.button_para1);
        b_para2 = findViewById(R.id.button_para2);
        numView = findViewById(R.id.input);
        // t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.output);
    }

    // Remove error message that is already written there.
    /*private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }*/

    // Make text small if too many digits.
    /*private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }*/

}