package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import apps.bienestar.pausasactivasybienestar.R;

public class Main38Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main38);
    }

    // metodo desayunos
    public void desayunos(View view) {
        Intent desayunos = new Intent(this, Main37Activity.class);
        startActivity(desayunos);
    }
    // metodo almuerzo
    public void almuerzo(View view) {
        Intent almuerzo = new Intent(this, Main39Activity.class);
        startActivity(almuerzo);
    }

    // metodo onces
    public void onces(View view) {
        Intent onces = new Intent(this, Main40Activity.class);
        startActivity(onces);

    }
    // metodo cena
    public void cena(View view) {
        Intent cena = new Intent(this, Main41Activity.class);
        startActivity(cena);

    }
    // metodo nivel 3
    public void normal(View view) {
        Intent normal = new Intent(this, Main42Activity.class);
        startActivity(normal);

    }



}
