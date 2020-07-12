package com.example.lectoescritura.Menu_Estudiante.Glosario.Animales;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class animales_contenido extends AppCompatActivity {
    private ImageView Abeja, Arana, Ballena, Burro, Caballo, Cebra, Cerdo, Condor, Conejo, Culebra,
            Cuy, Elefante, Gallina, Gallo, Gato, Jirafa, Lagartija, Leon, Lobo, Lombriz, Mariposa,
            Mono, Mosca, Oso, Oveja, Pajaro, Pato, Pavo, Perro, Pez, Raton, Sapo, Tigre, Toro,
            Tortuga, Vaca, Zancudo, Zorro;
    private ImageButton AbejaStop, AranaStop, BallenaStop, BurroStop, CaballoStop, CebraStop,
            CerdoStop, CondorStop, ConejoStop, CulebraStop, CuyStop, ElefanteStop, GallinaStop,
            GalloStop, GatoStop, JirafaStop, LagartijaStop, LeonStop, LoboStop, LombrizStop,
            MariposaStop, MonoStop, MoscaStop, OsoStop, OvejaStop, PajaroStop, PatoStop, PavoStop,
            PerroStop, PezStop, RatonStop, SapoStop, TigreStop, ToroStop, TortugaStop, VacaStop,
            ZancudoStop, ZorroStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Abeja = (ImageView)findViewById(R.id.ImaAbeja);
        Arana = (ImageView)findViewById(R.id.ImaArana);
        Ballena = (ImageView)findViewById(R.id.ImaBallena);
        Burro = (ImageView)findViewById(R.id.ImaBurro);
        Caballo = (ImageView)findViewById(R.id.ImaCaballo);
        Cebra = (ImageView)findViewById(R.id.ImaCebra);
        Cerdo = (ImageView)findViewById(R.id.ImaCerdo);
        Condor = (ImageView)findViewById(R.id.ImaCondor);
        Conejo = (ImageView)findViewById(R.id.ImaConejo);
        Culebra = (ImageView)findViewById(R.id.ImaCulebra);
        Cuy = (ImageView)findViewById(R.id.ImaCuy);
        Elefante = (ImageView)findViewById(R.id.ImaElefante);
        Gallina = (ImageView)findViewById(R.id.ImaGallina);
        Gallo = (ImageView)findViewById(R.id.ImaGallo);
        Gato = (ImageView)findViewById(R.id.ImaGato);
        Jirafa = (ImageView)findViewById(R.id.ImaJirafa);
        Lagartija = (ImageView)findViewById(R.id.ImaLagartija);
        Leon = (ImageView)findViewById(R.id.ImaLeon);
        Lobo = (ImageView)findViewById(R.id.ImaLobo);
        Lombriz = (ImageView)findViewById(R.id.ImaLombriz);
        Mariposa = (ImageView)findViewById(R.id.ImaMariposa);
        Mono = (ImageView)findViewById(R.id.ImaMono);
        Mosca = (ImageView)findViewById(R.id.ImaMosca);
        Oso = (ImageView)findViewById(R.id.ImaOso);
        Oveja = (ImageView)findViewById(R.id.ImaOveja);
        Pajaro = (ImageView)findViewById(R.id.ImaPajaro);
        Pato = (ImageView)findViewById(R.id.ImaPato);
        Pavo = (ImageView)findViewById(R.id.ImaPavo);
        Perro = (ImageView)findViewById(R.id.ImaPerro);
        Pez = (ImageView)findViewById(R.id.ImaPez);
        Raton = (ImageView)findViewById(R.id.ImaRaton);
        Sapo = (ImageView)findViewById(R.id.ImaSapo);
        Tigre = (ImageView)findViewById(R.id.ImaTigre);
        Toro = (ImageView)findViewById(R.id.ImaToro);
        Tortuga = (ImageView)findViewById(R.id.ImaTortuga);
        Vaca = (ImageView)findViewById(R.id.ImaVaca);
        Zancudo = (ImageView)findViewById(R.id.ImaZancudo);
        Zorro = (ImageView)findViewById(R.id.ImaZorro);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        AbejaStop = (ImageButton) findViewById(R.id.btnAbejaStop);
        AbejaStop.setEnabled(false);
        AranaStop = (ImageButton) findViewById(R.id.btnAranaStop);
        AranaStop.setEnabled(false);
        BallenaStop = (ImageButton) findViewById(R.id.btnBallenaStop);
        BallenaStop.setEnabled(false);
        BurroStop = (ImageButton) findViewById(R.id.btnBurroStop);
        BurroStop.setEnabled(false);
        CaballoStop = (ImageButton) findViewById(R.id.btnCaballoStop);
        CaballoStop.setEnabled(false);
        CebraStop = (ImageButton) findViewById(R.id.btnCebraStop);
        CebraStop.setEnabled(false);
        CerdoStop = (ImageButton) findViewById(R.id.btnCerdoStop);
        CerdoStop.setEnabled(false);
        CondorStop = (ImageButton) findViewById(R.id.btnCondorStop);
        CondorStop.setEnabled(false);
        ConejoStop = (ImageButton) findViewById(R.id.btnConejoStop);
        ConejoStop.setEnabled(false);
        CulebraStop = (ImageButton) findViewById(R.id.btnCulebraStop);
        CulebraStop.setEnabled(false);
        CuyStop = (ImageButton) findViewById(R.id.btnCuyStop);
        CuyStop.setEnabled(false);
        ElefanteStop = (ImageButton) findViewById(R.id.btnElefanteStop);
        ElefanteStop.setEnabled(false);
        GallinaStop = (ImageButton) findViewById(R.id.btnGallinaStop);
        GallinaStop.setEnabled(false);
        GalloStop = (ImageButton) findViewById(R.id.btnGalloStop);
        GalloStop.setEnabled(false);
        GatoStop = (ImageButton) findViewById(R.id.btnGatoStop);
        GatoStop.setEnabled(false);
        JirafaStop = (ImageButton) findViewById(R.id.btnJirafaStop);
        JirafaStop.setEnabled(false);
        LagartijaStop = (ImageButton) findViewById(R.id.btnLagartijaStop);
        LagartijaStop.setEnabled(false);
        LeonStop = (ImageButton) findViewById(R.id.btnLeonStop);
        LeonStop.setEnabled(false);
        LoboStop = (ImageButton) findViewById(R.id.btnLoboStop);
        LoboStop.setEnabled(false);
        LombrizStop = (ImageButton) findViewById(R.id.btnLombrizStop);
        LombrizStop.setEnabled(false);
        MariposaStop = (ImageButton) findViewById(R.id.btnMariposaStop);
        MariposaStop.setEnabled(false);
        MonoStop = (ImageButton) findViewById(R.id.btnMonoStop);
        MonoStop.setEnabled(false);
        MoscaStop = (ImageButton) findViewById(R.id.btnMoscaStop);
        MoscaStop.setEnabled(false);
        OsoStop = (ImageButton) findViewById(R.id.btnOsoStop);
        OsoStop.setEnabled(false);
        OvejaStop = (ImageButton) findViewById(R.id.btnOvejaStop);
        OvejaStop.setEnabled(false);
        PajaroStop = (ImageButton) findViewById(R.id.btnPajaroStop);
        PajaroStop.setEnabled(false);
        PatoStop = (ImageButton) findViewById(R.id.btnPatoStop);
        PatoStop.setEnabled(false);
        PavoStop = (ImageButton) findViewById(R.id.btnPavoStop);
        PavoStop.setEnabled(false);
        PerroStop = (ImageButton) findViewById(R.id.btnPerroStop);
        PerroStop.setEnabled(false);
        PezStop = (ImageButton) findViewById(R.id.btnPezStop);
        PezStop.setEnabled(false);
        RatonStop = (ImageButton) findViewById(R.id.btnRatonStop);
        RatonStop.setEnabled(false);
        SapoStop = (ImageButton) findViewById(R.id.btnSapoStop);
        SapoStop.setEnabled(false);
        TigreStop = (ImageButton) findViewById(R.id.btnTigreStop);
        TigreStop.setEnabled(false);
        ToroStop = (ImageButton) findViewById(R.id.btnToroStop);
        ToroStop.setEnabled(false);
        TortugaStop = (ImageButton) findViewById(R.id.btnTortugaStop);
        TortugaStop.setEnabled(false);
        VacaStop = (ImageButton) findViewById(R.id.btnVacaStop);
        VacaStop.setEnabled(false);
        ZancudoStop = (ImageButton) findViewById(R.id.btnZancudoStop);
        ZancudoStop.setEnabled(false);
        ZorroStop = (ImageButton) findViewById(R.id.btnZorroStop);
        ZorroStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE ABEJA A CEBRA MULTIMEDIA -------------------------------------------------------------------------------
    public void animales_seleccionar1 (View view) {
        switch (view.getId()) {
            case R.id.btnAbejaPlay:
                AbejaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_abeja).into(Abeja);
                break;
            case R.id.btnAbejaStop:
                Drawable drawableAbeja = Abeja.getDrawable();
                ((Animatable) drawableAbeja).stop();
                break;

            case R.id.btnAranaPlay:
                AranaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_arana).into(Arana);
                break;
            case R.id.btnAranaStop:
                Drawable drawableArana = Arana.getDrawable();
                ((Animatable) drawableArana).stop();
                break;

            case R.id.btnBallenaPlay:
                BallenaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_ballena).into(Ballena);
                break;
            case R.id.btnBallenaStop:
                Drawable drawableBallena = Ballena.getDrawable();
                ((Animatable) drawableBallena).stop();
                break;

            case R.id.btnBurroPlay:
                BurroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_burro).into(Burro);
                break;
            case R.id.btnBurroStop:
                Drawable drawableBurro = Burro.getDrawable();
                ((Animatable) drawableBurro).stop();
                break;

            case R.id.btnCaballoPlay:
                CaballoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_caballo).into(Caballo);
                break;
            case R.id.btnCaballoStop:
                Drawable drawableCaballo = Caballo.getDrawable();
                ((Animatable) drawableCaballo).stop();
                break;

            case R.id.btnCebraPlay:
                CebraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_cebra).into(Cebra);
                break;
            case R.id.btnCebraStop:
                Drawable drawableCebra = Cebra.getDrawable();
                ((Animatable) drawableCebra).stop();
                break;
            }
    }
    // DE ABEJA A CEBRA MULTIMEDIA -------------------------------------------------------------------------------

    // DE CERDO A ELEFANTE MULTIMEDIA ----------------------------------------------------------------------------
    public void animales_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnCerdoPlay:
                CerdoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_cerdo).into(Cerdo);
                break;
            case R.id.btnCerdoStop:
                Drawable drawableCerdo = Cerdo.getDrawable();
                ((Animatable) drawableCerdo).stop();
                break;

            case R.id.btnCondorPlay:
                CondorStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_condor).into(Condor);
                break;
            case R.id.btnCondorStop:
                Drawable drawableCondor = Condor.getDrawable();
                ((Animatable) drawableCondor).stop();
                break;

            case R.id.btnConejoPlay:
                ConejoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_conejo).into(Conejo);
                break;
            case R.id.btnConejoStop:
                Drawable drawableConejo = Conejo.getDrawable();
                ((Animatable) drawableConejo).stop();
                break;

            case R.id.btnCulebraPlay:
                CulebraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_culebra).into(Culebra);
                break;
            case R.id.btnCulebraStop:
                Drawable drawableCulebra = Culebra.getDrawable();
                ((Animatable) drawableCulebra).stop();
                break;

            case R.id.btnCuyPlay:
                CuyStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_cuy).into(Cuy);
                break;
            case R.id.btnCuyStop:
                Drawable drawableCuy = Cuy.getDrawable();
                ((Animatable) drawableCuy).stop();
                break;

            case R.id.btnElefantePlay:
                ElefanteStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_elefante).into(Elefante);
                break;
            case R.id.btnElefanteStop:
                Drawable drawableElefante = Elefante.getDrawable();
                ((Animatable) drawableElefante).stop();
                break;
        }
    }
    // DE CERDO A ELEFANTE MULTIMEDIA ----------------------------------------------------------------------------

    // DE GALLINA A LEON MULTIMEDIA ------------------------------------------------------------------------------
    public void animales_seleccionar3 (View view) {
        switch (view.getId()) {

            case R.id.btnGallinaPlay:
                GallinaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_gallina).into(Gallina);
                break;
            case R.id.btnGallinaStop:
                Drawable drawableGallina = Gallina.getDrawable();
                ((Animatable) drawableGallina).stop();
                break;

            case R.id.btnGalloPlay:
                GalloStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_gallo).into(Gallo);
                break;
            case R.id.btnGalloStop:
                Drawable drawableGallo = Gallo.getDrawable();
                ((Animatable) drawableGallo).stop();
                break;

            case R.id.btnGatoPlay:
                GatoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_gato).into(Gato);
                break;
            case R.id.btnGatoStop:
                Drawable drawableGato = Gato.getDrawable();
                ((Animatable) drawableGato).stop();
                break;

            case R.id.btnJirafaPlay:
                JirafaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_jirafa).into(Jirafa);
                break;
            case R.id.btnJirafaStop:
                Drawable drawableJirafa = Jirafa.getDrawable();
                ((Animatable) drawableJirafa).stop();
                break;

            case R.id.btnLagartijaPlay:
                LagartijaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_lagartija).into(Lagartija);
                break;
            case R.id.btnLagartijaStop:
                Drawable drawableLagartija = Lagartija.getDrawable();
                ((Animatable) drawableLagartija).stop();
                break;

            case R.id.btnLeonPlay:
                LeonStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_leon).into(Leon);
                break;
            case R.id.btnLeonStop:
                Drawable drawableLeon = Leon.getDrawable();
                ((Animatable) drawableLeon).stop();
                break;
        }
    }
    // DE GALLINA A LEON MULTIMEDIA ------------------------------------------------------------------------------

    // DE LOBO A OSO MULTIMEDIA ----------------------------------------------------------------------------------
    public void animales_seleccionar4 (View view) {
        switch (view.getId()) {

            case R.id.btnLoboPlay:
                LoboStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_lobo).into(Lobo);
                break;
            case R.id.btnLoboStop:
                Drawable drawableLobo = Lobo.getDrawable();
                ((Animatable) drawableLobo).stop();
                break;

            case R.id.btnLombrizPlay:
                LombrizStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_lombriz).into(Lombriz);
                break;
            case R.id.btnLombrizStop:
                Drawable drawableLombriz = Lombriz.getDrawable();
                ((Animatable) drawableLombriz).stop();
                break;

            case R.id.btnMariposaPlay:
                MariposaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_mariposa).into(Mariposa);
                break;
            case R.id.btnMariposaStop:
                Drawable drawableMariposa = Mariposa.getDrawable();
                ((Animatable) drawableMariposa).stop();
                break;

            case R.id.btnMonoPlay:
                MonoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_mono).into(Mono);
                break;
            case R.id.btnMonoStop:
                Drawable drawableMono = Mono.getDrawable();
                ((Animatable) drawableMono).stop();
                break;

            case R.id.btnMoscaPlay:
                MoscaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_mosca).into(Mosca);
                break;
            case R.id.btnMoscaStop:
                Drawable drawableMosca = Mosca.getDrawable();
                ((Animatable) drawableMosca).stop();
                break;

            case R.id.btnOsoPlay:
                OsoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_oso).into(Oso);
                break;
            case R.id.btnOsoStop:
                Drawable drawableOso = Oso.getDrawable();
                ((Animatable) drawableOso).stop();
                break;
        }
    }
    // DE LOBO A OSO MULTIMEDIA ----------------------------------------------------------------------------------

    // DE OVEJA A PEZ MULTIMEDIA ---------------------------------------------------------------------------------
    public void animales_seleccionar5 (View view) {
        switch (view.getId()) {

            case R.id.btnOvejaPlay:
                OvejaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_oveja).into(Oveja);
                break;
            case R.id.btnOvejaStop:
                Drawable drawableOveja = Oveja.getDrawable();
                ((Animatable) drawableOveja).stop();
                break;

            case R.id.btnPajaroPlay:
                PajaroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_pajaro).into(Pajaro);
                break;
            case R.id.btnPajaroStop:
                Drawable drawablePajaro = Pajaro.getDrawable();
                ((Animatable) drawablePajaro).stop();
                break;

            case R.id.btnPatoPlay:
                PatoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_pato).into(Pato);
                break;
            case R.id.btnPatoStop:
                Drawable drawablePato = Pato.getDrawable();
                ((Animatable) drawablePato).stop();
                break;

            case R.id.btnPavoPlay:
                PavoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_pavo).into(Pavo);
                break;
            case R.id.btnPavoStop:
                Drawable drawablePavo = Pavo.getDrawable();
                ((Animatable) drawablePavo).stop();
                break;

            case R.id.btnPerroPlay:
                PerroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_perro).into(Perro);
                break;
            case R.id.btnPerroStop:
                Drawable drawablePerro = Perro.getDrawable();
                ((Animatable) drawablePerro).stop();
                break;

            case R.id.btnPezPlay:
                PezStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_pez).into(Pez);
                break;
            case R.id.btnPezStop:
                Drawable drawablePez = Pez.getDrawable();
                ((Animatable) drawablePez).stop();
                break;
        }
    }
    // DE OVEJA A PEZ MULTIMEDIA ---------------------------------------------------------------------------------

    // DE RATON A ZORRO MULTIMEDIA -------------------------------------------------------------------------------
    public void animales_seleccionar6 (View view) {
        switch (view.getId()) {

            case R.id.btnRatonPlay:
                RatonStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_raton).into(Raton);
                break;
            case R.id.btnRatonStop:
                Drawable drawableRaton = Raton.getDrawable();
                ((Animatable) drawableRaton).stop();
                break;

            case R.id.btnSapoPlay:
                SapoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_sapo).into(Sapo);
                break;
            case R.id.btnSapoStop:
                Drawable drawableSapo = Sapo.getDrawable();
                ((Animatable) drawableSapo).stop();
                break;

            case R.id.btnTigrePlay:
                TigreStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_tigre).into(Tigre);
                break;
            case R.id.btnTigreStop:
                Drawable drawableTigre = Tigre.getDrawable();
                ((Animatable) drawableTigre).stop();
                break;

            case R.id.btnToroPlay:
                ToroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_toro).into(Toro);
                break;
            case R.id.btnToroStop:
                Drawable drawableToro = Toro.getDrawable();
                ((Animatable) drawableToro).stop();
                break;

            case R.id.btnTortugaPlay:
                TortugaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_tortuga).into(Tortuga);
                break;
            case R.id.btnTortugaStop:
                Drawable drawableTortuga = Tortuga.getDrawable();
                ((Animatable) drawableTortuga).stop();
                break;

            case R.id.btnVacaPlay:
                VacaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_vaca).into(Vaca);
                break;
            case R.id.btnVacaStop:
                Drawable drawableVaca = Vaca.getDrawable();
                ((Animatable) drawableVaca).stop();
                break;

            case R.id.btnZancudoPlay:
                ZancudoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_zancudo).into(Zancudo);
                break;
            case R.id.btnZancudoStop:
                Drawable drawableZancudo = Zancudo.getDrawable();
                ((Animatable) drawableZancudo).stop();
                break;

            case R.id.btnZorroPlay:
                ZorroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.animal_zorro).into(Zorro);
                break;
            case R.id.btnZorroStop:
                Drawable drawableZorro = Zorro.getDrawable();
                ((Animatable) drawableZorro).stop();
                break;
        }
    }
    // DE RATON A ZORRO MULTIMEDIA -------------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    { finish(); }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
