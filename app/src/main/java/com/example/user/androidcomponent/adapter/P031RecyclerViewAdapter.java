package com.example.user.androidcomponent.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.androidcomponent.R;

public class P031RecyclerViewAdapter extends RecyclerView.Adapter<P031RecyclerViewAdapter.MyRecyclerViewHolder> {

    Context context;
    String[] countries;
    String[] cities;
    public P031RecyclerViewAdapter(Context context,String[] countries,String[] cities) {
        this.context=context;
        this.countries=countries;
        this.cities=cities;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.p031_custom_row,viewGroup,false);
        MyRecyclerViewHolder myRecyclerViewHolder=new MyRecyclerViewHolder(view);
        return myRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder viewHolder, int i) {
        viewHolder.textViewLeftP031.setText(countries[i]);
        viewHolder.textViewRightP031.setText(cities[i]);
    }

    @Override
    public int getItemCount() {
        return countries.length;
    }

    public class MyRecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView textViewLeftP031;
        TextView textViewRightP031;
        public MyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewLeftP031= itemView.findViewById(R.id.textViewLeftP031);
            textViewRightP031= itemView.findViewById(R.id.textViewRightP031);
        }
    }
}
