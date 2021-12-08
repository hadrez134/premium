package apps.bienestar.pausasactivasybienestar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import apps.bienestar.pausasactivasybienestar.R;

import static androidx.navigation.Navigation.findNavController;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class PosturasFragment extends Fragment {

    private AdView adView;

    public PosturasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_posturas, container, false);

        Button btn1=rootView.findViewById(R.id.silla);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main21Activity);
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
