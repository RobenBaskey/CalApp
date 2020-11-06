package com.roben.calapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_history , tv_result;
    private Button sevenBtn , eightBtn , nineBtn , clearBtn;
    private Button fourBtn , fiveBtn , sixBtn , divideBtn ;
    private Button oneBtn , twoBtn , threeBtn , multiplyBtn , minusBtn;
    private Button dotBtn , zeroBtn , equalBtn , addBtn;
    int history = 0;
    int working = 0 , operation = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        tv_history = (TextView) findViewById(R.id.tv_history);
        tv_result = (TextView) findViewById(R.id.tv_result);
        sevenBtn = (Button) findViewById(R.id.seven_btn);
        eightBtn = (Button) findViewById(R.id.eight_btn);
        nineBtn = (Button) findViewById(R.id.nine_btn);
        clearBtn = (Button) findViewById(R.id.clear_btn);
        fourBtn = (Button) findViewById(R.id.four_btn);
        fiveBtn = (Button) findViewById(R.id.five_btn);
        sixBtn = (Button) findViewById(R.id.six_btn);
        divideBtn = (Button) findViewById(R.id.divide_btn);
        oneBtn = (Button) findViewById(R.id.one_btn);
        twoBtn = (Button) findViewById(R.id.two_btn);
        threeBtn = (Button) findViewById(R.id.three_btn);
        multiplyBtn = (Button) findViewById(R.id.multiply_btn);
        minusBtn = (Button) findViewById(R.id.minus_btn);
        dotBtn = (Button) findViewById(R.id.dot_btn);
        zeroBtn = (Button) findViewById(R.id.zero_btn);
        equalBtn = (Button) findViewById(R.id.equal_btn);
        addBtn = (Button) findViewById(R.id.add_btn);

        sevenBtn.setOnClickListener(this);
        eightBtn.setOnClickListener(this);
        nineBtn.setOnClickListener(this);
        clearBtn.setOnClickListener(this);
        fourBtn.setOnClickListener(this);
        fiveBtn.setOnClickListener(this);
        sixBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        multiplyBtn.setOnClickListener(this);
        oneBtn.setOnClickListener(this);
        twoBtn.setOnClickListener(this);
        threeBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        dotBtn.setOnClickListener(this);
        zeroBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
        addBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dot_btn:
                dotOperation();
                break;
            case R.id.equal_btn:
                equalOperation();
                break;
            case R.id.add_btn:
                addOperation();
                break;
            case R.id.minus_btn:
                minusOperation();
                break;
            case R.id.multiply_btn:
                multiplyOperation();
                break;
            case R.id.divide_btn:
                divideOperation();
                break;
            case R.id.clear_btn:
                clearOperation();
                break;
            case R.id.zero_btn:
                zeroOperation();
                break;
            case R.id.one_btn:
                oneOperation();
                break;
            case R.id.two_btn:
                twoOperation();
                break;
            case R.id.three_btn:
                threeOperation();
                break;
            case R.id.four_btn:
                fourOperation();
                break;
            case R.id.five_btn:
                fiveOperation();
                break;
            case R.id.six_btn:
                sixOperation();
                break;
            case R.id.seven_btn:
                sevenOperation();
                break;
            case R.id.eight_btn:
                eightOperation();
                break;
            case R.id.nine_btn:
                nineOperation();
                break;

        }
    }

    private void equalOperation() {
        if(operation ==1){
            int a = history;
            int b = Integer.parseInt(tv_result.getText().toString());

            tv_history.setText(String.valueOf(a)+" + "+String.valueOf(b)+" = ");
            int result = a + b;
            tv_result.setText(String.valueOf(result));

        }
        else if(operation ==2){
            int a = history;
            int b = Integer.parseInt(tv_result.getText().toString());

            tv_history.setText(String.valueOf(a)+" - "+String.valueOf(b)+" = ");
            int result = a - b;
            tv_result.setText(String.valueOf(result));
        }
        else if(operation ==3){
            int a = history;
            int b = Integer.parseInt(tv_result.getText().toString());

            tv_history.setText(String.valueOf(a)+" x "+String.valueOf(b)+" = ");
            int result = a * b;
            tv_result.setText(String.valueOf(result));

        }
        else if(operation ==4){
            int a = history;
            int b = Integer.parseInt(tv_result.getText().toString());

            tv_history.setText(String.valueOf(a)+" / "+String.valueOf(b)+" = ");
            int result = a / b;
            tv_result.setText(String.valueOf(result));

        }
    }

    private void addOperation() {
        operation = 1;
        working = 0;
        String number = tv_result.getText().toString();
        history = Integer.parseInt(number);
        tv_history.setText(number+" + ");
        tv_result.setText("");
    }

    private void minusOperation() {
        operation = 2;
        working = 0;
        String number = tv_result.getText().toString();
        history = Integer.parseInt(number);
        tv_history.setText(number+" - ");
        tv_result.setText("");
    }

    private void multiplyOperation() {
        operation = 3;
        working = 0;
        String number = tv_result.getText().toString();
        history = Integer.parseInt(number);
        tv_history.setText(number+" x ");
        tv_result.setText("");
    }

    private void divideOperation() {
        operation = 4;
        working = 0;
        String number = tv_result.getText().toString();
        history = Integer.parseInt(number);
        tv_history.setText(number+" / ");
        tv_result.setText("");
    }

    private void clearOperation() {
        tv_result.setText("");
        tv_history.setText("");
        working = 0;
    }

    private void zeroOperation() {
        if(working == 0){
            if(tv_result.getText().toString().equals("")){

            }else{
                String his = tv_result.getText().toString();
                String number = zeroBtn.getText().toString();
                tv_result.setText(String.valueOf(his+number));
            }

        }
    }

    private void oneOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = oneBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void twoOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = twoBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void threeOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = threeBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void fourOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = fourBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void fiveOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = fiveBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void sixOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = sixBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void sevenOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = sevenBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void eightOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = eightBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void nineOperation() {
        if(working == 0){
            String his = tv_result.getText().toString();
            String number = nineBtn.getText().toString();
            tv_result.setText(String.valueOf(his+number));
        }
    }

    private void dotOperation() {

    }
}