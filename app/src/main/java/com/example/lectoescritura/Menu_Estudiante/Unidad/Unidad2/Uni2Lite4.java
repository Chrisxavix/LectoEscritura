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

public class Uni2Lite4 extends AppCompatActivity {
    private RadioButton U2L4E2rdnVerdadero, U2L4E2rdnFalso;
    private CheckBox U2L4E3cbxOp1, U2L4E3cbxOp2, U2L4E3cbxOp3;
    private TextView U2L4E1Respuesta01, U2L4E2Respuesta02, U2L4E3Respuesta03, U2L4E4aRespuesta04a,
            U2L4E4bRespuesta04b;
    private EditText U2L4E1Ingreso01, U2L4E4aIngreso02, U2L4E4bIngreso03;
    private ImageView Ima_Gallina, Ima_Huevos, Ima_Matar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2_lite4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Gallina = (ImageView)findViewById(R.id.IMAUni02Gallina);
        Ima_Huevos = (ImageView)findViewById(R.id.IMAUni02Huevos);
        Ima_Matar = (ImageView)findViewById(R.id.IMAUni02Matar);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni2lite4_gallina).into(Ima_Gallina);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite4_huevo).into(Ima_Huevos);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite4_matar).into(Ima_Matar);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U2L4E1Ingreso01 = (EditText)findViewById(R.id.txtUni02Lite04_Ingreso01);
        U2L4E1Respuesta01 = (TextView)findViewById(R.id.txtUni02Lite04_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U2L4E2rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni02L04Eje02_op1);
        U2L4E2rdnFalso = (RadioButton)findViewById(R.id.rdnUni02L04Eje02_op2);
        U2L4E2Respuesta02 = (TextView)findViewById(R.id.txtUni02Lite04_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U2L4E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni02L04Eje03_op1);
        U2L4E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni02L04Eje03_op2);
        U2L4E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni02L04Eje03_op3);
        U2L4E3Respuesta03 = (TextView)findViewById(R.id.txtUni02Lite04_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U2L4E4aIngreso02 = (EditText)findViewById(R.id.txtUni02Lite04_Ingreso02);
        U2L4E4aRespuesta04a = (TextView)findViewById(R.id.txtUni02Lite04_Eje04a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U2L4E4bIngreso03 = (EditText)findViewById(R.id.txtUni02Lite04_Ingreso03);
        U2L4E4bRespuesta04b = (TextView)findViewById(R.id.txtUni02Lite04_Eje04b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni02Lite04Eje01 (View view){
        String respuesta01 = U2L4E1Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L4E1Ingreso01.requestFocus();
            U2L4E1Respuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L4E1Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("modificadores")) || respuesta01.equals("modificadores ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L4E1Respuesta01.setText("Respuesta correcta. Los complementos circunstanciales son otros modificadores del verbo.");

        } else if ((respuesta01.equals("adjetivos")) || respuesta01.equals("adjetivos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E1Respuesta01.setText("*adjetivos* es una respuesta incorrecta, revise la página 111 del libro.");

        } else if ((respuesta01.equals("artículos")) || respuesta01.equals("artículos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E1Respuesta01.setText("*artículos* es una respuesta incorrecta, revise la página 111 del libro.");

        }  else if ((respuesta01.equals("articulos")) || respuesta01.equals("articulos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E1Respuesta01.setText("*articulos* es una respuesta incorrecta, revise la página 111 del libro y recuerde usar las tildes de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U2L4E1Respuesta01.setText("");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni02Lite04Eje02 (View view) {
        if (U2L4E2rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L4E2Respuesta02.setText("Respuesta correcta.");

        } else if (U2L4E2rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E2Respuesta02.setText("Respuesta incorrecta, revise la página 111 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni02Lite04Eje03 (View view) {

        if ((U2L4E3cbxOp1.isChecked() == true && U2L4E3cbxOp2.isChecked() == true  && U2L4E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L4E3Respuesta03.setText("");

        }  else if ((U2L4E3cbxOp1.isChecked() == true && U2L4E3cbxOp2.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U2L4E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U2L4E3cbxOp1.isChecked() == true && U2L4E3cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E3Respuesta03.setText("Solo una opción es la correcta, revise la página 111 del libro.");

        }  else if ((U2L4E3cbxOp2.isChecked() == true && U2L4E3cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E3Respuesta03.setText("Solo una opción es la correcta, revise la página 111 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L4E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni02Lite04Eje04a (View view){
        String respuesta04a = U2L4E4aIngreso02.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L4E4aIngreso02.requestFocus();
            U2L4E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L4E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("huevos")) || respuesta04a.equals("huevos ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L4E4aRespuesta04a.setText("Respuesta correcta. Ponía huevos de oro.");

        } else if ((respuesta04a.equals("plumas")) || respuesta04a.equals("plumas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E4aRespuesta04a.setText("*plumas* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("pollos")) || respuesta04a.equals("pollos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E4aRespuesta04a.setText("*pollos* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U2L4E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni02Lite04Eje04b (View view){
        String respuesta04b = U2L4E4bIngreso03.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L4E4bIngreso03.requestFocus();
            U2L4E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L4E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("Mataron")) || respuesta04b.equals("Mataron ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L4E4bRespuesta04b.setText("Respuesta correcta. Mataron a la gallina.");

        } else if ((respuesta04b.equals("mataron")) || respuesta04b.equals("mataron ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E4bRespuesta04b.setText("*mataron* es una respuesta incorrecta, recuerde usar las mayúsculas de manera adecuada.");

        } else if ((respuesta04b.equals("empujaron")) || respuesta04b.equals("empujaron ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L4E4bRespuesta04b.setText("*empujaron* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las mayúsculas de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U2L4E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Gallina = Ima_Gallina.getDrawable();
        ((Animatable) drawableIma_Gallina).stop();

        Drawable drawableIma_Huevos = Ima_Huevos.getDrawable();
        ((Animatable) drawableIma_Huevos).stop();

        Drawable drawableIma_Matar = Ima_Matar.getDrawable();
        ((Animatable) drawableIma_Matar).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
