package com.example.listview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
      String[] countries = new String[]{"india","USA","england","UK","russia","japan","india","USA","england","UK","russia","japan","india","USA","england","UK","russia","japan"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
    }
    @Override
    protected void onStart() {
        super.onStart();
        RecyclerView  Cview = findViewById(R.id.recyclerView);
        CountriesAdapter adapter = new CountriesAdapter(countries);
        Cview.setLayoutManager(new LinearLayoutManager(this));
        Cview.setAdapter(adapter);
    }
}
