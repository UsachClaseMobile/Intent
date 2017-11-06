package cl.rodrigoayala.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    TextView saludoUsuarioTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludoUsuarioTextView = (TextView) findViewById(R.id.saludoUsuarioTextView);

        String nombre = getIntent().getStringExtra("nombre");

        saludoUsuarioTextView.setText("Hola "+ nombre +"!");
    }
}
