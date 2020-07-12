package com.example.lectoescritura;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.Fragmentos.Menu_fragmentos;
import com.example.lectoescritura.Menu_Docente.Menu.Docente_Logueo;
import com.example.lectoescritura.Menu_barra.Creditos;
import com.example.lectoescritura.Menu_barra.Informacion;

public class MainActivity extends AppCompatActivity {
    ImageView Ima_estudiante, Ima_docente, Ima_salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_estudiante = (ImageView)findViewById(R.id.ImaEstudiante);
        Ima_docente = (ImageView)findViewById(R.id.ImaDocente);
        Ima_salir = (ImageView)findViewById(R.id.ImaSalir);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.menuprin_estudiante1).into(Ima_estudiante);
        Glide.with(getBaseContext()).load(R.drawable.menuprin_docente2).into(Ima_docente);
        Glide.with(getBaseContext()).load(R.drawable.menuprin_salir3).into(Ima_salir);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
    }

    // BOTÓN DE IR AL MENÚ DE ESTUDIANTE -------------------------------------------------------------------------
    public void BotonEstudiante (View view) {
        Intent intent = new Intent(this, Menu_fragmentos.class);
        startActivity(intent);  }
    // BOTÓN DE IR AL MENÚ DE ESTUDIANTE -------------------------------------------------------------------------

    // BOTÓN DE IR AL MENÚ DE DOCENTE -------------------------------------------------------------------------
    public void BotonDocente (View view) {
        Intent intent = new Intent(this, Docente_Logueo.class);
        startActivity(intent);  }
    // BOTÓN DE IR AL MENÚ DE DOCENTE -------------------------------------------------------------------------

    // BOTÓN DE SALIR DEL MENÚ -----------------------------------------------------------------------------------
    public void BotonSalir (View view) { MostrarAlertaDialogo(); }
    // BOTÓN DE SALIR DEL MENÚ -----------------------------------------------------------------------------------

    // CREACIÓN DEL NAVEGADOR CRÉDITOS E INFORMACIÓN -------------------------------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btninfo:
                Intent intent = new Intent(this, Informacion.class);
                startActivity(intent);
                break;
            case R.id.btncreditos:
                Intent intent1 = new Intent(this, Creditos.class);
                startActivity(intent1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    // CREACIÓN DEL NAVEGADOR CRÉDITOS E INFORMACIÓN -------------------------------------------------------------

    // MÉTODO DE ALERT DIALOG DE SALIR CON EL PONY XD ------------------------------------------------------------
    public void MostrarAlertaDialogo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_salir, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_salir, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // MÉTODO DE ALERT DIALOG DE SALIR CON EL PONY XD ------------------------------------------------------------

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {MostrarAlertaDialogo();}
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
