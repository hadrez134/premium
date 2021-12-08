package apps.bienestar.pausasactivasybienestar;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import apps.bienestar.pausasactivasybienestar.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main25Activity extends YouTubeBaseActivity {

    private static final String TAG = "Main25Activity";

    YouTubePlayerView iYouTubePlayerView;
    Button btnPlay5;
    YouTubePlayer.OnInitializedListener  mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        btnPlay5 = (Button) findViewById(R.id.pausasss);
        iYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.juegos);
        Log.d(TAG, "onCreate: Starting.");

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing.");
                //List<String> videolist = new ArrayList<>();
                //videolist.add("1UeiM02DlkM");
                youTubePlayer.loadVideo("AhLGYG8mXfs");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initialize.");
            }
        };

        btnPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Intializing YouTube Playe");
                iYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);


            }

        });


    }

    // metodo ejercicios mentales facebook
    public void face(View view) {
        Intent face = new Intent(this, Main26Activity.class);
        startActivity(face);
    }

}
