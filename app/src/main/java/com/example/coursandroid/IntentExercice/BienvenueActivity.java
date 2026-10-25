
package com.example.coursandroid.IntentExercice;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursandroid.R;

public class BienvenueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenue);

        TextView txtBienvenue = findViewById(R.id.txtBienvenue);
        TextView txtNom = findViewById(R.id.txtNom);
        TextView txtPrenom = findViewById(R.id.txtPrenom);

        // Récupérer les données transmises
        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");

        // Afficher les données
        txtBienvenue.setText(
                "Bienvenue " + prenom + " " + nom + " !"
        );

        txtNom.setText("Nom : " + nom);
        txtPrenom.setText("Prénom : " + prenom);
    }
}
