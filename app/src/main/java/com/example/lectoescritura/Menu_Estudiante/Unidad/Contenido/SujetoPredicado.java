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

public class SujetoPredicado extends AppCompatActivity {
    private TextView SujePreRespuesta01, SujePreRespuesta02, SujePreRespuesta03, SujePreRespuesta04;
    private EditText SujePreIngreso01, SujePreIngreso02, SujePreIngreso03, SujePreIngreso04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujeto_predicado);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        SujePreIngreso01 = (EditText)findViewById(R.id.txtSujePreIngreso01);
        SujePreIngreso02 = (EditText)findViewById(R.id.txtSujePreIngreso02);
        SujePreIngreso03 = (EditText)findViewById(R.id.txtSujePreIngreso03);
        SujePreIngreso04 = (EditText)findViewById(R.id.txtSujePreIngreso04);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        SujePreRespuesta01 = (TextView)findViewById(R.id.txtSujePreRes01);
        SujePreRespuesta02 = (TextView)findViewById(R.id.txtSujePreRes02);
        SujePreRespuesta03 = (TextView)findViewById(R.id.txtSujePreRes03);
        SujePreRespuesta04 = (TextView)findViewById(R.id.txtSujePreRes04);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // SUJEPRE - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void SujePreVeri01 (View view){
        String sujepre01 = SujePreIngreso01.getText().toString();

        if (sujepre01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            SujePreIngreso01.requestFocus();
            SujePreRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(SujePreIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((sujepre01.equals("Mi hermano")) || sujepre01.equals("Mi hermano ")) {
            ToastBien("Excelente, respuesta correcta. ");
            SujePreRespuesta01.setText("Respuesta correcta. *Mi hermano* es el sujeto.");

        } else if ((sujepre01.equals("Maneja la moto")) || sujepre01.equals("Maneja la moto ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta01.setText("*Maneja la moto* es una respuesta incorrecta, revise las estructuras.");

        } else if ((sujepre01.equals("Mi Hermano")) || sujepre01.equals("Mi Hermano ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta01.setText("*Mi Hermano* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + sujepre01 + "* no es una opción.");
            SujePreRespuesta01.setText("");
        }
    }
    // SUJEPRE - EJERCICIO 1 -----------------------------------------------------------------------------------

    // SUJEPRE - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void SujePreVeri02 (View view){
        String sujepre02 = SujePreIngreso02.getText().toString();

        if (sujepre02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            SujePreIngreso02.requestFocus();
            SujePreRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(SujePreIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((sujepre02.equals("Daniel")) || sujepre02.equals("Daniel ")) {
            ToastBien("Excelente, respuesta correcta. ");
            SujePreRespuesta02.setText("Respuesta correcta. *Daniel* es el sujeto.");

        } else if ((sujepre02.equals("Canta Rock")) || sujepre02.equals("Canta Rock ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta02.setText("*Canta Rock* es una respuesta incorrecta, revise las estructuras.");

        } else if ((sujepre02.equals("daniel")) || sujepre02.equals("daniel ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta02.setText("*daniel* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + sujepre02 + "* no es una opción.");
            SujePreRespuesta02.setText("");
        }
    }
    // SUJEPRE - EJERCICIO 2 -----------------------------------------------------------------------------------

    // SUJEPRE - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void SujePreVeri03 (View view){
        String sujepre03 = SujePreIngreso03.getText().toString();

        if (sujepre03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            SujePreIngreso03.requestFocus();
            SujePreRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(SujePreIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((sujepre03.equals("come croquetas")) || sujepre03.equals("come croquetas ")) {
            ToastBien("Excelente, respuesta correcta. ");
            SujePreRespuesta03.setText("Respuesta correcta. *come croquetas* es el predicado.");

        } else if ((sujepre03.equals("El gato")) || sujepre03.equals("El gato ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta03.setText("*El gato* es una respuesta incorrecta, revise las estructuras.");

        } else if ((sujepre03.equals("Come croquetas")) || sujepre03.equals("Come croquetas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta03.setText("*Come croquetas* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + sujepre03 + "* no es una opción.");
            SujePreRespuesta03.setText("");
        }
    }
    // SUJEPRE - EJERCICIO 3 -----------------------------------------------------------------------------------

    // SUJEPRE - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void SujePreVeri04 (View view){
        String sujepre04 = SujePreIngreso04.getText().toString();

        if (sujepre04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            SujePreIngreso04.requestFocus();
            SujePreRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(SujePreIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((sujepre04.equals("redacta una notícia")) || sujepre04.equals("redacta una notícia ")) {
            ToastBien("Excelente, respuesta correcta. ");
            SujePreRespuesta04.setText("Respuesta correcta. *redacta una notícia* es el predicado.");

        } else if ((sujepre04.equals("El Doctor")) || sujepre04.equals("El Doctor ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta04.setText("*El Doctor* es una respuesta incorrecta, revise las estructuras.");

        } else if ((sujepre04.equals("Redacta una notícia")) || sujepre04.equals("Redacta una notícia ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta04.setText("*Redacta una notícia* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else if ((sujepre04.equals("redacta una noticia")) || sujepre04.equals("redacta una noticia ")) {
            ToastMal("Mal, respuesta incorrecta.");
            SujePreRespuesta04.setText("*redacta una noticia* es una respuesta incorrecta, revise las tildes (notícia).");

        }  else {
            ToastError("!ERROR¡ *" + sujepre04 + "* no es una opción.");
            SujePreRespuesta04.setText("");
        }
    }
    // SUJEPRE - EJERCICIO 4 -----------------------------------------------------------------------------------


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
