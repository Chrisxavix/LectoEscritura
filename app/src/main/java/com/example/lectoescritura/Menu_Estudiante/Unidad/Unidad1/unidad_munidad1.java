package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Adjetivo;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Articulo;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Mayuscula;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Pronombres;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.SujetoPredicado;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Tilde;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.Verbo;
import com.example.lectoescritura.R;

public class unidad_munidad1 extends AppCompatActivity {
    private ImageView Ima_unidad1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad_munidad1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_unidad1 = (ImageView)findViewById(R.id.ImaUnidad1Gif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.unida1_gif).into(Ima_unidad1);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_unidad1 (View view) {
        switch (view.getId()) {

            case R.id.btnUni1Lite1:
                Intent intentUni1Lite1 = new Intent(this, Uni1Lite1.class);
                startActivity(intentUni1Lite1);
                break;

            case R.id.btnUni1Lite2:
                Intent intentUni1Lite2 = new Intent(this, Uni1Lite2.class);
                startActivity(intentUni1Lite2);
                break;

            case R.id.btnUni1Lite3:
                Intent intentUni1Lite3 = new Intent(this, Uni1Lite3.class);
                startActivity(intentUni1Lite3);
                break;

            case R.id.btnUni1Lite4:
                Intent intentUni1Lite4 = new Intent(this, Uni1Lite4.class);
                startActivity(intentUni1Lite4);
                break;

            case R.id.btnUni1Lite5:
                Intent intentUni1Lite5 = new Intent(this, Uni1Lite5.class);
                startActivity(intentUni1Lite5);
                break;

            case R.id.btnUni1Lite6:
                Intent intentUni1Lite6 = new Intent(this, Uni1Lite6.class);
                startActivity(intentUni1Lite6);
                break;
        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_unidad1 = Ima_unidad1.getDrawable();
        ((Animatable) drawableIma_unidad1).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
