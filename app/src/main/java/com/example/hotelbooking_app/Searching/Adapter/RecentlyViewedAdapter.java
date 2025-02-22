package com.example.hotelbooking_app.Searching.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Domain.RecentlyViewedDomain;

import java.util.ArrayList;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.recentlyViewHolder> {
    ArrayList<RecentlyViewedDomain> data;

    public RecentlyViewedAdapter(ArrayList<RecentlyViewedDomain> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.recentlyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searching_rv_recently_viewed, parent, false);
        return new recentlyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.recentlyViewHolder holder, int position) {
        holder.tvName.setText(data.get(position).getName());
        holder.tvAddress.setText(data.get(position).getAddress());
        holder.tvRating.setText("" + data.get(position).getRating());
        holder.tvRatingCount.setText("(" + data.get(position).getRatingCount() + ")");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class recentlyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvAddress, tvRating, tvRatingCount;
        public recentlyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvHotelName);
            tvAddress = itemView.findViewById(R.id.tvHotelAddress);
            tvRating = itemView.findViewById(R.id.tvRaingPoint);
            tvRatingCount = itemView.findViewById(R.id.tvRatingCount);
        }
    }
}
