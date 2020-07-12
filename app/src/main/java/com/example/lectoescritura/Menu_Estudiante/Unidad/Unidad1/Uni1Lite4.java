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

public class Uni1Lite4 extends AppCompatActivity {
    private ImageView Ima_FiestaRana, Ima_Rana, Ima_Monumento;
    private RadioButton U1L4E1rdnOpcion1, U1L4E1rdnOpcion2, U1L4E1rdnOpcion3, U1L4E3rdnVerdadero, U1L4E3rdnFalso;
    private TextView U1L4E1Respuesta01, U1L4E2Respuesta02, U1L4E3Respuesta03, U1L4E4aRespuesta04a, U1L4E4bRespuesta04b;
    private EditText U1L4E2Ingreso01, U1L4E4aIngreso02, U1L4E4bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_FiestaRana = (ImageView)findViewById(R.id.IMAUni01FiestaRana);
        Ima_Rana = (ImageView)findViewById(R.id.IMAUni01Rana);
        Ima_Monumento = (ImageView)findViewById(R.id.IMAUni01Monumento);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite4_fiestarana).into(Ima_FiestaRana);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite4_rana).into(Ima_Rana);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite4_monumento).into(Ima_Monumento);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L4E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L04Eje01_op1);
        U1L4E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L04Eje01_op2);
        U1L4E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L04Eje01_op3);
        U1L4E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite04_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L4E2Ingreso01 = (EditText)findViewById(R.id.txtUni01Lite04_Ingreso01);
        U1L4E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite04_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U1L4E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni01L04Eje03_op1);
        U1L4E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni01L04Eje03_op2);
        U1L4E3Respuesta03 = (TextView)findViewById(R.id.txtUni01Lite04_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U1L4E4aIngreso02 = (EditText)findViewById(R.id.txtUni01Lite04_Ingreso02);
        U1L4E4aRespuesta04a = (TextView)findViewById(R.id.txtUni01Lite04_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U1L4E4bIngreso03 = (EditText)findViewById(R.id.txtUni01Lite04_Ingreso03);
        U1L4E4bRespuesta04b = (TextView)findViewById(R.id.txtUni01Lite04_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------


    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite04Eje01 (View view) {

        if (U1L4E1rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L4E1Respuesta01.setText("Respuesta correcta. La oración tiene dos partes básicas: Sujeto y predicado.");

        } else if (U1L4E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 51 del libro.");

        } else if (U1L4E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 51 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite04Eje02 (View view){
        String respuesta02 = U1L4E2Ingreso01.getText().toString();

        if (respuesta02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L4E2Ingreso01.requestFocus();
            U1L4E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L4E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta02.equals("verbo")) || respuesta02.equals("verbo ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L4E2Respuesta02.setText("Respuesta correcta. El núcleo de un predicado es siempre un verbo.");

        } else if ((respuesta02.equals("sujeto")) || respuesta02.equals("sujeto ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E2Respuesta02.setText("*sujeto* es una respuesta incorrecta, revise la página 51 del libro.");

        } else if ((respuesta02.equals("adjetivo")) || respuesta02.equals("adjetivo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E2Respuesta02.setText("*adjetivo* es una respuesta incorrecta, revise la página 51 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta02 + "* no es una opción.");
            U1L4E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni01Lite04Eje03 (View view) {
        if (U1L4E3rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L4E3Respuesta03.setText("Respuesta correcta. Ya que el predicado es la parte de la oración que expresa la acción que realiza el sujeto o el estado en que este puede encontrarse.");

        } else if (U1L4E3rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E3Respuesta03.setText("Respuesta incorrecta, revise la página 51 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni01Lite04Eje04a (View view){
        String respuesta04a = U1L4E4aIngreso02.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L4E4aIngreso02.requestFocus();
            U1L4E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L4E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("las ranas")) || respuesta04a.equals("las ranas ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L4E4aRespuesta04a.setText("Respuesta correcta. En el lago vivían las ranas.");

        } else if ((respuesta04a.equals("los ranas")) || respuesta04a.equals("los ranas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E4aRespuesta04a.setText("*los ranas* es una respuesta incorrecta, recuerde usar los artículos de manera adecuada.");

        } else if ((respuesta04a.equals("los gatos")) || respuesta04a.equals("los gatos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E4aRespuesta04a.setText("*los gatos* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U1L4E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni01Lite04Eje04b (View view){
        String respuesta04b = U1L4E4bIngreso03.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L4E4bIngreso03.requestFocus();
            U1L4E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L4E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("un monumento")) || respuesta04b.equals("un monumento ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L4E4bRespuesta04b.setText("Respuesta correcta. Que era un monumento de alguna tribu.");

        } else if ((respuesta04b.equals("Un monumento")) || respuesta04b.equals("Un monumento ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E4bRespuesta04b.setText("*Un monumento* es una respuesta incorrecta, recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta04b.equals("recuerdo")) || respuesta04b.equals("recuerdo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L4E4bRespuesta04b.setText("*recuerdo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U1L4E4bRespuesta04b.setText("");
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

        Drawable drawableIma_FiestaRana = Ima_FiestaRana.getDrawable();
        ((Animatable) drawableIma_FiestaRana).stop();

        Drawable drawableIma_Rana = Ima_Rana.getDrawable();
        ((Animatable) drawableIma_Rana).stop();

        Drawable drawableIma_Monumento = Ima_Monumento.getDrawable();
        ((Animatable) drawableIma_Monumento).stop();

    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}

