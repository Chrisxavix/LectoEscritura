package com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3;

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

public class Uni3Lite3 extends AppCompatActivity {
    private ImageView Ima_Leona, Ima_Leona2, Ima_Triste;
    private RadioButton U3L3E1rdnVerdadero, U3L3E1rdnFalso;
    private CheckBox U3L3E3cbxOp1, U3L3E3cbxOp2, U3L3E3cbxOp3, U3L3E4cbxOp1, U3L3E4cbxOp2, U3L3E4cbxOp3;
    private TextView U3L3E1Respuesta01, U3L3E2Respuesta02, U3L3E3Respuesta03, U3L3E4Respuesta04, U3L3E5aRespuesta05a,
            U3L3E5bRespuesta05b;
    private EditText U3L3E2Ingreso01, U3L3E5aIngreso02, U3L3E5bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni3_lite3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Leona = (ImageView)findViewById(R.id.IMAUni03Leona);
        Ima_Leona2 = (ImageView)findViewById(R.id.IMAUni03Leona2);
        Ima_Triste = (ImageView)findViewById(R.id.IMAUni03Triste);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni3lite3_leona).into(Ima_Leona);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite3_leona2).into(Ima_Leona2);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite3_triste).into(Ima_Triste);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U3L3E1rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni03L03Eje01_op1);
        U3L3E1rdnFalso = (RadioButton)findViewById(R.id.rdnUni03L03Eje01_op2);
        U3L3E1Respuesta01 = (TextView)findViewById(R.id.txtUni03Lite03_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U3L3E2Ingreso01 = (EditText)findViewById(R.id.txtUni03Lite03_Ingreso01);
        U3L3E2Respuesta02 = (TextView)findViewById(R.id.txtUni03Lite03_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U3L3E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni03L03Eje03_op1);
        U3L3E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni03L03Eje03_op2);
        U3L3E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni03L03Eje03_op3);
        U3L3E3Respuesta03 = (TextView)findViewById(R.id.txtUni03Lite03_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U3L3E4cbxOp1 = (CheckBox)findViewById(R.id.cbxUni03L03Eje04_op1);
        U3L3E4cbxOp2 = (CheckBox)findViewById(R.id.cbxUni03L03Eje04_op2);
        U3L3E4cbxOp3 = (CheckBox)findViewById(R.id.cbxUni03L03Eje04_op3);
        U3L3E4Respuesta04 = (TextView)findViewById(R.id.txtUni03Lite03_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U3L3E5aIngreso02 = (EditText)findViewById(R.id.txtUni03Lite03_Ingreso02);
        U3L3E5aRespuesta05a = (TextView)findViewById(R.id.txtUni03Lite03_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U3L3E5bIngreso03 = (EditText)findViewById(R.id.txtUni03Lite03_Ingreso03);
        U3L3E5bRespuesta05b = (TextView)findViewById(R.id.txtUni03Lite03_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje01 (View view) {
        if (U3L3E1rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L3E1Respuesta01.setText("Respuesta correcta. Ya que cuando las personas tienen la intención de exponer información, lo hacen mediante textos expositivos.");

        } else if (U3L3E1rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E1Respuesta01.setText("Respuesta incorrecta, revise la página 153 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje02 (View view){
        String respuesta01 = U3L3E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L3E2Ingreso01.requestFocus();
            U3L3E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L3E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("credibilidad")) || respuesta01.equals("credibilidad ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L3E2Respuesta02.setText("Respuesta correcta. Está unido a su credibilidad.");

        } else if ((respuesta01.equals("idea")) || respuesta01.equals("idea ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E2Respuesta02.setText("*dividen* es una respuesta incorrecta, revise la página 153 del libro.");

        } else if ((respuesta01.equals("realidad")) || respuesta01.equals("realidad ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E2Respuesta02.setText("*realidad* es una respuesta incorrecta, revise la página 153 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U3L3E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje03 (View view) {

        if ((U3L3E3cbxOp1.isChecked() == true && U3L3E3cbxOp2.isChecked() == true  && U3L3E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L3E3Respuesta03.setText("");

        }  else if ((U3L3E3cbxOp1.isChecked() == true && U3L3E3cbxOp2.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U3L3E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U3L3E3cbxOp1.isChecked() == true && U3L3E3cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E3Respuesta03.setText("Solo una opción es la correcta, revise la página 153 del libro.");

        }  else if ((U3L3E3cbxOp2.isChecked() == true && U3L3E3cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E3Respuesta03.setText("Solo una opción es la correcta, revise la página 153 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L3E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje04 (View view) {

        if ((U3L3E4cbxOp1.isChecked() == true && U3L3E4cbxOp2.isChecked() == true  && U3L3E4cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L3E4Respuesta04.setText("");

        }  else if ((U3L3E4cbxOp2.isChecked() == true && U3L3E4cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U3L3E4Respuesta04.setText("Respuestas correctas.");

        }  else if ((U3L3E4cbxOp2.isChecked() == true && U3L3E4cbxOp1.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E4Respuesta04.setText("Solo una opción es la correcta, revise la página 153 del libro.");

        }  else if ((U3L3E4cbxOp3.isChecked() == true && U3L3E4cbxOp1.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E4Respuesta04.setText("Solo una opción es la correcta, revise la página 153 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L3E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje05a (View view){
        String respuesta05a = U3L3E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L3E5aIngreso02.requestFocus();
            U3L3E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L3E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("leona")) || respuesta05a.equals("leona ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L3E5aRespuesta05a.setText("Respuesta correcta. Causaba temor la leona.");

        } else if ((respuesta05a.equals("mariposa")) || respuesta05a.equals("mariposa ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E5aRespuesta05a.setText("*mariposa* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("cebra")) || respuesta05a.equals("cebra ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E5aRespuesta05a.setText("*cebra* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U3L3E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni03Lite03Eje05b (View view){
        String respuesta05b = U3L3E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L3E5bIngreso03.requestFocus();
            U3L3E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L3E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("triste")) || respuesta05b.equals("triste ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L3E5bRespuesta05b.setText("Respuesta correcta. La leona estuvo triste.");

        } else if ((respuesta05b.equals("feliz")) || respuesta05b.equals("feliz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E5bRespuesta05b.setText("*feliz* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("pensativa")) || respuesta05b.equals("pensativa ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L3E5bRespuesta05b.setText("*pensativa* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U3L3E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Leona = Ima_Leona.getDrawable();
        ((Animatable) drawableIma_Leona).stop();

        Drawable drawableIma_Leona2 = Ima_Leona2.getDrawable();
        ((Animatable) drawableIma_Leona2).stop();

        Drawable drawableIma_Triste = Ima_Triste.getDrawable();
        ((Animatable) drawableIma_Triste).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
