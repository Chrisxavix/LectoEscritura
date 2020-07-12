package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion1.eval_evalua04;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion1.eval_evalua08;
import com.example.lectoescritura.R;

public class eval_evalua208 extends AppCompatActivity {
    int score;
    int notafinal;
    int pregunta;

    private TextView visu_usuario;
    private String obtiene_nombre, obtiene_notafinal;

    private RadioButton rdnEval2Pregu08Opcion3;
    private ImageView Ima_pregunta8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_evalua208);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------
        visu_usuario = (TextView)findViewById(R.id.textEval2_usuario);
        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------

        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------
        obtiene_nombre = getIntent().getStringExtra("usuario");
        visu_usuario.setText("Usuario: " + obtiene_nombre);
        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------

        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------
        obtiene_notafinal = getIntent().getStringExtra("notafinal");
        notafinal = Integer.parseInt(obtiene_notafinal);
        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_pregunta8 = (ImageView)findViewById(R.id.Ima_pregunta8);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.evaluacion2_08).into(Ima_pregunta8);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 8 ------------------------------------------------------------------------------------------
        rdnEval2Pregu08Opcion3 = (RadioButton)findViewById(R.id.rdnEval2Pre08);
        // PREGUNTA 8 ------------------------------------------------------------------------------------------
    }

    // PREGUNTA 8 ---------------------------------------------------------------------------------------------
    public void Evaluacion2Pregunta08 (View view) {

        if (rdnEval2Pregu08Opcion3.isChecked() == true) {

            score = 1;
            notafinal++;
            pregunta =8;
            BD_usuario();
            Intent intent = new Intent(this, eval_evalua209.class);
            obtiene_notafinal = String.valueOf(notafinal);
            intent.putExtra("notafinal", obtiene_notafinal);
            intent.putExtra("usuario", obtiene_nombre);
            startActivity(intent);
            finish();


        } else {

            score = 0;
            pregunta =8;
            BD_usuario();
            Intent intent = new Intent(this, eval_evalua209.class);
            obtiene_notafinal = String.valueOf(notafinal);
            intent.putExtra("notafinal", obtiene_notafinal);
            intent.putExtra("usuario", obtiene_nombre);
            startActivity(intent);
            finish();
        }
    }
    // PREGUNTA 8 ---------------------------------------------------------------------------------------------

    // NO RESPONDE ----------------------------------------------------------------------------------------------
    public void NoRespondeEvaluacion2Preg08 (View view){

        score = 0;
        pregunta =8;
        BD_usuario();
        Intent intent = new Intent(this, eval_evalua209.class);
        obtiene_notafinal = String.valueOf(notafinal);
        intent.putExtra("notafinal", obtiene_notafinal);
        intent.putExtra("usuario", obtiene_nombre);
        startActivity(intent);
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
        BaseFinal.insert("tb_evaluacion2", null, registro);
        BaseFinal.close();
    }
    // CLASE BASE DE DATOS -----------------------------------------------------------------------------------------

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

    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
    @Override
    public void onBackPressed()
    {
        ToastError("EVALUACIÓN, no puede regresar.");
    }
    // TECLA DE ATRAS, PERMITE JUGAR CON EL NAVEADOR -----------------------------------------------
}
