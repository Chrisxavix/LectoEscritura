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

public class Pronombres extends AppCompatActivity {
    private TextView PronombreRespuesta01, PronombreRespuesta02, PronombreRespuesta03, PronombreRespuesta04;
    private EditText PronombreIngreso01, PronombreIngreso02, PronombreIngreso03, PronombreIngreso04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        PronombreIngreso01 = (EditText)findViewById(R.id.txtPronombreIngreso01);
        PronombreIngreso02 = (EditText)findViewById(R.id.txtPronombreIngreso02);
        PronombreIngreso03 = (EditText)findViewById(R.id.txtPronombreIngreso03);
        PronombreIngreso04 = (EditText)findViewById(R.id.txtPronombreIngreso04);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        PronombreRespuesta01 = (TextView)findViewById(R.id.txtPronombreRes01);
        PronombreRespuesta02 = (TextView)findViewById(R.id.txtPronombreRes02);
        PronombreRespuesta03 = (TextView)findViewById(R.id.txtPronombreRes03);
        PronombreRespuesta04 = (TextView)findViewById(R.id.txtPronombreRes04);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // PRONOMBRE - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void PronombreVeri01 (View view){
        String pronombre01 = PronombreIngreso01.getText().toString();

        if (pronombre01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            PronombreIngreso01.requestFocus();
            PronombreRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(PronombreIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((pronombre01.equals("Ella")) || pronombre01.equals("Ella ")) {
            ToastBien("Excelente, respuesta correcta. ");
            PronombreRespuesta01.setText("Respuesta correcta. *Ella* es el pronombre de Daniela.");

        } else if ((pronombre01.equals("Él")) || pronombre01.equals("Él ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta01.setText("*Él* es una respuesta incorrecta, relacione la imagen para colocar el pronombre personal.");

        } else if ((pronombre01.equals("Yo")) || pronombre01.equals("Yo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta01.setText("*Yo* es una respuesta incorrecta, relacione la imagen para colocar el pronombre personal.");

        }  else {
            ToastError("!ERROR¡ *" + pronombre01 + "* no es una opción.");
            PronombreRespuesta01.setText("");
        }
    }
    // PRONOMBRE - EJERCICIO 1 -----------------------------------------------------------------------------------

    // PRONOMBRE - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void PronombreVeri02 (View view){
        String pronombre02 = PronombreIngreso02.getText().toString();

        if (pronombre02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            PronombreIngreso02.requestFocus();
            PronombreRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(PronombreIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((pronombre02.equals("Ellas")) || pronombre02.equals("Ellas ")) {
            ToastBien("Excelente, respuesta correcta. ");
            PronombreRespuesta02.setText("Respuesta correcta. *Ellas* es el pronombre de Gabriela y María.");

        } else if ((pronombre02.equals("Ellos")) || pronombre02.equals("Ellos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta02.setText("*Ellos* es una respuesta incorrecta, relacione la imagen para colocar el pronombre personal.");

        } else if ((pronombre02.equals("Ella")) || pronombre02.equals("Ella ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta02.setText("*Ella* es una respuesta incorrecta, relacione la imagen para colocar el pronombre personal.");

        }  else {
            ToastError("!ERROR¡ *" + pronombre02 + "* no es una opción.");
            PronombreRespuesta02.setText("");
        }
    }
    // PRONOMBRE - EJERCICIO 2 -----------------------------------------------------------------------------------

    // PRONOMBRE - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void PronombreVeri03 (View view){
        String pronombre03 = PronombreIngreso03.getText().toString();

        if (pronombre03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            PronombreIngreso03.requestFocus();
            PronombreRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(PronombreIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((pronombre03.equals("tuyos")) || pronombre03.equals("tuyos ")) {
            ToastBien("Excelente, respuesta correcta. ");
            PronombreRespuesta03.setText("Respuesta correcta. *tuyos* es el pronombre posesivo de juguetes.");

        } else if ((pronombre03.equals("tuyo")) || pronombre03.equals("tuyo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta03.setText("*tuyo* es una respuesta incorrecta, relacione la imagen para colocar el pronombre posesivo.");

        } else if ((pronombre03.equals("tuyas")) || pronombre03.equals("tuyas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta03.setText("*tuyas* es una respuesta incorrecta, relacione la imagen para colocar el pronombre posesivo.");

        }  else {
            ToastError("!ERROR¡ *" + pronombre03 + "* no es una opción.");
            PronombreRespuesta03.setText("");
        }
    }
    // PRONOMBRE - EJERCICIO 3 -----------------------------------------------------------------------------------

    // PRONOMBRE - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void PronombreVeri04 (View view){
        String pronombre04 = PronombreIngreso04.getText().toString();

        if (pronombre04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            PronombreIngreso04.requestFocus();
            PronombreRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(PronombreIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((pronombre04.equals("mío")) || pronombre04.equals("mío ")) {
            ToastBien("Excelente, respuesta correcta. ");
            PronombreRespuesta04.setText("Respuesta correcta. *mío* es el pronombre posesivo de gato.");

        } else if ((pronombre04.equals("mía")) || pronombre04.equals("mía ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta04.setText("*mía* es una respuesta incorrecta, relacione la imagen para colocar el pronombre posesivo.");

        } else if ((pronombre04.equals("tuyos")) || pronombre04.equals("tuyos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            PronombreRespuesta04.setText("*tuyos* es una respuesta incorrecta, relacione la imagen para colocar el pronombre posesivo.");

        }  else {
            ToastError("!ERROR¡ *" + pronombre04 + "* no es una opción.");
            PronombreRespuesta04.setText("");
        }
    }
    // PRONOMBRE - EJERCICIO 4 -----------------------------------------------------------------------------------


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
