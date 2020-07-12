package com.example.lectoescritura.Menu_Docente.Simulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.R;

import java.util.ArrayList;

public class Simulacion_Final extends AppCompatActivity {
    ListView lista_simulacion2;
    ArrayList<String> lista_array_simu2;
    ArrayAdapter adaptadors2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulacion__final);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        lista_simulacion2 = (ListView)findViewById(R.id.ListaSimulacion2);
        ClaseBaseDatos conexion = new ClaseBaseDatos(getApplicationContext(),null,null,1);
        lista_array_simu2 = LlenarSimu2();
        adaptadors2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista_array_simu2);
        lista_simulacion2.setAdapter(adaptadors2);
    }

    public ArrayList LlenarSimu2 () {
        ArrayList<String> lista_array_simu2 = new ArrayList<>();
        ClaseBaseDatos conexion = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = conexion.getWritableDatabase();

        String consulta = "SELECT * FROM tb_notas";
        Cursor registros = BaseFinal.rawQuery(consulta,null);

        if(registros.moveToFirst()){
            do{
                lista_array_simu2.add(registros.getString(0) + " tiene un puntaje final de: " + registros.getString(1));
            }while(registros.moveToNext());
        }
        return lista_array_simu2;
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
