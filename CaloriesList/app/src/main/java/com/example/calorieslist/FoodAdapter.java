package com.example.calorieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter {
// add array list and context
    ArrayList<Food> fArray;
    Context fContext;
// add constructor
    public FoodAdapter(ArrayList<Food> fArray, Context fContext) {
        this.fArray = fArray;
        this.fContext = fContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // fix this func. to connect the adapter to the item's design xml
        // imitation of main.java line 17
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        // notify view holder of variable v origins
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // putting data in their corresponding places
        ((ViewHolder) holder).calories.setText(fArray.get(position).getCalories()+"");
        ((ViewHolder) holder).name.setText(fArray.get(position).getName());
        ((ViewHolder) holder).serving.setText(fArray.get(position).getServing()+"");
        ((ViewHolder) holder).img.setImageResource(fArray.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return fArray.size();
    }
// create view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // add components and view
        public ImageView img;
        public TextView name;
        public TextView serving;
        public TextView calories;
        public View view;
// create constructor to eliminate error
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // to connect the adapter class to the project's resources file
            view = itemView; // introduce the components' parent
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            serving = itemView.findViewById(R.id.textView6);
            calories = itemView.findViewById(R.id.textView4);

        }
    }


}
