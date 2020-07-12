package com.example.lectoescritura.Menu_Docente.Evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.R;

import java.util.ArrayList;

public class Evaluacion3_Final extends AppCompatActivity {
    ListView lista_evaluacion3a;
    ArrayList<String> lista_array_eval3a;
    ArrayAdapter adaptadore3a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion3__final);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        lista_evaluacion3a = (ListView)findViewById(R.id.ListaEvaluacion3a);
        ClaseBaseDatos conexion = new ClaseBaseDatos(getApplicationContext(),null,null,1);
        lista_array_eval3a = LlenarEval3a();
        adaptadore3a = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista_array_eval3a);
        lista_evaluacion3a.setAdapter(adaptadore3a);
    }

    public ArrayList LlenarEval3a () {
        ArrayList<String> lista_array_eval3a = new ArrayList<>();
        ClaseBaseDatos conexion = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = conexion.getWritableDatabase();

        String consulta = "SELECT * FROM tb_notaseval3";
        Cursor registros = BaseFinal.rawQuery(consulta,null);

        if(registros.moveToFirst()){
            do{
                lista_array_eval3a.add(registros.getString(0) + " tiene un puntaje final de: " + registros.getString(1));
            }while(registros.moveToNext());
        }
        return lista_array_eval3a;
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
