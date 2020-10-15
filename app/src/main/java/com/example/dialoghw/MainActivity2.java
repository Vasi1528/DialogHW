package com.example.dialoghw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String ExtrString;
    private TextView firstTextView;
    private Button firstButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeViews();
        setOnClickListeners();
    }


    private void setOnClickListeners(){

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int2 = getIntent();
                ExtrString = int2.getStringExtra(Values.ExternValue1);
                firstTextView.setText("Raspuns:" + ExtrString);
            }
        });
    }
    private void initializeViews() {
        firstTextView=findViewById(R.id.mainvw);
        firstButton=findViewById(R.id.btn_mainbtn);
    }
}