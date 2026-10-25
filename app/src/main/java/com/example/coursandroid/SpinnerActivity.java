
package com.example.coursandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spinnerVilles =
                findViewById(R.id.spinnerVilles);

        Button btnVille = findViewById(R.id.btnVille);
        TextView txtVille = findViewById(R.id.txtVille);

        String[] villes = {
                "Marrakech",
                "Casablanca",
                "Rabat",
                "Fès",
                "Agadir"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        villes
                );

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerVilles.setAdapter(adapter);

        btnVille.setOnClickListener(v -> {

            String ville =
                    spinnerVilles.getSelectedItem().toString();

            txtVille.setText(
                    "Ville sélectionnée : " + ville
            );
        });
    }
}
