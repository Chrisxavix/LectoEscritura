package com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido;

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

public class unidad_mcontenido extends AppCompatActivity {
    private ImageView Ima_contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad_mcontenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_contenido = (ImageView)findViewById(R.id.ImaContenidoGif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.contenido_gif).into(Ima_contenido);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

    }

    public void opcion_contenido (View view) {
        switch (view.getId()) {

            case R.id.btnMayuscula:
                Intent intentMayuscula = new Intent(this, Mayuscula.class);
                startActivity(intentMayuscula);
                break;

            case R.id.btnTildes:
                Intent intentTildes = new Intent(this, Tilde.class);
                startActivity(intentTildes);
                break;

            case R.id.btnPronombres:
                Intent intentPronombres = new Intent(this, Pronombres.class);
                startActivity(intentPronombres);
                break;

            case R.id.btnArticulos:
                Intent intentArticulos = new Intent(this, Articulo.class);
                startActivity(intentArticulos);
                break;

            case R.id.btnAdjetivos:
                Intent intentAdjetivos = new Intent(this, Adjetivo.class);
                startActivity(intentAdjetivos);
                break;

            case R.id.btnVerbos:
                Intent intentVerbos = new Intent(this, Verbo.class);
                startActivity(intentVerbos);
                break;

            case R.id.btnSujetoPredicado:
                Intent intentSujetoPredicado = new Intent(this, SujetoPredicado.class);
                startActivity(intentSujetoPredicado);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_contenido = Ima_contenido.getDrawable();
        ((Animatable) drawableIma_contenido).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
