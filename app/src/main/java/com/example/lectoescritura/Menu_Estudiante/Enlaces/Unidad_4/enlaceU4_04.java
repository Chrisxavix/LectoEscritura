package com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.lectoescritura.R;

public class enlaceU4_04 extends AppCompatActivity {
    private WebView navegadorU404;
    private ProgressBar barraprogresoU404;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_u4_04);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------

        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------
        navegadorU404 =(WebView)findViewById(R.id.PanelWebU404);
        barraprogresoU404 = (ProgressBar) findViewById(R.id.ProgressBarU404);
        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------

        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------
        navegadorU404.getSettings().setJavaScriptEnabled(true);
        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------

        // ENLACE A CARGAR -------------------------------------------------------------------------
        navegadorU404.loadUrl("http://ciudadseva.com/autor/gabriel-garcia-marquez/cuentos/");
        // ENLACE A CARGAR -------------------------------------------------------------------------

        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------
        navegadorU404.getSettings().setBuiltInZoomControls(true);
        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------

        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------
        navegadorU404.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------

        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
        navegadorU404.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int progress) {
                barraprogresoU404.setProgress(0);
                barraprogresoU404.setVisibility(View.VISIBLE);
                enlaceU4_04.this.setProgress(progress * 1000);
                barraprogresoU404.incrementProgressBy(progress);
                if (progress == 100) {
                    barraprogresoU404.setVisibility(View.GONE);
                }
            }
        });
        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        if (navegadorU404.canGoBack())
        { navegadorU404.goBack(); }
        else
        { super.onBackPressed();
            finish();}
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
