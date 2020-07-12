package com.example.lectoescritura.Menu_barra.Cuentas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.lectoescritura.Menu_Estudiante.Enlaces.Unidad_1.enlaceU1_01;
import com.example.lectoescritura.R;

public class Facebook extends AppCompatActivity {
    private WebView navegadorFace;
    private ProgressBar barraprogresoFace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL ---------------------------------------------------

        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------
        navegadorFace=(WebView)findViewById(R.id.PanelWebFace);
        barraprogresoFace = (ProgressBar) findViewById(R.id.ProgressBarFace);
        // DEFINIR EL WEBVIEW Y PROGRESSBAR---------------------------------------------------------

        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------
        navegadorFace.getSettings().setJavaScriptEnabled(true);
        //HABILITAR JAVASCRIPT PARA DETALLES DE PAGINAS --------------------------------------------

        // ENLACE A CARGAR -------------------------------------------------------------------------
        navegadorFace.loadUrl("https://www.facebook.com/Christiansxa");
        // ENLACE A CARGAR -------------------------------------------------------------------------

        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------
        navegadorFace.getSettings().setBuiltInZoomControls(true);
        //HABILITAR ZOOM EN PÁGINAS ----------------------------------------------------------------

        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------
        navegadorFace.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // CARGAR ENLACE DENTRO DE LA APP ----------------------------------------------------------

        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
        navegadorFace.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int progress) {
                barraprogresoFace.setProgress(0);
                barraprogresoFace.setVisibility(View.VISIBLE);
                Facebook.this.setProgress(progress * 1000);
                barraprogresoFace.incrementProgressBy(progress);
                if (progress == 100) {
                    barraprogresoFace.setVisibility(View.GONE);
                }
            }
        });
        // RELACION DE LA BARRA CON EL NAVEGADOR ---------------------------------------------------
    }

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        if (navegadorFace.canGoBack())
        { navegadorFace.goBack(); }
        else
        { super.onBackPressed();
            finish();}
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
