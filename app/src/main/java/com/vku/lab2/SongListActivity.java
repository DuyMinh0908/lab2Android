package com.vku.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.vku.lab2.Adapter.SongAdapter;
import com.vku.lab2.Model.Singer;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {
    RecyclerView rcrSong;
    ArrayList<Singer> singers;
    SongAdapter songAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        rcrSong = (RecyclerView) findViewById(R.id.rcrSong);
        singers = new ArrayList<Singer>();
        Bundle extras = this.getIntent().getExtras();
        String name = extras.getString("NAME");
        String singer  = extras.getString("SINGER");

        singers.add(
                new Singer("https://sohanews.sohacdn.com/2019/12/26/m1-1577340365639936667977.jpg",
                            "Bài này Chill phết","MIN"));
        singers.add( new Singer("https://i1-ione.vnecdn.net/2019/06/28/capture-png-1561696294-3813-1561696778.png?w=1020&h=0&q=100&dpr=1&fit=crop&s=2wRlrU8IxfGjIWiMibewOg",
                "2 Triệu năm","Đen vâu"));
        singers.add(new Singer("https://sohanews.sohacdn.com/2019/12/26/m1-1577340365639936667977.jpg",name,singer));
        songAdapter = new SongAdapter(this, singers);
        rcrSong.setAdapter(songAdapter);
        rcrSong.setLayoutManager(new LinearLayoutManager(this));

    }
}