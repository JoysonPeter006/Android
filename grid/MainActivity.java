package com.example.lab8gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button add,sub,mul,div,eq,cl;
    TextView tv;
    int k1=0;
    Float r1,gh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.bt0);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.bt4);
        b5=(Button) findViewById(R.id.bt5);
        b6=(Button) findViewById(R.id.bt6);
        b7=(Button) findViewById(R.id.bt7);
        b8=(Button) findViewById(R.id.bt8);
        b9=(Button) findViewById(R.id.bt9);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        cl=(Button) findViewById(R.id.btc);
        tv=(TextView) findViewById(R.id.result);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"7");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1=Float.parseFloat(tv.getText().toString());
                k1=1;
                tv.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1=Float.parseFloat(tv.getText().toString());
                k1=2;
                tv.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1=Float.parseFloat(tv.getText().toString());
                k1=3;
                tv.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1=Float.parseFloat(tv.getText().toString());
                k1=4;
                tv.setText("");
            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                r1=0f;
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k1==1){
                    gh=r1+Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(gh));
                }
                if(k1==2){
                    gh=r1-Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(gh));
                }
                if(k1==3){
                    gh=r1*Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(gh));
                }
                if(k1==4){
                    gh=r1/Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(gh));
                }
            }
        });
    }
    public void gg(View view){
        finish();
    }
}
