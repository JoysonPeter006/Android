package com.example.framelayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.happybirthday);
        i2=(ImageView) findViewById(R.id.second);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.happybirthday){
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }
        else{
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }
    }
}