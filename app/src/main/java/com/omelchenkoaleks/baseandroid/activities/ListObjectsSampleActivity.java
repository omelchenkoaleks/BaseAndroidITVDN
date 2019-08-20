package com.omelchenkoaleks.baseandroid.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.omelchenkoaleks.baseandroid.R;
import com.omelchenkoaleks.baseandroid.adapters.ListObjectsSampleAdapter;
import com.omelchenkoaleks.baseandroid.pojo.Car;

import java.util.ArrayList;
import java.util.List;

public class ListObjectsSampleActivity extends Activity {
    private List<Car> mCars;
    private ListObjectsSampleAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);

        ListView listView = findViewById(R.id.list_view);
        mCars = getCars();
        mAdapter = new ListObjectsSampleAdapter(this, mCars);
        listView.setAdapter(mAdapter);
    }

    private List<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Acura", 340, 3.3));
        cars.add(new Car("Aston Martin", 400, 3.1));
        cars.add(new Car("Audi", 230, 3.4));
        cars.add(new Car("Buick", 400, 2.2));
        cars.add(new Car("BMW", 700, 6.6));
        cars.add(new Car("Alfa Romeo", 400, 3.8));

        return cars;
    }
}
