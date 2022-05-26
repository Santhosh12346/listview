package com.example.listview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {
   public static String TAG = CountriesAdapter.class.getSimpleName();
   String[] mCountries;
   public CountriesAdapter(String[] countries){
       mCountries = countries;
   }

    public class CountriesViewHolder extends RecyclerView.ViewHolder {
       TextView tvRecyclerItem;
        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRecyclerItem = itemView.findViewById(R.id.tvRecyclerItem);
        }


    }
    @NonNull
    @Override
    public CountriesAdapter.CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //Log.i(TAG,"puneeth ")
        View rowPlank = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_recycler_item_1, parent, false);
       return new CountriesViewHolder(rowPlank);
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesAdapter.CountriesViewHolder holder, int position) {
       holder.tvRecyclerItem.setText(mCountries[position]);


    }

    @Override
    public int getItemCount() {
        return mCountries.length;
    }


}
