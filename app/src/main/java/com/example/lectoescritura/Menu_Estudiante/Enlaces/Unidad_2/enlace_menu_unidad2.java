package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_01;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_02;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_03;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_04;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_05;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_06;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_07;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_08;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_09;
import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_10;
import com.example.lectoescritura.R;

public class enlace_menu_unidad2 extends AppCompatActivity {
    private ImageView Ima_Enlace02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_menu_unidad2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_Enlace02 = (ImageView)findViewById(R.id.ImaEnlaceGif02);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.enlace_01_gif).into(Ima_Enlace02);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_enlaceU2 (View view) {
        switch (view.getId()) {

            case R.id.btnEnlaceU201:
                Intent intentU201 = new Intent(this, enlaceU2_01.class);
                startActivity(intentU201);
                break;

            case R.id.btnEnlaceU202:
                Intent intentU202 = new Intent(this, enlaceU2_02.class);
                startActivity(intentU202);
                break;

            case R.id.btnEnlaceU203:
                Intent intentU203 = new Intent(this, enlaceU2_03.class);
                startActivity(intentU203);
                break;

            case R.id.btnEnlaceU204:
                Intent intentU204 = new Intent(this, enlaceU2_04.class);
                startActivity(intentU204);
                break;

            case R.id.btnEnlaceU205:
                Intent intentU205 = new Intent(this, enlaceU2_05.class);
                startActivity(intentU205);
                break;

            case R.id.btnEnlaceU206:
                Intent intentU206 = new Intent(this, enlaceU2_06.class);
                startActivity(intentU206);
                break;

            case R.id.btnEnlaceU207:
                Intent intentU207 = new Intent(this, enlaceU2_07.class);
                startActivity(intentU207);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_Enlace01 = Ima_Enlace02.getDrawable();
        ((Animatable) drawableIma_Enlace01).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
