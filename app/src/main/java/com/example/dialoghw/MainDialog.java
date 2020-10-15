package com.example.dialoghw;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class MainDialog extends AppCompatDialogFragment {
    private String EptText ="Trebuie introdus un text!!!";
    private String CnclText ="S-a dat cancel pe dialog";
    private String ValTransferata = "Cheie";
    private EditText input;
    private int eflag = 0;
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Introduceti un text:")

                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(input.getText().toString().equals(null) ||  input.getText().toString().equals("")){
                                    Toast.makeText(getActivity(),EptText,Toast.LENGTH_LONG).show();
                                    eflag = 1;
                                }
                                else
                                {
                                    Intent intent = new Intent(getActivity(),MainActivity2.class);
                                    intent.putExtra(Values.ExternValue1,input.getText().toString());
                                    startActivity(intent);


                                }
                            }
                        }
                )
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getActivity(),CnclText,Toast.LENGTH_LONG).show();
                            }
                        }

                        );

    input = new EditText(getActivity());
    builder.setView(input);
        return builder.create();
    }
}
