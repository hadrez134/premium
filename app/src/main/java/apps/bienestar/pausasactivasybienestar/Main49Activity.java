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

public class Main49Activity extends YouTubeBaseActivity {

    private static final String TAG = "Main49Activity";

    YouTubePlayerView ñYouTubePlayerView;
    Button btnPlay11;
    YouTubePlayer.OnInitializedListener  mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49);



        btnPlay11 = (Button) findViewById(R.id.boton3);
        ñYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.fisiprofesional);
        Log.d(TAG,"onCreate: Starting.");

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

        btnPlay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Intializing YouTube Playe");
                ñYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);

            }
        });

    }

    // metodo nivel 5
    public void leyenda(View view) {
        Intent leyenda = new Intent(this, Main50Activity.class);
        startActivity(leyenda);
    }

}
