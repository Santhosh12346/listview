package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateLisatview();
    }

    private void populateLisatview() {
        ListView conteriesListView = findViewById(R.id.countries);
        String[] countries = new String[]{"india","eruop","iran","greenland","paksithan","englang"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,countries);
        conteriesListView.setAdapter(adapter);
    }
}