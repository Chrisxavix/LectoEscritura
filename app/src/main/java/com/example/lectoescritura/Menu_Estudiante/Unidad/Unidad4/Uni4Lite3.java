package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad4;

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

public class Uni4Lite3 extends AppCompatActivity {
    private ImageView Ima_Zorro, Ima_Zorro2, Ima_Queso;
    private RadioButton U4L3E1rdnVerdadero, U4L3E1rdnFalso;
    private CheckBox U4L3E2cbxOp1, U4L3E2cbxOp2, U4L3E2cbxOp3, U4L3E3cbxOp1, U4L3E3cbxOp2, U4L3E3cbxOp3;
    private TextView U4L3E1Respuesta01, U4L3E2Respuesta02, U4L3E3Respuesta03, U4L3E4Respuesta04, U4L3E5aRespuesta05a,
            U4L3E5bRespuesta05b;
    private EditText U4L3E4Ingreso01, U4L3E5aIngreso02, U4L3E5bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni4_lite3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Zorro = (ImageView)findViewById(R.id.IMAUni04Zorro);
        Ima_Zorro2 = (ImageView)findViewById(R.id.IMAUni04Zorro2);
        Ima_Queso = (ImageView)findViewById(R.id.IMAUni04Queso);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni4lite3_zorro).into(Ima_Zorro);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite3_zorro2).into(Ima_Zorro2);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite3_queso).into(Ima_Queso);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U4L3E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni04L03Eje01_op1);
        U4L3E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni04L03Eje01_op2);
        U4L3E1Respuesta01 = (TextView)findViewById(R.id.txtUni04Lite03_Eje01);
        // PREGUNTA  ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U4L3E2cbxOp1 = (CheckBox)findViewById(R.id.cbxUni04L03Eje02_op1);
        U4L3E2cbxOp2 = (CheckBox)findViewById(R.id.cbxUni04L03Eje02_op2);
        U4L3E2cbxOp3 = (CheckBox)findViewById(R.id.cbxUni04L03Eje02_op3);
        U4L3E2Respuesta02 = (TextView)findViewById(R.id.txtUni04Lite03_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U4L3E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni04L03Eje03_op1);
        U4L3E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni04L03Eje03_op2);
        U4L3E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni04L03Eje03_op3);
        U4L3E3Respuesta03 = (TextView)findViewById(R.id.txtUni04Lite03_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U4L3E4Ingreso01 = (EditText)findViewById(R.id.txtUni04Lite03_Ingreso01);
        U4L3E4Respuesta04 = (TextView)findViewById(R.id.txtUni04Lite03_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U4L3E5aIngreso02 = (EditText)findViewById(R.id.txtUni04Lite03_Ingreso02);
        U4L3E5aRespuesta05a = (TextView)findViewById(R.id.txtUni04Lite03_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U4L3E5bIngreso03 = (EditText)findViewById(R.id.txtUni04Lite03_Ingreso03);
        U4L3E5bRespuesta05b = (TextView)findViewById(R.id.txtUni04Lite03_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje01 (View view) {
        if (U4L3E1rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L3E1Respuesta01.setText("Respuesta correcta. Ya que una monografía es un texto informativo que recopila y expone, de manera ordenada, la información disponible respecto de un mismo tema o asunto.");

        } else if (U4L3E1rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E1Respuesta01.setText("Respuesta incorrecta, revise la página 209 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje02 (View view) {

        if ((U4L3E2cbxOp1.isChecked() == true && U4L3E2cbxOp2.isChecked() == true  && U4L3E2cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L3E2Respuesta02.setText("");

        }  else if ((U4L3E2cbxOp1.isChecked() == true && U4L3E2cbxOp2.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U4L3E2Respuesta02.setText("Respuestas correctas.");

        }  else if ((U4L3E2cbxOp1.isChecked() == true && U4L3E2cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E2Respuesta02.setText("Solo una opción es la correcta, revise la página 209 del libro.");

        }  else if ((U4L3E2cbxOp2.isChecked() == true && U4L3E2cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E2Respuesta02.setText("Solo una opción es la correcta, revise la página 209 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L3E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje03 (View view) {

        if ((U4L3E3cbxOp1.isChecked() == true && U4L3E3cbxOp2.isChecked() == true  && U4L3E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L3E3Respuesta03.setText("");

        }  else if ((U4L3E3cbxOp1.isChecked() == true && U4L3E3cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U4L3E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U4L3E3cbxOp1.isChecked() == true && U4L3E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E3Respuesta03.setText("Solo una opción es la correcta, revise la página 210 del libro.");

        }  else if ((U4L3E3cbxOp3.isChecked() == true && U4L3E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E3Respuesta03.setText("Solo una opción es la correcta, revise la página 210 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L3E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje04 (View view){
        String respuesta01 = U4L3E4Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L3E4Ingreso01.requestFocus();
            U4L3E4Respuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L3E4Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("revisión")) || respuesta01.equals("revisión ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L3E4Respuesta04.setText("Respuesta correcta. Planificación, redacción, revisión y publicación.");

        } else if ((respuesta01.equals("revision")) || respuesta01.equals("revision ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E4Respuesta04.setText("*revision* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta01.equals("escritura")) || respuesta01.equals("escritura ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E4Respuesta04.setText("*escritura* es una respuesta incorrecta, revise la página 221 del libro.");

        }  else if ((respuesta01.equals("lectura")) || respuesta01.equals("lectura ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E4Respuesta04.setText("*lectura* es una respuesta incorrecta, revise la página 221 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U4L3E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje05a (View view){
        String respuesta05a = U4L3E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L3E5aIngreso02.requestFocus();
            U4L3E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L3E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("queso")) || respuesta05a.equals("queso ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L3E5aRespuesta05a.setText("Respuesta correcta. El zorro quería el queso.");

        } else if ((respuesta05a.equals("pelaje")) || respuesta05a.equals("pelaje ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E5aRespuesta05a.setText("*pelaje* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("dulce")) || respuesta05a.equals("dulce ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E5aRespuesta05a.setText("*dulce* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U4L3E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni04Lite03Eje05b (View view){
        String respuesta05b = U4L3E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L3E5bIngreso03.requestFocus();
            U4L3E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L3E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("zorro")) || respuesta05b.equals("zorro ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L3E5bRespuesta05b.setText("Respuesta correcta. El que engañó con halagos fue el zorro.");

        } else if ((respuesta05b.equals("cuervo")) || respuesta05b.equals("cuervo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E5bRespuesta05b.setText("*cuervo* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("caballo")) || respuesta05b.equals("caballo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L3E5bRespuesta05b.setText("*caballo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U4L3E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Zorro = Ima_Zorro.getDrawable();
        ((Animatable) drawableIma_Zorro).stop();

        Drawable drawableIma_Zorro2 = Ima_Zorro2.getDrawable();
        ((Animatable) drawableIma_Zorro2).stop();

        Drawable drawableIma_Queso = Ima_Queso.getDrawable();
        ((Animatable) drawableIma_Queso).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
