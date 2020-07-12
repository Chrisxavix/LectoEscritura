package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.R;

public class eval_evalua410 extends AppCompatActivity {
    int score;
    int notafinal;
    int pregunta;

    private TextView visu_usuario;
    private String obtiene_nombre, obtiene_notafinal;

    private RadioButton rdnEval4Pregu10OpcionFalso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_evalua410);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------
        visu_usuario = (TextView)findViewById(R.id.textEval4_usuario);
        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------

        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------
        obtiene_nombre = getIntent().getStringExtra("usuario");
        visu_usuario.setText("Usuario: " + obtiene_nombre);
        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------

        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------
        obtiene_notafinal = getIntent().getStringExtra("notafinal");
        notafinal = Integer.parseInt(obtiene_notafinal);
        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------

        // PREGUNTA 10 ------------------------------------------------------------------------------------------
        rdnEval4Pregu10OpcionFalso = (RadioButton)findViewById(R.id.rdnEval4Pre10);
        // PREGUNTA 10 ------------------------------------------------------------------------------------------
    }

    // PREGUNTA 10 ---------------------------------------------------------------------------------------------
    public void Evaluacion4Pregunta10 (View view) {
        if (rdnEval4Pregu10OpcionFalso.isChecked() == true) {

            score = 1;
            notafinal++;
            pregunta =10;
            BD_usuario();
            PuntajeFinal();
            ToastBien("Felicidades, ha terminado la Evaluacion 4.");
            finish();


        } else {

            score = 0;
            pregunta =10;
            BD_usuario();
            PuntajeFinal();
            ToastBien("Felicidades, ha terminado la Evaluacion 4.");
            finish();

        }
    }
    // PREGUNTA 10 ---------------------------------------------------------------------------------------------

    // NO RESPONDE ----------------------------------------------------------------------------------------------
    public void NoRespondeEvaluacion4Preg10 (View view){

        score = 0;
        pregunta =10;
        BD_usuario();
        PuntajeFinal();
        ToastBien("Felicidades, ha terminado la Evaluacion 4.");
        finish();
    }
    // NO RESPONDE ----------------------------------------------------------------------------------------------

    // CLASE BASE DE DATOS -----------------------------------------------------------------------------------------
    public void BD_usuario() {

        ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
        SQLiteDatabase BaseFinal = admin.getWritableDatabase();


        ContentValues registro = new ContentValues();
        registro.put("usuario", obtiene_nombre);
        registro.put("score", score);
        registro.put("pregunta", pregunta);
        registro.put("notafinal", notafinal);
        BaseFinal.insert("tb_evaluacion4", null, registro);
        BaseFinal.close();

    }
    // CLASE BASE DE DATOS -----------------------------------------------------------------------------------------

    // CLASE BASE DE PUNTUACIÓN ------------------------------------------------------------------------------------
    public void PuntajeFinal () {

        if (notafinal == 0) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 1) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 2) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 3) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 4) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 5) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 6) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 7) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 8) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 9) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else if (notafinal == 10) {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();

            ContentValues registro = new ContentValues();
            registro.put("nombre", obtiene_nombre);
            registro.put("notafinal", notafinal);
            BaseFinal.insert("tb_notaseval4", null, registro);
            BaseFinal.close();

        } else {
            ClaseBaseDatos admin = new ClaseBaseDatos(this, "BaseLecto", null, 1);
            SQLiteDatabase BaseFinal = admin.getWritableDatabase();
            BaseFinal.close();
        }
    }
    // CLASE BASE DE PUNTUACIÓN ------------------------------------------------------------------------------------

    // MÉTODO DE DISEÑO MAL DEL TOAST ----------------------------------------------------------------------------
    public void ToastError(String texto){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_diseno_error, (ViewGroup)findViewById(R.id.toast_diseno_error));

        TextView textView = layout.findViewById(R.id.txt_diseno_error);
        textView.setText(texto);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL| Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    // MÉTODO DE DISEÑO MAL DEL TOAST ----------------------------------------------------------------------------

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

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        ToastError("EVALUACIÓN, no puede regresar.");
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
