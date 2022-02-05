package com.example.imagebutton01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton ibt ;
    ImageView iv2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv2 = findViewById(R.id.iv2) ;
        ibt = findViewById(R.id.ibt) ;
    }

    public void go(View view) {

         int ran = (int)(101* Math.random()) %3+1;
         if (ran==1)
             iv2.setImageResource(R.drawable.img1);
         else if (ran==2)
             iv2.setImageResource(R.drawable.img2);
         else
             iv2.setImageResource(R.drawable.img3);


    }

}