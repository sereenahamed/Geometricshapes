package com.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LearningActivity extends AppCompatActivity {
    private Button bttn ;
    int count=0;
    private ImageView img1;
    private  ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private Button backbttn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        bttn = findViewById(R.id.nextbttn);
        img1 = findViewById(R.id.imageView1);
        img2= findViewById(R.id.imageView2);
        img3= findViewById(R.id.imageView3);
        img4= findViewById(R.id.imageView4);
        txt1=findViewById(R.id.textView1);
        txt2=findViewById(R.id.textView2);
        txt3=findViewById(R.id.textView3);
        txt4=findViewById(R.id.textView4);
        backbttn=findViewById(R.id.backbttn);
        backbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

       buttonNext ();

    }
    void newImg (int count){
        if (count==1){
            img1.setVisibility(View.VISIBLE);
            txt1.setVisibility(View.VISIBLE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt4.setVisibility(View.GONE);
            img3.setVisibility(View.GONE);
            img2.setVisibility(View.GONE);
            img4.setVisibility(View.GONE);
        }
        else if (count==2){
            img2.setVisibility(View.VISIBLE);
            img1.setVisibility(View.GONE);
            img3.setVisibility(View.GONE);
            img4.setVisibility(View.GONE);
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.VISIBLE);
            txt3.setVisibility(View.GONE);
            txt4.setVisibility(View.GONE);
        }
        else if (count==3){
            img3.setVisibility(View.VISIBLE);
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.GONE);
            img4.setVisibility(View.GONE);
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.VISIBLE);
            txt4.setVisibility(View.GONE);
        }
        else if (count==4){
            img4.setVisibility(View.VISIBLE);
            img3.setVisibility(View.GONE);
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.GONE);
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt4.setVisibility(View.VISIBLE);
           // buttonNext();

        }
    }
    private void buttonNext (){
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count<=4){
                    count++;
                    newImg (count);
                }
                else{
                    count=0;
                    newImg(count);
                }

            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}