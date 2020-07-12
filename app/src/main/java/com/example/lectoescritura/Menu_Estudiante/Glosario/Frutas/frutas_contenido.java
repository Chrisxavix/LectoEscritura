package com.example.lectoescritura.Menu_Estudiante.Glosario.Frutas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class frutas_contenido extends AppCompatActivity {
    private ImageView Capuli, Cereza, Chirimoya, Ciruela, Coco, Durazno, Granadilla, Higo, Limon,
            Mandarina, Mango, Manzana, Maracuya, Melon, Naranja, Orito, Pera, Sandia, Tomate, Toronja, Uva;
    private ImageButton CapuliStop, CerezaStop, ChirimoyaStop, CiruelaStop, CocoStop, DuraznoStop,
            GranadillaStop, HigoStop, LimonStop, MandarinaStop, MangoStop, ManzanaStop, MaracuyaStop,
            MelonStop, NaranjaStop, OritoStop, PeraStop, SandiaStop, TomateStop, ToronjaStop, UvaStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Capuli = (ImageView)findViewById(R.id.ImaCapuli);
        Cereza = (ImageView)findViewById(R.id.ImaCereza);
        Chirimoya = (ImageView)findViewById(R.id.ImaChirimoya);
        Ciruela = (ImageView)findViewById(R.id.ImaCiruela);
        Coco = (ImageView)findViewById(R.id.ImaCoco);
        Durazno = (ImageView)findViewById(R.id.ImaDurazno);
        Granadilla = (ImageView)findViewById(R.id.ImaGranadilla);
        Higo = (ImageView)findViewById(R.id.ImaHigo);
        Limon = (ImageView)findViewById(R.id.ImaLimon);
        Mandarina = (ImageView)findViewById(R.id.ImaMandarina);
        Mango = (ImageView)findViewById(R.id.ImaMango);
        Manzana = (ImageView)findViewById(R.id.ImaManzana);
        Maracuya = (ImageView)findViewById(R.id.ImaMaracuya);
        Melon = (ImageView)findViewById(R.id.ImaMelon);
        Naranja = (ImageView)findViewById(R.id.ImaNaranja);
        Orito = (ImageView)findViewById(R.id.ImaOrito);
        Pera = (ImageView)findViewById(R.id.ImaPera);
        Sandia = (ImageView)findViewById(R.id.ImaSandia);
        Tomate = (ImageView)findViewById(R.id.ImaTomate);
        Toronja = (ImageView)findViewById(R.id.ImaToronja);
        Uva = (ImageView)findViewById(R.id.ImaUva);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        CapuliStop = (ImageButton) findViewById(R.id.btnCapuliStop);
        CapuliStop.setEnabled(false);
        CerezaStop = (ImageButton) findViewById(R.id.btnCerezaStop);
        CerezaStop.setEnabled(false);
        ChirimoyaStop = (ImageButton) findViewById(R.id.btnChirimoyaStop);
        ChirimoyaStop.setEnabled(false);
        CiruelaStop = (ImageButton) findViewById(R.id.btnCiruelaStop);
        CiruelaStop.setEnabled(false);
        CocoStop = (ImageButton) findViewById(R.id.btnCocoStop);
        CocoStop.setEnabled(false);
        DuraznoStop = (ImageButton) findViewById(R.id.btnDuraznoStop);
        DuraznoStop.setEnabled(false);
        GranadillaStop = (ImageButton) findViewById(R.id.btnGranadillaStop);
        GranadillaStop.setEnabled(false);
        HigoStop = (ImageButton) findViewById(R.id.btnHigoStop);
        HigoStop.setEnabled(false);
        LimonStop = (ImageButton) findViewById(R.id.btnLimonStop);
        LimonStop.setEnabled(false);
        MandarinaStop = (ImageButton) findViewById(R.id.btnMandarinaStop);
        MandarinaStop.setEnabled(false);
        MangoStop = (ImageButton) findViewById(R.id.btnMangoStop);
        MangoStop.setEnabled(false);
        ManzanaStop = (ImageButton) findViewById(R.id.btnManzanaStop);
        ManzanaStop.setEnabled(false);
        MaracuyaStop = (ImageButton) findViewById(R.id.btnMaracuyaStop);
        MaracuyaStop.setEnabled(false);
        MelonStop = (ImageButton) findViewById(R.id.btnMelonStop);
        MelonStop.setEnabled(false);
        NaranjaStop = (ImageButton) findViewById(R.id.btnNaranjaStop);
        NaranjaStop.setEnabled(false);
        OritoStop = (ImageButton) findViewById(R.id.btnOritoStop);
        OritoStop.setEnabled(false);
        PeraStop = (ImageButton) findViewById(R.id.btnPeraStop);
        PeraStop.setEnabled(false);
        SandiaStop = (ImageButton) findViewById(R.id.btnSandiaStop);
        SandiaStop.setEnabled(false);
        TomateStop = (ImageButton) findViewById(R.id.btnTomateStop);
        TomateStop.setEnabled(false);
        ToronjaStop = (ImageButton) findViewById(R.id.btnToronjaStop);
        ToronjaStop.setEnabled(false);
        UvaStop = (ImageButton) findViewById(R.id.btnUvaStop);
        UvaStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE CAPULI A GRANADILLA MULTIMEDIA -------------------------------------------------------------------------
    public void frutas_seleccionar1 (View view) {
        switch (view.getId()) {

            case R.id.btnCapuliPlay:
                CapuliStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_capuli).into(Capuli);
                break;
            case R.id.btnCapuliStop:
                Drawable drawableCapuli = Capuli.getDrawable();
                ((Animatable) drawableCapuli).stop();
                break;

            case R.id.btnCerezaPlay:
                CerezaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_cereza).into(Cereza);
                break;
            case R.id.btnCerezaStop:
                Drawable drawableCereza = Cereza.getDrawable();
                ((Animatable) drawableCereza).stop();
                break;

            case R.id.btnChirimoyaPlay:
                ChirimoyaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_chirimoya).into(Chirimoya);
                break;
            case R.id.btnChirimoyaStop:
                Drawable drawableChirimoya = Chirimoya.getDrawable();
                ((Animatable) drawableChirimoya).stop();
                break;

            case R.id.btnCiruelaPlay:
                CiruelaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_ciruela).into(Ciruela);
                break;
            case R.id.btnCiruelaStop:
                Drawable drawableCiruela = Ciruela.getDrawable();
                ((Animatable) drawableCiruela).stop();
                break;

            case R.id.btnCocoPlay:
                CocoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_coco).into(Coco);
                break;
            case R.id.btnCocoStop:
                Drawable drawableCoco = Coco.getDrawable();
                ((Animatable) drawableCoco).stop();
                break;

            case R.id.btnDuraznoPlay:
                DuraznoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_durazno).into(Durazno);
                break;
            case R.id.btnDuraznoStop:
                Drawable drawableDurazno = Durazno.getDrawable();
                ((Animatable) drawableDurazno).stop();
                break;

            case R.id.btnGranadillaPlay:
                GranadillaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_granadilla).into(Granadilla);
                break;
            case R.id.btnGranadillaStop:
                Drawable drawableGranadilla = Granadilla.getDrawable();
                ((Animatable) drawableGranadilla).stop();
                break;
        }
    }
    // DE CAPULI A GRANADILLA MULTIMEDIA -------------------------------------------------------------------------

    // DE HIGO A MELON MULTIMEDIA --------------------------------------------------------------------------------
    public void frutas_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnHigoPlay:
                HigoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_higo).into(Higo);
                break;
            case R.id.btnHigoStop:
                Drawable drawableHigo = Higo.getDrawable();
                ((Animatable) drawableHigo).stop();
                break;

            case R.id.btnLimonPlay:
                LimonStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_limon).into(Limon);
                break;
            case R.id.btnLimonStop:
                Drawable drawableLimon = Limon.getDrawable();
                ((Animatable) drawableLimon).stop();
                break;

            case R.id.btnMandarinaPlay:
                MandarinaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_mandarina).into(Mandarina);
                break;
            case R.id.btnMandarinaStop:
                Drawable drawableMandarina = Mandarina.getDrawable();
                ((Animatable) drawableMandarina).stop();
                break;

            case R.id.btnMangoPlay:
                MangoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_mango).into(Mango);
                break;
            case R.id.btnMangoStop:
                Drawable drawableMango = Mango.getDrawable();
                ((Animatable) drawableMango).stop();
                break;

            case R.id.btnManzanaPlay:
                ManzanaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_manzana).into(Manzana);
                break;
            case R.id.btnManzanaStop:
                Drawable drawableManzana = Manzana.getDrawable();
                ((Animatable) drawableManzana).stop();
                break;

            case R.id.btnMaracuyaPlay:
                MaracuyaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_maracuya).into(Maracuya);
                break;
            case R.id.btnMaracuyaStop:
                Drawable drawableMaracuya = Maracuya.getDrawable();
                ((Animatable) drawableMaracuya).stop();
                break;

            case R.id.btnMelonPlay:
                MelonStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_melon).into(Melon);
                break;
            case R.id.btnMelonStop:
                Drawable drawableMelon = Melon.getDrawable();
                ((Animatable) drawableMelon).stop();
                break;
        }
    }
    // DE HIGO A MELON MULTIMEDIA --------------------------------------------------------------------------------

    // DE NARANJA A UVA MULTIMEDIA -------------------------------------------------------------------------------
    public void frutas_seleccionar3 (View view) {
        switch (view.getId()) {

            case R.id.btnNaranjaPlay:
                NaranjaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_naranja).into(Naranja);
                break;
            case R.id.btnNaranjaStop:
                Drawable drawableNaranja = Naranja.getDrawable();
                ((Animatable) drawableNaranja).stop();
                break;

            case R.id.btnOritoPlay:
                OritoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_orito).into(Orito);
                break;
            case R.id.btnOritoStop:
                Drawable drawableOrito = Orito.getDrawable();
                ((Animatable) drawableOrito).stop();
                break;

            case R.id.btnPeraPlay:
                PeraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_pera).into(Pera);
                break;
            case R.id.btnPeraStop:
                Drawable drawablePera = Pera.getDrawable();
                ((Animatable) drawablePera).stop();
                break;

            case R.id.btnSandiaPlay:
                SandiaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_sandia).into(Sandia);
                break;
            case R.id.btnSandiaStop:
                Drawable drawableSandia = Sandia.getDrawable();
                ((Animatable) drawableSandia).stop();
                break;

            case R.id.btnTomatePlay:
                TomateStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_tomate).into(Tomate);
                break;
            case R.id.btnTomateStop:
                Drawable drawableTomate = Tomate.getDrawable();
                ((Animatable) drawableTomate).stop();
                break;

            case R.id.btnToronjaPlay:
                ToronjaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_toronja).into(Toronja);
                break;
            case R.id.btnToronjaStop:
                Drawable drawableToronja = Toronja.getDrawable();
                ((Animatable) drawableToronja).stop();
                break;

            case R.id.btnUvaPlay:
                UvaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.frutas_uva).into(Uva);
                break;
            case R.id.btnUvaStop:
                Drawable drawableUva = Uva.getDrawable();
                ((Animatable) drawableUva).stop();
                break;
        }
    }
    // DE NARANJA A UVA MULTIMEDIA -------------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
