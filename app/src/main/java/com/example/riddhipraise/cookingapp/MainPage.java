package com.example.riddhipraise.cookingapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.SearchView;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("rtsp://r4---sn-vgqsrnel.googlevideo.com/Cj0LENy73wIaNAmFG9WAXY_jXxMYDSANFC264GpZMOCoAUIASARgluncnqKGwYRZigELTUhpeE1tRkVOTFUM/E163216148A40D9269A89DEF434C2F5F74D0BCC1.E23E24D1E5F06C964AF71C789F10903F3D9F10F2/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

    public void goToUserSettings(View view){
        Intent intent = new Intent(this, ProfileSettings.class);
        startActivity(intent);
    }

    public void searchGo (View view){
        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setVisibility(View.VISIBLE);
        ImageButton user = (ImageButton) findViewById(R.id.userSettings);
        user.setVisibility(View.INVISIBLE);
        ImageButton search = (ImageButton) findViewById(R.id.search);
        search.setVisibility(View.INVISIBLE);
    }
}
