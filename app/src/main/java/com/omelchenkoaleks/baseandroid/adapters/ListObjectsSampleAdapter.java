package com.omelchenkoaleks.baseandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.omelchenkoaleks.baseandroid.R;
import com.omelchenkoaleks.baseandroid.pojo.Car;

import java.util.List;

public class ListObjectsSampleAdapter extends BaseAdapter {
    private List<Car> mCars;
    private LayoutInflater mLayoutInflater;

    public ListObjectsSampleAdapter(Context context, List<Car> cars) {
        mCars = cars;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mCars.size();
    }

    @Override
    public Object getItem(int position) {
        return mCars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.car_item, parent, false);
        }

        Car car = (Car) getItem(position);

        TextView carModel = view.findViewById(R.id.model_text_view);
        TextView carSpeed = view.findViewById(R.id.speed_text_view);
        TextView carEngine = view.findViewById(R.id.engine_text_view);

        carModel.setText("Model: " + car.getModel());
        carSpeed.setText("Speed: " + car.getSpeed());
        carEngine.setText("Engine: " + car.isEngine());

        return view;
    }
}
