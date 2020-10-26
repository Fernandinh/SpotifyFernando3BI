package com.example.spotify_fernando3bi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer toca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.img_musica);
        Glide.with(this).load("https://img.youtube.com/vi/bqsiJPK-94Q/0.jpg").into(imageView);

        toca = MediaPlayer.create(getApplicationContext(), R.raw.bishop);
    }

    protected void onResume(){
        super.onResume();
    }

    public void play(View view){
        toca.start();
    }
}
