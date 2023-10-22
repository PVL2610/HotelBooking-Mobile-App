package com.example.hotelbooking_app.Searching.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelbooking_app.MainActivity;
import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Activity.SearchingActivity;

import java.util.ArrayList;

public class LastSearchAdapter extends RecyclerView.Adapter<LastSearchAdapter.MyHolder> {
    ArrayList<String> data;
    public LastSearchAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searching_rv_last_search, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
