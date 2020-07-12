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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni2Lite5 extends AppCompatActivity {
    private RadioButton U2L5E2rdnOpcion1, U2L5E2rdnOpcion2, U2L5E2rdnOpcion3, U2L5E1rdnVerdadero, U2L5E1rdnFalso;
    private CheckBox U2L5E3cbxOp1, U2L5E3cbxOp2, U2L5E3cbxOp3;
    private TextView U2L5E1Respuesta01, U2L5E2Respuesta02, U2L5E3Respuesta03, U2L5E4aRespuesta04a,
            U2L5E4bRespuesta04b;
    private EditText U2L5E4aIngreso01, U2L5E4bIngreso02;
    private ImageView Ima_Zorra, Ima_Uva, Ima_Pajaro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2_lite5);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Zorra = (ImageView)findViewById(R.id.IMAUni02Zorra);
        Ima_Uva = (ImageView)findViewById(R.id.IMAUni02Uva);
        Ima_Pajaro = (ImageView)findViewById(R.id.IMAUni02Pajaro);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni2lite5_zorra).into(Ima_Zorra);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite5_uva).into(Ima_Uva);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite5_pajaro).into(Ima_Pajaro);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U2L5E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni02L05Eje01_op1);
        U2L5E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni02L05Eje01_op2);
        U2L5E1Respuesta01 = (TextView)findViewById(R.id.txtUni02Lite05_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U2L5E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni02L05Eje02_op1);
        U2L5E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni02L05Eje02_op2);
        U2L5E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni02L05Eje02_op3);
        U2L5E2Respuesta02 = (TextView)findViewById(R.id.txtUni02Lite05_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U2L5E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni02L05Eje03_op1);
        U2L5E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni02L05Eje03_op2);
        U2L5E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni02L05Eje03_op3);
        U2L5E3Respuesta03 = (TextView)findViewById(R.id.txtUni02Lite05_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U2L5E4aIngreso01 = (EditText)findViewById(R.id.txtUni02Lite05_Ingreso01);
        U2L5E4aRespuesta04a = (TextView)findViewById(R.id.txtUni02Lite05_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U2L5E4bIngreso02 = (EditText)findViewById(R.id.txtUni02Lite05_Ingreso02);
        U2L5E4bRespuesta04b = (TextView)findViewById(R.id.txtUni02Lite05_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni02Lite05Eje01 (View view) {
        if (U2L5E1rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L5E1Respuesta01.setText("Respuesta correcta.");

        } else if (U2L5E1rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E1Respuesta01.setText("Respuesta incorrecta, revise la página 115 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni02Lite05Eje02 (View view) {

        if (U2L5E2rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L5E2Respuesta02.setText("Respuesta correcta. Al final de una conferencia se invita al público a que formule preguntas para ser respondidas por el conferencista.");

        } else if (U2L5E2rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E2Respuesta02.setText("Respuesta incorrecta, revise la página 115 del libro.");

        } else if (U2L5E2rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E2Respuesta02.setText("Respuesta incorrecta, revise la página 115 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni03Lite05Eje03 (View view) {

        if ((U2L5E3cbxOp1.isChecked() == true && U2L5E3cbxOp2.isChecked() == true  && U2L5E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L5E3Respuesta03.setText("");

        }  else if ((U2L5E3cbxOp1.isChecked() == true && U2L5E3cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U2L5E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U2L5E3cbxOp1.isChecked() == true && U2L5E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E3Respuesta03.setText("Solo una opción es la correcta, revise la página 116 del libro.");

        }  else if ((U2L5E3cbxOp3.isChecked() == true && U2L5E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E3Respuesta03.setText("Solo una opción es la correcta, revise la página 116 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L5E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni02Lite05Eje04a (View view){
        String respuesta04a = U2L5E4aIngreso01.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L5E4aIngreso01.requestFocus();
            U2L5E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L5E4aIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("uvas")) || respuesta04a.equals("uvas ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L5E4aRespuesta04a.setText("Respuesta correcta. La zorra quería agarrar las uvas.");

        } else if ((respuesta04a.equals("manzanas")) || respuesta04a.equals("manzanas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E4aRespuesta04a.setText("*manzanas* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("fresas")) || respuesta04a.equals("fresas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E4aRespuesta04a.setText("*fresas* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U2L5E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni02Lite05Eje04b (View view){
        String respuesta04b = U2L5E4bIngreso02.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L5E4bIngreso02.requestFocus();
            U2L5E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L5E4bIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("pájaro")) || respuesta04b.equals("pájaro ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L5E4bRespuesta04b.setText("Respuesta correcta. Un pájaro le estuvo viendo.");

        } else if ((respuesta04b.equals("pajaro")) || respuesta04b.equals("pajaro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E4bRespuesta04b.setText("*pajaro* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta04b.equals("uva")) || respuesta04b.equals("uva ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E4bRespuesta04b.setText("*uva* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04b.equals("gallo")) || respuesta04b.equals("gallo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L5E4bRespuesta04b.setText("*gallo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U2L5E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Zorra = Ima_Zorra.getDrawable();
        ((Animatable) drawableIma_Zorra).stop();

        Drawable drawableIma_Uva = Ima_Uva.getDrawable();
        ((Animatable) drawableIma_Uva).stop();

        Drawable drawableIma_Pajaro = Ima_Pajaro.getDrawable();
        ((Animatable) drawableIma_Pajaro).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
