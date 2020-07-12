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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni1Lite6 extends AppCompatActivity {
    private ImageView Ima_Bruja, Ima_Dinero, Ima_Juicio;
    private RadioButton U1L6E2rdnOpcion1, U1L6E2rdnOpcion2, U1L6E2rdnOpcion3;
    private TextView U1L6E1Respuesta01, U1L6E2Respuesta02, U1L6E3aRespuesta03a, U1L6E3bRespuesta03b;
    private EditText U1L6E1Ingreso01, U1L6E3aIngreso02, U1L6E3bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite6);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Bruja = (ImageView)findViewById(R.id.IMAUni01Bruja);
        Ima_Dinero = (ImageView)findViewById(R.id.IMAUni01Dinero);
        Ima_Juicio = (ImageView)findViewById(R.id.IMAUni01Juicio);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite6_bruja).into(Ima_Bruja);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite6_dinero).into(Ima_Dinero);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite6_juicio).into(Ima_Juicio);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L6E1Ingreso01 = (EditText)findViewById(R.id.txtUni01Lite06_Ingreso01);
        U1L6E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite06_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L6E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L06Eje02_op1);
        U1L6E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L06Eje02_op2);
        U1L6E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L06Eje02_op3);
        U1L6E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite06_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3a ------------------------------------------------------------------------------------------
        U1L6E3aIngreso02 = (EditText)findViewById(R.id.txtUni01Lite06_Ingreso02);
        U1L6E3aRespuesta03a = (TextView)findViewById(R.id.txtUni01Lite06_Eje03a);
        // PREGUNTA 3a ------------------------------------------------------------------------------------------

        // PREGUNTA 3b ------------------------------------------------------------------------------------------
        U1L6E3bIngreso03 = (EditText)findViewById(R.id.txtUni01Lite06_Ingreso03);
        U1L6E3bRespuesta03b = (TextView)findViewById(R.id.txtUni01Lite06_Eje03b);
        // PREGUNTA 3b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite06Eje01 (View view){
        String respuesta01 = U1L6E1Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L6E1Ingreso01.requestFocus();
            U1L6E1Respuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L6E1Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("texto")) || respuesta01.equals("texto ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L6E1Respuesta01.setText("Respuesta correcta. Hay que comprender a fondo el texto.");

        } else if ((respuesta01.equals("Detalle")) || respuesta01.equals("Detalle ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E1Respuesta01.setText("*Detalle* es una respuesta incorrecta, revise la página 59 del libro y recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta01.equals("detalle")) || respuesta01.equals("detalle ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E1Respuesta01.setText("*detalle* es una respuesta incorrecta, revise la página 59 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U1L6E1Respuesta01.setText("");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite06Eje02 (View view) {

        if (U1L6E2rdnOpcion3.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L6E2Respuesta02.setText("Respuesta correcta. La lectura expresiva es una actividad que se efectúa luego de haber leído varias veces y de haber analizado el texto.");

        } else if (U1L6E2rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E2Respuesta02.setText("Respuesta incorrecta, revise la página 59 del libro.");

        } else if (U1L6E2rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E2Respuesta02.setText("Respuesta incorrecta, revise la página 59 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3a ---------------------------------------------------------------------------------------------
    public void Uni01Lite06Eje03a (View view){
        String respuesta03a = U1L6E3aIngreso02.getText().toString();

        if (respuesta03a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L6E3aIngreso02.requestFocus();
            U1L6E3aRespuesta03a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L6E3aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03a.equals("dinero")) || respuesta03a.equals("dinero ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L6E3aRespuesta03a.setText("Respuesta correcta. La bruja conseguía dinero.");

        } else if ((respuesta03a.equals("encantamientos")) || respuesta03a.equals("encantamientos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E3aRespuesta03a.setText("*encantamientos* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta03a.equals("dulces")) || respuesta03a.equals("dulces ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E3aRespuesta03a.setText("*dulces* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta03a + "* no es una opción.");
            U1L6E3aRespuesta03a.setText("");
        }
    }
    // EJERCICIO 3a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni01Lite06Eje03b (View view){
        String respuesta03b = U1L6E3bIngreso03.getText().toString();

        if (respuesta03b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L6E3bIngreso03.requestFocus();
            U1L6E3bRespuesta03b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L6E3bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03b.equals("un juicio")) || respuesta03b.equals("un juicio ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L6E3bRespuesta03b.setText("Respuesta correcta. Tuvo que ir a un juicio.");

        } else if ((respuesta03b.equals("juicio")) || respuesta03b.equals("juicio ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E3bRespuesta03b.setText("*juicio* es una respuesta incorrecta, recuerde usar los artículos de manera adecuada.");

        } else if ((respuesta03b.equals("una reunión")) || respuesta03b.equals("una reunión ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E3bRespuesta03b.setText("*una reunión* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta03b.equals("una reunion")) || respuesta03b.equals("una reunion ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L6E3bRespuesta03b.setText("*una reunion* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar los artículos de manera adecuada.");

        } else {
            ToastError("!ERROR¡ *" + respuesta03b + "* no es una opción.");
            U1L6E3bRespuesta03b.setText("");
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

        Drawable drawableIma_Bruja = Ima_Bruja.getDrawable();
        ((Animatable) drawableIma_Bruja).stop();

        Drawable drawableIma_Dinero = Ima_Dinero.getDrawable();
        ((Animatable) drawableIma_Dinero).stop();

        Drawable drawableIma_Juicio = Ima_Juicio.getDrawable();
        ((Animatable) drawableIma_Juicio).stop();

    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
