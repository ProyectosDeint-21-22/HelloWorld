package com.nachomg.helloworld;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Crear variables de objetos de una subclase de View.
    private TextView tvMessage;
    private Button btChangeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Instanciar las variables creadas y darle memoria a través de su id con el método estática findViewById();
        //Para acceder a su id desde una Activity lo hacemos a través de la clas R, R.id.tvMessage.
        tvMessage= findViewById(R.id.tvMessage);
        btChangeMessage= findViewById(R.id.btChangeMessage);

        //3. Modificar el texto en tiempo de ejecución, no es recomendable.
        //Lo recomendable es modificar el texto en el layout.
        tvMessage.setText(R.string.msgCaracola);

        //Si queremos coger el valor de un recurso utilizamos el método getResource(), porque si ponemos R.color.teal_200
        //cogería la dirección de memoria de ese color y no el valor que sería #FF03DAC5.
        //Pero resulta que para coger el color lo tenemos que coger del contexto de la Activity y no de Application, por
        //eso utilizamos la clase ContextCompat, siendo this el contexto actual en el que estamos trabajando (MainActivity).
        btChangeMessage.setBackgroundColor(ContextCompat.getColor(this,R.color.teal_200));
    }
}