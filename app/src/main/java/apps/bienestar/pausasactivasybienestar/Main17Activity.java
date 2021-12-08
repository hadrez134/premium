package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import apps.bienestar.pausasactivasybienestar.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Main17Activity extends AppCompatActivity {

    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        imagen1 = (ImageView) findViewById(R.id.imageView3);
        imagen2 = (ImageView) findViewById(R.id.imageView4);
        imagen3 = (ImageView) findViewById(R.id.imageView5);
        photoViewAttacher =new PhotoViewAttacher(imagen1);
        photoViewAttacher =new PhotoViewAttacher(imagen2);
        photoViewAttacher =new PhotoViewAttacher(imagen3);
    }
    // metodo ofi
    public void ofi(View view) {
        Intent ofi = new Intent(this, Main18Activity.class);
        startActivity(ofi);
    }

    // metodo dina
    public void dina(View view) {
        Intent dina = new Intent(this, Main19Activity.class);
        startActivity(dina);
    }

    // enfermedades en la oficina
    public void tunel(View view) {
        Intent tunel = new Intent(this, Main20Activity.class);
        startActivity(tunel);

    }
}
