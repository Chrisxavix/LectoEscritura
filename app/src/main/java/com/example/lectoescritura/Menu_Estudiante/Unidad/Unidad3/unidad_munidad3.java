package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite1;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite2;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite3;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite4;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite5;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.Uni1Lite6;
import com.example.lectoescritura.R;

public class unidad_munidad3 extends AppCompatActivity {
    private ImageView Ima_unidad3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad_munidad3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_unidad3 = (ImageView)findViewById(R.id.ImaUnidad3Gif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.unidad3_gif).into(Ima_unidad3);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_unidad3 (View view) {
        switch (view.getId()) {

            case R.id.btnUni3Lite1:
                Intent intentUni3Lite1 = new Intent(this, Uni3Lite1.class);
                startActivity(intentUni3Lite1);
                break;

            case R.id.btnUni3Lite2:
                Intent intentUni3Lite2 = new Intent(this, Uni3Lite2.class);
                startActivity(intentUni3Lite2);
                break;

            case R.id.btnUni3Lite3:
                Intent intentUni3Lite3 = new Intent(this, Uni3Lite3.class);
                startActivity(intentUni3Lite3);
                break;

            case R.id.btnUni3Lite4:
                Intent intentUni3Lite4 = new Intent(this, Uni3Lite4.class);
                startActivity(intentUni3Lite4);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_unidad3 = Ima_unidad3.getDrawable();
        ((Animatable) drawableIma_unidad3).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
