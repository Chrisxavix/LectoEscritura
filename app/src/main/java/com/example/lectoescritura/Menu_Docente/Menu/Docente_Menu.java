package com.example.lectoescritura.Menu_Docente.Menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.MainActivity;
import com.example.lectoescritura.Menu_Docente.Evaluacion01.Evaluacion1_Final;
import com.example.lectoescritura.Menu_Docente.Evaluacion01.Evaluacion1_Pregunta;
import com.example.lectoescritura.Menu_Docente.Evaluacion2.Evaluacion2_Final;
import com.example.lectoescritura.Menu_Docente.Evaluacion2.Evaluacion2_Pregunta;
import com.example.lectoescritura.Menu_Docente.Evaluacion3.Evaluacion3_Final;
import com.example.lectoescritura.Menu_Docente.Evaluacion3.Evaluacion3_Pregunta;
import com.example.lectoescritura.Menu_Docente.Evaluacion4.Evaluacion4_Final;
import com.example.lectoescritura.Menu_Docente.Evaluacion4.Evaluacion4_Pregunta;
import com.example.lectoescritura.Menu_Docente.Simulacion.Simulacion_Final;
import com.example.lectoescritura.Menu_Docente.Simulacion.Simulacion_Pregunta;
import com.example.lectoescritura.R;

public class Docente_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente__menu);
    }

    public void Eleccion_notas (View view) {
        switch (view.getId()) {

            case R.id.btnSimu1:
                Intent intentSimua = new Intent(this, Simulacion_Pregunta.class);
                startActivity(intentSimua);
                break;

            case R.id.btnSimu2:
                Intent intentSimub = new Intent(this, Simulacion_Final.class);
                startActivity(intentSimub);
                break;

            case R.id.btnSimuBorrar:
                MostrarAlertaDialogoBorrarSimulacion();
                break;

            case R.id.btnEval1a:
                Intent intentEval1a = new Intent(this, Evaluacion1_Pregunta.class);
                startActivity(intentEval1a);
                break;

            case R.id.btnEval1b:
                Intent intentEval1b = new Intent(this, Evaluacion1_Final.class);
                startActivity(intentEval1b);
                break;

            case R.id.btnEval1Borrar:
                MostrarAlertaDialogoBorrarEvaluacion1();
                break;

            case R.id.btnEval2a:
                Intent intentEval2a = new Intent(this, Evaluacion2_Pregunta.class);
                startActivity(intentEval2a);
                break;

            case R.id.btnEval2b:
                Intent intentEval2b = new Intent(this, Evaluacion2_Final.class);
                startActivity(intentEval2b);
                break;

            case R.id.btnEval2Borrar:
                MostrarAlertaDialogoBorrarEvaluacion2();
                break;

            case R.id.btnEval3a:
                Intent intentEval3a = new Intent(this, Evaluacion3_Pregunta.class);
                startActivity(intentEval3a);
                break;

            case R.id.btnEval3b:
                Intent intentEval3b = new Intent(this, Evaluacion3_Final.class);
                startActivity(intentEval3b);
                break;

            case R.id.btnEval3Borrar:
                MostrarAlertaDialogoBorrarEvaluacion3();
                break;

            case R.id.btnEval4a:
                Intent intentEval4a = new Intent(this, Evaluacion4_Pregunta.class);
                startActivity(intentEval4a);
                break;

            case R.id.btnEval4b:
                Intent intentEval4b = new Intent(this, Evaluacion4_Final.class);
                startActivity(intentEval4b);
                break;

            case R.id.btnEval4Borrar:
                MostrarAlertaDialogoBorrarEvaluacion4();
                break;

        }
    }

    // SIMULACION -------------------------------------------------------------------------------------------------
    // CLASE BASE DE DATOS ----------------------
    public void BD_usuarioSimulacion() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();

        BaseFinal.execSQL("Delete from tb_simulacion");
        BaseFinal.execSQL("Delete from tb_notas");

        BaseFinal.close();
    }
    // CLASE BASE DE DATOS ----------------------

    // ALERTA BORRAR SIMULACION ------------------
    public void MostrarAlertaDialogoBorrarSimulacion(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Docente_Menu.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_borrar, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_borrar, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BD_usuarioSimulacion();
                        ToastBien("Datos borrados con éxito.");
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // ALERTA BORRAR SIMULACION ------------------
    // SIMULACION -------------------------------------------------------------------------------------------------

    // EVALUACION 1 -------------------------------------------------------------------------------------------------
    // CLASE BASE DE DATOS ----------------------
    public void BD_usuarioEvaluacion1() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();

        BaseFinal.execSQL("Delete from tb_evaluacion1");
        BaseFinal.execSQL("Delete from tb_notaseval1");

        BaseFinal.close();
    }
    // CLASE BASE DE DATOS ----------------------

    // ALERTA BORRAR SIMULACION ------------------
    public void MostrarAlertaDialogoBorrarEvaluacion1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Docente_Menu.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_borrar, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_borrar, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BD_usuarioEvaluacion1();
                        ToastBien("Datos borrados con éxito.");
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // ALERTA BORRAR SIMULACION ------------------
    // EVALUACION 1 -------------------------------------------------------------------------------------------------

    // EVALUACION 2 -------------------------------------------------------------------------------------------------
    // CLASE BASE DE DATOS ----------------------
    public void BD_usuarioEvaluacion2() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();

        BaseFinal.execSQL("Delete from tb_evaluacion2");
        BaseFinal.execSQL("Delete from tb_notaseval2");

        BaseFinal.close();
    }
    // CLASE BASE DE DATOS ----------------------

    // ALERTA BORRAR SIMULACION ------------------
    public void MostrarAlertaDialogoBorrarEvaluacion2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Docente_Menu.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_borrar, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_borrar, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BD_usuarioEvaluacion2();
                        ToastBien("Datos borrados con éxito.");
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // ALERTA BORRAR SIMULACION ------------------
    // EVALUACION 2 -------------------------------------------------------------------------------------------------

    // EVALUACION 3 -------------------------------------------------------------------------------------------------
    // CLASE BASE DE DATOS ----------------------
    public void BD_usuarioEvaluacion3() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();

        BaseFinal.execSQL("Delete from tb_evaluacion3");
        BaseFinal.execSQL("Delete from tb_notaseval3");

        BaseFinal.close();
    }
    // CLASE BASE DE DATOS ----------------------

    // ALERTA BORRAR SIMULACION ------------------
    public void MostrarAlertaDialogoBorrarEvaluacion3(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Docente_Menu.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_borrar, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_borrar, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BD_usuarioEvaluacion3();
                        ToastBien("Datos borrados con éxito.");
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // ALERTA BORRAR SIMULACION ------------------
    // EVALUACION 3 -------------------------------------------------------------------------------------------------

    // EVALUACION 4 -------------------------------------------------------------------------------------------------
    // CLASE BASE DE DATOS ----------------------
    public void BD_usuarioEvaluacion4() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();

        BaseFinal.execSQL("Delete from tb_evaluacion4");
        BaseFinal.execSQL("Delete from tb_notaseval4");

        BaseFinal.close();
    }
    // CLASE BASE DE DATOS ----------------------

    // ALERTA BORRAR SIMULACION ------------------
    public void MostrarAlertaDialogoBorrarEvaluacion4(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Docente_Menu.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_dialogo_borrar, null);
        builder.setView(view);
        builder.setView(inflater.inflate(R.layout.alerta_dialogo_borrar, null))
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BD_usuarioEvaluacion4();
                        ToastBien("Datos borrados con éxito.");
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }
    // ALERTA BORRAR SIMULACION ------------------
    // EVALUACION 4 -------------------------------------------------------------------------------------------------


    // MÉTODO DE DISEÑO BIEN DEL TOAST ----------------------------------------------------------------------------
    public void ToastBien(String texto){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_diseno_bien, (ViewGroup)findViewById(R.id.toast_diseno_bien));

        TextView textView = layout.findViewById(R.id.txt_diseno_bien);
        textView.setText(texto);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL| Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    // MÉTODO DE DISEÑO BIEN DEL TOAST ----------------------------------------------------------------------------

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
