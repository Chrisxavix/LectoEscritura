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

public class Uni1Lite2 extends AppCompatActivity {
    private ImageView Ima_RatoGato, Ima_Gato, Ima_Raton;
    private RadioButton U1L2E1rdnVerdadero, U1L2E1rdnFalso, U1L2E2rdnOpcion1, U1L2E2rdnOpcion2, U1L2E2rdnOpcion3;
    private TextView U1L2E1Respuesta01, U1L2E2Respuesta02, U1L2E3Respuesta03, U1L2E4Respuesta04, U1L2E5aRespuesta05a,
            U1L2E5bRespuesta05b;
    private EditText U1L2E3Ingreso01, U1L2E4Ingreso02, U1L2E5aIngreso03, U1L2E5bIngreso04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_RatoGato = (ImageView)findViewById(R.id.IMAUni01RatoGa);
        Ima_Gato = (ImageView)findViewById(R.id.IMAUni01Gato);
        Ima_Raton = (ImageView)findViewById(R.id.IMAUni01Raton);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite2_ratonga).into(Ima_RatoGato);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite2_gato).into(Ima_Gato);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite2_raton).into(Ima_Raton);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L2E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni01L02Eje01_op1);
        U1L2E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni01L02Eje01_op2);
        U1L2E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite02_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L2E2rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L02Eje02_op1);
        U1L2E2rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L02Eje02_op2);
        U1L2E2rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L02Eje02_op3);
        U1L2E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite02_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U1L2E3Ingreso01 = (EditText)findViewById(R.id.txtUni01Lite02_Ingreso01);
        U1L2E3Respuesta03 = (TextView)findViewById(R.id.txtUni01Lite02_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U1L2E4Ingreso02 = (EditText)findViewById(R.id.txtUni01Lite02_Ingreso02);
        U1L2E4Respuesta04 = (TextView)findViewById(R.id.txtUni01Lite02_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U1L2E5aIngreso03 = (EditText)findViewById(R.id.txtUni01Lite02_Ingreso03);
        U1L2E5aRespuesta05a = (TextView)findViewById(R.id.txtUni01Lite02_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U1L2E5bIngreso04 = (EditText)findViewById(R.id.txtUni01Lite02_Ingreso04);
        U1L2E5bRespuesta05b = (TextView)findViewById(R.id.txtUni01Lite02_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje01 (View view) {
        if (U1L2E1rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E1Respuesta01.setText("Respuesta correcta. Ya que la comedia y la tragedia son los subgéneros dramáticos más significativos.");

        } else if (U1L2E1rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 24 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje02 (View view) {

        if (U1L2E2rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E2Respuesta02.setText("Respuesta correcta. Es una escena de un teatro basado en el amor.");

        } else if (U1L2E2rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E2Respuesta02.setText("Respuesta incorrecta, observe bien la imagen.");

        } else if (U1L2E2rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E2Respuesta02.setText("Respuesta incorrecta, observe bien la imagen.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje03 (View view){
        String respuesta01 = U1L2E3Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L2E3Ingreso01.requestFocus();
            U1L2E3Respuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L2E3Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("griego")) || respuesta01.equals("griego ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E3Respuesta03.setText("Respuesta correcta. El teatro occidental se desarrolló a partir del teatro griego.");

        } else if ((respuesta01.equals("romano")) || respuesta01.equals("romano ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E3Respuesta03.setText("*romano* es una respuesta incorrecta, revise la página 24 del libro.");

        } else if ((respuesta01.equals("religioso")) || respuesta01.equals("religioso ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E3Respuesta03.setText("*religioso* es una respuesta incorrecta, revise la página 24 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U1L2E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje04 (View view){
        String respuesta02 = U1L2E4Ingreso02.getText().toString();

        if (respuesta02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L2E4Ingreso02.requestFocus();
            U1L2E4Respuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L2E4Ingreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta02.equals("teatro")) || respuesta02.equals("teatro ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E4Respuesta04.setText("Respuesta correcta, en los siglos XVI y XVII se desarrolló el teatro moderno.");

        } else if ((respuesta02.equals("Teatro")) || respuesta02.equals("Teatro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E4Respuesta04.setText("*Teatro* es una respuesta incorrecta, recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta02.equals("recorrido")) || respuesta02.equals("recorrido ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E4Respuesta04.setText("*recorrido* es una respuesta incorrecta, revise la página 32 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta02 + "* no es una opción.");
            U1L2E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje05a (View view){
        String respuesta03 = U1L2E5aIngreso03.getText().toString();

        if (respuesta03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L2E5aIngreso03.requestFocus();
            U1L2E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput( U1L2E5aIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03.equals("gato")) || respuesta03.equals("gato ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E5aRespuesta05a.setText("Respuesta correcta. Querían ponerle un cascabel al gato.");

        } else if ((respuesta03.equals("perro")) || respuesta03.equals("perro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5aRespuesta05a.setText("*perro* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta03.equals("ratón")) || respuesta03.equals("ratón ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5aRespuesta05a.setText("*ratón* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else if ((respuesta03.equals("raton")) || respuesta03.equals("raton ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5aRespuesta05a.setText("*raton* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        }else {
            ToastError("!ERROR¡ *" + respuesta03 + "* no es una opción.");
            U1L2E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni01Lite02Eje05b (View view){
        String respuesta03 = U1L2E5bIngreso04.getText().toString();

        if (respuesta03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L2E5bIngreso04.requestFocus();
            U1L2E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput( U1L2E5bIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03.equals("el ratón")) || respuesta03.equals("el ratón ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L2E5bRespuesta05b.setText("Respuesta correcta. Propuso la idea el ratón.");

        } else if ((respuesta03.equals("ratón")) || respuesta03.equals("ratón ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5bRespuesta05b.setText("*ratón* es una respuesta incorrecta, use los artículos.");

        } else if ((respuesta03.equals("raton")) || respuesta03.equals("raton ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5bRespuesta05b.setText("*raton* es una respuesta incorrecta, recuerde usar los artículos y tildes de manera adecuada.");

        }  else if ((respuesta03.equals("el raton")) || respuesta03.equals("el raton ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5bRespuesta05b.setText("*el raton* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        }  else if ((respuesta03.equals("el gato")) || respuesta03.equals("el gato ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L2E5bRespuesta05b.setText("*el gato* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta03 + "* no es una opción.");
            U1L2E5bRespuesta05b.setText("");
        }
    }
    // EJERCICIO 5b ---------------------------------------------------------------------------------------------



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

        Drawable drawableIma_RatoGato = Ima_RatoGato.getDrawable();
        ((Animatable) drawableIma_RatoGato).stop();

        Drawable drawableIma_Gato = Ima_Gato.getDrawable();
        ((Animatable) drawableIma_Gato).stop();

        Drawable drawableIma_Raton = Ima_Raton.getDrawable();
        ((Animatable) drawableIma_Raton).stop();

    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
