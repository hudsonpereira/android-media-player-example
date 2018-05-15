package com.example.android.mediaplayersample;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.superboy);
    }

    public void onPlayClicked(View view) {
        mediaPlayer.start();
    }

    public void onPauseClicked(View view) {
        mediaPlayer.pause();
    }
}
