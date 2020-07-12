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

public class Uni3Lite2 extends AppCompatActivity {
    private ImageView Ima_Conejo, Ima_Mariposa, Ima_Mono;
    private RadioButton U3L2E1rdnOpcion1, U3L2E1rdnOpcion2, U3L2E1rdnOpcion3;
    private CheckBox U3L2E3cbxOp1, U3L2E3cbxOp2, U3L2E3cbxOp3;
    private TextView U3L2E1Respuesta01, U3L2E2Respuesta02, U3L2E3Respuesta03, U3L2E4aRespuesta04a,
            U3L2E4bRespuesta04b;
    private EditText U3L2E2Ingreso01, U3L2E4aIngreso02, U3L2E4bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni3_lite2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Conejo = (ImageView)findViewById(R.id.IMAUni03Conejo);
        Ima_Mariposa = (ImageView)findViewById(R.id.IMAUni03Mariposa);
        Ima_Mono = (ImageView)findViewById(R.id.IMAUni03Mono);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni3lite2_conejo).into(Ima_Conejo);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite2_mariposa).into(Ima_Mariposa);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite2_mono).into(Ima_Mono);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U3L2E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni03L02Eje01_op1);
        U3L2E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni03L02Eje01_op2);
        U3L2E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni03L02Eje01_op3);
        U3L2E1Respuesta01 = (TextView)findViewById(R.id.txtUni03Lite02_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U3L2E2Ingreso01 = (EditText)findViewById(R.id.txtUni03Lite02_Ingreso01);
        U3L2E2Respuesta02 = (TextView)findViewById(R.id.txtUni03Lite02_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U3L2E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni03L02Eje03_op1);
        U3L2E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni03L02Eje03_op2);
        U3L2E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni03L02Eje03_op3);
        U3L2E3Respuesta03 = (TextView)findViewById(R.id.txtUni03Lite02_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U3L2E4aIngreso02 = (EditText)findViewById(R.id.txtUni03Lite02_Ingreso02);
        U3L2E4aRespuesta04a = (TextView)findViewById(R.id.txtUni03Lite02_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U3L2E4bIngreso03 = (EditText)findViewById(R.id.txtUni03Lite02_Ingreso03);
        U3L2E4bRespuesta04b = (TextView)findViewById(R.id.txtUni03Lite02_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni03Lite02Eje01 (View view) {

        if (U3L2E1rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L2E1Respuesta01.setText("Respuesta correcta. El cuento es una narración breve que relata una secuencia de hechos ficticios.");

        } else if (U3L2E1rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 139 del libro.");

        } else if (U3L2E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 139 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni03Lite02Eje02 (View view){
        String respuesta01 = U3L2E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L2E2Ingreso01.requestFocus();
            U3L2E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L2E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("trama")) || respuesta01.equals("trama ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L2E2Respuesta02.setText("Respuesta correcta. Vive un cambio a lo largo de la trama.");

        } else if ((respuesta01.equals("novela")) || respuesta01.equals("novela ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E2Respuesta02.setText("*novela* es una respuesta incorrecta, revise la página 139 del libro.");

        } else if ((respuesta01.equals("párrafo")) || respuesta01.equals("párrafo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E2Respuesta02.setText("*párrafo* es una respuesta incorrecta, revise la página 11 del libro.");

        } else if ((respuesta01.equals("parrafo")) || respuesta01.equals("parrafo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E2Respuesta02.setText("*parrafo* es una respuesta incorrecta, revise la página 11 del libro y recuerde usar las tildes de manera adecuada.");

        } else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U3L2E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni03Lite02Eje03 (View view) {

        if ((U3L2E3cbxOp1.isChecked() == true && U3L2E3cbxOp2.isChecked() == true  && U3L2E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L2E3Respuesta03.setText("");

        }  else if ((U3L2E3cbxOp2.isChecked() == true && U3L2E3cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U3L2E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U3L2E3cbxOp1.isChecked() == true && U3L2E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E3Respuesta03.setText("Solo una opción es la correcta, revise la página 139 del libro.");

        }  else if ((U3L2E3cbxOp1.isChecked() == true && U3L2E3cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E3Respuesta03.setText("Solo una opción es la correcta, revise la página 139 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L2E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni03Lite02Eje04a (View view){
        String respuesta04a = U3L2E4aIngreso02.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L2E4aIngreso02.requestFocus();
            U3L2E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L2E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("mariposa")) || respuesta04a.equals("mariposa ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L2E4aRespuesta04a.setText("Respuesta correcta. Se estaba ahogando la mariposa.");

        } else if ((respuesta04a.equals("vaca")) || respuesta04a.equals("vaca ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E4aRespuesta04a.setText("*vaca* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("coneja")) || respuesta04a.equals("coneja ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E4aRespuesta04a.setText("*coneja* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U3L2E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni03Lite02Eje04b (View view){
        String respuesta04b = U3L2E4bIngreso03.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L2E4bIngreso03.requestFocus();
            U3L2E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L2E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("mono")) || respuesta04b.equals("mono ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L2E4bRespuesta04b.setText("Respuesta correcta. El que vio todo fue el mono.");

        } else if ((respuesta04b.equals("tigre")) || respuesta04b.equals("tigre ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E4bRespuesta04b.setText("*tigre* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04b.equals("lobo")) || respuesta04b.equals("lobo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L2E4bRespuesta04b.setText("*lobo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U3L2E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Conejo = Ima_Conejo.getDrawable();
        ((Animatable) drawableIma_Conejo).stop();

        Drawable drawableIma_Mariposa = Ima_Mariposa.getDrawable();
        ((Animatable) drawableIma_Mariposa).stop();

        Drawable drawableIma_Mono = Ima_Mono.getDrawable();
        ((Animatable) drawableIma_Mono).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
