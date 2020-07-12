package com.example.lectoescritura.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.MainActivity;
import com.example.lectoescritura.R;

public class Splash extends AppCompatActivity {
    ImageView Ima_cargando;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_cargando = (ImageView)findViewById(R.id.ImageView_Gif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.splash_gif).into(Ima_cargando);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // CONTROL DE TIEMPO DEL SPLASH --------------------------------------------------------------------------
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(Splash.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        },4000);
        // CONTROL DE TIEMPO DEL SPLASH --------------------------------------------------------------------------
    }
}
