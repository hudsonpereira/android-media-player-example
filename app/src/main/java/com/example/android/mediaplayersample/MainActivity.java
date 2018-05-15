package com.example.android.mediaplayersample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
    }

    public void onPlayClicked(View view) {
        mediaPlayer.start();
    }

    onPauseClicked(View view) {
        mediaPlayer.pause();
    }
}
