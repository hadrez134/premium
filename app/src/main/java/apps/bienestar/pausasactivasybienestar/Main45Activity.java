package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import apps.bienestar.pausasactivasybienestar.R;

public class Main45Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main45);
    }

    // metodo nivel 1
    public void amateur(View view) {
        Intent amateur = new Intent(this, Main46Activity.class);
        startActivity(amateur);
    }

    // metodo nivel 2
    public void principiante(View view) {
        Intent principiante = new Intent(this, Main47Activity.class);
        startActivity(principiante);
    }

    // metodo nivel 3
    public void normal(View view) {
        Intent normal = new Intent(this, Main48Activity.class);
        startActivity(normal);

    }

    // metodo nivel 4
    public void profesional(View view) {
        Intent profesional = new Intent(this, Main49Activity.class);
        startActivity(profesional);
    }

    // metodo nivel 5
    public void leyenda(View view) {
        Intent leyenda = new Intent(this, Main50Activity.class);
        startActivity(leyenda);
    }

}


