package com.example.lectoescritura.Menu_Estudiante.Glosario.Cordialidades;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class cordialidades_contenido extends AppCompatActivity {
    private ImageView Adios, Bdias, Btarde, Bnoche, Gracias, Hola,
            Losiento, Muchogusto, Porfa1, Porfa2;
    private ImageButton AdiosStop, BdiasStop, BtardeStop, BnocheStop, GraciasStop, HolaStop,
            LosientoStop, MuchogustoStop, Porfa1Stop, Porfa2Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordialidades_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Adios = (ImageView)findViewById(R.id.ImaAdios);
        Bdias = (ImageView)findViewById(R.id.ImaBdias);
        Btarde = (ImageView)findViewById(R.id.ImaBtarde);
        Bnoche = (ImageView)findViewById(R.id.ImaBnoche);
        Gracias = (ImageView)findViewById(R.id.ImaGracias);
        Hola = (ImageView)findViewById(R.id.ImaHola);
        Losiento = (ImageView)findViewById(R.id.ImaLosiento);
        Muchogusto = (ImageView)findViewById(R.id.ImaMuchogusto);
        Porfa1 = (ImageView)findViewById(R.id.ImaPorfa1);
        Porfa2 = (ImageView)findViewById(R.id.ImaPorfa2);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        AdiosStop = (ImageButton) findViewById(R.id.btnAdiosStop);
        AdiosStop.setEnabled(false);
        BdiasStop = (ImageButton) findViewById(R.id.btnBdiasStop);
        BdiasStop.setEnabled(false);
        BtardeStop = (ImageButton) findViewById(R.id.btnBtardeStop);
        BtardeStop.setEnabled(false);
        BnocheStop = (ImageButton) findViewById(R.id.btnBnocheStop);
        BnocheStop.setEnabled(false);
        GraciasStop = (ImageButton) findViewById(R.id.btnGraciasStop);
        GraciasStop.setEnabled(false);
        HolaStop = (ImageButton) findViewById(R.id.btnHolaStop);
        HolaStop.setEnabled(false);
        LosientoStop = (ImageButton) findViewById(R.id.btnLosientoStop);
        LosientoStop.setEnabled(false);
        MuchogustoStop = (ImageButton) findViewById(R.id.btnMuchogustoStop);
        MuchogustoStop.setEnabled(false);
        Porfa1Stop = (ImageButton) findViewById(R.id.btnPorfa1Stop);
        Porfa1Stop.setEnabled(false);
        Porfa2Stop = (ImageButton) findViewById(R.id.btnPorfa2Stop);
        Porfa2Stop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE ADIOS A GRACIAS MULTIMEDIA ------------------------------------------------------------------------------
    public void cordial_seleccionar1 (View view) {
        switch (view.getId()) {

            case R.id.btnAdiosPlay:
                AdiosStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_adios).into(Adios);
                break;
            case R.id.btnAdiosStop:
                Drawable drawableAdios = Adios.getDrawable();
                ((Animatable) drawableAdios).stop();
                break;

            case R.id.btnBdiasPlay:
                BdiasStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_b1dias).into(Bdias);
                break;
            case R.id.btnBdiasStop:
                Drawable drawableBdias = Bdias.getDrawable();
                ((Animatable) drawableBdias).stop();
                break;

            case R.id.btnBtardePlay:
                BtardeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_b2tardes).into(Btarde);
                break;
            case R.id.btnBtardeStop:
                Drawable drawableBtarde = Btarde.getDrawable();
                ((Animatable) drawableBtarde).stop();
                break;

            case R.id.btnBnochePlay:
                BnocheStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_b3noches).into(Bnoche);
                break;
            case R.id.btnBnocheStop:
                Drawable drawableBnoche = Bnoche.getDrawable();
                ((Animatable) drawableBnoche).stop();
                break;

            case R.id.btnGraciasPlay:
                GraciasStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_gracias).into(Gracias);
                break;
            case R.id.btnGraciasStop:
                Drawable drawableGracias = Gracias.getDrawable();
                ((Animatable) drawableGracias).stop();
                break;
        }
    }
    // DE ADIOS A GRACIAS MULTIMEDIA ------------------------------------------------------------------------------

    // DE HOLA A PORFA2 MULTIMEDIA --------------------------------------------------------------------------------
    public void cordial_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnHolaPlay:
                HolaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_hola).into(Hola);
                break;
            case R.id.btnHolaStop:
                Drawable drawableHola = Hola.getDrawable();
                ((Animatable) drawableHola).stop();
                break;

            case R.id.btnLosientoPlay:
                LosientoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_losiento).into(Losiento);
                break;
            case R.id.btnLosientoStop:
                Drawable drawableLosiento = Losiento.getDrawable();
                ((Animatable) drawableLosiento).stop();
                break;

            case R.id.btnMuchogustoPlay:
                MuchogustoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_muchogusto).into(Muchogusto);
                break;
            case R.id.btnMuchogustoStop:
                Drawable drawableMuchogusto = Muchogusto.getDrawable();
                ((Animatable) drawableMuchogusto).stop();
                break;

            case R.id.btnPorfa1Play:
                Porfa1Stop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_porfavor1).into(Porfa1);
                break;
            case R.id.btnPorfa1Stop:
                Drawable drawablePorfa1 = Porfa1.getDrawable();
                ((Animatable) drawablePorfa1).stop();
                break;

            case R.id.btnPorfa2Play:
                Porfa2Stop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.cordial_porfavor2).into(Porfa2);
                break;
            case R.id.btnPorfa2Stop:
                Drawable drawablePorfa2 = Porfa2.getDrawable();
                ((Animatable) drawablePorfa2).stop();
                break;
        }
    }
    // DE HOLA A PORFA2 MULTIMEDIA --------------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
