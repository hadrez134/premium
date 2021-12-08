package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import apps.bienestar.pausasactivasybienestar.R;

public class Main35Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main35);
    }

    // metodo nivel 1
    public void amateur(View view) {
        Intent amateur = new Intent(this, Main36Activity.class);
        startActivity(amateur);
    }

    // metodo nivel 2
    public void principiante(View view) {
        Intent principiante = new Intent(this, Main38Activity.class);
        startActivity(principiante);
    }

    // metodo nivel 3
    public void normal(View view) {
        Intent normal = new Intent(this, Main42Activity.class);
        startActivity(normal);

    }

    // metodo nivel 4
    public void profesional(View view) {
        Intent profesional = new Intent(this, Main43Activity.class);
        startActivity(profesional);
    }

    // metodo nivel 5
    public void leyenda(View view) {
        Intent leyenda = new Intent(this, Main44Activity.class);
        startActivity(leyenda);
    }
    // metodo empieza por partes
    public void partes(View view) {
        Intent partes= new Intent(this, MainActivity2.class);
        startActivity(partes);
    }
    // metodo cambios saludables
    public void cambios(View view) {
        Intent cambios= new Intent(this, MainActivity3.class);
        startActivity(cambios);
    }
    // metodo beneficio de tomar agua
    public void agua(View view) {
        Intent agua= new Intent(this, MainActivity4.class);
        startActivity(agua);
    }
    // metodo consejos saludables
    public void conejos(View view) {
        Intent conejos= new Intent(this, MainActivity5.class);
        startActivity(conejos);
    }
    // metodo snaks
    public void snaks(View view) {
        Intent snaks= new Intent(this, MainActivity6.class);
        startActivity(snaks);
    }
    // metodo snaks
    public void macro(View view) {
        Intent macro= new Intent(this, MainActivity7.class);
        startActivity(macro);
    }

}
