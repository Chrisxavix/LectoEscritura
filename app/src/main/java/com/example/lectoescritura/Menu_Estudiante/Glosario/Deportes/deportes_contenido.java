package com.example.lectoescritura.Menu_Estudiante.Glosario.Deportes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class deportes_contenido extends AppCompatActivity {
    private ImageView Atletismo, Baloncesto, Boxeo, Ciclismo, Futbol, Indorfutbol,
    Natacion, Tenis, Voleibol;
    private ImageButton AtletismoStop, BaloncestoStop, BoxeoStop, CiclismoStop,
            FutbolStop, IndorfutbolStop, NatacionStop, TenisStop, VoleibolStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Atletismo = (ImageView)findViewById(R.id.ImaAtletismo);
        Baloncesto = (ImageView)findViewById(R.id.ImaBaloncesto);
        Boxeo = (ImageView)findViewById(R.id.ImaBoxeo);
        Ciclismo = (ImageView)findViewById(R.id.ImaCiclismo);
        Futbol = (ImageView)findViewById(R.id.ImaFutbol);
        Indorfutbol = (ImageView)findViewById(R.id.ImaIndorfutbol);
        Natacion = (ImageView)findViewById(R.id.ImaNatacion);
        Tenis = (ImageView)findViewById(R.id.ImaTenis);
        Voleibol = (ImageView)findViewById(R.id.ImaVoleibol);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        AtletismoStop = (ImageButton) findViewById(R.id.btnAtletismoStop);
        AtletismoStop.setEnabled(false);
        BaloncestoStop = (ImageButton) findViewById(R.id.btnBaloncestoStop);
        BaloncestoStop.setEnabled(false);
        BoxeoStop = (ImageButton) findViewById(R.id.btnBoxeoStop);
        BoxeoStop.setEnabled(false);
        CiclismoStop = (ImageButton) findViewById(R.id.btnCiclismoStop);
        CiclismoStop.setEnabled(false);
        FutbolStop = (ImageButton) findViewById(R.id.btnFutbolStop);
        FutbolStop.setEnabled(false);
        IndorfutbolStop = (ImageButton) findViewById(R.id.btnIndorfutbolStop);
        IndorfutbolStop.setEnabled(false);
        NatacionStop = (ImageButton) findViewById(R.id.btnNatacionStop);
        NatacionStop.setEnabled(false);
        TenisStop = (ImageButton) findViewById(R.id.btnTenisStop);
        TenisStop.setEnabled(false);
        VoleibolStop = (ImageButton) findViewById(R.id.btnVoleibolStop);
        VoleibolStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    public void deporte_seleccionar (View view) {
        switch (view.getId()) {

            case R.id.btnAtletismoPlay:
                AtletismoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_atletismo).into(Atletismo);
                break;
            case R.id.btnAtletismoStop:
                Drawable drawableAtletismo = Atletismo.getDrawable();
                ((Animatable) drawableAtletismo).stop();
                break;

            case R.id.btnBaloncestoPlay:
                BaloncestoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_baloncesto).into(Baloncesto);
                break;
            case R.id.btnBaloncestoStop:
                Drawable drawableBaloncesto = Baloncesto.getDrawable();
                ((Animatable) drawableBaloncesto).stop();
                break;

            case R.id.btnBoxeoPlay:
                BoxeoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_boxeo).into(Boxeo);
                break;
            case R.id.btnBoxeoStop:
                Drawable drawableBoxeo = Boxeo.getDrawable();
                ((Animatable) drawableBoxeo).stop();
                break;

            case R.id.btnCiclismoPlay:
                CiclismoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_ciclismo).into(Ciclismo);
                break;
            case R.id.btnCiclismoStop:
                Drawable drawableCiclismo = Ciclismo.getDrawable();
                ((Animatable) drawableCiclismo).stop();
                break;

            case R.id.btnFutbolPlay:
                FutbolStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_futbol).into(Futbol);
                break;
            case R.id.btnFutbolStop:
                Drawable drawableFutbol = Futbol.getDrawable();
                ((Animatable) drawableFutbol).stop();
                break;

            case R.id.btnIndorfutbolPlay:
                IndorfutbolStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_indorfutbol).into(Indorfutbol);
                break;
            case R.id.btnIndorfutbolStop:
                Drawable drawableIndorfutbol = Indorfutbol.getDrawable();
                ((Animatable) drawableIndorfutbol).stop();
                break;

            case R.id.btnNatacionPlay:
                NatacionStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_natacion).into(Natacion);
                break;
            case R.id.btnNatacionStop:
                Drawable drawableNatacion = Natacion.getDrawable();
                ((Animatable) drawableNatacion).stop();
                break;

            case R.id.btnTenisPlay:
                TenisStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_tenis).into(Tenis);
                break;
            case R.id.btnTenisStop:
                Drawable drawableTenis = Tenis.getDrawable();
                ((Animatable) drawableTenis).stop();
                break;

            case R.id.btnVoleibolPlay:
                VoleibolStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.deporte_voleibol).into(Voleibol);
                break;
            case R.id.btnVoleibolStop:
                Drawable drawableVoleibol = Voleibol.getDrawable();
                ((Animatable) drawableVoleibol).stop();
                break;
        }
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
