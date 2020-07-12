package com.example.lectoescritura.Menu_barra;

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
import com.example.lectoescritura.Menu_barra.Cuentas.Facebook;
import com.example.lectoescritura.Menu_barra.Cuentas.Instagram;
import com.example.lectoescritura.Menu_barra.Cuentas.Twitter;
import com.example.lectoescritura.R;

public class Creditos extends AppCompatActivity {
    private ImageView Ima_Face, Ima_Twitter, Ima_Insta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DE PRUEBA HASTA CONSTRUIR EL DEFINITOV------------------------------------------------------
        Ima_Face = (ImageView)findViewById(R.id.Face);
        Ima_Twitter = (ImageView)findViewById(R.id.Twitter);
        Ima_Insta = (ImageView)findViewById(R.id.Insta);

        Glide.with(getBaseContext()).load(R.drawable.barra_face).into(Ima_Face);
        Glide.with(getBaseContext()).load(R.drawable.barra_twitter).into(Ima_Twitter);
        Glide.with(getBaseContext()).load(R.drawable.barra_insta).into(Ima_Insta);
        // DE PRUEBA HASTA CONSTRUIR EL DEFINITOV------------------------------------------------------
    }

    public void opcion_redes (View view) {
        switch (view.getId()) {

            case R.id.Face:
                Intent intentFace = new Intent(this, Facebook.class);
                startActivity(intentFace);
                break;

            case R.id.Twitter:
                Intent intentTwitter = new Intent(this, Twitter.class);
                startActivity(intentTwitter);
                break;

            case R.id.Insta:
                Intent intentInsta = new Intent(this, Instagram.class);
                startActivity(intentInsta);
                break;

        }
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();

        Drawable drawableIma_Face = Ima_Face.getDrawable();
        ((Animatable) drawableIma_Face).stop();

        Drawable drawableIma_Twitter = Ima_Twitter.getDrawable();
        ((Animatable) drawableIma_Twitter).stop();

        Drawable drawableIma_Insta = Ima_Insta.getDrawable();
        ((Animatable) drawableIma_Insta).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
