package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import apps.bienestar.pausasactivasybienestar.R;

public class Main32Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
    }

    // metodo boton  pausas
    public void pausas(View view) {
        Intent pausas = new Intent(this, MainActivity.class);
        startActivity(pausas);
    }
    // metodo boton  pausas
    public void estres(View view) {
        Intent estres = new Intent(this, Main27Activity.class);
        startActivity(estres);
    }


    // Nivel mental
    public void mental(View view) {
        Intent mental = new Intent(this, Main25Activity.class);
        startActivity(mental);
    }
}