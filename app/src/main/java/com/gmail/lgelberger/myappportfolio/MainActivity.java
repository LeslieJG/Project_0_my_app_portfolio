package com.gmail.lgelberger.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSpotifyStreamer(View view){
        Toast.makeText(this,getString(R.string.spotify_streamer_toast), Toast.LENGTH_SHORT).show();
    }

    public void launchScoresApp(View view){
        Toast.makeText(this, getString(R.string.scores_app_toast), Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryApp(View view){
        Toast.makeText(this, getString(R.string.library_app_toast), Toast.LENGTH_SHORT).show();
    }

    public void launchBuildItBigger(View view){
        Toast.makeText(this, getString(R.string.build_it_bigger_app_toast), Toast.LENGTH_SHORT).show();
    }

    public void launchXYZReader(View view){
        Toast.makeText(this, getString(R.string.XYZReader_app_toast), Toast.LENGTH_SHORT).show();
    }

    public void launchCapstone(View view){
        Toast.makeText(this, getString(R.string.capstone_app_toast), Toast.LENGTH_SHORT).show();
    }
}
