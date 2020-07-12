package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_01;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_02;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_03;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_04;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_05;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_06;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2.enlaceU2_07;
import com.example.lectoescritura.R;

public class enlace_menu_unidad3 extends AppCompatActivity {
    private ImageView Ima_Enlace03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_menu_unidad3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_Enlace03 = (ImageView)findViewById(R.id.ImaEnlaceGif03);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.enlace_03_gif).into(Ima_Enlace03);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_enlaceU3 (View view) {
        switch (view.getId()) {

            case R.id.btnEnlaceU301:
                Intent intentU301 = new Intent(this, enlaceU3_01.class);
                startActivity(intentU301);
                break;

            case R.id.btnEnlaceU302:
                Intent intentU302 = new Intent(this, enlaceU3_02.class);
                startActivity(intentU302);
                break;

            case R.id.btnEnlaceU303:
                Intent intentU303 = new Intent(this, enlaceU3_03.class);
                startActivity(intentU303);
                break;

            case R.id.btnEnlaceU304:
                Intent intentU304 = new Intent(this, enlaceU3_04.class);
                startActivity(intentU304);
                break;

            case R.id.btnEnlaceU305:
                Intent intentU305 = new Intent(this, enlaceU3_05.class);
                startActivity(intentU305);
                break;

            case R.id.btnEnlaceU306:
                Intent intentU306 = new Intent(this, enlaceU3_06.class);
                startActivity(intentU306);
                break;

            case R.id.btnEnlaceU307:
                Intent intentU307 = new Intent(this, enlaceU3_07.class);
                startActivity(intentU307);
                break;

            case R.id.btnEnlaceU308:
                Intent intentU308 = new Intent(this, enlaceU3_08.class);
                startActivity(intentU308);
                break;

            case R.id.btnEnlaceU309:
                Intent intentU309 = new Intent(this, enlaceU3_09.class);
                startActivity(intentU309);
                break;
        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_Enlace01 = Ima_Enlace03.getDrawable();
        ((Animatable) drawableIma_Enlace01).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------

}
