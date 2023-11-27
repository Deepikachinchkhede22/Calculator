package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.calculator.R;

public class MainActivity extends Activity {
    private EditText editText;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btnTotal;
    private Button btnClear;
    private Button btnDot;

    private int Value1, Value2;
    private Boolean Add ,Sub ,Mul , Div;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        editText=(EditText)findViewById(R.id.editText);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnTotal=(Button)findViewById(R.id.btnTotal);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnDot=(Button)findViewById(R.id.btnDot) ;

        btn0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"0");}
                }
        );
        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"1");}
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"2");}
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"3");}
                }
        );
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"4");}
                }
        );
        btn5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"5");}
                }
        );
        btn6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"6");}
                }
        );
        btn7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"7");}
                }
        );
        btn8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"8");}
                }
        );
        btn9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+"9");}
                }
        );
        btnDot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {editText.setText(editText.getText()+".");}
                }
        );
        btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText== null){
                            editText.setText("");
                        }
                        else {
                            Value1=Integer.parseInt(editText.getText()+"");
                            Add=true;
                            editText.setText(null);
                        }
                    }
                }
        );
        btnSub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText== null){
                            editText.setText("");
                        }
                        else {
                            Value1=Integer.parseInt(editText.getText()+"");
                            Sub=true;
                            editText.setText(null);
                        }
                    }
                }
        );
        btnMul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText== null){
                            editText.setText("");
                        }
                        else {
                            Value1=Integer.parseInt(editText.getText()+"");
                            Mul=true;
                            editText.setText(null);
                        }
                    }
                }
        );
        btnDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText== null){
                            editText.setText("");
                        }
                        else {
                            Value1=Integer.parseInt(editText.getText()+"");
                            Div=true;
                            editText.setText(null);
                        }
                    }
                }
        );
        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2=Integer.parseInt(editText.getText()+"");
                if (Add==true){
                    editText.setText(Value1+Value2+"");
                    Add=false;
                }
                else if (Sub==true) {
                    editText.setText(Value1-Value2+"");
                    Sub=false;
                }
                else if (Mul==true) {
                    editText.setText(Value1*Value2+"");
                    Mul=false;
                }
                else if (Div==true) {
                    editText.setText(Value1/Value2+"");
                    Div =false ;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {editText.setText("");}
        });
    }
}
