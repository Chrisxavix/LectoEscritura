package com.example.lectoescritura.Menu_Docente.Evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.R;

import java.util.ArrayList;

public class Evaluacion2_Final extends AppCompatActivity {
    ListView lista_evaluacion2a;
    ArrayList<String> lista_array_eval2a;
    ArrayAdapter adaptadore2a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion2__final);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        lista_evaluacion2a = (ListView)findViewById(R.id.ListaEvaluacion2a);
        ClaseBaseDatos conexion = new ClaseBaseDatos(getApplicationContext(),null,null,1);
        lista_array_eval2a = LlenarEval2a();
        adaptadore2a = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista_array_eval2a);
        lista_evaluacion2a.setAdapter(adaptadore2a);
    }

    public ArrayList LlenarEval2a () {
        ArrayList<String> lista_array_eval2a = new ArrayList<>();
        ClaseBaseDatos conexion = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = conexion.getWritableDatabase();

        String consulta = "SELECT * FROM tb_notaseval2";
        Cursor registros = BaseFinal.rawQuery(consulta,null);

        if(registros.moveToFirst()){
            do{
                lista_array_eval2a.add(registros.getString(0) + " tiene un puntaje final de: " + registros.getString(1));
            }while(registros.moveToNext());
        }
        return lista_array_eval2a;
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
