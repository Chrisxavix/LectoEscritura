package com.example.lectoescritura.Menu_Estudiante.Glosario.Familia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class familia_contenido extends AppCompatActivity {
    private ImageView Abuelo, Ahijado, Bebe, Bisabuelo, Bisnieto, Cunado, Esposo, Hermana, Hermanastro,
            Hermano, Hijastro, Hijo, Madrastra, Mama, Nieto, Nuera, Padrastro, Papa, Primo,
            Sobrino, Suegro, Tio, Yerno;
    private ImageButton AbueloStop, AhijadoStop, BebeStop, BisabueloStop, BisnietoStop, CunadoStop,
            EsposoStop, HermanaStop, HermanastroStop, HermanoStop, HijastroStop, HijoStop,
            MadrastraStop, MamaStop, NietoStop, NueraStop, PadrastroStop, PapaStop, PrimoStop,
            SobrinoStop, SuegroStop, TioStop, YernoStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Abuelo = (ImageView)findViewById(R.id.ImaAbuelo);
        Ahijado = (ImageView)findViewById(R.id.ImaAhijado);
        Bebe = (ImageView)findViewById(R.id.ImaBebe);
        Bisabuelo = (ImageView)findViewById(R.id.ImaBisabuelo);
        Bisnieto = (ImageView)findViewById(R.id.ImaBisnieto);
        Cunado = (ImageView)findViewById(R.id.ImaCunado);
        Esposo = (ImageView)findViewById(R.id.ImaEsposo);
        Hermana = (ImageView)findViewById(R.id.ImaHermana);
        Hermanastro = (ImageView)findViewById(R.id.ImaHermanastro);
        Hermano = (ImageView)findViewById(R.id.ImaHermano);
        Hijastro = (ImageView)findViewById(R.id.ImaHijastro);
        Hijo = (ImageView)findViewById(R.id.ImaHijo);
        Madrastra = (ImageView)findViewById(R.id.ImaMadrastra);
        Mama = (ImageView)findViewById(R.id.ImaMama);
        Nieto = (ImageView)findViewById(R.id.ImaNieto);
        Nuera = (ImageView)findViewById(R.id.ImaNuera);
        Padrastro = (ImageView)findViewById(R.id.ImaPadrastro);
        Papa = (ImageView)findViewById(R.id.ImaPapa);
        Primo = (ImageView)findViewById(R.id.ImaPrimo);
        Sobrino = (ImageView)findViewById(R.id.ImaSobrino);
        Suegro = (ImageView)findViewById(R.id.ImaSuegro);
        Tio = (ImageView)findViewById(R.id.ImaTio);
        Yerno = (ImageView)findViewById(R.id.ImaYerno);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        AbueloStop = (ImageButton) findViewById(R.id.btnAbueloStop);
        AbueloStop.setEnabled(false);
        AhijadoStop = (ImageButton) findViewById(R.id.btnAhijadoStop);
        AhijadoStop.setEnabled(false);
        BebeStop = (ImageButton) findViewById(R.id.btnBebeStop);
        BebeStop.setEnabled(false);
        BisabueloStop = (ImageButton) findViewById(R.id.btnBisabueloStop);
        BisabueloStop.setEnabled(false);
        BisnietoStop = (ImageButton) findViewById(R.id.btnBisnietoStop);
        BisnietoStop.setEnabled(false);
        CunadoStop = (ImageButton) findViewById(R.id.btnCunadoStop);
        CunadoStop.setEnabled(false);
        EsposoStop = (ImageButton) findViewById(R.id.btnEsposoStop);
        EsposoStop.setEnabled(false);
        HermanaStop = (ImageButton) findViewById(R.id.btnHermanaStop);
        HermanaStop.setEnabled(false);
        HermanastroStop = (ImageButton) findViewById(R.id.btnHermanastroStop);
        HermanastroStop.setEnabled(false);
        HermanoStop = (ImageButton) findViewById(R.id.btnHermanoStop);
        HermanoStop.setEnabled(false);
        HijastroStop = (ImageButton) findViewById(R.id.btnHijastroStop);
        HijastroStop.setEnabled(false);
        HijoStop = (ImageButton) findViewById(R.id.btnHijoStop);
        HijoStop.setEnabled(false);
        MadrastraStop = (ImageButton) findViewById(R.id.btnMadrastraStop);
        MadrastraStop.setEnabled(false);
        MamaStop = (ImageButton) findViewById(R.id.btnMamaStop);
        MamaStop.setEnabled(false);
        NietoStop = (ImageButton) findViewById(R.id.btnNietoStop);
        NietoStop.setEnabled(false);
        NueraStop = (ImageButton) findViewById(R.id.btnNueraStop);
        NueraStop.setEnabled(false);
        PadrastroStop = (ImageButton) findViewById(R.id.btnPadrastroStop);
        PadrastroStop.setEnabled(false);
        PapaStop = (ImageButton) findViewById(R.id.btnPapaStop);
        PapaStop.setEnabled(false);
        PrimoStop = (ImageButton) findViewById(R.id.btnPrimoStop);
        PrimoStop.setEnabled(false);
        SobrinoStop = (ImageButton) findViewById(R.id.btnSobrinoStop);
        SobrinoStop.setEnabled(false);
        SuegroStop = (ImageButton) findViewById(R.id.btnSuegroStop);
        SuegroStop.setEnabled(false);
        TioStop = (ImageButton) findViewById(R.id.btnTioStop);
        TioStop.setEnabled(false);
        YernoStop = (ImageButton) findViewById(R.id.btnYernoStop);
        YernoStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE ABUELO A HERMANA MULTIMEDIA ----------------------------------------------------------------------------
    public void familia_seleccionar1 (View view) {
        switch (view.getId()) {

            case R.id.btnAbueloPlay:
                AbueloStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_abuelo).into(Abuelo);
                break;
            case R.id.btnAbueloStop:
                Drawable drawableAbuelo = Abuelo.getDrawable();
                ((Animatable) drawableAbuelo).stop();
                break;

            case R.id.btnAhijadoPlay:
                AhijadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_ahijado).into(Ahijado);
                break;
            case R.id.btnAhijadoStop:
                Drawable drawableAhijado = Ahijado.getDrawable();
                ((Animatable) drawableAhijado).stop();
                break;

            case R.id.btnBebePlay:
                BebeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_bebe).into(Bebe);
                break;
            case R.id.btnBebeStop:
                Drawable drawableBebe = Bebe.getDrawable();
                ((Animatable) drawableBebe).stop();
                break;

            case R.id.btnBisabueloPlay:
                BisabueloStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_bisabuelo).into(Bisabuelo);
                break;
            case R.id.btnBisabueloStop:
                Drawable drawableBisabuelo = Bisabuelo.getDrawable();
                ((Animatable) drawableBisabuelo).stop();
                break;

            case R.id.btnBisnietoPlay:
                BisnietoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_bisnieto).into(Bisnieto);
                break;
            case R.id.btnBisnietoStop:
                Drawable drawableBisnieto = Bisnieto.getDrawable();
                ((Animatable) drawableBisnieto).stop();
                break;

            case R.id.btnCunadoPlay:
                CunadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_cunado).into(Cunado);
                break;
            case R.id.btnCunadoStop:
                Drawable drawableCunado = Cunado.getDrawable();
                ((Animatable) drawableCunado).stop();
                break;

            case R.id.btnEsposoPlay:
                EsposoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_esposo).into(Esposo);
                break;
            case R.id.btnEsposoStop:
                Drawable drawableEsposo = Esposo.getDrawable();
                ((Animatable) drawableEsposo).stop();
                break;

            case R.id.btnHermanaPlay:
                HermanaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_hermana).into(Hermana);
                break;
            case R.id.btnHermanaStop:
                Drawable drawableHermana = Hermana.getDrawable();
                ((Animatable) drawableHermana).stop();
                break;
        }
    }
    // DE ABUELO A HERMANA MULTIMEDIA ----------------------------------------------------------------------------

    // DE HERMANASTRO A NUERA MULTIMEDIA -------------------------------------------------------------------------
    public void familia_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnHermanastroPlay:
                HermanastroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_hermanastro).into(Hermanastro);
                break;
            case R.id.btnHermanastroStop:
                Drawable drawableHermanastro = Hermanastro.getDrawable();
                ((Animatable) drawableHermanastro).stop();
                break;

            case R.id.btnHermanoPlay:
                HermanoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_hermano).into(Hermano);
                break;
            case R.id.btnHermanoStop:
                Drawable drawableHermano = Hermano.getDrawable();
                ((Animatable) drawableHermano).stop();
                break;

            case R.id.btnHijastroPlay:
                HijastroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_hijastro).into(Hijastro);
                break;
            case R.id.btnHijastroStop:
                Drawable drawableHijastro = Hijastro.getDrawable();
                ((Animatable) drawableHijastro).stop();
                break;

            case R.id.btnHijoPlay:
                HijoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_hijo).into(Hijo);
                break;
            case R.id.btnHijoStop:
                Drawable drawableHijo = Hijo.getDrawable();
                ((Animatable) drawableHijo).stop();
                break;

            case R.id.btnMadrastraPlay:
                MadrastraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_madrastra).into(Madrastra);
                break;
            case R.id.btnMadrastraStop:
                Drawable drawableMadrastra = Madrastra.getDrawable();
                ((Animatable) drawableMadrastra).stop();
                break;

            case R.id.btnMamaPlay:
                MamaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_mama).into(Mama);
                break;
            case R.id.btnMamaStop:
                Drawable drawableMama = Mama.getDrawable();
                ((Animatable) drawableMama).stop();
                break;

            case R.id.btnNietoPlay:
                NietoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_nieto).into(Nieto);
                break;
            case R.id.btnNietoStop:
                Drawable drawableNieto = Nieto.getDrawable();
                ((Animatable) drawableNieto).stop();
                break;

            case R.id.btnNueraPlay:
                NueraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_nuera).into(Nuera);
                break;
            case R.id.btnNueraStop:
                Drawable drawableNuera = Nuera.getDrawable();
                ((Animatable) drawableNuera).stop();
                break;
        }
    }
    // DE HERMANASTRO A NUERA MULTIMEDIA -------------------------------------------------------------------------

    // DE PADRASTRO A YERNO MULTIMEDIA ---------------------------------------------------------------------------
    public void familia_seleccionar3 (View view) {
        switch (view.getId()) {

            case R.id.btnPadrastroPlay:
                PadrastroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_padrastro).into(Padrastro);
                break;
            case R.id.btnPadrastroStop:
                Drawable drawablePadrastro = Padrastro.getDrawable();
                ((Animatable) drawablePadrastro).stop();
                break;

            case R.id.btnPapaPlay:
                PapaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_papa).into(Papa);
                break;
            case R.id.btnPapaStop:
                Drawable drawablePapa = Papa.getDrawable();
                ((Animatable) drawablePapa).stop();
                break;

            case R.id.btnPrimoPlay:
                PrimoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_primo).into(Primo);
                break;
            case R.id.btnPrimoStop:
                Drawable drawablePrimo = Primo.getDrawable();
                ((Animatable) drawablePrimo).stop();
                break;

            case R.id.btnSobrinoPlay:
                SobrinoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_sobrino).into(Sobrino);
                break;
            case R.id.btnSobrinoStop:
                Drawable drawableSobrino = Sobrino.getDrawable();
                ((Animatable) drawableSobrino).stop();
                break;

            case R.id.btnSuegroPlay:
                SuegroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_suegro).into(Suegro);
                break;
            case R.id.btnSuegroStop:
                Drawable drawableSuegro = Suegro.getDrawable();
                ((Animatable) drawableSuegro).stop();
                break;

            case R.id.btnTioPlay:
                TioStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_tio).into(Tio);
                break;
            case R.id.btnTioStop:
                Drawable drawableTio = Tio.getDrawable();
                ((Animatable) drawableTio).stop();
                break;

            case R.id.btnYernoPlay:
                YernoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.familia_yerno).into(Yerno);
                break;
            case R.id.btnYernoStop:
                Drawable drawableYerno = Yerno.getDrawable();
                ((Animatable) drawableYerno).stop();
                break;
        }
    }
    // DE PADRASTRO A YERNO MULTIMEDIA ---------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
