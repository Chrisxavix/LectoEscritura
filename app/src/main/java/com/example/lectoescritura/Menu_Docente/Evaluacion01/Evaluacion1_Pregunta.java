package com.example.lectoescritura.Menu_Docente.Evaluacion01;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.R;

import java.util.ArrayList;

public class Evaluacion1_Pregunta extends AppCompatActivity {
    ListView lista_evaluacion1;
    ArrayList<String> lista_array_eval1;
    ArrayAdapter adaptadore1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion1__pregunta);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        lista_evaluacion1 = (ListView)findViewById(R.id.ListaEvaluacion1);
        ClaseBaseDatos conexion = new ClaseBaseDatos(getApplicationContext(),null,null,1);
        lista_array_eval1 = LlenarEval1();
        adaptadore1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista_array_eval1);
        lista_evaluacion1.setAdapter(adaptadore1);
    }

    public ArrayList LlenarEval1 () {
        ArrayList<String> lista_array_eval1 = new ArrayList<>();
        ClaseBaseDatos conexion = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = conexion.getWritableDatabase();

        String consulta = "SELECT * FROM tb_evaluacion1";
        Cursor registros = BaseFinal.rawQuery(consulta,null);

        if(registros.moveToFirst()){
            do{
                lista_array_eval1.add(registros.getString(0)+ " Pregunta " + registros.getString(2) + ", obtiene: "+registros.getString(1));
            }while(registros.moveToNext());
        }
        return lista_array_eval1;
    }

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
