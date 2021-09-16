package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcl = (RecyclerView) findViewById(R.id.rclView);
//        rcl.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rcl.setLayoutManager(new GridLayoutManager(this, 3));


        String arr[]={"C","C++","Java","PHP","Python","JavaScript","C","C++","Java","PHP","Python","JavaScript","C","C++","Java","PHP","Python","JavaScript","C","C++","Java","PHP","Python","JavaScript"};
        rcl.setAdapter(new myAdapter(arr));
    }
}