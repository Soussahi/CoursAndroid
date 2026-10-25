package com.example.coursandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnValider = findViewById(R.id.btnValider);
        TextView txtMode = findViewById(R.id.txtMode);

        btnValider.setOnClickListener(v -> {

            int id = radioGroup.getCheckedRadioButtonId();

            if (id == -1) {
                txtMode.setText("Veuillez choisir une option");
            } else {
                RadioButton choix = findViewById(id);

                txtMode.setText(
                        "Mode sélectionné : " + choix.getText()
                );
            }
        });
    }
}