package com.omelchenkoaleks.baseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListViewSimpleActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);


        // 3 пример - получаем данные из ресурсов (string-array)
        ListView listView = findViewById(R.id.list_view);
        String[] items = getResources().getStringArray(R.array.items);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);

        // 2 пример - получаем список в отдельном методе
//        ListView listView = findViewById(R.id.list_view);
//        List<String> items = getItems();
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        listView.setAdapter(arrayAdapter);

        // 1 пример
//        ListView listView = findViewById(R.id.list_view);
//        String[] list = {"doctor", "dog", "method", "milk", "car", "work"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(adapter);
    }

//    private List<String> getItems() {
//        List<String> items = new ArrayList<>();
//
//        items.add("doctor");
//        items.add("dog");
//        items.add("method");
//        items.add("big");
//        items.add("small");
//
//        return items;
//    }
}
