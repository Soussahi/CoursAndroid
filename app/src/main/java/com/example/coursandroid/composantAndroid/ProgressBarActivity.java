
package com.example.coursandroid.composantAndroid;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursandroid.R;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView txtPourcentage;
    Button btnDemarrer;

    Handler handler = new Handler(Looper.getMainLooper());
    int progression = 0;

    Runnable tache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = findViewById(R.id.progressBar);
        txtPourcentage = findViewById(R.id.txtPourcentage);
        btnDemarrer = findViewById(R.id.btnDemarrer);

        tache = new Runnable() {
            @Override
            public void run() {

                progression += 10;

                progressBar.setProgress(progression);
                txtPourcentage.setText(progression + " %");

                if (progression < 100) {
                    handler.postDelayed(this, 500);
                } else {
                    btnDemarrer.setEnabled(true);

                    Toast.makeText(
                            ProgressBarActivity.this,
                            "Chargement terminé",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        };

        btnDemarrer.setOnClickListener(v -> {

            handler.removeCallbacks(tache);

            progression = 0;
            progressBar.setProgress(0);
            txtPourcentage.setText("0 %");

            btnDemarrer.setEnabled(false);

            handler.postDelayed(tache, 500);
        });
    }

    @Override
    protected void onDestroy() {
        handler.removeCallbacks(tache);
        super.onDestroy();
    }
}
