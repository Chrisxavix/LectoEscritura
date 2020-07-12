package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_01;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_02;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_03;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_04;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_05;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_06;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_07;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_08;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3.enlaceU3_09;
import com.example.lectoescritura.R;

public class enlace_menu_unidad4 extends AppCompatActivity {
    private ImageView Ima_Enlace04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_menu_unidad4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_Enlace04 = (ImageView)findViewById(R.id.ImaEnlaceGif04);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.enlace_04_gif).into(Ima_Enlace04);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_enlaceU4 (View view) {
        switch (view.getId()) {

            case R.id.btnEnlaceU401:
                Intent intentU401 = new Intent(this, enlaceU4_01.class);
                startActivity(intentU401);
                break;

            case R.id.btnEnlaceU402:
                Intent intentU402 = new Intent(this, enlaceU4_02.class);
                startActivity(intentU402);
                break;

            case R.id.btnEnlaceU403:
                Intent intentU403 = new Intent(this, enlaceU4_03.class);
                startActivity(intentU403);
                break;

            case R.id.btnEnlaceU404:
                Intent intentU404 = new Intent(this, enlaceU4_04.class);
                startActivity(intentU404);
                break;

            case R.id.btnEnlaceU405:
                Intent intentU405 = new Intent(this, enlaceU4_05.class);
                startActivity(intentU405);
                break;

            case R.id.btnEnlaceU406:
                Intent intentU406 = new Intent(this, enlaceU4_06.class);
                startActivity(intentU406);
                break;

            case R.id.btnEnlaceU407:
                Intent intentU407 = new Intent(this, enlaceU4_07.class);
                startActivity(intentU407);
                break;

            case R.id.btnEnlaceU408:
                Intent intentU408 = new Intent(this, enlaceU4_08.class);
                startActivity(intentU408);
                break;

            case R.id.btnEnlaceU409:
                Intent intentU409 = new Intent(this, enlaceU4_09.class);
                startActivity(intentU409);
                break;

            case R.id.btnEnlaceU410:
                Intent intentU410 = new Intent(this, enlaceU4_10.class);
                startActivity(intentU410);
                break;

            case R.id.btnEnlaceU411:
                Intent intentU411 = new Intent(this, enlaceU4_11.class);
                startActivity(intentU411);
                break;

            case R.id.btnEnlaceU412:
                Intent intentU412 = new Intent(this, enlaceU4_12.class);
                startActivity(intentU412);
                break;
        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_Enlace01 = Ima_Enlace04.getDrawable();
        ((Animatable) drawableIma_Enlace01).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
