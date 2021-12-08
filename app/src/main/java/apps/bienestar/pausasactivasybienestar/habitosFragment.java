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
 */
public class habitosFragment extends Fragment {

    private AdView adView;

    public habitosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_habitos, container, false);

        Button btn1=rootView.findViewById(R.id.button31);
        Button btn2=rootView.findViewById(R.id.button32);
        Button btn3=rootView.findViewById(R.id.ejerciciomental);
        Button btn4=rootView.findViewById(R.id.habitoshigienicos);
        Button btn5=rootView.findViewById(R.id.sueño);
        Button btn6=rootView.findViewById(R.id.tiempolibre);
        Button btn7=rootView.findViewById(R.id.accidentes);
        Button btn8=rootView.findViewById(R.id.estresssss);
        Button btn9=rootView.findViewById(R.id.mentallll);
        Button btn10=rootView.findViewById(R.id.sociall);
        Button btn11=rootView.findViewById(R.id.toxicossss);



        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main35Activity);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main45Activity);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main25Activity);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main51Activity);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main52Activity);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main53Activity);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main54Activity);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main27Activity);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main55Activity);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main56Activity);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main57Activity);
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