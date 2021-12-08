package apps.bienestar.pausasactivasybienestar.ui.home;

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

public class HomeFragment extends Fragment {

    private AdView adView;

    private HomeViewModel homeViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_home, container, false);

        Button btn1= rootView.findViewById(R.id.registrarse);
        Button btn2= rootView.findViewById(R.id.pausasactivas);
        Button btn3= rootView.findViewById(R.id.iluminacion);
        Button btn4= rootView.findViewById(R.id.tunel);
        Button btn5= rootView.findViewById(R.id.posturas);
        Button btn6= rootView.findViewById(R.id.ojos);
        Button btn7= rootView.findViewById(R.id.descansos);
        Button btn8= rootView.findViewById(R.id.habitosaludables);

        btn1.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) {
                findNavController(v).navigate(R.id.registroActivity);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                findNavController(v).navigate(R.id.nav_gallery);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.sindromeFragment);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main17Activity);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.posturasFragment);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.nav_slideshow);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.descansosFragment);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.habitosFragment);

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