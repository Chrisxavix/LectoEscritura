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

public class Articulo extends AppCompatActivity {
    private TextView ArticuloRespuesta01, ArticuloRespuesta02, ArticuloRespuesta03, ArticuloRespuesta04;
    private EditText ArticuloIngreso01, ArticuloIngreso02, ArticuloIngreso03, ArticuloIngreso04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        ArticuloIngreso01 = (EditText)findViewById(R.id.txtArticuloIngreso01);
        ArticuloIngreso02 = (EditText)findViewById(R.id.txtArticuloIngreso02);
        ArticuloIngreso03 = (EditText)findViewById(R.id.txtArticuloIngreso03);
        ArticuloIngreso04 = (EditText)findViewById(R.id.txtArticuloIngreso04);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        ArticuloRespuesta01 = (TextView)findViewById(R.id.txtArticuloRes01);
        ArticuloRespuesta02 = (TextView)findViewById(R.id.txtArticuloRes02);
        ArticuloRespuesta03 = (TextView)findViewById(R.id.txtArticuloRes03);
        ArticuloRespuesta04 = (TextView)findViewById(R.id.txtArticuloRes04);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // ARTICULO - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void ArticuloVeri01 (View view){
        String articulo01 = ArticuloIngreso01.getText().toString();

        if (articulo01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            ArticuloIngreso01.requestFocus();
            ArticuloRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(ArticuloIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((articulo01.equals("Los")) || articulo01.equals("Los ")) {
            ToastBien("Excelente, respuesta correcta. ");
            ArticuloRespuesta01.setText("Respuesta correcta. *Los* es el artículo para niños.");

        } else if ((articulo01.equals("Las")) || articulo01.equals("Las ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta01.setText("*Las* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        } else if ((articulo01.equals("La")) || articulo01.equals("La ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta01.setText("*La* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        }  else {
            ToastError("!ERROR¡ *" + articulo01 + "* no es una opción.");
            ArticuloRespuesta01.setText("");
        }
    }
    // ARTICULO - EJERCICIO 1 -----------------------------------------------------------------------------------

    // ARTICULO - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void ArticuloVeri02 (View view){
        String articulo02 = ArticuloIngreso02.getText().toString();

        if (articulo02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            ArticuloIngreso02.requestFocus();
            ArticuloRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(ArticuloIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((articulo02.equals("La")) || articulo02.equals("La ")) {
            ToastBien("Excelente, respuesta correcta. ");
            ArticuloRespuesta02.setText("Respuesta correcta. *La* es el artículo para niños.");

        } else if ((articulo02.equals("El")) || articulo02.equals("El ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta02.setText("*El* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        } else if ((articulo02.equals("Las")) || articulo02.equals("Las ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta02.setText("*Las* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        }  else {
            ToastError("!ERROR¡ *" + articulo02 + "* no es una opción.");
            ArticuloRespuesta02.setText("");
        }
    }
    // ARTICULO - EJERCICIO 2 -----------------------------------------------------------------------------------

    // ARTICULO - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void ArticuloVeri03 (View view){
        String articulo03 = ArticuloIngreso03.getText().toString();

        if (articulo03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            ArticuloIngreso03.requestFocus();
            ArticuloRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(ArticuloIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((articulo03.equals("Algunas")) || articulo03.equals("Algunas ")) {
            ToastBien("Excelente, respuesta correcta. ");
            ArticuloRespuesta03.setText("Respuesta correcta. *Algunas* es el artículo para niños.");

        } else if ((articulo03.equals("Algunos")) || articulo03.equals("Algunos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta03.setText("*Algunos* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        } else if ((articulo03.equals("Un")) || articulo03.equals("Un ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta03.setText("*Un* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        }  else {
            ToastError("!ERROR¡ *" + articulo03 + "* no es una opción.");
            ArticuloRespuesta03.setText("");
        }
    }
    // ARTICULO - EJERCICIO 3 -----------------------------------------------------------------------------------

    // ARTICULO - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void ArticuloVeri04 (View view){
        String articulo04 = ArticuloIngreso04.getText().toString();

        if (articulo04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            ArticuloIngreso04.requestFocus();
            ArticuloRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(ArticuloIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((articulo04.equals("Una")) || articulo04.equals("Una ")) {
            ToastBien("Excelente, respuesta correcta. ");
            ArticuloRespuesta04.setText("Respuesta correcta. *Una* es el artículo para niños.");

        } else if ((articulo04.equals("Unas")) || articulo04.equals("Unas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta04.setText("*Unas* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        } else if ((articulo04.equals("Unos")) || articulo04.equals("Unos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            ArticuloRespuesta04.setText("*Unos* es una respuesta incorrecta, relacione la imagen para colocar el artículo.");

        }  else {
            ToastError("!ERROR¡ *" + articulo04 + "* no es una opción.");
            ArticuloRespuesta04.setText("");
        }
    }
    // ARTICULO - EJERCICIO 4 -----------------------------------------------------------------------------------


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
