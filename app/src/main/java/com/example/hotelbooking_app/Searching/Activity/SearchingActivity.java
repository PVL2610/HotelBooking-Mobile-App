package com.example.hotelbooking_app.Searching.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Adapter.LastSearchAdapter;
import com.example.hotelbooking_app.Searching.Adapter.PopularSearchAdapter;
import com.example.hotelbooking_app.Searching.Adapter.RecentlyViewedAdapter;
import com.example.hotelbooking_app.Searching.Domain.LastSearchDomain;
import com.example.hotelbooking_app.Searching.Domain.PopularSearchDomain;
import com.example.hotelbooking_app.Searching.Domain.RecentlyViewedDomain;

import java.util.ArrayList;

public class SearchingActivity extends AppCompatActivity {

    ListView lvPopularSearch;
    RecyclerView rvLastSearch, rvRecentlyViewed;
    LastSearchAdapter lastSearchAdapter;
    RecentlyViewedAdapter recentlyViewedAdapter;

    PopularSearchAdapter popularSearchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching_layout);

        rvLastSearch = findViewById(R.id.rvLastSearch);
        initLastSearchRecyclerView();

        rvRecentlyViewed = findViewById(R.id.rvRecentlyViewed);
        initRecentlyViewedRecyclerView();

        lvPopularSearch = findViewById(R.id.lvPopularSearch);
        initPopularSearchListView();
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

    private void initRecentlyViewedRecyclerView() {

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

    private void initPopularSearchListView() {
//        String[] listPplHotelName = {"Muong Thanh Luxury", "Lavencos Hotel", "Lamore Hotel"};
//        int[] listPplSearchCount = {1200, 950, 384};
//        int[] listPplHotelImage = {R.drawable.searching_image_muongthanh, R.drawable.searching_image_muongthanh, R.drawable.searching_image_muongthanh};

        ArrayList<PopularSearchDomain> popularSearchData = new ArrayList<>();
//        for (int i = 0; i < listPplHotelName.length; i++) {
//            popularSearchData.add(new PopularSearchDomain(listPplHotelName[i], listPplSearchCount[i], listPplHotelImage[i]));
//        }

        popularSearchData.add(new PopularSearchDomain("Muong Thanh", 1244, R.drawable.searching_image_muongthanh));
        popularSearchData.add(new PopularSearchDomain("Muong Thanh", 1244, R.drawable.searching_image_muongthanh));
        popularSearchData.add(new PopularSearchDomain("Muong Thanh", 1244, R.drawable.searching_image_muongthanh));


        popularSearchAdapter = new PopularSearchAdapter(this, R.layout.searching_lv_popular_search, popularSearchData);
        lvPopularSearch.setAdapter(popularSearchAdapter);
    }
}