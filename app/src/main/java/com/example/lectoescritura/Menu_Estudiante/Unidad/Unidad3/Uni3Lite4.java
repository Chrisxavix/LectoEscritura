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

public class Uni3Lite4 extends AppCompatActivity {
    private ImageView Ima_Caballo, Ima_Caballo2, Ima_Preocupar;
    private RadioButton U3L4E1rdnOpcion1, U3L4E1rdnOpcion2, U3L4E1rdnOpcion3, U3L4E3rdnVerdadero, U3L4E3rdnFalso;
    private CheckBox U3L4E4cbxOp1, U3L4E4cbxOp2, U3L4E4cbxOp3;
    private TextView U3L4E1Respuesta01, U3L4E2Respuesta02, U3L4E3Respuesta03, U3L4E4Respuesta04, U3L4E5aRespuesta05a,
            U3L4E5bRespuesta05b;
    private EditText U3L4E2Ingreso01, U3L4E5aIngreso02, U3L4E5bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni3_lite4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Caballo = (ImageView)findViewById(R.id.IMAUni03Caballo);
        Ima_Caballo2 = (ImageView)findViewById(R.id.IMAUni03Caballo2);
        Ima_Preocupar = (ImageView)findViewById(R.id.IMAUni03Preocupado);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni3lite4_caballo).into(Ima_Caballo);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite4_caballo2).into(Ima_Caballo2);
        Glide.with(getBaseContext()).load(R.drawable.uni3lite4_preocupado).into(Ima_Preocupar);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U3L4E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni03L04Eje01_op1);
        U3L4E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni03L04Eje01_op2);
        U3L4E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni03L04Eje01_op3);
        U3L4E1Respuesta01 = (TextView)findViewById(R.id.txtUni03Lite04_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U3L4E2Ingreso01 = (EditText)findViewById(R.id.txtUni03Lite04_Ingreso01);
        U3L4E2Respuesta02 = (TextView)findViewById(R.id.txtUni03Lite04_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U3L4E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni03L04Eje03_op1);
        U3L4E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni03L04Eje03_op2);
        U3L4E3Respuesta03 = (TextView)findViewById(R.id.txtUni03Lite04_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U3L4E4cbxOp1 = (CheckBox)findViewById(R.id.cbxUni03L04Eje04_op1);
        U3L4E4cbxOp2 = (CheckBox)findViewById(R.id.cbxUni03L04Eje04_op2);
        U3L4E4cbxOp3 = (CheckBox)findViewById(R.id.cbxUni03L04Eje04_op3);
        U3L4E4Respuesta04 = (TextView)findViewById(R.id.txtUni03Lite04_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U3L4E5aIngreso02 = (EditText)findViewById(R.id.txtUni03Lite04_Ingreso02);
        U3L4E5aRespuesta05a = (TextView)findViewById(R.id.txtUni03Lite04_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U3L4E5bIngreso03 = (EditText)findViewById(R.id.txtUni03Lite04_Ingreso03);
        U3L4E5bRespuesta05b = (TextView)findViewById(R.id.txtUni03Lite04_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje01 (View view) {

        if (U3L4E1rdnOpcion3.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L4E1Respuesta01.setText("Respuesta correcta. El debate es un evento comunicativo formal en el que un grupo de ponentes discuten sobre temas de interés general.");

        } else if (U3L4E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 171 del libro.");

        } else if (U3L4E1rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 171 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje02 (View view){
        String respuesta01 = U3L4E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L4E2Ingreso01.requestFocus();
            U3L4E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L4E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("orden")) || respuesta01.equals("orden ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L4E2Respuesta02.setText("Respuesta correcta. De límites de orden y respeto.");

        } else if ((respuesta01.equals("señas")) || respuesta01.equals("señas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E2Respuesta02.setText("*señas* es una respuesta incorrecta, revise la página 171 del libro.");

        } else if ((respuesta01.equals("espacio")) || respuesta01.equals("espacio ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E2Respuesta02.setText("*espacio* es una respuesta incorrecta, revise la página 171 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U3L4E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje03 (View view) {
        if (U3L4E3rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U3L4E3Respuesta03.setText("Respuesta correcta.");

        } else if (U3L4E3rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E3Respuesta03.setText("Respuesta incorrecta, revise la página 172 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje04 (View view) {

        if ((U3L4E4cbxOp1.isChecked() == true && U3L4E4cbxOp2.isChecked() == true  && U3L4E4cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L4E4Respuesta04.setText("");

        }  else if ((U3L4E4cbxOp1.isChecked() == true && U3L4E4cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U3L4E4Respuesta04.setText("Respuestas correctas.");

        }  else if ((U3L4E4cbxOp1.isChecked() == true && U3L4E4cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E4Respuesta04.setText("Solo una opción es la correcta, revise la página 177 del libro.");

        }  else if ((U3L4E4cbxOp3.isChecked() == true && U3L4E4cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E4Respuesta04.setText("Solo una opción es la correcta, revise la página 177 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U3L4E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje05a (View view){
        String respuesta05a = U3L4E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L4E5aIngreso02.requestFocus();
            U3L4E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L4E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("caballo")) || respuesta05a.equals("caballo ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L4E5aRespuesta05a.setText("Respuesta correcta. Se burlaba el caballo.");

        } else if ((respuesta05a.equals("loro")) || respuesta05a.equals("loro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E5aRespuesta05a.setText("*loro* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("tigre")) || respuesta05a.equals("tigre ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E5aRespuesta05a.setText("*tigre* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U3L4E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni03Lite04Eje05b (View view){
        String respuesta05b = U3L4E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U3L4E5bIngreso03.requestFocus();
            U3L4E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U3L4E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("preocupada")) || respuesta05b.equals("preocupada ")) {
            ToastBien("Excelente, respuesta correcta.");
            U3L4E5bRespuesta05b.setText("Respuesta correcta. La leona estuvo preocupada.");

        } else if ((respuesta05b.equals("sonriente")) || respuesta05b.equals("sonriente  ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E5bRespuesta05b.setText("*sonriente * es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("feliz")) || respuesta05b.equals("feliz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U3L4E5bRespuesta05b.setText("*feliz* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U3L4E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Caballo = Ima_Caballo.getDrawable();
        ((Animatable) drawableIma_Caballo).stop();

        Drawable drawableIma_Caballo2 = Ima_Caballo2.getDrawable();
        ((Animatable) drawableIma_Caballo2).stop();

        Drawable drawableIma_Preocupar = Ima_Preocupar.getDrawable();
        ((Animatable) drawableIma_Preocupar).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
