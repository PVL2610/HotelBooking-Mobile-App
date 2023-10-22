package com.example.hotelbooking_app.Searching.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Adapter.LastSearchAdapter;

import java.util.ArrayList;

public class SearchingActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<String> dataSource;
    LinearLayoutManager linearLayoutManager;
    LastSearchAdapter lastSearchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching_layout);

        rv = findViewById(R.id.rvLastSearch);

        //Setting the data source
        dataSource = new ArrayList<>();
        dataSource.add("Hotel");
        dataSource.add("Khách sạn");
        dataSource.add("Đà Nẵng");
        dataSource.add("Mường Thanh");

        linearLayoutManager = new LinearLayoutManager(SearchingActivity.this, RecyclerView.HORIZONTAL, false);
        lastSearchAdapter = new LastSearchAdapter(dataSource);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(lastSearchAdapter);
    }
}