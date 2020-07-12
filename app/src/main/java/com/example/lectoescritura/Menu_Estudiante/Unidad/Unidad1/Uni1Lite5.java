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

public class Uni1Lite5 extends AppCompatActivity {
    private ImageView Ima_NinoDulce, Ima_Dulce, Ima_Llorar;
    private RadioButton U1L5E1rdnOpcion1, U1L5E1rdnOpcion2, U1L5E1rdnOpcion3, U1L5E3rdnSi, U1L5E3rdnNo;
    private TextView U1L5E1Respuesta01, U1L5E2Respuesta02, U1L5E3Respuesta03, U1L5E4aRespuesta04a, U1L5E4bRespuesta04b;
    private EditText U1L5E2Ingreso01, U1L5E4aIngreso02, U1L5E4bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite5);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_NinoDulce = (ImageView)findViewById(R.id.IMAUni01NinoDulce);
        Ima_Dulce = (ImageView)findViewById(R.id.IMAUni01Dulces);
        Ima_Llorar = (ImageView)findViewById(R.id.IMAUni01Llorar);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite5_ninodulce).into(Ima_NinoDulce);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite5_dulce).into(Ima_Dulce);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite5_llorar).into(Ima_Llorar);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L5E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L05Eje01_op1);
        U1L5E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L05Eje01_op2);
        U1L5E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L05Eje01_op3);
        U1L5E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite05_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L5E2Ingreso01 = (EditText)findViewById(R.id.txtUni01Lite05_Ingreso01);
        U1L5E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite05_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U1L5E3rdnSi= (RadioButton)findViewById(R.id.rdnUni01L05Eje03_op1);
        U1L5E3rdnNo = (RadioButton)findViewById(R.id.rdnUni01L05Eje03_op2);
        U1L5E3Respuesta03 = (TextView)findViewById(R.id.txtUni01Lite05_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U1L5E4aIngreso02 = (EditText)findViewById(R.id.txtUni01Lite05_Ingreso02);
        U1L5E4aRespuesta04a = (TextView)findViewById(R.id.txtUni01Lite05_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U1L5E4bIngreso03 = (EditText)findViewById(R.id.txtUni01Lite05_Ingreso03);
        U1L5E4bRespuesta04b = (TextView)findViewById(R.id.txtUni01Lite05_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite05Eje01 (View view) {

        if (U1L5E1rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L5E1Respuesta01.setText("Respuesta correcta. Un párrafo tiene una idea principal y otras que apoyan a la principal.");

        } else if (U1L5E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E1Respuesta01.setText("Respuesta incorrecta, revise la página 56 del libro.");

        } else if (U1L5E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E1Respuesta01.setText("Respuesta incorrecta, revise la página 56 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite05Eje02 (View view){
        String respuesta01 = U1L5E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L5E2Ingreso01.requestFocus();
            U1L5E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L5E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("objetiva")) || respuesta01.equals("objetiva ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L5E2Respuesta02.setText("Respuesta correcta. La información tiene que ser objetiva, clara y concisa.");

        } else if ((respuesta01.equals("Objetiva")) || respuesta01.equals("Objetiva ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E2Respuesta02.setText("*Objetiva * es una respuesta incorrecta, recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta01.equals("técnica")) || respuesta01.equals("técnica ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E2Respuesta02.setText("*técnica* es una respuesta incorrecta, revise la página 56 del libro.");

        } else if ((respuesta01.equals("tecnica")) || respuesta01.equals("tecnica ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E2Respuesta02.setText("*tecnica* es una respuesta incorrecta, revise la página 56 del libro y recuerde usar las tildes de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U1L5E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni01Lite05Eje03 (View view) {
        if (U1L5E3rdnNo.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L5E3Respuesta03.setText("Respuesta correcta. Ya que existen ideas que no van de acuerdo al mismo tema.");

        } else if (U1L5E3rdnSi.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E3Respuesta03.setText("Respuesta incorrecta, lea nuevamente el párrafo.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni01Lite05Eje04a (View view){
        String respuesta05a = U1L5E4aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L5E4aIngreso02.requestFocus();
            U1L5E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L5E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("dulces")) || respuesta05a.equals("dulces ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L5E4aRespuesta04a.setText("Respuesta correcta. El niño quería agarrar dulces.");

        } else if ((respuesta05a.equals("Recipiente")) || respuesta05a.equals("Recipiente ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E4aRespuesta04a.setText("*Recipiente* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta05a.equals("recipiente")) || respuesta05a.equals("recipiente ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E4aRespuesta04a.setText("*recipiente* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U1L5E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni01Lite05Eje04b (View view){
        String respuesta05b = U1L5E4bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L5E4bIngreso03.requestFocus();
            U1L5E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L5E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("a llorar")) || respuesta05b.equals("a llorar ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L5E4bRespuesta04b.setText("Respuesta correcta. El niño se puso a llorar.");

        } else if ((respuesta05b.equals("a hablar")) || respuesta05b.equals("a hablar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E4bRespuesta04b.setText("*a hablar* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("a reír")) || respuesta05b.equals("a reír ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E4bRespuesta04b.setText("*a reír* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else if ((respuesta05b.equals("a reir")) || respuesta05b.equals("a reir ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L5E4bRespuesta04b.setText("*a reir* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U1L5E4bRespuesta04b.setText("");
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

        Drawable drawableIma_NinoDulce = Ima_NinoDulce.getDrawable();
        ((Animatable) drawableIma_NinoDulce).stop();

        Drawable drawableIma_Dulce = Ima_Dulce.getDrawable();
        ((Animatable) drawableIma_Dulce).stop();

        Drawable drawableIma_Llorar = Ima_Llorar.getDrawable();
        ((Animatable) drawableIma_Llorar).stop();

    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
