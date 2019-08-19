package com.omelchenkoaleks.baseandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangeImageActivity extends AppCompatActivity {
    private TextView description;
    private ImageView image;
    private ImageView virtualImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);

        description = findViewById(R.id.textView);
        image = findViewById(R.id.ao_image_view);
        virtualImage = findViewById(R.id.flower_image_view);
    }

    public void imageClick(View view) {
        description.setText(getResources().getString(R.string.empty_text));

        /*
            обарати внимание все наоборот - обмен происходит )))
         */
        Drawable drawable = virtualImage.getDrawable();
        Drawable oldDrawable = image.getDrawable();
        String tag = (String) virtualImage.getTag();
        String oldTag = (String) image.getTag();
        virtualImage.setTag(oldTag);
        virtualImage.setImageDrawable(oldDrawable);
        image.setTag(tag);
        image.setImageDrawable(drawable);
    }

    public void descriptionOnClick(View view) {
        String text = (String) image.getTag();
        description.setText(text);
    }
}
