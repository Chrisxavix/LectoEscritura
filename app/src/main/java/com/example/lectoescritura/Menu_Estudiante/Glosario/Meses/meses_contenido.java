package com.example.lectoescritura.Menu_Estudiante.Glosario.Meses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class meses_contenido extends AppCompatActivity {
    private ImageView Enero, Febrero, Marzo, Abril, MayoSierra, MayoCosta,
            Junio, Julio, Agosto, Septiembre, OctubreSierra, OctubreCosta,
            NoviembreSierra, NoviembreCosta, Diciembre;
    private ImageButton EneroStop, FebreroStop, MarzoStop, AbrilStop, MayoSierraStop, MayoCostaStop,
            JunioStop, JulioStop, AgostoStop, SeptiembreStop, OctubreSierraStop, OctubreCostaStop,
            NoviembreSierraStop, NoviembreCostaStop, DiciembreStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meses_contenido);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------
        Enero = (ImageView)findViewById(R.id.ImaEnero);
        Febrero = (ImageView)findViewById(R.id.ImaFebrero);
        Marzo = (ImageView)findViewById(R.id.ImaMarzo);
        Abril = (ImageView)findViewById(R.id.ImaAbril);
        MayoSierra = (ImageView)findViewById(R.id.ImaMayoSierra);
        MayoCosta = (ImageView)findViewById(R.id.ImaMayoCosta);
        Junio = (ImageView)findViewById(R.id.ImaJunio);
        Julio = (ImageView)findViewById(R.id.ImaJulio);
        Agosto = (ImageView)findViewById(R.id.ImaAgosto);
        Septiembre = (ImageView)findViewById(R.id.ImaSeptiembre);
        OctubreSierra = (ImageView)findViewById(R.id.ImaOctubreSierra);
        OctubreCosta = (ImageView)findViewById(R.id.ImaOctubreCosta);
        NoviembreSierra = (ImageView)findViewById(R.id.ImaNoviembreSierra);
        NoviembreCosta = (ImageView)findViewById(R.id.ImaNoviembreCosta);
        Diciembre = (ImageView)findViewById(R.id.ImaDiciembre);
        // DECLARACION DE IDs DEL XML ----------------------------------------------------------------------------

        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
        EneroStop = (ImageButton) findViewById(R.id.btnEneroStop);
        EneroStop.setEnabled(false);
        FebreroStop = (ImageButton) findViewById(R.id.btnFebreroStop);
        FebreroStop.setEnabled(false);
        MarzoStop = (ImageButton) findViewById(R.id.btnMarzoStop);
        MarzoStop.setEnabled(false);
        AbrilStop = (ImageButton) findViewById(R.id.btnAbrilStop);
        AbrilStop.setEnabled(false);
        MayoSierraStop = (ImageButton) findViewById(R.id.btnMayoSierraStop);
        MayoSierraStop.setEnabled(false);
        MayoCostaStop = (ImageButton) findViewById(R.id.btnMayoCostaStop);
        MayoCostaStop.setEnabled(false);
        JunioStop = (ImageButton) findViewById(R.id.btnJunioStop);
        JunioStop.setEnabled(false);
        JulioStop = (ImageButton) findViewById(R.id.btnJulioStop);
        JulioStop.setEnabled(false);
        AgostoStop = (ImageButton) findViewById(R.id.btnAgostoStop);
        AgostoStop.setEnabled(false);
        SeptiembreStop = (ImageButton) findViewById(R.id.btnSeptiembreStop);
        SeptiembreStop.setEnabled(false);
        OctubreSierraStop = (ImageButton) findViewById(R.id.btnOctubreSierraStop);
        OctubreSierraStop.setEnabled(false);
        OctubreCostaStop = (ImageButton) findViewById(R.id.btnOctubreCostaStop);
        OctubreCostaStop.setEnabled(false);
        NoviembreSierraStop = (ImageButton) findViewById(R.id.btnNoviembreSierraStop);
        NoviembreSierraStop.setEnabled(false);
        NoviembreCostaStop = (ImageButton) findViewById(R.id.btnNoviembreCostaStop);
        NoviembreCostaStop.setEnabled(false);
        DiciembreStop = (ImageButton) findViewById(R.id.btnDiciembreStop);
        DiciembreStop.setEnabled(false);
        // DECLARACION DE BOTONES DE REPRODUCCION ----------------------------------------------------------------
    }

    // DE ENERO A JUNIO MULTIMEDIA -------------------------------------------------------------------------------
    public void meses_seleccionar1 (View view) {
        switch (view.getId()) {
            case R.id.btnEneroPlay:
                EneroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_enero).into(Enero);
                break;
            case R.id.btnEneroStop:
                Drawable drawableEnero = Enero.getDrawable();
                ((Animatable) drawableEnero).stop();
                break;

            case R.id.btnFebreroPlay:
                FebreroStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_febrero).into(Febrero);
                break;
            case R.id.btnFebreroStop:
                Drawable drawableFebrero = Febrero.getDrawable();
                ((Animatable) drawableFebrero).stop();
                break;

            case R.id.btnMarzoPlay:
                MarzoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_marzo).into(Marzo);
                break;
            case R.id.btnMarzoStop:
                Drawable drawableMarzo = Marzo.getDrawable();
                ((Animatable) drawableMarzo).stop();
                break;

            case R.id.btnAbrilPlay:
                AbrilStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_abril).into(Abril);
                break;
            case R.id.btnAbrilStop:
                Drawable drawableAbril = Abril.getDrawable();
                ((Animatable) drawableAbril).stop();
                break;

            case R.id.btnMayoSierraPlay:
                MayoSierraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_mayosierra).into(MayoSierra);
                break;
            case R.id.btnMayoSierraStop:
                Drawable drawableMayoSierra = MayoSierra.getDrawable();
                ((Animatable) drawableMayoSierra).stop();
                break;

            case R.id.btnMayoCostaPlay:
                MayoCostaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_mayocosta).into(MayoCosta);
                break;
            case R.id.btnMayoCostaStop:
                Drawable drawableMayoCosta = MayoCosta.getDrawable();
                ((Animatable) drawableMayoCosta).stop();
                break;

            case R.id.btnJunioPlay:
                JunioStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_junio).into(Junio);
                break;
            case R.id.btnJunioStop:
                Drawable drawableJunio = Junio.getDrawable();
                ((Animatable) drawableJunio).stop();
                break;
        }
    }
    // DE ENERO A JUNIO MULTIMEDIA -------------------------------------------------------------------------------

    // DE JULIO A DICIEMBRE MULTIMEDIA ---------------------------------------------------------------------------
    public void meses_seleccionar2 (View view) {
        switch (view.getId()) {

            case R.id.btnJulioPlay:
                JulioStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_julio).into(Julio);
                break;
            case R.id.btnJulioStop:
                Drawable drawableJulio = Julio.getDrawable();
                ((Animatable) drawableJulio).stop();
                break;

            case R.id.btnAgostoPlay:
                AgostoStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_agosto).into(Agosto);
                break;
            case R.id.btnAgostoStop:
                Drawable drawableAgosto = Agosto.getDrawable();
                ((Animatable) drawableAgosto).stop();
                break;

            case R.id.btnSeptiembrePlay:
                SeptiembreStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_septiembre).into(Septiembre);
                break;
            case R.id.btnSeptiembreStop:
                Drawable drawableSeptiembre = Septiembre.getDrawable();
                ((Animatable) drawableSeptiembre).stop();
                break;

            case R.id.btnOctubreSierraPlay:
                OctubreSierraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_octubresierra).into(OctubreSierra);
                break;
            case R.id.btnOctubreSierraStop:
                Drawable drawableOctubreSierra = OctubreSierra.getDrawable();
                ((Animatable) drawableOctubreSierra).stop();
                break;

            case R.id.btnOctubreCostaPlay:
                OctubreCostaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_octubrecosta).into(OctubreCosta);
                break;
            case R.id.btnOctubreCostaStop:
                Drawable drawableOctubreCosta = OctubreCosta.getDrawable();
                ((Animatable) drawableOctubreCosta).stop();
                break;

            case R.id.btnNoviembreSierraPlay:
                NoviembreSierraStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_noviembresierra).into(NoviembreSierra);
                break;
            case R.id.btnNoviembreSierraStop:
                Drawable drawableNovimbreSierra = NoviembreSierra.getDrawable();
                ((Animatable) drawableNovimbreSierra).stop();
                break;

            case R.id.btnNoviembreCostaPlay:
                NoviembreCostaStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_noviembrecosta).into(NoviembreCosta);
                break;
            case R.id.btnNoviembreCostaStop:
                Drawable drawableNovimbreCosta = NoviembreCosta.getDrawable();
                ((Animatable) drawableNovimbreCosta).stop();
                break;

            case R.id.btnDiciembrePlay:
                DiciembreStop.setEnabled(true);
                Glide.with(getBaseContext()).load(R.drawable.meses_diciembre).into(Diciembre);
                break;
            case R.id.btnDiciembreStop:
                Drawable drawableDiciembre = Diciembre.getDrawable();
                ((Animatable) drawableDiciembre).stop();
                break;
        }
    }
    // DE JULIO A DICIEMBRE MULTIMEDIA ---------------------------------------------------------------------------

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        finish();
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
