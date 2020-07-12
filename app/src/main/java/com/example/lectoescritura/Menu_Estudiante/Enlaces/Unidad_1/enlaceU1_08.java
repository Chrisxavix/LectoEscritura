package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.lectoescritura.R;

public class enlaceU1_08 extends AppCompatActivity {
    private WebView navegadorU108;
    private ProgressBar barraprogresoU108;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_u1_08);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------

        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------
        navegadorU108=(WebView)findViewById(R.id.PanelWebU108);
        barraprogresoU108 = (ProgressBar) findViewById(R.id.ProgressBarU108);
        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------

        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------
        navegadorU108.getSettings().setJavaScriptEnabled(true);
        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------

        // ENLACE A CARGAR -------------------------------------------------------------------------
        navegadorU108.loadUrl("https://confirmado.net/2014/02/21/en-ecuador-existen-catorce-lenguas-ancestrales/");
        // ENLACE A CARGAR -------------------------------------------------------------------------

        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------
        navegadorU108.getSettings().setBuiltInZoomControls(true);
        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------

        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------
        navegadorU108.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------

        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
        navegadorU108.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int progress) {
                barraprogresoU108.setProgress(0);
                barraprogresoU108.setVisibility(View.VISIBLE);
                enlaceU1_08.this.setProgress(progress * 1000);
                barraprogresoU108.incrementProgressBy(progress);
                if (progress == 100) {
                    barraprogresoU108.setVisibility(View.GONE);
                }
            }
        });
        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        if (navegadorU108.canGoBack())
        { navegadorU108.goBack(); }
        else
        { super.onBackPressed();
            finish();}
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
