package apps.bienestar.pausasactivasybienestar;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import apps.bienestar.pausasactivasybienestar.R;

public class Main26Activity extends AppCompatActivity {

    // URL a cargar
    String url = "https://www.facebook.com/groups/834642876718933/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

        WebView web = (WebView) findViewById(R.id.webejerciciosmentales);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


    }
}

