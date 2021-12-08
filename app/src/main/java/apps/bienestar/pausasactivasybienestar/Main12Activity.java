package apps.bienestar.pausasactivasybienestar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import apps.bienestar.pausasactivasybienestar.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main12Activity extends YouTubeBaseActivity {

    private static final String TAG = "Main12Activity";

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener  mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        btnPlay = (Button) findViewById(R.id.buttondina6h);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.dina6h);
        Log.d(TAG,"onCreate: Starting.");

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing.");
                //List<String> videolist = new ArrayList<>();
                youTubePlayer.loadVideo("I4TGGGPsXn0");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initialize.");
            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Intializing YouTube Playe");
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);

            }
        });
    }
}
