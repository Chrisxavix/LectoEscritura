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

public class Uni4Lite2 extends AppCompatActivity {
    private ImageView Ima_Leon, Ima_Agradecer, Ima_Reir;
    private RadioButton U4L2E1rdnOpcion1, U4L2E1rdnOpcion2, U4L2E1rdnOpcion3;
    private CheckBox U4L2E2cbxOp1, U4L2E2cbxOp2, U4L2E2cbxOp3;
    private TextView U4L2E1Respuesta01, U4L2E2Respuesta02, U4L2E3aRespuesta03a, U4L2E3bRespuesta03b;
    private EditText U4L2E3aIngreso01, U4L2E3bIngreso02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni4_lite2);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Leon = (ImageView)findViewById(R.id.IMAUni04Leon);
        Ima_Agradecer = (ImageView)findViewById(R.id.IMAUni04Agradecer);
        Ima_Reir = (ImageView)findViewById(R.id.IMAUni04Reir);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni4lite2_leon).into(Ima_Leon);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite2_agradecer).into(Ima_Agradecer);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite2_reir).into(Ima_Reir);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U4L2E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni04L02Eje01_op1);
        U4L2E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni04L02Eje01_op2);
        U4L2E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni04L02Eje01_op3);
        U4L2E1Respuesta01 = (TextView)findViewById(R.id.txtUni04Lite02_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U4L2E2cbxOp1 = (CheckBox)findViewById(R.id.cbxUni04L02Eje02_op1);
        U4L2E2cbxOp2 = (CheckBox)findViewById(R.id.cbxUni04L02Eje02_op2);
        U4L2E2cbxOp3 = (CheckBox)findViewById(R.id.cbxUni04L02Eje02_op3);
        U4L2E2Respuesta02 = (TextView)findViewById(R.id.txtUni04Lite02_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3a ------------------------------------------------------------------------------------------
        U4L2E3aIngreso01 = (EditText)findViewById(R.id.txtUni04Lite02_Ingreso01);
        U4L2E3aRespuesta03a = (TextView)findViewById(R.id.txtUni04Lite02_Eje03a);
        // PREGUNTA 3a ------------------------------------------------------------------------------------------

        // PREGUNTA 3b ------------------------------------------------------------------------------------------
        U4L2E3bIngreso02 = (EditText)findViewById(R.id.txtUni04Lite02_Ingreso02);
        U4L2E3bRespuesta03b = (TextView)findViewById(R.id.txtUni04Lite02_Eje03b);
        // PREGUNTA 3b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni04Lite02Eje01 (View view) {

        if (U4L2E1rdnOpcion3.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L2E1Respuesta01.setText("Respuesta correcta. Texto y contexto son las dos caras que presenta siempre la literatura y que van íntimamente unidas cuando de interpretar los mensajes se trata.");

        } else if (U4L2E1rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 198 del libro.");

        } else if (U4L2E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E1Respuesta01.setText("Respuesta incorrecta, revise la página 198 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni04Lite02Eje02 (View view) {

        if ((U4L2E2cbxOp1.isChecked() == true && U4L2E2cbxOp2.isChecked() == true  && U4L2E2cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L2E2Respuesta02.setText("");

        }  else if ((U4L2E2cbxOp1.isChecked() == true && U4L2E2cbxOp2.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U4L2E2Respuesta02.setText("Respuestas correctas.");

        }  else if ((U4L2E2cbxOp1.isChecked() == true && U4L2E2cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E2Respuesta02.setText("Solo una opción es la correcta, revise la página 198 del libro.");

        }  else if ((U4L2E2cbxOp2.isChecked() == true && U4L2E2cbxOp3.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E2Respuesta02.setText("Solo una opción es la correcta, revise la página 198 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U4L2E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3a ---------------------------------------------------------------------------------------------
    public void Uni04Lite02Eje03a (View view){
        String respuesta03a = U4L2E3aIngreso01.getText().toString();

        if (respuesta03a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L2E3aIngreso01.requestFocus();
            U4L2E3aRespuesta03a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L2E3aIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03a.equals("reír")) || respuesta03a.equals("reír ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L2E3aRespuesta03a.setText("Respuesta correcta. El león se puso a reír.");

        } else if ((respuesta03a.equals("reir")) || respuesta03a.equals("reir ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E3aRespuesta03a.setText("*reir* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta03a.equals("cantar")) || respuesta03a.equals("cantar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E3aRespuesta03a.setText("*cantar* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta03a.equals("llorar")) || respuesta03a.equals("llorar ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E3aRespuesta03a.setText("*llorar* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta03a + "* no es una opción.");
            U4L2E3aRespuesta03a.setText("");
        }
    }
    // EJERCICIO 3a ---------------------------------------------------------------------------------------------

    // EJERCICIO 3b ---------------------------------------------------------------------------------------------
    public void Uni04Lite02Eje03b (View view){
        String respuesta03b = U4L2E3bIngreso02.getText().toString();

        if (respuesta03b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L2E3bIngreso02.requestFocus();
            U4L2E3bRespuesta03b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L2E3bIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta03b.equals("agradecido")) || respuesta03b.equals("agradecido ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L2E3bRespuesta03b.setText("Respuesta correcta. El león estaba agradecido con el ratón.");

        } else if ((respuesta03b.equals("llorando")) || respuesta03b.equals("llorando ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E3bRespuesta03b.setText("*llorando* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta03b.equals("riendo")) || respuesta03b.equals("riendo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L2E3bRespuesta03b.setText("*riendo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta03b + "* no es una opción.");
            U4L2E3bRespuesta03b.setText("");
        }
    }
    // EJERCICIO 3b ---------------------------------------------------------------------------------------------


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
        Drawable drawableIma_Leon = Ima_Leon.getDrawable();
        ((Animatable) drawableIma_Leon).stop();

        Drawable drawableIma_Agradecer = Ima_Agradecer.getDrawable();
        ((Animatable) drawableIma_Agradecer).stop();

        Drawable drawableIma_Reir = Ima_Reir.getDrawable();
        ((Animatable) drawableIma_Reir).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
