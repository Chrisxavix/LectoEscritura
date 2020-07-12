package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad2;

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

public class Uni2Lite2 extends AppCompatActivity {
    private ImageView Ima_Leon, Ima_Leon2, Ima_Gallina;
    private RadioButton U2L2E1rdnVerdadero, U2L2E1rdnFalso, U2L2E2rdnOpcion1, U2L2E2rdnOpcion2, U2L2E2rdnOpcion3,
            U2L2E4rdnOpcion1, U2L2E4rdnOpcion2, U2L2E4rdnOpcion3;
    private TextView U2L2E1Respuesta01, U2L2E2Respuesta02, U2L2E3Respuesta03, U2L2E4Respuesta04, U2L2E5aRespuesta05a,
            U2L2E5bRespuesta05b;
    private EditText U2L2E3Ingreso01, U2L2E5aIngreso02, U2L2E5bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2_lite2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Leon = (ImageView)findViewById(R.id.IMAUni02Leon);
        Ima_Leon2 = (ImageView)findViewById(R.id.IMAUni02Leon2);
        Ima_Gallina = (ImageView)findViewById(R.id.IMAUni02Gallina);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni2lite2_leon).into(Ima_Leon);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite2_leon2).into(Ima_Leon2);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite2_gallina).into(Ima_Gallina);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U2L2E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni02L02Eje01_op1);
        U2L2E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni02L02Eje01_op2);
        U2L2E1Respuesta01 = (TextView)findViewById(R.id.txtUni02Lite02_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U2L2E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni02L02Eje02_op1);
        U2L2E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni02L02Eje02_op2);
        U2L2E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni02L02Eje02_op3);
        U2L2E2Respuesta02 = (TextView)findViewById(R.id.txtUni02Lite02_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U2L2E3Ingreso01 = (EditText)findViewById(R.id.txtUni02Lite02_Ingreso01);
        U2L2E3Respuesta03 = (TextView)findViewById(R.id.txtUni02Lite02_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U2L2E4rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni02L02Eje04_op1);
        U2L2E4rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni02L02Eje04_op2);
        U2L2E4rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni02L02Eje04_op3);
        U2L2E4Respuesta04 = (TextView)findViewById(R.id.txtUni02Lite02_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U2L2E5aIngreso02 = (EditText)findViewById(R.id.txtUni02Lite02_Ingreso02);
        U2L2E5aRespuesta05a = (TextView)findViewById(R.id.txtUni02Lite02_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U2L2E5bIngreso03 = (EditText)findViewById(R.id.txtUni02Lite02_Ingreso03);
        U2L2E5bRespuesta05b = (TextView)findViewById(R.id.txtUni02Lite02_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }


    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje01 (View view) {
        if (U2L2E1rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E1Respuesta01.setText("Respuesta correcta.");

        } else if (U2L2E1rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 97 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje02 (View view) {

        if (U2L2E2rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E2Respuesta02.setText("Respuesta correcta. Es una imagen de publicidad de bebidas.");

        } else if (U2L2E2rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E2Respuesta02.setText("Respuesta incorrecta, observe bien la imagen.");

        } else if (U2L2E2rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E2Respuesta02.setText("Respuesta incorrecta, observe bien la imagen.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje03 (View view){
        String respuesta01 = U2L2E3Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L2E3Ingreso01.requestFocus();
            U2L2E3Respuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L2E3Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("consumo")) || respuesta01.equals("consumo ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E3Respuesta03.setText("Respuesta correcta. Intenta incrementar el consumo de un producto o servicio.");

        } else if ((respuesta01.equals("precio")) || respuesta01.equals("precio ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E3Respuesta03.setText("*precio* es una respuesta incorrecta, revise la página 97 del libro.");

        } else if ((respuesta01.equals("detalle")) || respuesta01.equals("detalle ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E3Respuesta03.setText("*detalle* es una respuesta incorrecta, revise la página 97 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U2L2E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje04 (View view) {

        if (U2L2E4rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E4Respuesta04.setText("Respuesta correcta. En una sociedad como la nuestra, la publicidad se presenta como una comunicación especializada en persuadir.");

        } else if (U2L2E4rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E4Respuesta04.setText("Respuesta incorrecta, revise la página 98 del libro.");

        } else if (U2L2E4rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E4Respuesta04.setText("Respuesta incorrecta, revise la página 98 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje05a (View view){
        String respuesta05a = U2L2E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L2E5aIngreso02.requestFocus();
            U2L2E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L2E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("al león")) || respuesta05a.equals("al león ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E5aRespuesta05a.setText("Respuesta correcta. Se le quedó al león.");

        } else if ((respuesta05a.equals("al leon")) || respuesta05a.equals("al leon ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E5aRespuesta05a.setText("*al leon* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta05a.equals("gallina")) || respuesta05a.equals("gallina ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E5aRespuesta05a.setText("*gallina* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar los artículos de manera adecuada.");

        } else if ((respuesta05a.equals("la gallina")) || respuesta05a.equals("la gallina ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E5aRespuesta05a.setText("*la gallina* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar los artículos de manera adecuada.");

        } else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U2L2E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni02Lite02Eje05b (View view){
        String respuesta05b = U2L2E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L2E5bIngreso03.requestFocus();
            U2L2E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L2E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("gallina")) || respuesta05b.equals("gallina ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L2E5bRespuesta05b.setText("Respuesta correcta. Al león le ayudó a la gallina");

        } else if ((respuesta05b.equals("abeja")) || respuesta05b.equals("abeja ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E5bRespuesta05b.setText("*abeja* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("paloma")) || respuesta05b.equals("paloma ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L2E5bRespuesta05b.setText("*paloma* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U2L2E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Leon = Ima_Leon.getDrawable();
        ((Animatable) drawableIma_Leon).stop();

        Drawable drawableIma_Leon2 = Ima_Leon2.getDrawable();
        ((Animatable) drawableIma_Leon2).stop();

        Drawable drawableIma_Gallina = Ima_Gallina.getDrawable();
        ((Animatable) drawableIma_Gallina).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------

}
