package com.example.coursandroid.composantAndroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEditText = findViewById(R.id.btnEditText);
        Button btnCheckBox = findViewById(R.id.btnCheckBox);
        Button btnRadioButton = findViewById(R.id.btnRadioButton);
        Button btnImageView = findViewById(R.id.btnImageView);
        Button btnSwitch = findViewById(R.id.btnSwitch);
        Button btnSpinner = findViewById(R.id.btnSpinner);
        Button btnProgressBar = findViewById(R.id.btnProgressBar);

        btnEditText.setOnClickListener(v ->
                startActivity(new Intent(this, EditTextActivity.class)));

        btnCheckBox.setOnClickListener(v ->
                startActivity(new Intent(this, CheckBoxActivity.class)));

        btnRadioButton.setOnClickListener(v ->
                startActivity(new Intent(this, RadioButtonActivity.class)));

        btnImageView.setOnClickListener(v ->
                startActivity(new Intent(this, ImageViewActivity.class)));

        btnSwitch.setOnClickListener(v ->
                startActivity(new Intent(this, SwitchActivity.class)));

        btnSpinner.setOnClickListener(v ->
                startActivity(new Intent(this, SpinnerActivity.class)));

        btnProgressBar.setOnClickListener(v ->
                startActivity(new Intent(this, ProgressBarActivity.class)));
    }
}