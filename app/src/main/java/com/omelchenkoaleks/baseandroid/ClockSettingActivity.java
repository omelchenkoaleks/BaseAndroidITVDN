package com.omelchenkoaleks.baseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ClockSettingActivity extends Activity {
    private TextView hoursTextView;
    private TextView minutesTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_setting);

        hoursTextView = findViewById(R.id.hour_text_view);
        minutesTextView = findViewById(R.id.min_text_view);
    }

    public void clockSettingOnClick(View view) {
        String hourText = hoursTextView.getText().toString();
        String minText = minutesTextView.getText().toString();
        int hour = Integer.parseInt(hourText);
        int min = Integer.parseInt(minText);

        switch (view.getId()) {
            case R.id.hour_up_button:
                hour = resultPlus(hour, true);
                hoursTextView.setText(String.valueOf(hour));
                break;
            case R.id.hour_down_button:
                hour = resultMinus(hour, true);
                hoursTextView.setText(String.valueOf(hour));
                break;
            case R.id.min_up_button:
                min = resultPlus(min, false);
                minutesTextView.setText(String.valueOf(min));
                break;
            case R.id.min_down_button:
                min = resultMinus(min, false);
                minutesTextView.setText(String.valueOf(min));
                break;
        }
    }

    private int resultPlus(int value, boolean isHour) {
        int maxValue = (isHour) ? 23 : 59;

        value++;

        if (value > maxValue) {
            value = 0;
        }

        return value;
    }

    private int resultMinus(int value, boolean isHour) {
        int maxValue = (isHour) ? 23 : 59;

        value--;

        if (value < 0) {
            value = maxValue;
        }

        return value;
    }
}
