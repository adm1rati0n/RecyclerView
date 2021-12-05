package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }
    private void setData(){
        movies.add(new Model(R.drawable.cars, "Тачки"));
        movies.add(new Model(R.drawable.shrek2,"Шрек 2"));
        movies.add(new Model(R.drawable.shrek2,"Шрек 2"));
        movies.add(new Model(R.drawable.shrek2,"Шрек 2"));
        movies.add(new Model(R.drawable.shrek2,"Шрек 2"));
        movies.add(new Model(R.drawable.cars, "Тачки"));
        movies.add(new Model(R.drawable.cars, "Тачки"));
        movies.add(new Model(R.drawable.cars, "Тачки"));
        movies.add(new Model(R.drawable.shrek2,"Шрек 2"));


    }
}