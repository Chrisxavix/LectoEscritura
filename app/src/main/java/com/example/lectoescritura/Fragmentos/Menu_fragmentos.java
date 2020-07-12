package com.example.lectoescritura.Fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.lectoescritura.Menu_barra.Creditos;
import com.example.lectoescritura.Menu_barra.Informacion;
import com.example.lectoescritura.R;

public class Menu_fragmentos extends AppCompatActivity implements Fragmento_Enlaces.OnFragmentInteractionListener,
        Fragmento_Evaluacion.OnFragmentInteractionListener,
        Fragmento_Glosario.OnFragmentInteractionListener, Fragmento_Unidad.OnFragmentInteractionListener {

    // ASIGNAR UN NOMBRE X PARA LOS FRAGMENTOS-------------------------------------------------------------------
    Fragmento_Unidad FragmentUnidades;
    Fragmento_Glosario FragmentGlosario;
    Fragmento_Enlaces FragmentEnlaces;
    Fragmento_Evaluacion FragmentEvaluaciones;
    // ASIGNAR UN NOMBRE X PARA LOS FRAGMENTOS--------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fragmentos);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // INSTANCIAS DE LOS FRAGMENTOS --------------------------------------------------------------------------
        FragmentUnidades = new Fragmento_Unidad();
        FragmentGlosario = new Fragmento_Glosario();
        FragmentEnlaces = new Fragmento_Enlaces();
        FragmentEvaluaciones = new Fragmento_Evaluacion();
        // INSTANCIAS DE LOS FRAGMENTOS --------------------------------------------------------------------------

        //ASIGNA POR DEFECTO EL PRIMER FRAGMENTO DE UNIDADES -----------------------------------------------------
        getSupportFragmentManager().beginTransaction().add(R.id.Contenedor, FragmentUnidades).commit();
        //ASIGNA POR DEFECTO EL PRIMER FRAGMENTO DE UNIDADES -----------------------------------------------------
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    // CREACIÓN DEL MÉTODO DE SELECCIÓN DEL FRAGMENTO CON BOTONES -----------------------------------------------
    public void OpcionFragmento (View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.bntUnidades:
                transaction.replace(R.id.Contenedor, FragmentUnidades);
                break;
            case R.id.btnGlosario:
                transaction.replace(R.id.Contenedor, FragmentGlosario);
                break;
            case R.id.btnEnlaces:
                transaction.replace(R.id.Contenedor, FragmentEnlaces);
                break;
            case R.id.btnEvaluaciones:
                transaction.replace(R.id.Contenedor, FragmentEvaluaciones);
                break;
        }
        transaction.commit();
    }
    // CREACIÓN DEL MÉTODO DE SELECCIÓN DEL FRAGMENTO CON BOTONES -----------------------------------------------

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
}
