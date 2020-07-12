package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad2;

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

public class unidad_munidad2 extends AppCompatActivity {
    private ImageView Ima_unidad2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad_munidad2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_unidad2 = (ImageView)findViewById(R.id.ImaUnidad2Gif);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.unida2_gif).into(Ima_unidad2);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    public void opcion_unidad2 (View view) {
        switch (view.getId()) {

            case R.id.btnUni2Lite1:
                Intent intentUni2Lite1 = new Intent(this, Uni2Lite1.class);
                startActivity(intentUni2Lite1);
                break;

            case R.id.btnUni2Lite2:
                Intent intentUni2Lite2 = new Intent(this, Uni2Lite2.class);
                startActivity(intentUni2Lite2);
                break;

            case R.id.btnUni2Lite3:
                Intent intentUni2Lite3 = new Intent(this, Uni2Lite3.class);
                startActivity(intentUni2Lite3);
                break;

            case R.id.btnUni2Lite4:
                Intent intentUni2Lite4 = new Intent(this, Uni2Lite4.class);
                startActivity(intentUni2Lite4);
                break;

            case R.id.btnUni2Lite5:
                Intent intentUni2Lite5 = new Intent(this, Uni2Lite5.class);
                startActivity(intentUni2Lite5);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_unidad2 = Ima_unidad2.getDrawable();
        ((Animatable) drawableIma_unidad2).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
