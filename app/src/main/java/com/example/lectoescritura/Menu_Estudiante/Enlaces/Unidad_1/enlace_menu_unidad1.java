package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class enlace_menu_unidad1 extends AppCompatActivity {
    private ImageView Ima_Enlace01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_menu_unidad1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_Enlace01 = (ImageView)findViewById(R.id.ImaEnlaceGif01);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.enlace_02_gif).into(Ima_Enlace01);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_enlaceU1 (View view) {
        switch (view.getId()) {

            case R.id.btnEnlaceU101:
                Intent intentU101 = new Intent(this, enlaceU1_01.class);
                startActivity(intentU101);
                break;

            case R.id.btnEnlaceU102:
                Intent intentU102 = new Intent(this, enlaceU1_02.class);
                startActivity(intentU102);
                break;

            case R.id.btnEnlaceU103:
                Intent intentU103 = new Intent(this, enlaceU1_03.class);
                startActivity(intentU103);
                break;

            case R.id.btnEnlaceU104:
                Intent intentU104 = new Intent(this, enlaceU1_04.class);
                startActivity(intentU104);
                break;

            case R.id.btnEnlaceU105:
                Intent intentU105 = new Intent(this, enlaceU1_05.class);
                startActivity(intentU105);
                break;

            case R.id.btnEnlaceU106:
                Intent intentU106 = new Intent(this, enlaceU1_06.class);
                startActivity(intentU106);
                break;

            case R.id.btnEnlaceU107:
                Intent intentU107 = new Intent(this, enlaceU1_07.class);
                startActivity(intentU107);
                break;

            case R.id.btnEnlaceU108:
                Intent intentU108 = new Intent(this, enlaceU1_08.class);
                startActivity(intentU108);
                break;

            case R.id.btnEnlaceU109:
                Intent intentU109 = new Intent(this, enlaceU1_09.class);
                startActivity(intentU109);
                break;

            case R.id.btnEnlaceU110:
                Intent intentU110 = new Intent(this, enlaceU1_10.class);
                startActivity(intentU110);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_Enlace01 = Ima_Enlace01.getDrawable();
        ((Animatable) drawableIma_Enlace01).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------

}
