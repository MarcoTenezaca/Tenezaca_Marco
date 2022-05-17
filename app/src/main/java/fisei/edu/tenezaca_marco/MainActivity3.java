package fisei.edu.tenezaca_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
private EditText e_Nombre;
    private EditText e_Apellido;
    private EditText e_Base;
    private EditText e_Exponente;
    private EditText e_Numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e_Nombre=(EditText)findViewById(R.id.text_Nombre3);
        e_Apellido=(EditText)findViewById(R.id.text_Apellido3);
        e_Base=(EditText)findViewById(R.id.text_Base3);
        e_Exponente=(EditText)findViewById(R.id.text_exponente3);
        e_Numero=(EditText)findViewById(R.id.text_numero3);
    }
    public void Regresar(View view){
        Intent regresar = new Intent(MainActivity3.this, MainActivity2.class );

        String nomb = e_Nombre.getText().toString();
        regresar.putExtra("nombre", nomb);
        String bas = e_Base.getText().toString();
        regresar.putExtra("base", bas);
        // variables que no van en el main2
        String expo = e_Exponente.getText().toString();
        regresar.putExtra("expo", expo);
        String apell = e_Apellido.getText().toString();
        regresar.putExtra("apellido", apell);
        String num = e_Numero.getText().toString();
        regresar.putExtra("nume", num);
        startActivity(regresar);
    }


}