package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import apps.bienestar.pausasactivasybienestar.R;

public class Main29Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);
    }

    // metodo boton  pausas
    public void pausas(View view) {
        Intent pausas = new Intent(this, MainActivity.class);
        startActivity(pausas);
    }
}