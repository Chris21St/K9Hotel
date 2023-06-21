package sv.edu.catolica.k_9hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void citas(View view)
    {
        Intent citas= new Intent(MainActivity.this,ActivityCitas.class);
        startActivity(citas);
    }

    public void quienes(View view)
    {
        Intent quienes= new Intent(MainActivity.this,ActivityQuienes.class);
        startActivity(quienes);
    }

    public void suscripciones(View view)
    {
        Intent suscri= new Intent(MainActivity.this,ActivitySuscripcion.class);
        startActivity(suscri);
    }

    public void instalaciones(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityInstalaciones.class);
        startActivity(insta);
    }

    public void galeria(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityGaleria.class);
        startActivity(insta);
    }

    public void ofertas(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityOfertas.class);
        startActivity(insta);
    }

    public void metodopago(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityPago.class);
        startActivity(insta);
    }

    public void contacto(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityContacto.class);
        startActivity(insta);
    }

    public void servicios(View view)
    {
        Intent insta= new Intent(MainActivity.this,ActivityServicios.class);
        startActivity(insta);
    }
}