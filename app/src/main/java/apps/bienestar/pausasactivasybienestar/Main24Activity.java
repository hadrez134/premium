package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import apps.bienestar.pausasactivasybienestar.R;

import uk.co.senab.photoview.PhotoViewAttacher;

import static androidx.navigation.Navigation.findNavController;

public class Main24Activity extends AppCompatActivity {

    ImageView imagen5;
    PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        imagen5 = (ImageView) findViewById(R.id.imagendes);
        photoViewAttacher = new PhotoViewAttacher(imagen5);
    }

    public void pausass(View view) {
        Intent pausass = new Intent(this, MainActivity.class);
        startActivity(pausass);

    }

    // Nivel mental
    public void mental(View view) {
        Intent mental = new Intent(this, Main25Activity.class);
        startActivity(mental);
    }

    // Nivel estres
    public void estres(View view) {
        Intent estres = new Intent(this, Main27Activity.class);
        startActivity(estres);
    }



}



