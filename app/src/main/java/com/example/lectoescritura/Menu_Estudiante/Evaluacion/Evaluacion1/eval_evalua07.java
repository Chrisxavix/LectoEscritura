package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.BaseDatos.ClaseBaseDatos;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Simulacion.eval_simu05;
import com.example.lectoescritura.R;

public class eval_evalua07 extends AppCompatActivity {
    int score;
    int notafinal;
    int pregunta;

    private TextView visu_usuario;
    private String obtiene_nombre, obtiene_notafinal;

    private EditText Eval1Pre07_Ingreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_evalua07);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------
        visu_usuario = (TextView)findViewById(R.id.textEval1_usuario);
        // DECLARACION TEXTVIEW PARA PASAR EL NOMBRE ENTRE ACTIVIDADES -------------------------------------------

        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------
        obtiene_nombre = getIntent().getStringExtra("usuario");
        visu_usuario.setText("Usuario: " + obtiene_nombre);
        // OBTIENE EL NOMBRE DE USUARIO DE LA ACTIVIDAD ANTERIOR -------------------------------------------------

        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------
        obtiene_notafinal = getIntent().getStringExtra("notafinal");
        notafinal = Integer.parseInt(obtiene_notafinal);
        // OBTIENE LA NOTA FINAL DE USUARIO DE LA ACTIVIDAD ANTERIOR ---------------------------------------------

        // PREGUNTA 7 ------------------------------------------------------------------------------------------
        Eval1Pre07_Ingreso = (EditText)findViewById(R.id.txtEval1Pre07_Ingreso);
        // PREGUNTA 7 ------------------------------------------------------------------------------------------
    }

    // PREGUNTA 7 ---------------------------------------------------------------------------------------------
    public void Evaluacion1Pregunta07 (View view){
        String respuesta01 = Eval1Pre07_Ingreso.getText().toString();

        if ((respuesta01.equals("roja")) || respuesta01.equals("roja ")) {
            score = 1;
            notafinal++;
            pregunta =7;
            BD_usuario();
            Intent intent = new Intent(this, eval_evalua08.class);
            obtiene_notafinal = String.valueOf(notafinal);
            intent.putExtra("notafinal", obtiene_notafinal);
            intent.putExtra("usuario", obtiene_nombre);
            startActivity(intent);
            finish();

        }  else {

            score = 0;
            pregunta =7;
            BD_usuario();
            Intent intent = new Intent(this, eval_evalua08.class);
            obtiene_notafinal = String.valueOf(notafinal);
            intent.putExtra("notafinal", obtiene_notafinal);
            intent.putExtra("usuario", obtiene_nombre);
            startActivity(intent);
            finish();

        }
    }
    // PREGUNTA 7 ---------------------------------------------------------------------------------------------

    // NO RESPONDE ----------------------------------------------------------------------------------------------
    public void NoRespondeEvaluacion1Preg07 (View view){

        score = 0;
        pregunta =7;
        BD_usuario();
        Intent intent = new Intent(this, eval_evalua08.class);
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
        BaseFinal.insert("tb_evaluacion1", null, registro);
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
