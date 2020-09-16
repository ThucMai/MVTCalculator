package com.example.mvtcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button del;
    private Button pi;
    private Button ans;
    private Button ac;
    private TextView info;
    private TextView result;
    private Button reset;
    private Button point;
    private final char ADDITION ='+';
    private final char SUBTRACTION ='-';
    private final char MULTIPLICATION ='*';
    private final char DIVISION ='/';
    private final char EQU =0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private String ansval;
    private Button btninfor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString()+ "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

         two.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() +"2");
             }
         });

         three.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() +"3");
             }
         });

         four.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() +"4");
             }
         });

         five.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() +"5");
             }
         });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +"9");
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3.14159265359");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + ".");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) +"-");
                info.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1) +"*");
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1)+ "/");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQU;
                result.setText(result.getText().toString()+ String.valueOf(val2) + "=" + String.valueOf(val1));
                ansval = String.valueOf(val1);
                info.setText(null);
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                CharSequence name = info.getText().toString();
                info.setText(name.subSequence(0, name.length()-1));
                }
//                else{
//                    val1 = Double.NaN;
//                    val2 = Double.NaN;
//                    info.setText(null);
//                    result.setText(null);
//                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText(null);
                result.setText(null);
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ansval.length() > 0) {
                    info.setText(ansval);
                }
            }
        });

        btninfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MoreActivity.class);
                startActivity(intent);
            }
        });

    }



    private void  setupUIView(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnMult);
        div = (Button)findViewById(R.id.btnDiv);
        equal = (Button)findViewById(R.id.btnRes);
        info = (TextView)findViewById(R.id.txtInfor);
        result = (TextView)findViewById(R.id.txtRes);
        del = (Button)findViewById(R.id.btnDel);
        ans = (Button)findViewById(R.id.btnANS);
        ac = (Button)findViewById(R.id.btnAC);
        point = (Button)findViewById(R.id.btnPoint);
        pi = (Button)findViewById(R.id.btnPI);
        reset =(Button)findViewById(R.id.btnRes);
        btninfor =(Button)findViewById(R.id.btninfor);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch(ACTION){
                case ADDITION:
                val1 = val1 + val2;
                break;
                case SUBTRACTION:
                val1 = val1 - val2;
                break;
                case MULTIPLICATION:
                val1 = val1 * val2;
                break;
                case  DIVISION:
                val1 = val1 / val2;
                break;
                case  EQU:
                break;
            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }


}
