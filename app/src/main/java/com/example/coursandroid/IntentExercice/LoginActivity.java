package com.example.coursandroid.IntentExercice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursandroid.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtNom = findViewById(R.id.edtNom);
        EditText edtPrenom = findViewById(R.id.edtPrenom);
        EditText edtMotDePasse = findViewById(R.id.edtMotDePasse);
        Button btnConnexion = findViewById(R.id.btnConnexion);

        btnConnexion.setOnClickListener(v -> {

            String nom = edtNom.getText().toString().trim();
            String prenom = edtPrenom.getText().toString().trim();
            String mdp = edtMotDePasse.getText().toString();

            if (nom.isEmpty() || prenom.isEmpty()) {
                Toast.makeText(this,
                        "Veuillez saisir votre nom et prénom",
                        Toast.LENGTH_SHORT).show();

            } else if (mdp.length() < 5) {
                Toast.makeText(this,
                        "Le mot de passe doit contenir au moins 5 caractères",
                        Toast.LENGTH_SHORT).show();

            } else {
                Intent intent = new Intent(
                        LoginActivity.this,
                        BienvenueActivity.class
                );

                intent.putExtra("nom", nom);
                intent.putExtra("prenom", prenom);

                startActivity(intent);
            }
        });
    }
}
