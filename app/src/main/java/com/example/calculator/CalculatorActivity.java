package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPoint, btnSum, btnSubtraction, btnMultiply, btnDivide, btnPercentage, btnEquals, btnAC, btnDel, btnMore;
    TextView tvFirstDigit, tvSecondDigit, tvOperation, tvAnswer;
    Integer FirstDigit, SecondDigit, Answer;
    String Operation, Ans;
    View vHorizontalLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getID();
        onClick();
    }

    public void getID() {
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnPoint = findViewById(R.id.buttonPoint);
        btnSum = findViewById(R.id.buttonSum);
        btnSubtraction = findViewById(R.id.buttonSubtraction);
        btnMultiply = findViewById(R.id.buttonMultiply);
        btnDivide = findViewById(R.id.buttonDivide);
        btnPercentage = findViewById(R.id.buttonPercentage);
        btnEquals = findViewById(R.id.buttonEquals);
        btnAC = findViewById(R.id.buttonAC);
        btnDel = findViewById(R.id.buttonDelete);
        btnMore = findViewById(R.id.buttonMore);
        tvFirstDigit = findViewById(R.id.textViewFirstDigit);
        tvSecondDigit = findViewById(R.id.textViewSecondDigit);
        tvOperation = findViewById(R.id.textViewOperation);
        tvAnswer = findViewById(R.id.textViewAnswer);
        vHorizontalLine = findViewById(R.id.viewHorizontalLine);
    }

    public void onClick() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnPercentage.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn0) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("0");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("0");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "0";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "0";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn1) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("1");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("1");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "1";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "1";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn2) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("2");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("2");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "2";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "2";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn3) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("3");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("3");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "3";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "3";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn4) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("4");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("4");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "4";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "4";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn5) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("5");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("5");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "5";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "5";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn6) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("6");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("6");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "6";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "6";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn7) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("7");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("7");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "7";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "7";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn8) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("8");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("8");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "8";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "8";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btn9) {
            if (tvFirstDigit.getVisibility() == View.GONE) {
                tvFirstDigit.setText("9");
                tvFirstDigit.setVisibility(View.VISIBLE);
            } else if ((tvOperation.getVisibility() == View.VISIBLE) && (tvFirstDigit.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                tvSecondDigit.setText("9");
                tvSecondDigit.setVisibility(View.VISIBLE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + "9";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (tvAnswer.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + "9";
                tvSecondDigit.setText(Ans);
            } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
        }

        if (v == btnPoint) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Ans = FirstDigit + ".";
                tvFirstDigit.setText(Ans);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.GONE)) {
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Ans = SecondDigit + ".";
                tvSecondDigit.setText(Ans);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = Answer + ".";
                tvFirstDigit.setText(Ans);
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnSum) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("+");
                tvOperation.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = tvAnswer.getText().toString().trim();
                Ans = Ans.replace("Answer : ","");
                tvFirstDigit.setText("");
                tvOperation.setText("");
                tvSecondDigit.setText("");
                tvAnswer.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
                tvFirstDigit.setText(Ans);
                tvFirstDigit.setVisibility(View.VISIBLE);
                tvOperation.setText("+");
                tvOperation.setVisibility(View.VISIBLE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnSubtraction) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("-");
                tvOperation.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = tvAnswer.getText().toString().trim();
                Ans = Ans.replace("Answer : ","");
                tvFirstDigit.setText("");
                tvOperation.setText("");
                tvSecondDigit.setText("");
                tvAnswer.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
                tvFirstDigit.setText(Ans);
                tvFirstDigit.setVisibility(View.VISIBLE);
                tvOperation.setText("-");
                tvOperation.setVisibility(View.VISIBLE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnMultiply) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("*");
                tvOperation.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = tvAnswer.getText().toString().trim();
                Ans = Ans.replace("Answer : ","");
                tvFirstDigit.setText("");
                tvOperation.setText("");
                tvSecondDigit.setText("");
                tvAnswer.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
                tvFirstDigit.setText(Ans);
                tvFirstDigit.setVisibility(View.VISIBLE);
                tvOperation.setText("*");
                tvOperation.setVisibility(View.VISIBLE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnDivide) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("/");
                tvOperation.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = tvAnswer.getText().toString().trim();
                Ans = Ans.replace("Answer : ","");
                tvFirstDigit.setText("");
                tvOperation.setText("");
                tvSecondDigit.setText("");
                tvAnswer.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
                tvFirstDigit.setText(Ans);
                tvFirstDigit.setVisibility(View.VISIBLE);
                tvOperation.setText("/");
                tvOperation.setVisibility(View.VISIBLE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnPercentage) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("%");
                tvOperation.setVisibility(View.VISIBLE);
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Answer = FirstDigit / 100;
                tvAnswer.setText("Answer : "+Answer);
                vHorizontalLine.setVisibility(View.VISIBLE);
                tvAnswer.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = tvAnswer.getText().toString().trim();
                Ans = Ans.replace("Answer : ","");
                tvFirstDigit.setText("");
                tvOperation.setText("");
                tvSecondDigit.setText("");
                tvAnswer.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
                tvFirstDigit.setText(Ans);
                tvFirstDigit.setVisibility(View.VISIBLE);
                tvOperation.setText("%");
                tvOperation.setVisibility(View.VISIBLE);
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                Answer = FirstDigit / 100;
                tvAnswer.setText("Answer : "+Answer);
                vHorizontalLine.setVisibility(View.VISIBLE);
                tvAnswer.setVisibility(View.VISIBLE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnEquals) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE)) {
                vHorizontalLine.setVisibility(View.VISIBLE);
                FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
                SecondDigit = Integer.parseInt(tvSecondDigit.getText().toString().trim());
                Operation = tvOperation.getText().toString().trim();
                if (Operation.equals("+")) {
                    Answer = FirstDigit + SecondDigit;
                    tvAnswer.setText("Answer : "+Answer);
                    tvAnswer.setVisibility(View.VISIBLE);
                }
                if (Operation.equals("-")) {
                    Answer = FirstDigit - SecondDigit;
                    tvAnswer.setText("Answer : "+Answer);
                    tvAnswer.setVisibility(View.VISIBLE);
                }
                if (Operation.equals("*")) {
                    Answer = FirstDigit * SecondDigit;
                    tvAnswer.setText("Answer : "+Answer);
                    tvAnswer.setVisibility(View.VISIBLE);
                }
                if (Operation.equals("/")) {
                    Answer = FirstDigit / SecondDigit;
                    tvAnswer.setText("Answer : "+Answer);
                    tvAnswer.setVisibility(View.VISIBLE);
                }
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnAC) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) || (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE)) {
                tvFirstDigit.setText("");
                tvFirstDigit.setVisibility(View.GONE);
                tvOperation.setText("");
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setText("");
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setText("");
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnDel) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvFirstDigit.setText("");
                tvFirstDigit.setVisibility(View.GONE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE)) {
                tvSecondDigit.setText("");
                tvSecondDigit.setVisibility(View.GONE);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                tvOperation.setText("");
                tvOperation.setVisibility(View.GONE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnMore) Toast.makeText(CalculatorActivity.this, "This button is under construction", Toast.LENGTH_LONG).show();
    }
}