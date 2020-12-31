package com.example.calorieslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect the RecyclerView to the activity
        RecyclerView foodCal = findViewById(R.id.rv);

        ArrayList<Food> foods = new ArrayList<>();
        // Items of the array list
        Food e = new Food("Egg",50,72,R.drawable.egg);
        Food r = new Food("White rice",100,165,R.drawable.rice);
        Food b = new Food("Beef bacon",100,272.2,R.drawable.bacon);
        Food c = new Food("Emmental cheese",25,107,R.drawable.cheese);
        Food bc = new Food("Butter croissant",67,272,R.drawable.croissant);
        Food wb = new Food("Whole wheat bread",32,82,R.drawable.bread);
        foods.add(e);  //0
        foods.add(r);  //1
        foods.add(b);  //2
        foods.add(c);  //3
        foods.add(bc); //4
        foods.add(wb); //5

//        align rv with linear layout
        foodCal.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        foodCal.setLayoutManager(lm);

        // add the adapter
        FoodAdapter fa = new FoodAdapter(foods,MainActivity.this);
        foodCal.setAdapter(fa);

    }
}