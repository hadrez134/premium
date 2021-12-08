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
public class descansosFragment extends Fragment {

    private AdView adView;

    public descansosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_descansos, container, false);

        Button btn1=rootView.findViewById(R.id.button11);
        Button btn2=rootView.findViewById(R.id.button12);
        Button btn3=rootView.findViewById(R.id.button13);
        Button btn4=rootView.findViewById(R.id.button14);
        Button btn5=rootView.findViewById(R.id.button15);
        Button btn6=rootView.findViewById(R.id.button16);
        Button btn7= rootView.findViewById(R.id.button17);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main24Activity);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main28Activity);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main29Activity);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main30Activity);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main31Activity);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main32Activity);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findNavController(v).navigate(R.id.main33Activity);
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