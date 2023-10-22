package com.example.hotelbooking_app.Searching.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Adapter.LastSearchAdapter;
import com.example.hotelbooking_app.Searching.Adapter.RecentlyViewedAdapter;
import com.example.hotelbooking_app.Searching.Domain.LastSearchDomain;
import com.example.hotelbooking_app.Searching.Domain.RecentlyViewedDomain;

import java.util.ArrayList;

public class SearchingActivity extends AppCompatActivity {
    RecyclerView rvLastSearch, rvRecentlyViewed;
    LastSearchAdapter lastSearchAdapter;
    RecentlyViewedAdapter recentlyViewedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching_layout);

        rvLastSearch = findViewById(R.id.rvLastSearch);
        initLastSearchRecyclerView();

        rvRecentlyViewed = findViewById(R.id.rvRecentlyViewed);
        initRecentlyViewedRecyclerView();
    }

    private void initLastSearchRecyclerView() {
        ArrayList<LastSearchDomain> lastSearchData;


        //Setting the last search data source
        lastSearchData = new ArrayList<>();
        lastSearchData.add(new LastSearchDomain("hotel"));
        lastSearchData.add(new LastSearchDomain("muong thanh"));
        lastSearchData.add(new LastSearchDomain("da nang"));
        lastSearchData.add(new LastSearchDomain("khach san 5 sao"));

        lastSearchAdapter = new LastSearchAdapter(lastSearchData);
        rvLastSearch.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvLastSearch.setAdapter(lastSearchAdapter);
    }

    public void initRecentlyViewedRecyclerView() {
        ArrayList<RecentlyViewedDomain> recentlyViewedData;

        //Setting the recently viewed data source
        recentlyViewedData = new ArrayList<>();
        recentlyViewedData.add(new RecentlyViewedDomain("Muong Thanh Hotel", "270 Võ Nguyên Giáp, Đà Nẵng", 4, 58));
        recentlyViewedData.add(new RecentlyViewedDomain("Hai An Hotel", "155 Võ Nguyên Giáp, Đà Nẵng", 5, 122));
        recentlyViewedData.add(new RecentlyViewedDomain("Dong Duong Hotel", "54 Nguyễn Tất Thành, Đà Nẵng", 4, 32));

        recentlyViewedAdapter = new RecentlyViewedAdapter(recentlyViewedData);
        rvRecentlyViewed.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvRecentlyViewed.setAdapter(recentlyViewedAdapter);
    }
}