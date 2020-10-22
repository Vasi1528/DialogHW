package com.example.dialoghw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView firstTextView;
    private Button firstButton,dialogButton,dialogButton2,secondButton,cancelButton;
    private EditText firstEditView,secondText;
    private Dialog firstDialog;
    private String VAL1 = "Cheie";
    private LinearLayout secondDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setOnClickListeners();
        //Toast.makeText(this,"aaa",Toast.LENGTH_LONG);
    }

    private void setOnClickListeners(){

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                intent.putExtra(VAL1,"text ajustat");
                startActivity(intent);
            }
        });
        dialogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDialog();
            }
        });
        dialogButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
        secondButton.setVisibility(View.VISIBLE);
                secondText.setVisibility(View.VISIBLE);
                cancelButton.setVisibility(View.VISIBLE);
            }
        });
        secondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    intent.putExtra(VAL1, "text ajustat");
                startActivity(intent);

            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Activitate oprita",Toast.LENGTH_LONG);
                secondText.setText("asfds");
            }
        });
    }

    private void openDialog() {
        MainDialog mainDialog = new MainDialog();
        mainDialog.show(getSupportFragmentManager(),"main dialog");
    }

    private void initializeViews(){
        dialogButton2=findViewById(R.id.btn_dialbtn2);
        secondText=findViewById(R.id.secondtext);
        firstTextView=findViewById(R.id.mainvw);
        firstButton=findViewById(R.id.btn_mainbtn);
        firstEditView=findViewById(R.id.mained);
        dialogButton=findViewById(R.id.btn_dialbtn);
        //secondDialog=findViewById(R.id.secondlayout);
        secondButton=findViewById(R.id.secondbutton);
        cancelButton=findViewById(R.id.cancelbutton);
    }
}


