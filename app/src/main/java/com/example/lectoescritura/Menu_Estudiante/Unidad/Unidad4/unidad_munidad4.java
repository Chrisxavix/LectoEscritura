package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3.Uni3Lite1;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3.Uni3Lite2;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3.Uni3Lite3;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3.Uni3Lite4;
import com.example.lectoescritura.R;

public class unidad_munidad4 extends AppCompatActivity {
    private ImageView Ima_unidad4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad_munidad4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_unidad4 = (ImageView)findViewById(R.id.ImaUnidad4Gif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.unidad4_gif).into(Ima_unidad4);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_unidad4 (View view) {
        switch (view.getId()) {

            case R.id.btnUni4Lite1:
                Intent intentUni4Lite1 = new Intent(this, Uni4Lite1.class);
                startActivity(intentUni4Lite1);
                break;

            case R.id.btnUni4Lite2:
                Intent intentUni4Lite2 = new Intent(this, Uni4Lite2.class);
                startActivity(intentUni4Lite2);
                break;

            case R.id.btnUni4Lite3:
                Intent intentUni4Lite3 = new Intent(this, Uni4Lite3.class);
                startActivity(intentUni4Lite3);
                break;

            case R.id.btnUni4Lite4:
                Intent intentUni4Lite4 = new Intent(this, Uni4Lite4.class);
                startActivity(intentUni4Lite4);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_unidad4 = Ima_unidad4.getDrawable();
        ((Animatable) drawableIma_unidad4).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
