package apps.bienestar.pausasactivasybienestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import apps.bienestar.pausasactivasybienestar.R;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registroActivity extends AppCompatActivity {
    EditText txtNombre;
    EditText txtCorreo;
    EditText txtCelular;
    EditText txtEmpresa;
    Button btnRegistrar;

    private DatabaseReference Usuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Usuarios = FirebaseDatabase.getInstance().getReference("Usuarios");
        txtNombre = (EditText) findViewById(R.id.txtnombre);
        txtCorreo = (EditText) findViewById(R.id.txtcorreo);
        txtCelular = (EditText) findViewById(R.id.txtcelular);
        txtEmpresa = (EditText) findViewById(R.id.txtempresa);
        txtNombre = (EditText) findViewById(R.id.txtnombre);
        btnRegistrar = (Button) findViewById(R.id.btnregistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Registrarusuarios();

            }
        });
    }

    public void Registrarusuarios() {
        String nombre = txtNombre.getText().toString();
        String correo = txtCorreo.getText().toString();
        String celular = txtCelular.getText().toString();
        String empresa = txtEmpresa.getText().toString();

        if (!TextUtils.isEmpty(nombre)) {
            String clasenombre = Usuarios.push().getKey();
            Usuarios nuevos = new Usuarios(nombre, correo, celular, empresa);
            Usuarios.child("nuevos").child(nombre).setValue(nuevos);

            Toast.makeText(this, "Usuario registrado", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Debe introducir un nombre", Toast.LENGTH_SHORT).show();

    }
        // metodo empieza tu autocuidado ahora
        public void autocuidado(View view) {
            Intent autocuidado = new Intent(this, MainActivity.class);
            autocuidado.putExtra("dato", txtNombre.getText().toString());
            startActivity(autocuidado);
        }

    }

