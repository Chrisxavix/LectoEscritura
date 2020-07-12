package com.example.lectoescritura.Menu_Estudiante.Glosario.Alimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class alimentos_contenido extends AppCompatActivity {
    private ImageView Arroz, Bolon, Cafe, Caldo, Chocolate, Empanada, Encebollado,
            Espumilla, Fritada, Galleta, Gelatina, Hamburguesa, Helado, Hornado, Jugo,
            Leche, Pizza, Salchipapa, Verdura;

    private ImageButton ArrozStop, BolonStop, CafeStop, CaldoStop, ChocolateStop, EmpanadaStop, EncebolladoStop,
            EspumillaStop, FritadaStop, GalletaStop, GelatinaStop, HamburguesaStop, HeladoStop, HornadoStop, JugoStop,
            LecheStop, PizzaStop, SalchipapaStop, VerduraStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Arroz = (ImageView)findViewById(R.id.ImaArroz);
        Bolon = (ImageView)findViewById(R.id.ImaBolon);
        Cafe = (ImageView)findViewById(R.id.ImaCafe);
        Caldo = (ImageView)findViewById(R.id.ImaCaldo);
        Chocolate = (ImageView)findViewById(R.id.ImaChocolate);
        Empanada = (ImageView)findViewById(R.id.ImaEmpanada);
        Encebollado = (ImageView)findViewById(R.id.ImaEncebollado);
        Espumilla = (ImageView)findViewById(R.id.ImaEspumilla);
        Fritada = (ImageView)findViewById(R.id.ImaFritada);
        Galleta = (ImageView)findViewById(R.id.ImaGalleta);
        Gelatina = (ImageView)findViewById(R.id.ImaGelatina);
        Hamburguesa = (ImageView)findViewById(R.id.ImaHamburguesa);
        Helado = (ImageView)findViewById(R.id.ImaHelado);
        Hornado = (ImageView)findViewById(R.id.ImaHornado);
        Jugo = (ImageView)findViewById(R.id.ImaJugo);
        Leche = (ImageView)findViewById(R.id.ImaLeche);
        Pizza = (ImageView)findViewById(R.id.ImaPizza);
        Salchipapa = (ImageView)findViewById(R.id.ImaSalchipapa);
        Verdura = (ImageView)findViewById(R.id.ImaVerdura);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        ArrozStop = (ImageButton) findViewById(R.id.btnArrozStop);
        ArrozStop.setEnabled(false);
        BolonStop = (ImageButton) findViewById(R.id.btnBolonStop);
        BolonStop.setEnabled(false);
        CafeStop = (ImageButton) findViewById(R.id.btnCafeStop);
        CafeStop.setEnabled(false);
        CaldoStop = (ImageButton) findViewById(R.id.btnCaldoStop);
        CaldoStop.setEnabled(false);
        ChocolateStop = (ImageButton) findViewById(R.id.btnChocolateStop);
        ChocolateStop.setEnabled(false);
        EmpanadaStop = (ImageButton) findViewById(R.id.btnEmpanadaStop);
        EmpanadaStop.setEnabled(false);
        EncebolladoStop = (ImageButton) findViewById(R.id.btnEncebolladoStop);
        EncebolladoStop.setEnabled(false);
        EspumillaStop = (ImageButton) findViewById(R.id.btnEspumillaStop);
        EspumillaStop.setEnabled(false);
        FritadaStop = (ImageButton) findViewById(R.id.btnFritadaStop);
        FritadaStop.setEnabled(false);
        GalletaStop = (ImageButton) findViewById(R.id.btnGalletaStop);
        GalletaStop.setEnabled(false);
        GelatinaStop = (ImageButton) findViewById(R.id.btnGelatinaStop);
        GelatinaStop.setEnabled(false);
        HamburguesaStop = (ImageButton) findViewById(R.id.btnHamburguesaStop);
        HamburguesaStop.setEnabled(false);
        HeladoStop = (ImageButton) findViewById(R.id.btnHeladoStop);
        HeladoStop.setEnabled(false);
        HornadoStop = (ImageButton) findViewById(R.id.btnHornadoStop);
        HornadoStop.setEnabled(false);
        JugoStop = (ImageButton) findViewById(R.id.btnJugoStop);
        JugoStop.setEnabled(false);
        LecheStop = (ImageButton) findViewById(R.id.btnLecheStop);
        LecheStop.setEnabled(false);
        PizzaStop = (ImageButton) findViewById(R.id.btnPizzaStop);
        PizzaStop.setEnabled(false);
        SalchipapaStop = (ImageButton) findViewById(R.id.btnSalchipapaStop);
        SalchipapaStop.setEnabled(false);
        VerduraStop = (ImageButton) findViewById(R.id.btnVerduraStop);
        VerduraStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE ARROZ A EMPANADA MULTIMEDIA ----------------------------------------------------------------------------
    public void alimentos_seleccionar1 (View view) {
        switch (view.getId()) {

            case R.id.btnArrozPlay:
                ArrozStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_arroz).into(Arroz);
                break;
            case R.id.btnArrozStop:
                Drawable drawableArroz = Arroz.getDrawable();
                ((Animatable) drawableArroz).stop();
                break;

            case R.id.btnBolonPlay:
                BolonStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_bolon).into(Bolon);
                break;
            case R.id.btnBolonStop:
                Drawable drawableBolon = Bolon.getDrawable();
                ((Animatable) drawableBolon).stop();
                break;

            case R.id.btnCafePlay:
                CafeStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_cafe).into(Cafe);
                break;
            case R.id.btnCafeStop:
                Drawable drawableCafe = Cafe.getDrawable();
                ((Animatable) drawableCafe).stop();
                break;

            case R.id.btnCaldoPlay:
                CaldoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_caldo).into(Caldo);
                break;
            case R.id.btnCaldoStop:
                Drawable drawableCaldo = Caldo.getDrawable();
                ((Animatable) drawableCaldo).stop();
                break;

            case R.id.btnChocolatePlay:
                ChocolateStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_chocolate).into(Chocolate);
                break;
            case R.id.btnChocolateStop:
                Drawable drawableChocolate = Chocolate.getDrawable();
                ((Animatable) drawableChocolate).stop();
                break;

            case R.id.btnEmpanadaPlay:
                EmpanadaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_empanada).into(Empanada);
                break;
            case R.id.btnEmpanadaStop:
                Drawable drawableEmpanada = Empanada.getDrawable();
                ((Animatable) drawableEmpanada).stop();
                break;
        }
    }
    // DE ARROZ A EMPANADA MULTIMEDIA ----------------------------------------------------------------------------

    // DE ENCEBOLLADO A HELADO MULTIMEDIA ------------------------------------------------------------------------
    public void alimentos_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnEncebolladoPlay:
                EncebolladoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_encebollado).into(Encebollado);
                break;
            case R.id.btnEncebolladoStop:
                Drawable drawableEncebollado = Encebollado.getDrawable();
                ((Animatable) drawableEncebollado).stop();
                break;

            case R.id.btnEspumillaPlay:
                EspumillaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_espumlla).into(Espumilla);
                break;
            case R.id.btnEspumillaStop:
                Drawable drawableEspumilla = Espumilla.getDrawable();
                ((Animatable) drawableEspumilla).stop();
                break;

            case R.id.btnFritadaPlay:
                FritadaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_fritada).into(Fritada);
                break;
            case R.id.btnFritadaStop:
                Drawable drawableFritada = Fritada.getDrawable();
                ((Animatable) drawableFritada).stop();
                break;

            case R.id.btnGalletaPlay:
                GalletaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_galleta).into(Galleta);
                break;
            case R.id.btnGalletaStop:
                Drawable drawableGalleta = Galleta.getDrawable();
                ((Animatable) drawableGalleta).stop();
                break;

            case R.id.btnGelatinaPlay:
                GelatinaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_gelatina).into(Gelatina);
                break;
            case R.id.btnGelatinaStop:
                Drawable drawableGelatina = Gelatina.getDrawable();
                ((Animatable) drawableGelatina).stop();
                break;

            case R.id.btnHamburguesaPlay:
                HamburguesaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_hamburguesa).into(Hamburguesa);
                break;
            case R.id.btnHamburguesaStop:
                Drawable drawableHamburguesa = Hamburguesa.getDrawable();
                ((Animatable) drawableHamburguesa).stop();
                break;

            case R.id.btnHeladoPlay:
                HeladoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_helado).into(Helado);
                break;
            case R.id.btnHeladoStop:
                Drawable drawableHelado = Helado.getDrawable();
                ((Animatable) drawableHelado).stop();
                break;
        }
    }
    // DE ENCEBOLLADO A HELADO MULTIMEDIA ------------------------------------------------------------------------

    // DE HORNADO A VERDURA MULTIMEDIA ---------------------------------------------------------------------------
    public void alimentos_seleccionar3 (View view) {
        switch (view.getId()) {

            case R.id.btnHornadoPlay:
                HornadoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_hornado).into(Hornado);
                break;
            case R.id.btnHornadoStop:
                Drawable drawableHornado = Hornado.getDrawable();
                ((Animatable) drawableHornado).stop();
                break;

            case R.id.btnJugoPlay:
                JugoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_jugo).into(Jugo);
                break;
            case R.id.btnJugoStop:
                Drawable drawableJugo = Jugo.getDrawable();
                ((Animatable) drawableJugo).stop();
                break;

            case R.id.btnLechePlay:
                LecheStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_leche).into(Leche);
                break;
            case R.id.btnLecheStop:
                Drawable drawableLeche = Leche.getDrawable();
                ((Animatable) drawableLeche).stop();
                break;

            case R.id.btnPizzaPlay:
                PizzaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_pizza).into(Pizza);
                break;
            case R.id.btnPizzaStop:
                Drawable drawablePizza = Pizza.getDrawable();
                ((Animatable) drawablePizza).stop();
                break;

            case R.id.btnSalchipapaPlay:
                SalchipapaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_salchipapa).into(Salchipapa);
                break;
            case R.id.btnSalchipapaStop:
                Drawable drawableSalchipapa = Salchipapa.getDrawable();
                ((Animatable) drawableSalchipapa).stop();
                break;

            case R.id.btnVerduraPlay:
                VerduraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.alimentos_verdura).into(Verdura);
                break;
            case R.id.btnVerduraStop:
                Drawable drawableVerdura = Verdura.getDrawable();
                ((Animatable) drawableVerdura).stop();
                break;

        }
    }
    // DE HORNADO A VERDURA MULTIMEDIA ---------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
