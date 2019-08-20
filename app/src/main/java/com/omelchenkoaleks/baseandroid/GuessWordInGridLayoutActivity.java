package com.omelchenkoaleks.baseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class GuessWordInGridLayoutActivity extends Activity {
    private String realTranslate;
    private int currentIndex;
    private GridLayout mGridLayout;
    private TextView mText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_word);

        realTranslate = "EGG";
        mGridLayout = findViewById(R.id.grid_layout);
        mText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        CharSequence letter = ((Button) view).getText();
        String currentText = mText.getText().toString();

        if (currentIndex < realTranslate.length() && realTranslate.charAt(currentIndex) == letter.charAt(0)) {
            mText.setText(currentText + letter.toString());
            currentIndex++;
            mGridLayout.removeView(view);
        } else if (currentIndex == realTranslate.length() && !currentText.contains("You translated successful!!!")) {
            mText.setText(currentText + "\nYou translated successful!!!");
        }
    }
}
