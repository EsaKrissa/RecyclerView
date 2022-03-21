package com.example.tugas2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecyclerView adapterRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<itemModel> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i = 0; i < MyItem.judulPoster.length; i++) {
            data.add(new itemModel(
                    MyItem.judulPoster[i],
                    MyItem.tanggalLahir[i],
                    MyItem.poster[i]
            ));

        }
        adapterRecyclerView =  new AdapterRecyclerView(data);
        recyclerView.setAdapter(adapterRecyclerView);
    }
}