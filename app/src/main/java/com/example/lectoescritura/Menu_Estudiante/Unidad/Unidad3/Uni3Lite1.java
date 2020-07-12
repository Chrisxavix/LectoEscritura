package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni3Lite1 extends AppCompatActivity {
    private ImageView Ima_Jirafa, Ima_Jirafa2, Ima_Pais;
    private RadioButton U3L1E2rdnOpcion1, U3L1E2rdnOpcion2, U3L1E2rdnOpcion3, U3L1E1rdnVerdadero, U3L1E1rdnFalso;
    private TextView U3L1E1Respuesta01, U3L1E2Respuesta02, U3L1E3Respuesta03, U3L1E4Respuesta04, U3L1E5aRespuesta05a,
            U3L1E5bRespuesta05b;
    private EditText U3L1E3Ingreso01, U3L1E4Ingreso02, U3L1E5aIngreso03, U3L1E5bIngreso04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni3_lite1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Jirafa = (ImageView)findViewById(R.id.IMAUni03Jirafa);
        Ima_Jirafa2 = (ImageView)findViewById(R.id.IMAUni03Jirafa2);
        Ima_Pais = (ImageView)findViewById(R.id.IMAUni03Pais);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni3lite1_jirafa).into(Ima_Jirafa);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite1_jirafa2).into(Ima_Jirafa2);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite1_pais).into(Ima_Pais);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U3L1E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni03L01Eje01_op1);
        U3L1E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni03L01Eje01_op2);
        U3L1E1Respuesta01 = (TextView)findViewById(R.id.txtUni03Lite01_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U3L1E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni03L01Eje02_op1);
        U3L1E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni03L01Eje02_op2);
        U3L1E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni03L01Eje02_op3);
        U3L1E2Respuesta02 = (TextView)findViewById(R.id.txtUni03Lite01_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U3L1E3Ingreso01 = (EditText)findViewById(R.id.txtUni03Lite01_Ingreso01);
        U3L1E3Respuesta03 = (TextView)findViewById(R.id.txtUni03Lite01_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U3L1E4Ingreso02 = (EditText)findViewById(R.id.txtUni03Lite01_Ingreso02);
        U3L1E4Respuesta04 = (TextView)findViewById(R.id.txtUni03Lite01_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U3L1E5aIngreso03 = (EditText)findViewById(R.id.txtUni03Lite01_Ingreso03);
        U3L1E5aRespuesta05a = (TextView)findViewById(R.id.txtUni03Lite01_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U3L1E5bIngreso04 = (EditText)findViewById(R.id.txtUni03Lite01_Ingreso04);
        U3L1E5bRespuesta05b = (TextView)findViewById(R.id.txtUni03Lite01_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje01 (View view) {
        if (U3L1E1rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E1Respuesta01.setText("Respuesta correcta.");

        } else if (U3L1E1rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 127 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje02 (View view) {

        if (U3L1E2rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E2Respuesta02.setText("Respuesta correcta. Las lenguas no son unas estructuras cerradas, sino que viven constantes transformaciones.");

        } else if (U3L1E2rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E2Respuesta02.setText("Respuesta incorrecta, revise la página 128 del libro.");

        } else if (U3L1E2rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E2Respuesta02.setText("Respuesta incorrecta, revise la página 128 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje03 (View view){
        String respuesta01 = U3L1E3Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L1E3Ingreso01.requestFocus();
            U3L1E3Respuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L1E3Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("XVIII")) || respuesta01.equals("XVIII ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E3Respuesta03.setText("Respuesta correcta. Se comenzó a llamar español a partir del siglo XVIII.");

        } else if ((respuesta01.equals("XVII")) || respuesta01.equals("XVII ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E3Respuesta03.setText("*XVII* es una respuesta incorrecta, revise la página 128 del libro.");

        } else if ((respuesta01.equals("XVI")) || respuesta01.equals("XVI ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E3Respuesta03.setText("*XVI* es una respuesta incorrecta, revise la página 128 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U3L1E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje04 (View view){
        String respuesta02 = U3L1E4Ingreso02.getText().toString();

        if (respuesta02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L1E4Ingreso02.requestFocus();
            U3L1E4Respuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L1E4Ingreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta02.equals("comunicación")) || respuesta02.equals("comunicación ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E4Respuesta04.setText("Respuesta correcta. La lengua es una herramienta de comunicación.");

        } else if ((respuesta02.equals("comunicacion")) || respuesta02.equals("comunicacion ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E4Respuesta04.setText("*comunicacion* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta02.equals("transformación")) || respuesta02.equals("transformación ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E4Respuesta04.setText("*transformación* es una respuesta incorrecta, revise la página 129 del libro.");

        }  else if ((respuesta02.equals("transformacion")) || respuesta02.equals("transformacion ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E4Respuesta04.setText("*transformacion* es una respuesta incorrecta, revise la página 129 del libro y recuerde usar las tildes de manera adecuada.");

        }  else if ((respuesta02.equals("explorar")) || respuesta02.equals("explorar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E4Respuesta04.setText("*explorar* es una respuesta incorrecta, revise la página 129 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta02 + "* no es una opción.");
            U3L1E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje05a (View view){
        String respuesta05a = U3L1E5aIngreso03.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L1E5aIngreso03.requestFocus();
            U3L1E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L1E5aIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("país")) || respuesta05a.equals("país ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E5aRespuesta05a.setText("Respuesta correcta. Salió del país en busca de medicinas.");

        } else if ((respuesta05a.equals("pais")) || respuesta05a.equals("pais ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E5aRespuesta05a.setText("*pais* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta05a.equals("pueblo")) || respuesta05a.equals("pueblo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E5aRespuesta05a.setText("*pueblo* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("campo")) || respuesta05a.equals("campo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E5aRespuesta05a.setText("*campo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U3L1E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni03Lite01Eje05b (View view){
        String respuesta05b = U3L1E5bIngreso04.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L1E5bIngreso04.requestFocus();
            U3L1E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L1E5bIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("jirafa")) || respuesta05b.equals("jirafa ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L1E5bRespuesta05b.setText("Respuesta correcta. La jirafa estaba enferma.");

        } else if ((respuesta05b.equals("cebra")) || respuesta05b.equals("cebra ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E5bRespuesta05b.setText("*cebra* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("vaca")) || respuesta05b.equals("vaca ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L1E5bRespuesta05b.setText("*vaca* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U3L1E5bRespuesta05b.setText("");
        }
    }
    // EJERCICIO 5b ---------------------------------------------------------------------------------------------


    // MÉTODO DE DISEÑO MAL DEL TOAST ----------------------------------------------------------------------------
    public void ToastMal(String texto){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_diseno_mal, (ViewGroup)findViewById(R.id.toast_diseno_mal));

        TextView textView = layout.findViewById(R.id.txt_diseno_mal);
        textView.setText(texto);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL| Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    // MÉTODO DE DISEÑO MAL DEL TOAST ----------------------------------------------------------------------------

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

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
        Drawable drawableIma_Jirafa = Ima_Jirafa.getDrawable();
        ((Animatable) drawableIma_Jirafa).stop();

        Drawable drawableIma_Jirafa2 = Ima_Jirafa2.getDrawable();
        ((Animatable) drawableIma_Jirafa2).stop();

        Drawable drawableIma_Pais = Ima_Pais.getDrawable();
        ((Animatable) drawableIma_Pais).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
