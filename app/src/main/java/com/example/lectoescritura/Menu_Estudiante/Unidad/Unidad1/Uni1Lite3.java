package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni1Lite3 extends AppCompatActivity {
    private ImageView Ima_VacaLeche, Ima_Fiesta, Ima_Leche;
    private CheckBox U1L3E1cbxOp1, U1L3E1cbxOp2, U1L3E1cbxOp3;
    private TextView U1L3E1Respuesta01, U1L3E2Respuesta02, U1L3E3Respuesta03, U1L3E4aRespuesta04a, U1L3E4bRespuesta04b;
    private RadioButton U1L3E2rdnOpcion1, U1L3E2rdnOpcion2, U1L3E2rdnOpcion3, U1L3E3rdnVerdadero, U1L3E3rdnFalso;
    private EditText U1L3E4aIngreso01, U1L3E4bIngreso02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_VacaLeche = (ImageView)findViewById(R.id.IMAUni01VacaLeche);
        Ima_Fiesta = (ImageView)findViewById(R.id.IMAUni01Fiesta);
        Ima_Leche = (ImageView)findViewById(R.id.IMAUni01Leche);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite3_vacaleche).into(Ima_VacaLeche);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite3_fiesta).into(Ima_Fiesta);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite3_leche).into(Ima_Leche);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L3E1cbxOp1 = (CheckBox)findViewById(R.id.cbxUni01L03Eje01_op1);
        U1L3E1cbxOp2 = (CheckBox)findViewById(R.id.cbxUni01L03Eje01_op2);
        U1L3E1cbxOp3 = (CheckBox)findViewById(R.id.cbxUni01L03Eje01_op3);
        U1L3E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite03_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L3E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L03Eje02_op1);
        U1L3E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L03Eje02_op2);
        U1L3E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L03Eje02_op3);
        U1L3E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite03_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U1L3E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni01L03Eje03_op1);
        U1L3E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni01L03Eje03_op2);
        U1L3E3Respuesta03 = (TextView)findViewById(R.id.txtUni01Lite03_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U1L3E4aIngreso01 = (EditText)findViewById(R.id.txtUni01Lite03_Ingreso01);
        U1L3E4aRespuesta04a = (TextView)findViewById(R.id.txtUni01Lite03_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U1L3E4bIngreso02 = (EditText)findViewById(R.id.txtUni01Lite03_Ingreso02);
        U1L3E4bRespuesta04b = (TextView)findViewById(R.id.txtUni01Lite03_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite03Eje01 (View view) {

        if ((U1L3E1cbxOp1.isChecked() == true && U1L3E1cbxOp2.isChecked() == true  && U1L3E1cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U1L3E1Respuesta01.setText("");

        }  else if ((U1L3E1cbxOp1.isChecked() == true && U1L3E1cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U1L3E1Respuesta01.setText("Respuestas correctas.");

        }  else if ((U1L3E1cbxOp1.isChecked() == true && U1L3E1cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E1Respuesta01.setText("Solo una opción es la correcta, revise la página 40 del libro.");

        }  else if ((U1L3E1cbxOp3.isChecked() == true && U1L3E1cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E1Respuesta01.setText("Solo una opción es la correcta, revise la página 40 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U1L3E1Respuesta01.setText("");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite03Eje02 (View view) {

        if (U1L3E2rdnOpcion3.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L3E2Respuesta02.setText("Respuesta correcta. Un informe es un tipo de texto que consigna una información determinada, de forma concreta y resumida, con el objetivo de pasar la información a una tercera persona.");

        } else if (U1L3E2rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E2Respuesta02.setText("Respuesta incorrecta, revise la página 39 del libro.");

        } else if (U1L3E2rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E2Respuesta02.setText("Respuesta incorrecta, revise la página 39 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni01Lite03Eje03 (View view) {
        if (U1L3E3rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L3E3Respuesta03.setText("Respuesta correcta.");

        } else if (U1L3E3rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E3Respuesta03.setText("Respuesta incorrecta, revise la página 39 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni01Lite03Eje04a (View view){
        String respuesta04a = U1L3E4aIngreso01.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L3E4aIngreso01.requestFocus();
            U1L3E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L3E4aIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("fiesta")) || respuesta04a.equals("fiesta ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L3E4aRespuesta04a.setText("Respuesta correcta. Quería comprar un vestido para la fiesta.");

        } else if ((respuesta04a.equals("Fiesta")) || respuesta04a.equals("Fiesta ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E4aRespuesta04a.setText("*Fiesta* es una respuesta incorrecta, recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta04a.equals("reunión")) || respuesta04a.equals("reunión ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E4aRespuesta04a.setText("*reunión* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("reunion")) || respuesta04a.equals("reunion ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E4aRespuesta04a.setText("*reunion* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U1L3E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni01Lite03Eje04b (View view){
        String respuesta04b = U1L3E4bIngreso02.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L3E4bIngreso02.requestFocus();
            U1L3E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L3E4bIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("la leche")) || respuesta04b.equals("la leche ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L3E4bRespuesta04b.setText("Respuesta correcta. Se regó la leche.");

        } else if ((respuesta04b.equals("leche")) || respuesta04b.equals("leche ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E4bRespuesta04b.setText("*leche* es una respuesta incorrecta, recuerde usar los artículos de manera adecuada.");

        } else if ((respuesta04b.equals("agua")) || respuesta04b.equals("agua ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L3E4bRespuesta04b.setText("*agua* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U1L3E4bRespuesta04b.setText("");
        }
    }
    // EJERCICIO 4b ---------------------------------------------------------------------------------------------


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

        Drawable drawableIma_VacaLeche = Ima_VacaLeche.getDrawable();
        ((Animatable) drawableIma_VacaLeche).stop();

        Drawable drawableIma_Fiesta = Ima_Fiesta.getDrawable();
        ((Animatable) drawableIma_Fiesta).stop();

        Drawable drawableIma_Leche = Ima_Leche.getDrawable();
        ((Animatable) drawableIma_Leche).stop();

    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
