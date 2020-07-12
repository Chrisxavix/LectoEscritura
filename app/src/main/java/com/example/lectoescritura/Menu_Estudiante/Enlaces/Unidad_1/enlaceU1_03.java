package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.lectoescritura.R;

public class enlaceU1_03 extends AppCompatActivity {
    private WebView navegadorU103;
    private ProgressBar barraprogresoU103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_u1_03);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------

        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------
        navegadorU103=(WebView)findViewById(R.id.PanelWebU103);
        barraprogresoU103 = (ProgressBar) findViewById(R.id.ProgressBarU103);
        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------

        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------
        navegadorU103.getSettings().setJavaScriptEnabled(true);
        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------

        // ENLACE A CARGAR -------------------------------------------------------------------------
        navegadorU103.loadUrl("https://youtu.be/VhwdOez0lrs");
        // ENLACE A CARGAR -------------------------------------------------------------------------

        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------
        navegadorU103.getSettings().setBuiltInZoomControls(true);
        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------

        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------
        navegadorU103.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------

        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
        navegadorU103.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int progress) {
                barraprogresoU103.setProgress(0);
                barraprogresoU103.setVisibility(View.VISIBLE);
                enlaceU1_03.this.setProgress(progress * 1000);
                barraprogresoU103.incrementProgressBy(progress);
                if (progress == 100) {
                    barraprogresoU103.setVisibility(View.GONE);
                }
            }
        });
        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        if (navegadorU103.canGoBack())
        { navegadorU103.goBack(); }
        else
        { super.onBackPressed();
            finish();}
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------

}
