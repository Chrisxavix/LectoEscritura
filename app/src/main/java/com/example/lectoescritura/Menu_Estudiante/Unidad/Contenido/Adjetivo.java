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

public class Adjetivo extends AppCompatActivity {
    private TextView AdjetivoRespuesta01, AdjetivoRespuesta02, AdjetivoRespuesta03, AdjetivoRespuesta04,
                     AdjetivoRespuesta05, AdjetivoRespuesta06, AdjetivoRespuesta07, AdjetivoRespuesta08;
    private EditText AdjetivoIngreso01, AdjetivoIngreso02, AdjetivoIngreso03, AdjetivoIngreso04,
                     AdjetivoIngreso05, AdjetivoIngreso06, AdjetivoIngreso07, AdjetivoIngreso08;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjetivo);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        AdjetivoIngreso01 = (EditText)findViewById(R.id.txtAdjetivoIngreso01);
        AdjetivoIngreso02 = (EditText)findViewById(R.id.txtAdjetivoIngreso02);
        AdjetivoIngreso03 = (EditText)findViewById(R.id.txtAdjetivoIngreso03);
        AdjetivoIngreso04 = (EditText)findViewById(R.id.txtAdjetivoIngreso04);
        AdjetivoIngreso05 = (EditText)findViewById(R.id.txtAdjetivoIngreso05);
        AdjetivoIngreso06 = (EditText)findViewById(R.id.txtAdjetivoIngreso06);
        AdjetivoIngreso07 = (EditText)findViewById(R.id.txtAdjetivoIngreso07);
        AdjetivoIngreso08 = (EditText)findViewById(R.id.txtAdjetivoIngreso08);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        AdjetivoRespuesta01 = (TextView)findViewById(R.id.txtAdjetivoRes01);
        AdjetivoRespuesta02 = (TextView)findViewById(R.id.txtAdjetivoRes02);
        AdjetivoRespuesta03 = (TextView)findViewById(R.id.txtAdjetivoRes03);
        AdjetivoRespuesta04 = (TextView)findViewById(R.id.txtAdjetivoRes04);
        AdjetivoRespuesta05 = (TextView)findViewById(R.id.txtAdjetivoRes05);
        AdjetivoRespuesta06 = (TextView)findViewById(R.id.txtAdjetivoRes06);
        AdjetivoRespuesta07 = (TextView)findViewById(R.id.txtAdjetivoRes07);
        AdjetivoRespuesta08 = (TextView)findViewById(R.id.txtAdjetivoRes08);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // ADJETIVO - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void AdjetivoVeri01 (View view){
        String adjetivo01 = AdjetivoIngreso01.getText().toString();

        if (adjetivo01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso01.requestFocus();
            AdjetivoRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo01.equals("negro")) || adjetivo01.equals("negro ")) {
            ToastBien("Excelente, respuesta correcta.");
            AdjetivoRespuesta01.setText("Respuesta correcta. *negro* es un adjetivo calificativo que expresa cualidad.");

        } else if ((adjetivo01.equals("blanco")) || adjetivo01.equals("blanco ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta01.setText("*blanco* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        } else if ((adjetivo01.equals("rojo")) || adjetivo01.equals("rojo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta01.setText("*rojo* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo01 + "* no es una opción.");
            AdjetivoRespuesta01.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 1 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void AdjetivoVeri02 (View view){
        String adjetivo02 = AdjetivoIngreso02.getText().toString();

        if (adjetivo02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso02.requestFocus();
            AdjetivoRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo02.equals("triste")) || adjetivo02.equals("triste ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta02.setText("Respuesta correcta. *triste* es un adjetivo calificativo que expresa cualidad.");

        } else if ((adjetivo02.equals("feliz")) || adjetivo02.equals("feliz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta02.setText("*feliz* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        } else if ((adjetivo02.equals("llorar")) || adjetivo02.equals("llorar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta02.setText("*llorar* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo y revise la sección de verbos.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo02 + "* no es una opción.");
            AdjetivoRespuesta02.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 2 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void AdjetivoVeri03 (View view){
        String adjetivo03 = AdjetivoIngreso03.getText().toString();

        if (adjetivo03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso03.requestFocus();
            AdjetivoRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo03.equals("trabajo")) || adjetivo03.equals("trabajo ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta03.setText("Respuesta correcta. *trabajo* es un adjetivo relacional que expresa un rasgo del sustantivo.");

        } else if ((adjetivo03.equals("familiar")) || adjetivo03.equals("familiar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta03.setText("*familiar* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo y revise la sección de verbos.");

        } else if ((adjetivo03.equals("escolar")) || adjetivo03.equals("escolar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta03.setText("*escolar* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo y revise la sección de verbos.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo03 + "* no es una opción.");
            AdjetivoRespuesta03.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 3 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void AdjetivoVeri04 (View view){
        String adjetivo04 = AdjetivoIngreso04.getText().toString();

        if (adjetivo04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso04.requestFocus();
            AdjetivoRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo04.equals("peruano")) || adjetivo04.equals("peruano ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta04.setText("Respuesta correcta. *peruano* es un adjetivo relacional que expresa un rasgo del sustantivo.");

        } else if ((adjetivo04.equals("feliz")) || adjetivo04.equals("feliz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta04.setText("*feliz* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        } else if ((adjetivo04.equals("mestizo")) || adjetivo04.equals("mestizo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta04.setText("*mestizo* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo04 + "* no es una opción.");
            AdjetivoRespuesta04.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 4 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 5 -----------------------------------------------------------------------------------
    public void AdjetivoVeri05 (View view){
        String adjetivo05 = AdjetivoIngreso05.getText().toString();

        if (adjetivo05.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso05.requestFocus();
            AdjetivoRespuesta05.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso05, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo05.equals("posible")) || adjetivo05.equals("posible ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta05.setText("Respuesta correcta. *posible* es un adjetivo adverbial.");

        } else if ((adjetivo05.equals("Posible")) || adjetivo05.equals("Posible ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta05.setText("*Posible* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo y revise la sección de mayúsculas.");

        } else if ((adjetivo05.equals("seguro")) || adjetivo05.equals("seguro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta05.setText("*seguro* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo para dar sentido a la oración.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo05 + "* no es una opción.");
            AdjetivoRespuesta05.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 5 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 6 -----------------------------------------------------------------------------------
    public void AdjetivoVeri06 (View view){
        String adjetivo06 = AdjetivoIngreso06.getText().toString();

        if (adjetivo06.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso06.requestFocus();
            AdjetivoRespuesta06.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso06, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo06.equals("verdadera")) || adjetivo06.equals("verdadera ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta06.setText("Respuesta correcta. *verdadera* es un adjetivo adverbial.");

        } else if ((adjetivo06.equals("Verdadera")) || adjetivo06.equals("Verdadera ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta06.setText("*Verdadera* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((adjetivo06.equals("tristes")) || adjetivo06.equals("tristes ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta06.setText("*tristes* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo para dar sentido a la oración.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo06 + "* no es una opción.");
            AdjetivoRespuesta06.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 6 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 7 -----------------------------------------------------------------------------------
    public void AdjetivoVeri07 (View view){
        String adjetivo07 = AdjetivoIngreso07.getText().toString();

        if (adjetivo07.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso07.requestFocus();
            AdjetivoRespuesta07.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso07, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo07.equals("amarillo")) || adjetivo07.equals("amarillo ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta07.setText("Respuesta correcta. *amarillo* es un adjetivo sustantivado.");

        } else if ((adjetivo07.equals("verde")) || adjetivo07.equals("verde ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta07.setText("*verde* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        } else if ((adjetivo07.equals("negro")) || adjetivo07.equals("negro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta07.setText("*negro* es una respuesta incorrecta, relacione la imagen para colocar el adjetivo.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo07 + "* no es una opción.");
            AdjetivoRespuesta07.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 7 -----------------------------------------------------------------------------------

    // ADJETIVO - EJERCICIO 8 -----------------------------------------------------------------------------------
    public void AdjetivoVeri08 (View view){
        String adjetivo08 = AdjetivoIngreso08.getText().toString();

        if (adjetivo08.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            AdjetivoIngreso08.requestFocus();
            AdjetivoRespuesta08.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(AdjetivoIngreso08, InputMethodManager.SHOW_IMPLICIT);

        } else if ((adjetivo08.equals("pequeño")) || adjetivo08.equals("pequeño ")) {
            ToastBien("Excelente, respuesta correcta. ");
            AdjetivoRespuesta08.setText("Respuesta correcta. *pequeño* es un adjetivo sustantivado.");

        } else if ((adjetivo08.equals("Pequeño")) || adjetivo08.equals("Pequeño ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta08.setText("*Pequeño* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((adjetivo08.equals("PEQUEÑO")) || adjetivo08.equals("PEQUEÑO ")) {
            ToastMal("Mal, respuesta incorrecta.");
            AdjetivoRespuesta08.setText("*PEQUEÑO* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + adjetivo08 + "* no es una opción.");
            AdjetivoRespuesta08.setText("");
        }
    }
    // ADJETIVO - EJERCICIO 8 -----------------------------------------------------------------------------------


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
