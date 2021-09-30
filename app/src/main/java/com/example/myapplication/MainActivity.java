package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{

    private enum Operator {none, minus, add, multiply, divide};

    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;
    private Button btn00, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnEquals, btnMinuns, btnPlus, btnDivide, btnDot;
    private EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = findViewById(R.id.btn00);
        btn1 = findViewById(R.id.btn01);
        btn2 = findViewById(R.id.btn02);
        btn3 = findViewById(R.id.btn03);
        btn4 = findViewById(R.id.btn04);
        btn5 = findViewById(R.id.btn05);
        btn6 = findViewById(R.id.btn06);
        btn7 = findViewById(R.id.btn07);
        btn8 = findViewById(R.id.btn08);
        btn9 = findViewById(R.id.btn09);
        btnEquals = findViewById(R.id.btnResult);
        btnMinuns = findViewById(R.id.btnMinus);
        eText = findViewById(R.id.resultEdit);
        btnPlus = findViewById(R.id.btnPlus);
        btnClear = findViewById(R.id.btnClear);
        btnDivide = findViewById(R.id.btnDivide);
        btnDot = findViewById(R.id.btnDot);
    }

    public void btn00OnClick(View view){
        eText.setText((eText.getText() + "0"));
    }
    public void btn1OnClick(View view){
        eText.setText((eText.getText() +"1"));
    }
    public void btn2OnClick(View view){
        eText.setText((eText.getText() +"2"));
    }
    public void btn3OnClick(View view){
        eText.setText((eText.getText() +"3"));
    }
    public void btn4OnClick(View view){
        eText.setText((eText.getText() +"4"));
    }
    public void btn5OnClick(View view){
        eText.setText((eText.getText() +"5"));
    }
    public void btn6OnClick(View view){
        eText.setText((eText.getText() +"6"));
    }
    public void btn7OnClick(View view){
        eText.setText((eText.getText() +"7"));
    }
    public void btn8OnClick(View view){
        eText.setText((eText.getText() +"8"));
    }
    public void btn9OnClick(View view){
        eText.setText((eText.getText() +"9"));
    }

    public void btnDotOnClick(View view){
        eText.setText((eText.getText() +"."));
    }

    public void btnPlusOnClick(View view){
        optr = Operator.add;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideOnClick(View view){
        optr = Operator.divide;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusOnClick(View view){
        optr = Operator.minus;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyOnClick(View view){
        optr = Operator.multiply;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearOnClick(View view){
        eText.setText("");
    }

    public void btnResultOnClick(View view){
        if (optr != Operator.none){
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add){
                result = data1 + data2;
            }
            else if (optr == Operator.minus){
                result = data1 - data2;
            }
            else if (optr == Operator.multiply){
                result = data1 * data2;
            }
            else if (optr == Operator.divide){
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = result;
            if ((result - (int)result)!=0){
                eText.setText(String.valueOf(result));
            }
            else{
                eText.setText(String.valueOf((int)result));
            }

        }
    }


}