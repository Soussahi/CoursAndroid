package com.example.coursandroid;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;


public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox chkJava = findViewById(R.id.chkJava);
        CheckBox chkPython = findViewById(R.id.chkPython);
        CheckBox chkC = findViewById(R.id.chkC);
        Button btnChoix = findViewById(R.id.btnChoix);
        TextView txtChoix = findViewById(R.id.txtChoix);

        btnChoix.setOnClickListener(v -> {

            String resultat = "";

            if (chkJava.isChecked()) {
                resultat += chkJava.getText().toString()+"\n";
            }

            if (chkPython.isChecked()) {
                resultat += chkPython.getText().toString()+"\n";
            }

            if (chkC.isChecked()) {
                resultat += chkC.getText().toString()+"\n";
            }

            if (resultat.isEmpty()) {
                txtChoix.setText("Aucun langage sélectionné");
            } else {
                txtChoix.setText("Vos choix :\n" + resultat);
            }
        });
    }
}