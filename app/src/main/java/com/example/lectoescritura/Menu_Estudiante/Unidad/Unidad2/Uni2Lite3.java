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

public class Uni2Lite3 extends AppCompatActivity {
    private ImageView Ima_Escorpion, Ima_Asustar, Ima_Picar;
    private RadioButton U2L3E1rdnVerdadero, U2L3E1rdnFalso, U2L3E3rdnVerdadero, U2L3E3rdnFalso;
    private CheckBox U2L3E2cbxOp1, U2L3E2cbxOp2, U2L3E2cbxOp3;
    private TextView U2L3E1Respuesta01, U2L3E2Respuesta02, U2L3E3Respuesta03, U2L3E4aRespuesta04a,
            U2L3E4bRespuesta04b;
    private EditText U2L3E4aIngreso01, U2L3E4bIngreso02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2_lite3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Escorpion = (ImageView)findViewById(R.id.IMAUni02Escorpion);
        Ima_Asustar = (ImageView)findViewById(R.id.IMAUni02Asustar);
        Ima_Picar = (ImageView)findViewById(R.id.IMAUni02Picar);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni2lite3_escorpion).into(Ima_Escorpion);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite3_asustar).into(Ima_Asustar);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite3_picar).into(Ima_Picar);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U2L3E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni02L03Eje01_op1);
        U2L3E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni02L03Eje01_op2);
        U2L3E1Respuesta01 = (TextView)findViewById(R.id.txtUni02Lite03_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U2L3E2cbxOp1 = (CheckBox)findViewById(R.id.cbxUni02L03Eje02_op1);
        U2L3E2cbxOp2 = (CheckBox)findViewById(R.id.cbxUni02L03Eje02_op2);
        U2L3E2cbxOp3 = (CheckBox)findViewById(R.id.cbxUni02L03Eje02_op3);
        U2L3E2Respuesta02 = (TextView)findViewById(R.id.txtUni02Lite03_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U2L3E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni02L03Eje03_op1);
        U2L3E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni02L03Eje03_op2);
        U2L3E3Respuesta03 = (TextView)findViewById(R.id.txtUni02Lite03_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U2L3E4aIngreso01 = (EditText)findViewById(R.id.txtUni02Lite03_Ingreso01);
        U2L3E4aRespuesta04a = (TextView)findViewById(R.id.txtUni02Lite03_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U2L3E4bIngreso02 = (EditText)findViewById(R.id.txtUni02Lite03_Ingreso02);
        U2L3E4bRespuesta04b = (TextView)findViewById(R.id.txtUni02Lite03_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni02Lite03Eje01 (View view) {
        if (U2L3E1rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L3E1Respuesta01.setText("Respuesta correcta. Ya que un ensayo es un tipo de texto, relativamente breve, que interpreta o explica un determinado tema humanístico, político, social, cultural, deportivo, etc.");

        } else if (U2L3E1rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E1Respuesta01.setText("Respuesta incorrecta, revise la página 105 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni02Lite03Eje02 (View view) {

        if ((U2L3E2cbxOp1.isChecked() == true && U2L3E2cbxOp2.isChecked() == true  && U2L3E2cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L3E2Respuesta02.setText("");

        }  else if ((U2L3E2cbxOp2.isChecked() == true && U2L3E2cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U2L3E2Respuesta02.setText("Respuestas correctas.");

        }  else if ((U2L3E2cbxOp1.isChecked() == true && U2L3E2cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E2Respuesta02.setText("Solo una opción es la correcta, revise la página 105 del libro.");

        }  else if ((U2L3E2cbxOp1.isChecked() == true && U2L3E2cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E2Respuesta02.setText("Solo una opción es la correcta, revise la página 105 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L3E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni02Lite03Eje03 (View view) {
        if (U2L3E3rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L3E3Respuesta03.setText("Respuesta correcta.");

        } else if (U2L3E3rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E3Respuesta03.setText("Respuesta incorrecta, revise la página 107 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni02Lite03Eje04a (View view){
        String respuesta04a = U2L3E4aIngreso01.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L3E4aIngreso01.requestFocus();
            U2L3E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L3E4aIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("asustó")) || respuesta04a.equals("asustó ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L3E4aRespuesta04a.setText("Respuesta correcta. La rana se asustó.");

        } else if ((respuesta04a.equals("asusto")) || respuesta04a.equals("asusto ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4aRespuesta04a.setText("*asusto* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta04a.equals("alegró")) || respuesta04a.equals("alegró ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4aRespuesta04a.setText("*alegró* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("alegro")) || respuesta04a.equals("alegro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4aRespuesta04a.setText("*alegro* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta04a.equals("fue")) || respuesta04a.equals("fue ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4aRespuesta04a.setText("*fue* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U2L3E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni02Lite03Eje04b (View view){
        String respuesta05b = U2L3E4bIngreso02.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L3E4bIngreso02.requestFocus();
            U2L3E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L3E4bIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("picó")) || respuesta05b.equals("picó ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L3E4bRespuesta04b.setText("Respuesta correcta. Le picó a la rana.");

        } else if ((respuesta05b.equals("pico")) || respuesta05b.equals("pico ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L3E4bRespuesta04b.setText("*pico* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta05b.equals("ayudó")) || respuesta05b.equals("ayudó ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4bRespuesta04b.setText("*ayudó* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("ayudo")) || respuesta05b.equals("ayudo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4bRespuesta04b.setText("*ayudo* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta05b.equals("empujó")) || respuesta05b.equals("empujó ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4bRespuesta04b.setText("*empujó* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("empujo")) || respuesta05b.equals("empujo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L3E4bRespuesta04b.setText("*empujó* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        } else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U2L3E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Escorpion = Ima_Escorpion.getDrawable();
        ((Animatable) drawableIma_Escorpion).stop();

        Drawable drawableIma_Asustar = Ima_Asustar.getDrawable();
        ((Animatable) drawableIma_Asustar).stop();

        Drawable drawableIma_Picar = Ima_Picar.getDrawable();
        ((Animatable) drawableIma_Picar).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
