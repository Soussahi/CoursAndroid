package com.example.coursandroid.composantAndroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursandroid.R;

public class ImageViewActivity extends AppCompatActivity {

    boolean imageChangee = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView imgDemo = findViewById(R.id.imgDemo);
        Button btnChangerImage =
                findViewById(R.id.btnChangerImage);

        btnChangerImage.setOnClickListener(v -> {

            if (!imageChangee) {
                imgDemo.setImageResource(
                        android.R.drawable.ic_menu_gallery
                );
                imgDemo.setContentDescription(
                        "Icône de galerie"
                );
                imageChangee = true;
            } else {
                imgDemo.setImageResource(
                        android.R.drawable.ic_menu_camera
                );
                imgDemo.setContentDescription(
                        "Icône d'appareil photo"
                );
                imageChangee = false;
            }
        });
    }
}
