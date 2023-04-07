package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("abc1","abc1.com"));
        items.add(new Item("abc2","abc2.com"));
        items.add(new Item("abc3","abc3.com"));
        items.add(new Item("abc4","abc4.com"));
        items.add(new Item("abc1","abc1.com"));
        items.add(new Item("abc2","abc2.com"));
        items.add(new Item("abc3","abc3.com"));
        items.add(new Item("abc4","abc4.com"));
        items.add(new Item("abc1","abc1.com"));
        items.add(new Item("abc2","abc2.com"));
        items.add(new Item("abc3","abc3.com"));
        items.add(new Item("abc4","abc4.com"));
        items.add(new Item("abc1","abc1.com"));
        items.add(new Item("abc2","abc2.com"));
        items.add(new Item("abc3","abc3.com"));
        items.add(new Item("abc4","abc4.com"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}