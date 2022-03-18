package com.henrique.ediimusic.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.henrique.ediimusic.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout searchBtn = findViewById(R.id.searchBtn);
        final LinearLayout menuBtn = findViewById(R.id.menuBtn);
        final RecyclerView musicRecyclerView = findViewById(R.id.musicRecycler);
        final CardView playPauseCard = findViewById(R.id.playPauseCard);
        final ImageView nextBtn = findViewById(R.id.nextBtn);
        final ImageView prevBtn = findViewById(R.id.previusBtn);

        musicRecyclerView.setHasFixedSize(true);
        musicRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}