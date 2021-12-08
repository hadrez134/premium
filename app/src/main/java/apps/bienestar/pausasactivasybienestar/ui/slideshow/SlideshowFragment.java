package apps.bienestar.pausasactivasybienestar.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import apps.bienestar.pausasactivasybienestar.R;

import static androidx.navigation.Navigation.findNavController;

public class SlideshowFragment extends Fragment {

    private AdView adView;


    private SlideshowViewModel slideshowViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_slideshow, container, false);

        Button btn1=rootView.findViewById(R.id.button7);
        Button btn2=rootView.findViewById(R.id.button8);
        Button btn3=rootView.findViewById(R.id.button9);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.sindromeFragment);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main22Activity);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main23Activity);

            }
        });


        adView = new AdView(getActivity());
        adView.setAdUnitId("ca-app-pub-9498156915000940/8948895544");
        adView.setAdSize(AdSize.SMART_BANNER);
        LinearLayout layout = (LinearLayout) rootView.findViewById(R.id.layout_admob);
        layout.addView(adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        return rootView;


    }

}