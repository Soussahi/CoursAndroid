package com.example.coursandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditTextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        EditText edtNom = findViewById(R.id.edtNom);
        Button btnAfficher = findViewById(R.id.btnAfficher);
        TextView txtResultat = findViewById(R.id.txtResultat);

        btnAfficher.setOnClickListener(v -> {
            String nom = edtNom.getText().toString();
            txtResultat.setText("Bonjour " + nom);
        });
    }
}