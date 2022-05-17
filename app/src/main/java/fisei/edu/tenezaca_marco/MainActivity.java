package fisei.edu.tenezaca_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText c_Nombre;
    private EditText c_Apellido;
    private EditText c_Base;
    private EditText c_Exponente;
    private EditText c_Factorial;
    private EditText c_Potencia;
    private Button c_mostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c_Nombre=(EditText)findViewById(R.id.text_Nombre);
        c_Apellido=(EditText)findViewById(R.id.text_Apellido);
        c_Base=(EditText)findViewById(R.id.text_Base);
        c_Exponente=(EditText)findViewById(R.id.text_Exponente);
        c_Factorial=(EditText)findViewById(R.id.text_Factorial);
        c_Potencia=(EditText)findViewById(R.id.text_Potencia);
        c_mostrar = (Button)findViewById(R.id.button_Mostrar);
        String nombr = getIntent().getStringExtra("nombre");
        c_Nombre.setText(nombr);

        if (c_Nombre.length()==0){
            c_mostrar.setEnabled(false);
        }else{
            c_Nombre.setEnabled(true);
        }

    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(MainActivity.this, MainActivity2.class );
        startActivity(siguiente);
    }


    public void Mostrar(View view){


        String apellid = getIntent().getStringExtra("apellido");
        c_Apellido.setText(apellid);

        String exp = getIntent().getStringExtra("exponen");
        c_Exponente.setText(exp);

        String base = getIntent().getStringExtra("base");
        c_Base.setText(base);

        String pot = c_Base.getText().toString();
        String expt = c_Exponente.getText().toString();
        double poten = Double.parseDouble(pot);
        double exponen = Double.parseDouble(expt);
        double potencia = Math.pow(poten,exponen);

        String res = String.valueOf(poten);

        long factorial = 1;
        int num = Integer.parseInt( getIntent().getStringExtra("numer"));
        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }
        c_Factorial.setText(String.valueOf(factorial));
        c_Potencia.setText(res);
    }
}