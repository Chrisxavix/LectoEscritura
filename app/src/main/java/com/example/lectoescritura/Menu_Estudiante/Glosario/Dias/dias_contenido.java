package com.example.lectoescritura.Menu_Estudiante.Glosario.Dias;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class dias_contenido extends AppCompatActivity {
    private ImageView Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
    private ImageButton LunesStop, MartesStop, MiercolesStop, JuevesStop, ViernesStop, SabadoStop, DomingoStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dias_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Lunes = (ImageView)findViewById(R.id.ImaLunes);
        Martes = (ImageView)findViewById(R.id.ImaMartes);
        Miercoles = (ImageView)findViewById(R.id.ImaMiercoles);
        Jueves = (ImageView)findViewById(R.id.ImaJueves);
        Viernes = (ImageView)findViewById(R.id.ImaViernes);
        Sabado = (ImageView)findViewById(R.id.ImaSabado);
        Domingo = (ImageView)findViewById(R.id.ImaDomingo);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        LunesStop = (ImageButton) findViewById(R.id.btnLunesStop);
        LunesStop.setEnabled(false);
        MartesStop = (ImageButton) findViewById(R.id.btnMartesStop);
        MartesStop.setEnabled(false);
        MiercolesStop = (ImageButton) findViewById(R.id.btnMiercolesStop);
        MiercolesStop.setEnabled(false);
        JuevesStop = (ImageButton) findViewById(R.id.btnJuevesStop);
        JuevesStop.setEnabled(false);
        ViernesStop = (ImageButton) findViewById(R.id.btnViernesStop);
        ViernesStop.setEnabled(false);
        SabadoStop = (ImageButton) findViewById(R.id.btnSabadoStop);
        SabadoStop.setEnabled(false);
        DomingoStop = (ImageButton) findViewById(R.id.btnDomingoStop);
        DomingoStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    public void dias_seleccionar (View view) {
        switch (view.getId()) {
            case R.id.btnLunesPlay:
                LunesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_lunes).into(Lunes);
                break;
            case R.id.btnLunesStop:
                Drawable drawablelunes = Lunes.getDrawable();
                ((Animatable) drawablelunes).stop();
                break;

            case R.id.btnMartesPlay:
                MartesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_martes).into(Martes);
                break;
            case R.id.btnMartesStop:
                Drawable drawablemartes = Martes.getDrawable();
                ((Animatable) drawablemartes).stop();
                break;

            case R.id.btnMiercolesPlay:
                MiercolesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_miercoles).into(Miercoles);
                break;
            case R.id.btnMiercolesStop:
                Drawable drawablemiercoles = Miercoles.getDrawable();
                ((Animatable) drawablemiercoles).stop();
                break;

            case R.id.btnJuevesPlay:
                JuevesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_jueves).into(Jueves);
                break;
            case R.id.btnJuevesStop:
                Drawable drawablejueves = Jueves.getDrawable();
                ((Animatable) drawablejueves).stop();
                break;

            case R.id.btnViernesPlay:
                ViernesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_viernes).into(Viernes);
                break;
            case R.id.btnViernesStop:
                Drawable drawableviernes = Viernes.getDrawable();
                ((Animatable) drawableviernes).stop();
                break;

            case R.id.btnSabadoPlay:
                SabadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_sabado).into(Sabado);
                break;
            case R.id.btnSabadoStop:
                Drawable drawablesabado = Sabado.getDrawable();
                ((Animatable) drawablesabado).stop();
                break;

            case R.id.btnDomingoPlay:
                DomingoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.dias_domingo).into(Domingo);
                break;
            case R.id.btnDomingoStop:
                Drawable drawabledomingo = Domingo.getDrawable();
                ((Animatable) drawabledomingo).stop();
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
