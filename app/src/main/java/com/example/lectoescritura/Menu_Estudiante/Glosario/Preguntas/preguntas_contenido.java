package com.example.lectoescritura.Menu_Estudiante.Glosario.Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class preguntas_contenido extends AppCompatActivity {
    private ImageView Comoesta, Cual, Cuando, Cuantocuesta, Donde, Paraque, Porque, Queesesto,
            Quehace, Quehoraes, Quemecuentas, Quepaso, Quetal;
    private ImageButton ComoestaStop, CualStop, CuandoStop, CuantocuestaStop, DondeStop,
            ParaqueStop, PorqueStop, QueesestoStop, QuehaceStop, QuehoraesStop, QuemecuentasStop,
            QuepasoStop, QuetalStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Comoesta = (ImageView)findViewById(R.id.ImaComoesta);
        Cual = (ImageView)findViewById(R.id.ImaCual);
        Cuando = (ImageView)findViewById(R.id.ImaCuando);
        Cuantocuesta = (ImageView)findViewById(R.id.ImaCuantocuesta);
        Donde = (ImageView)findViewById(R.id.ImaDonde);
        Paraque = (ImageView)findViewById(R.id.ImaParaque);
        Porque = (ImageView)findViewById(R.id.ImaPorque);
        Queesesto = (ImageView)findViewById(R.id.ImaQueesesto);
        Quehace = (ImageView)findViewById(R.id.ImaQuehace);
        Quehoraes = (ImageView)findViewById(R.id.ImaQuehoraes);
        Quemecuentas = (ImageView)findViewById(R.id.ImaQuemecuentas);
        Quepaso = (ImageView)findViewById(R.id.ImaQuepaso);
        Quetal = (ImageView)findViewById(R.id.ImaQuetal);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        ComoestaStop = (ImageButton) findViewById(R.id.btnComoestaStop);
        ComoestaStop.setEnabled(false);
        CualStop = (ImageButton) findViewById(R.id.btnCualStop);
        CualStop.setEnabled(false);
        CuandoStop = (ImageButton) findViewById(R.id.btnCuandoStop);
        CuandoStop.setEnabled(false);
        CuantocuestaStop = (ImageButton) findViewById(R.id.btnCuantocuestaStop);
        CuantocuestaStop.setEnabled(false);
        DondeStop = (ImageButton) findViewById(R.id.btnDondeStop);
        DondeStop.setEnabled(false);
        ParaqueStop = (ImageButton) findViewById(R.id.btnParaqueStop);
        ParaqueStop.setEnabled(false);
        PorqueStop = (ImageButton) findViewById(R.id.btnPorqueStop);
        PorqueStop.setEnabled(false);
        QueesestoStop = (ImageButton) findViewById(R.id.btnQueesestoStop);
        QueesestoStop.setEnabled(false);
        QuehaceStop = (ImageButton) findViewById(R.id.btnQuehaceStop);
        QuehaceStop.setEnabled(false);
        QuehoraesStop = (ImageButton) findViewById(R.id.btnQuehoraesStop);
        QuehoraesStop.setEnabled(false);
        QuemecuentasStop = (ImageButton) findViewById(R.id.btnQuemecuentasStop);
        QuemecuentasStop.setEnabled(false);
        QuepasoStop = (ImageButton) findViewById(R.id.btnQuepasoStop);
        QuepasoStop.setEnabled(false);
        QuetalStop = (ImageButton) findViewById(R.id.btnQuetalStop);
        QuetalStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE COMOESTA A PORQUE MULTIMEDIA ---------------------------------------------------------------------------
    public void preguntas_seleccionar1 (View view) {
        switch (view.getId()) {

            case R.id.btnComoestaPlay:
                ComoestaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_comoesta).into(Comoesta);
                break;
            case R.id.btnComoestaStop:
                Drawable drawableComoesta = Comoesta.getDrawable();
                ((Animatable) drawableComoesta).stop();
                break;

            case R.id.btnCualPlay:
                CualStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_cual).into(Cual);
                break;
            case R.id.btnCualStop:
                Drawable drawableCual = Cual.getDrawable();
                ((Animatable) drawableCual).stop();
                break;

            case R.id.btnCuandoPlay:
                CuandoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_cuando).into(Cuando);
                break;
            case R.id.btnCuandoStop:
                Drawable drawableCuando = Cuando.getDrawable();
                ((Animatable) drawableCuando).stop();
                break;

            case R.id.btnCuantocuestaPlay:
                CuantocuestaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_cuantocuesta).into(Cuantocuesta);
                break;
            case R.id.btnCuantocuestaStop:
                Drawable drawableCuantocuesta = Cuantocuesta.getDrawable();
                ((Animatable) drawableCuantocuesta).stop();
                break;

            case R.id.btnDondePlay:
                DondeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_donde).into(Donde);
                break;
            case R.id.btnDondeStop:
                Drawable drawableDonde = Donde.getDrawable();
                ((Animatable) drawableDonde).stop();
                break;

            case R.id.btnParaquePlay:
                ParaqueStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_paraque).into(Paraque);
                break;
            case R.id.btnParaqueStop:
                Drawable drawableParaque = Paraque.getDrawable();
                ((Animatable) drawableParaque).stop();
                break;

            case R.id.btnPorquePlay:
                PorqueStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_porque).into(Porque);
                break;
            case R.id.btnPorqueStop:
                Drawable drawablePorque = Porque.getDrawable();
                ((Animatable) drawablePorque).stop();
                break;
        }
    }
    // DE COMOESTA A PORQUE MULTIMEDIA ---------------------------------------------------------------------------

    // DE QUEESESTO A QUETAL MULTIMEDIA --------------------------------------------------------------------------
    public void preguntas_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnQueesestoPlay:
                QueesestoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_queesesto).into(Queesesto);
                break;
            case R.id.btnQueesestoStop:
                Drawable drawableQueesesto = Queesesto.getDrawable();
                ((Animatable) drawableQueesesto).stop();
                break;

            case R.id.btnQuehacePlay:
                QuehaceStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_quehace).into(Quehace);
                break;
            case R.id.btnQuehaceStop:
                Drawable drawableQuehace = Quehace.getDrawable();
                ((Animatable) drawableQuehace).stop();
                break;

            case R.id.btnQuehoraesPlay:
                QuehoraesStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_quehoraes).into(Quehoraes);
                break;
            case R.id.btnQuehoraesStop:
                Drawable drawableQuehoraes = Quehoraes.getDrawable();
                ((Animatable) drawableQuehoraes).stop();
                break;

            case R.id.btnQuemecuentasPlay:
                QuemecuentasStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_quemecuentas).into(Quemecuentas);
                break;
            case R.id.btnQuemecuentasStop:
                Drawable drawableQuemecuentas = Quemecuentas.getDrawable();
                ((Animatable) drawableQuemecuentas).stop();
                break;

            case R.id.btnQuepasoPlay:
                QuepasoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_quepaso).into(Quepaso);
                break;
            case R.id.btnQuepasoStop:
                Drawable drawableQuepaso = Quepaso.getDrawable();
                ((Animatable) drawableQuepaso).stop();
                break;

            case R.id.btnQuetalPlay:
                QuetalStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.preguntas_quetal).into(Quetal);
                break;
            case R.id.btnQuetalStop:
                Drawable drawableQuetal = Quetal.getDrawable();
                ((Animatable) drawableQuetal).stop();
                break;
        }
    }
    // DE QUEESESTO A QUETAL MULTIMEDIA --------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
