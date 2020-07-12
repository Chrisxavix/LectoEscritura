package com.example.lectoescritura.Menu_Estudiante.Glosario.Colores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class colores_contenido extends AppCompatActivity {
    private ImageView Amarillo, Anaranjado, Azul, Blanco, Cafe, Celeste,
            Morado, Negro, Plomo, Rojo, Rosado, Verde;
    private ImageButton AmarilloStop, AnaranjadoStop, AzulStop, BlancoStop, CafeStop, CelesteStop,
            MoradoStop, NegroStop, PlomoStop, RojoStop, RosadoStop, VerdeStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Amarillo = (ImageView)findViewById(R.id.ImaAmarillo);
        Anaranjado = (ImageView)findViewById(R.id.ImaAnaranjado);
        Azul = (ImageView)findViewById(R.id.ImaAzul);
        Blanco = (ImageView)findViewById(R.id.ImaBlanco);
        Cafe = (ImageView)findViewById(R.id.ImaCafe);
        Celeste = (ImageView)findViewById(R.id.ImaCeleste);
        Morado = (ImageView)findViewById(R.id.ImaMorado);
        Negro = (ImageView)findViewById(R.id.ImaNegro);
        Plomo = (ImageView)findViewById(R.id.ImaPlomo);
        Rojo = (ImageView)findViewById(R.id.ImaRojo);
        Rosado = (ImageView)findViewById(R.id.ImaRosado);
        Verde = (ImageView)findViewById(R.id.ImaVerde);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        AmarilloStop = (ImageButton) findViewById(R.id.btnAmarilloStop);
        AmarilloStop.setEnabled(false);
        AnaranjadoStop = (ImageButton) findViewById(R.id.btnAnaranjadoStop);
        AnaranjadoStop.setEnabled(false);
        AzulStop = (ImageButton) findViewById(R.id.btnAzulStop);
        AzulStop.setEnabled(false);
        BlancoStop = (ImageButton) findViewById(R.id.btnBlancoStop);
        BlancoStop.setEnabled(false);
        CafeStop = (ImageButton) findViewById(R.id.btnCafeStop);
        CafeStop.setEnabled(false);
        CelesteStop = (ImageButton) findViewById(R.id.btnCelesteStop);
        CelesteStop.setEnabled(false);
        MoradoStop = (ImageButton) findViewById(R.id.btnMoradoStop);
        MoradoStop.setEnabled(false);
        NegroStop = (ImageButton) findViewById(R.id.btnNegroStop);
        NegroStop.setEnabled(false);
        PlomoStop = (ImageButton) findViewById(R.id.btnPlomoStop);
        PlomoStop.setEnabled(false);
        RojoStop = (ImageButton) findViewById(R.id.btnRojoStop);
        RojoStop.setEnabled(false);
        RosadoStop = (ImageButton) findViewById(R.id.btnRosadoStop);
        RosadoStop.setEnabled(false);
        VerdeStop = (ImageButton) findViewById(R.id.btnVerdeStop);
        VerdeStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE AMARILLO A CELESTE MULTIMEDIA --------------------------------------------------------------------------
    public void colores_seleccionar1 (View view) {
        switch (view.getId()) {
            case R.id.btnAmarilloPlay:
                AmarilloStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_amarillo).into(Amarillo);
                break;
            case R.id.btnAmarilloStop:
                Drawable drawableAmarillo = Amarillo.getDrawable();
                ((Animatable) drawableAmarillo).stop();
                break;

            case R.id.btnAnaranjadoPlay:
                AnaranjadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_anaranjado).into(Anaranjado);
                break;
            case R.id.btnAnaranjadoStop:
                Drawable drawableAnaranjado = Anaranjado.getDrawable();
                ((Animatable) drawableAnaranjado).stop();
                break;

            case R.id.btnAzulPlay:
                AzulStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_azul).into(Azul);
                break;
            case R.id.btnAzulStop:
                Drawable drawableAzul = Azul.getDrawable();
                ((Animatable) drawableAzul).stop();
                break;

            case R.id.btnBlancoPlay:
                BlancoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_blanco).into(Blanco);
                break;
            case R.id.btnBlancoStop:
                Drawable drawableBlanco = Blanco.getDrawable();
                ((Animatable) drawableBlanco).stop();
                break;

            case R.id.btnCafePlay:
                CafeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_cafe).into(Cafe);
                break;
            case R.id.btnCafeStop:
                Drawable drawableCafe = Cafe.getDrawable();
                ((Animatable) drawableCafe).stop();
                break;

            case R.id.btnCelestePlay:
                CelesteStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_celeste).into(Celeste);
                break;
            case R.id.btnCelesteStop:
                Drawable drawableCeleste = Celeste.getDrawable();
                ((Animatable) drawableCeleste).stop();
                break;
        }
    }
    // DE AMARILLO A CELESTE MULTIMEDIA --------------------------------------------------------------------------

    // DE MORADO A VERDE MULTIMEDIA ------------------------------------------------------------------------------
    public void colores_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnMoradoPlay:
                MoradoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_morado).into(Morado);
                break;
            case R.id.btnMoradoStop:
                Drawable drawableMorado = Morado.getDrawable();
                ((Animatable) drawableMorado).stop();
                break;

            case R.id.btnNegroPlay:
                NegroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_negro).into(Negro);
                break;
            case R.id.btnNegroStop:
                Drawable drawableNegro = Negro.getDrawable();
                ((Animatable) drawableNegro).stop();
                break;

            case R.id.btnPlomoPlay:
                PlomoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_plomo).into(Plomo);
                break;
            case R.id.btnPlomoStop:
                Drawable drawablePlomo = Plomo.getDrawable();
                ((Animatable) drawablePlomo).stop();
                break;

            case R.id.btnRojoPlay:
                RojoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_rojo).into(Rojo);
                break;
            case R.id.btnRojoStop:
                Drawable drawableRojo = Rojo.getDrawable();
                ((Animatable) drawableRojo).stop();
                break;

            case R.id.btnRosadoPlay:
                RosadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_rosado).into(Rosado);
                break;
            case R.id.btnRosadoStop:
                Drawable drawableRosado = Rosado.getDrawable();
                ((Animatable) drawableRosado).stop();
                break;

            case R.id.btnVerdePlay:
                VerdeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.color_verde).into(Verde);
                break;
            case R.id.btnVerdeStop:
                Drawable drawableVerde = Verde.getDrawable();
                ((Animatable) drawableVerde).stop();
                break;
        }
    }
    // DE MORADO A VERDE MULTIMEDIA ------------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
