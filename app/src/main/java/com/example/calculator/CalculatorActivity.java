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
    Integer FirstDigit, SecondDigit, Answer, Digit;
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

        if (v == btn0) digitButton("0");

        if (v == btn1) digitButton("1");

        if (v == btn2) digitButton("2");

        if (v == btn3) digitButton("3");

        if (v == btn4) digitButton("4");

        if (v == btn5) digitButton("5");

        if (v == btn6) digitButton("6");

        if (v == btn7) digitButton("7");

        if (v == btn8) digitButton("8");

        if (v == btn9) digitButton("9");

        if (v == btnPoint) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                appendDigit(tvFirstDigit, ".");
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.GONE) && (tvAnswer.getVisibility() == View.GONE)) {
                appendDigit(tvSecondDigit, ".");
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                Ans = Answer + ".";
                tvFirstDigit.setText(Ans);
                tvOperation.setVisibility(View.GONE);
                tvSecondDigit.setVisibility(View.GONE);
                tvAnswer.setVisibility(View.GONE);
                vHorizontalLine.setVisibility(View.GONE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnSum) operationButton("+");

        if (v == btnSubtraction) operationButton("-");

        if (v == btnMultiply) operationButton("*");

        if (v == btnDivide) operationButton("/");

        if (v == btnPercentage) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                addAll(tvOperation, "%");
                operationPercentage();
                tvAnswer.setVisibility(View.VISIBLE);
            } else if (tvAnswer.getVisibility() == View.VISIBLE) {
                operationEquals("%");
                operationPercentage();
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
                    showAnswer();
                }
                if (Operation.equals("-")) {
                    Answer = FirstDigit - SecondDigit;
                    showAnswer();
                }
                if (Operation.equals("*")) {
                    Answer = FirstDigit * SecondDigit;
                    showAnswer();
                }
                if (Operation.equals("/")) {
                    Answer = FirstDigit / SecondDigit;
                    showAnswer();
                }
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnAC) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) || (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE)) {
                removeALL(tvFirstDigit);
                removeALL(tvSecondDigit);
                removeALL(tvOperation);
                removeALL(tvAnswer);
                vHorizontalLine.setVisibility(View.GONE);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnDel) {
            if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                changeDigit(tvFirstDigit);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE)) {
                changeDigit(tvSecondDigit);
            } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
                removeALL(tvOperation);
            } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
        }

        if (v == btnMore) Toast.makeText(CalculatorActivity.this, "This button is under construction", Toast.LENGTH_LONG).show();
    }

    public void changeDigit(TextView textView) {
        String str = textView.getText().toString().trim();
        str = str.substring(0, (str.length() - 1));
        textView.setText("");
        textView.setVisibility(View.GONE);
        textView.setText(str);
        textView.setVisibility(View.VISIBLE);
    }

    public void removeALL(TextView textView) {
        textView.setText("");
        textView.setVisibility(View.GONE);
    }

    public void addAll(TextView textView, String s) {
        textView.setText(s);
        textView.setVisibility(View.VISIBLE);
    }

    public void appendDigit(TextView textView, String s) {
        Digit = Integer.parseInt(textView.getText().toString().trim());
        Ans = Digit + s;
        textView.setText(Ans);
    }

    public void digitButton(String s) {
        if (tvFirstDigit.getVisibility() == View.GONE) {
            addAll(tvFirstDigit, s);
        } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE) && (vHorizontalLine.getVisibility() == View.GONE) && (tvAnswer.getVisibility() == View.GONE)) {
            addAll(tvSecondDigit, s);
        } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.GONE) && (tvSecondDigit.getVisibility() == View.GONE)) {
            appendDigit(tvFirstDigit, s);
        } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (vHorizontalLine.getVisibility() == View.GONE) && (tvAnswer.getVisibility() == View.GONE)) {
            appendDigit(tvSecondDigit, s);
        } else Toast.makeText(CalculatorActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
    }

    public void operationButton(String s) {
        if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.GONE)) {
            addAll(tvOperation, s);
        } else if (tvAnswer.getVisibility() == View.VISIBLE) {
            operationEquals(s);
        } else if ((tvFirstDigit.getVisibility() == View.VISIBLE) && (tvSecondDigit.getVisibility() == View.VISIBLE) && (tvOperation.getVisibility() == View.VISIBLE)) {

        } else Toast.makeText(CalculatorActivity.this, "Please enter value first", Toast.LENGTH_LONG).show();
    }

    public void operationEquals(String s) {
        Ans = tvAnswer.getText().toString().trim();
        Ans = Ans.replace("Answer : ","");
        removeALL(tvFirstDigit);
        removeALL(tvOperation);
        removeALL(tvSecondDigit);
        removeALL(tvAnswer);
        vHorizontalLine.setVisibility(View.GONE);
        addAll(tvFirstDigit, Ans);
        addAll(tvOperation, s);
    }

    public void operationPercentage() {
        FirstDigit = Integer.parseInt(tvFirstDigit.getText().toString().trim());
        Answer = FirstDigit / 100;
        tvAnswer.setText("Answer : " + Answer);
        vHorizontalLine.setVisibility(View.VISIBLE);
        tvAnswer.setVisibility(View.VISIBLE);
    }

    public void showAnswer() {
        tvAnswer.setText("Answer : " + Answer);
        tvAnswer.setVisibility(View.VISIBLE);
    }
}