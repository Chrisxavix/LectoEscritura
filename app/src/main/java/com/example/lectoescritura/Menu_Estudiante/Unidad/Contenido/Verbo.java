package com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.R;

public class Verbo extends AppCompatActivity {
    private TextView VerboRespuesta01, VerboRespuesta02, VerboRespuesta03, VerboRespuesta04;
    private EditText VerboIngreso01, VerboIngreso02, VerboIngreso03, VerboIngreso04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbo);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        VerboIngreso01 = (EditText)findViewById(R.id.txtVerboIngreso01);
        VerboIngreso02 = (EditText)findViewById(R.id.txtVerboIngreso02);
        VerboIngreso03 = (EditText)findViewById(R.id.txtVerboIngreso03);
        VerboIngreso04 = (EditText)findViewById(R.id.txtVerboIngreso04);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        VerboRespuesta01 = (TextView)findViewById(R.id.txtVerboRes01);
        VerboRespuesta02 = (TextView)findViewById(R.id.txtVerboRes02);
        VerboRespuesta03 = (TextView)findViewById(R.id.txtVerboRes03);
        VerboRespuesta04 = (TextView)findViewById(R.id.txtVerboRes04);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // VERBO - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void VerboVeri01 (View view){
        String verbo01 = VerboIngreso01.getText().toString();

        if (verbo01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            VerboIngreso01.requestFocus();
            VerboRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(VerboIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((verbo01.equals("jugar")) || verbo01.equals("jugar ")) {
            ToastBien("Excelente, respuesta correcta. ");
            VerboRespuesta01.setText("Respuesta correcta. *jugar* es un verbo infinitvo.");

        } else if ((verbo01.equals("Jugar")) || verbo01.equals("Jugar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta01.setText("*Jugar* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((verbo01.equals("comer")) || verbo01.equals("comer ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta01.setText("*comer* es una respuesta incorrecta, relacione la imagen para colocar el verbo.");

        }  else {
            ToastError("!ERROR¡ *" + verbo01 + "* no es una opción.");
            VerboRespuesta01.setText("");
        }
    }
    // VERBO - EJERCICIO 1 -----------------------------------------------------------------------------------

    // VERBO - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void VerboVeri02 (View view){
        String verbo02 = VerboIngreso02.getText().toString();

        if (verbo02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            VerboIngreso02.requestFocus();
            VerboRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(VerboIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((verbo02.equals("entrenar")) || verbo02.equals("entrenar ")) {
            ToastBien("Excelente, respuesta correcta. ");
            VerboRespuesta02.setText("Respuesta correcta. *entrenar* es un verbo infinitvo.");

        } else if ((verbo02.equals("Entrenar")) || verbo02.equals("Entrenar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta02.setText("*Entrenar* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((verbo02.equals("jugar")) || verbo02.equals("jugar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta02.setText("*jugar* es una respuesta incorrecta, relacione la imagen para colocar el verbo.");

        }  else {
            ToastError("!ERROR¡ *" + verbo02 + "* no es una opción.");
            VerboRespuesta02.setText("");
        }
    }
    // VERBO - EJERCICIO 2 -----------------------------------------------------------------------------------

    // VERBO - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void VerboVeri03 (View view){
        String verbo03 = VerboIngreso03.getText().toString();

        if (verbo03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            VerboIngreso03.requestFocus();
            VerboRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(VerboIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((verbo03.equals("bailando")) || verbo03.equals("bailando ")) {
            ToastBien("Excelente, respuesta correcta. ");
            VerboRespuesta03.setText("Respuesta correcta. *bailando* es un verbo gerudio.");

        } else if ((verbo03.equals("bailar")) || verbo03.equals("bailar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta03.setText("*bailar* es una respuesta incorrecta, relacione la imagen para colocar el verbo.");

        } else if ((verbo03.equals("bailó")) || verbo03.equals("bailó ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta03.setText("*bailó* es una respuesta incorrecta, relacione la imagen para colocar el verbo.");

        }  else {
            ToastError("!ERROR¡ *" + verbo03 + "* no es una opción.");
            VerboRespuesta03.setText("");
        }
    }
    // VERBO - EJERCICIO 3 -----------------------------------------------------------------------------------

    // VERBO - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void VerboVeri04 (View view){
        String verbo04 = VerboIngreso04.getText().toString();

        if (verbo04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            VerboIngreso04.requestFocus();
            VerboRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(VerboIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((verbo04.equals("durmiendo")) || verbo04.equals("durmiendo ")) {
            ToastBien("Excelente, respuesta correcta. ");
            VerboRespuesta04.setText("Respuesta correcta. *durmiendo* es un verbo gerudio.");

        } else if ((verbo04.equals("Durmiendo")) || verbo04.equals("Durmiendo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta04.setText("*Durmiendo* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((verbo04.equals("dormir")) || verbo04.equals("dormir ")) {
            ToastMal("Mal, respuesta incorrecta.");
            VerboRespuesta04.setText("*dormir* es una respuesta incorrecta, relacione la imagen para colocar el verbo.");

        }  else {
            ToastError("!ERROR¡ *" + verbo04 + "* no es una opción.");
            VerboRespuesta04.setText("");
        }
    }
    // VERBO - EJERCICIO 4 -----------------------------------------------------------------------------------

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
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
