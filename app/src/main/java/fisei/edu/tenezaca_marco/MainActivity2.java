package fisei.edu.tenezaca_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText d_Nombre;

    private EditText d_Base;

    private EditText d_Apellido;

    private EditText d_Exponente;
    private Button  d_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        d_Nombre = (EditText)findViewById(R.id.text_Nombre2);
        d_button = (Button) findViewById(R.id.button3);
        d_Base = (EditText)findViewById(R.id.text_Base2);
        String nombr = getIntent().getStringExtra("nombre");
        d_Nombre.setText(nombr);
        String base = getIntent().getStringExtra("base");
        d_Base.setText(base);
        if (d_Nombre.length()==0){
            d_button.setEnabled(false);
        }else{
            d_button.setEnabled(true);
        }
    }

    public void Siguiente2(View view){
        Intent siguiente = new Intent(MainActivity2.this, MainActivity3.class );
        startActivity(siguiente);
    }

    public void Cerrar (View view){
        Intent siguiente = new Intent(MainActivity2.this, MainActivity.class );
        String apellido = getIntent().getStringExtra("apellido");
        String exponente = getIntent().getStringExtra("expo");
        String numero = getIntent().getStringExtra("nume");
        String nombr = d_Nombre.getText().toString();
        String base = d_Base.getText().toString();
        siguiente.putExtra("numer",numero);
        siguiente.putExtra("exponen",exponente);
        siguiente.putExtra("apellido",apellido);
        siguiente.putExtra("nombre",nombr);
        siguiente.putExtra("base",base);
        startActivity(siguiente);



    }
}
