package com.omelchenkoaleks.baseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class WorkFrameLayoutActivity extends Activity {
    private ImageView aleksandrImageView;
    private ImageView flowerMyImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_frame_layout);

        aleksandrImageView = findViewById(R.id.aleksandr_image_view);
        flowerMyImageView = findViewById(R.id.flower_my_image_view);

        aleksandrImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flowerMyImageView.setVisibility(View.VISIBLE);
                aleksandrImageView.setVisibility(View.INVISIBLE);
            }
        });

        flowerMyImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aleksandrImageView.setVisibility(View.VISIBLE);
                flowerMyImageView.setVisibility(View.INVISIBLE);
            }
        });
    }
}
