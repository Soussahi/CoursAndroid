
package com.example.coursandroid;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        Switch switchNotif =
                findViewById(R.id.switchNotif);

        TextView txtEtat =
                findViewById(R.id.txtEtat);

        switchNotif.setOnCheckedChangeListener(
                (buttonView, isChecked) -> {

                    if (isChecked) {
                        txtEtat.setText("Notifications activées");

                        Toast.makeText(this,
                                "Notifications ON",
                                Toast.LENGTH_SHORT).show();

                    } else {
                        txtEtat.setText("Notifications désactivées");

                        Toast.makeText(this,
                                "Notifications OFF",
                                Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
