package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_01;
import com.example.lectoescritura.R;

public class enlaceU2_01 extends AppCompatActivity {
    private WebView navegadorU201;
    private ProgressBar barraprogresoU201;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_u2_01);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------

        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------
        navegadorU201=(WebView)findViewById(R.id.PanelWebU201);
        barraprogresoU201 = (ProgressBar) findViewById(R.id.ProgressBarU201);
        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------

        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------
        navegadorU201.getSettings().setJavaScriptEnabled(true);
        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------

        // ENLACE A CARGAR -------------------------------------------------------------------------
        navegadorU201.loadUrl("https://youtu.be/Az6HB2HT-xM");
        // ENLACE A CARGAR -------------------------------------------------------------------------

        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------
        navegadorU201.getSettings().setBuiltInZoomControls(true);
        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------

        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------
        navegadorU201.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------

        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
        navegadorU201.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int progress) {
                barraprogresoU201.setProgress(0);
                barraprogresoU201.setVisibility(View.VISIBLE);
                enlaceU2_01.this.setProgress(progress * 1000);
                barraprogresoU201.incrementProgressBy(progress);
                if (progress == 100) {
                    barraprogresoU201.setVisibility(View.GONE);
                }
            }
        });
        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        if (navegadorU201.canGoBack())
        { navegadorU201.goBack(); }
        else
        { super.onBackPressed();
            finish();}
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
