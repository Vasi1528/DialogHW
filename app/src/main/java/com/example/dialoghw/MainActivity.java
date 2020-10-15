package com.example.dialoghw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView firstTextView;
    private Button firstButton,dialogButton;
    private EditText firstEditView;
    private Dialog firstDialog;
    private String VAL1 = "Cheie";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setOnClickListeners();

    }

    private void setOnClickListeners(){

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
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
    }

    private void openDialog() {
        MainDialog mainDialog = new MainDialog();
        mainDialog.show(getSupportFragmentManager(),"main dialog");
    }

    private void initializeViews(){
        firstTextView=findViewById(R.id.mainvw);
        firstButton=findViewById(R.id.btn_mainbtn);
        firstEditView=findViewById(R.id.mained);
        dialogButton=findViewById(R.id.btn_dialbtn);

    }
}


