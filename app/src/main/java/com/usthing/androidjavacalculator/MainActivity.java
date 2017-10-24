package com.usthing.androidjavacalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;
import java.util.List;

import static com.usthing.androidjavacalculator.MainActivity.Action.*;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;

    private Button dot;
    private Button clear;
    private Button compute;

    private EditText input;
    private EditText result;

    enum Action {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }

    private Double valueOne = Double.NaN;
    private Double valueTwo = Double.NaN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setNumberPadOnClickListener();
        setActionButtonOnClickListener();
        setMiscButtonOnClickListener();
    }

    private void initViews() {
        btn0 = findViewById(R.id.button_0);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);

        add = findViewById(R.id.button_add);
        subtract = findViewById(R.id.button_subtract);
        multiply = findViewById(R.id.button_multiply);
        divide = findViewById(R.id.button_divide);

        dot = findViewById(R.id.button_dot);
        clear = findViewById(R.id.button_clear);
        compute = findViewById(R.id.button_compute);

        input = findViewById(R.id.input);
        result = findViewById(R.id.result);
    }

    private void setNumberPadOnClickListener() {
        List<Button> btnList = Arrays.asList(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        for(Button button : btnList) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO: numpad button on click
                }
            });
        }
    }

    private void setActionButtonOnClickListener() {
        List<Button> btnList = Arrays.asList(add, subtract, multiply, divide);
        List<Action> actionList = Arrays.asList(ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION);
        for (Button button : btnList) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO: action button on click
                }
            });
        }
    }

    private void setMiscButtonOnClickListener() {
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: dot button on click
            }
        });
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: compute button on click
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: clear button on click
            }
        });
    }

}
