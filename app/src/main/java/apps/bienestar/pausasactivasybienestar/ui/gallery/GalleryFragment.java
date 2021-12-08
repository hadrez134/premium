package apps.bienestar.pausasactivasybienestar.ui.gallery;

import android.content.Intent;
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

import apps.bienestar.pausasactivasybienestar.Main10Activity;
import apps.bienestar.pausasactivasybienestar.Main11Activity;
import apps.bienestar.pausasactivasybienestar.Main12Activity;
import apps.bienestar.pausasactivasybienestar.Main13Activity;
import apps.bienestar.pausasactivasybienestar.Main14Activity;
import apps.bienestar.pausasactivasybienestar.Main15Activity;
import apps.bienestar.pausasactivasybienestar.Main16Activity;
import apps.bienestar.pausasactivasybienestar.Main2Activity;
import apps.bienestar.pausasactivasybienestar.Main3Activity;
import apps.bienestar.pausasactivasybienestar.Main4Activity;
import apps.bienestar.pausasactivasybienestar.Main5Activity;
import apps.bienestar.pausasactivasybienestar.Main6Activity;
import apps.bienestar.pausasactivasybienestar.Main7Activity;
import apps.bienestar.pausasactivasybienestar.Main8Activity;
import apps.bienestar.pausasactivasybienestar.Main9Activity;
import apps.bienestar.pausasactivasybienestar.R;

import static androidx.navigation.Navigation.findNavController;

public class GalleryFragment extends Fragment {

    private AdView adView;

    public GalleryFragment  () {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_gallery, container, false);

        Button btnOpen=(Button) rootView.findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Main2Activity.class);
                               startActivity(in);

            }
        });
        Button btnbrazos=(Button) rootView.findViewById(R.id.btnbrazos);
        btnbrazos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn = new Intent(getActivity(), Main3Activity.class);
                startActivity(inn);

            }
        });
        Button manos=(Button) rootView.findViewById(R.id.manos);
        manos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Main13Activity.class);
                startActivity(i);

            }
        });
        Button espalda=(Button) rootView.findViewById(R.id.espalda);
       espalda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iss = new Intent(getActivity(), Main4Activity.class);
                startActivity(iss);

            }
        });
        Button piernas=(Button) rootView.findViewById(R.id.piernas);
        piernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isss = new Intent(getActivity(), Main5Activity.class);
                startActivity(isss);

            }
        });
        Button calendinaa=(Button) rootView.findViewById(R.id.calendinaa);
        calendinaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iq = new Intent(getActivity(), Main6Activity.class);
                startActivity(iq);

            }
        });
        Button vdtcalen=(Button) rootView.findViewById(R.id.vdtcalen);
        vdtcalen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ioo= new Intent(getActivity(), Main7Activity.class);
                startActivity(ioo);

            }
        });
        Button dina2hs=(Button) rootView.findViewById(R.id.dina2hs);
        dina2hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent its = new Intent(getActivity(), Main8Activity.class);
                startActivity(its);

            }
        });
        Button vdt2hs=(Button) rootView.findViewById(R.id.vdt2hs);
        vdt2hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iq = new Intent(getActivity(), Main9Activity.class);
                startActivity(iq);

            }
        });
        Button dina4hs=(Button) rootView.findViewById(R.id.dina4hs);
       dina4hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent(getActivity(), Main10Activity.class);
                startActivity(ig);

            }
        });
        Button vdt4hs=(Button) rootView.findViewById(R.id.vdt4hs);
        vdt4hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent il = new Intent(getActivity(), Main11Activity.class);
                startActivity(il);

            }
        });
        Button dina6hs=(Button) rootView.findViewById(R.id.dina6hs);
        dina6hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iha = new Intent(getActivity(), Main12Activity.class);
                startActivity(iha);

            }
        });
        Button vdt6hs=(Button) rootView.findViewById(R.id.vdt6hs);
        vdt6hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ihar = new Intent(getActivity(), Main14Activity.class);
                startActivity(ihar);

            }
        });
        Button dina8hs=(Button) rootView.findViewById(R.id.dina8hs);
        dina8hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iharo = new Intent(getActivity(), Main15Activity.class);
                startActivity(iharo);

            }
        });
        Button vdt8hs=(Button) rootView.findViewById(R.id.vdt8hs);
        vdt8hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iharo = new Intent(getActivity(), Main16Activity.class);
                startActivity(iharo);

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