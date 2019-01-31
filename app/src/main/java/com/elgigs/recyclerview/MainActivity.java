package com.elgigs.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView peopleList = findViewById(R.id.people_list);
        peopleList.setLayoutManager(new GridLayoutManager(this, 3));
        String[] names = {"Sahil", "Suprem", "Bir", "Chirag", "Vikram", "Kunal", "Ranjan", "Guddu", "Prashanto", "saurav"};
        peopleList.setAdapter(new PeopleAdapter(names));
    }
}
