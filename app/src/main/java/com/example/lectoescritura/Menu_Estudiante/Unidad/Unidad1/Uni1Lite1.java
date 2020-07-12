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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni1Lite1 extends AppCompatActivity {
    private RadioButton U1L1E1rdnOpcion1, U1L1E1rdnOpcion2, U1L1E1rdnOpcion3, U1L1E2rdnVerdadero, U1L1E2rdnFalso;
    private TextView U1L1E1Respuesta01, U1L1E2Respuesta02, U1L1E3Respuesta03, U1L1E4Respuesta04, U1L1E5aRespuesta05a,
            U1L1E5bRespuesta05b;
    private EditText U1L1E3Ingreso01, U1L1E5aIngreso02, U1L1E5bIngreso03;
    private CheckBox U1L1E4cbxOp1, U1L1E4cbxOp2, U1L1E4cbxOp3;
    private ImageView Ima_Gallo, Ima_Maiz, Ima_Perro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni1_lite1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Gallo = (ImageView)findViewById(R.id.IMAUni01Gallo);
        Ima_Maiz = (ImageView)findViewById(R.id.IMAUni01Maiz);
        Ima_Perro = (ImageView)findViewById(R.id.IMAUni01Perro);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni1lite1_gallo).into(Ima_Gallo);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite1_maiz).into(Ima_Maiz);
        Glide.with(getBaseContext()).load(R.drawable.uni1lite1_perro).into(Ima_Perro);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U1L1E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni01L01Eje01_op1);
        U1L1E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni01L01Eje01_op2);
        U1L1E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni01L01Eje01_op3);
        U1L1E1Respuesta01 = (TextView)findViewById(R.id.txtUni01Lite01_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U1L1E2rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni01L01Eje02_op1);
        U1L1E2rdnFalso = (RadioButton)findViewById(R.id.rdnUni01L01Eje02_op2);
        U1L1E2Respuesta02 = (TextView)findViewById(R.id.txtUni01Lite01_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U1L1E3Ingreso01 = (EditText)findViewById(R.id.txtUni01Lite01_Ingreso01);
        U1L1E3Respuesta03 = (TextView)findViewById(R.id.txtUni01Lite01_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U1L1E4cbxOp1 = (CheckBox)findViewById(R.id.cbxUni01L01Eje04_op1);
        U1L1E4cbxOp2 = (CheckBox)findViewById(R.id.cbxUni01L01Eje04_op2);
        U1L1E4cbxOp3 = (CheckBox)findViewById(R.id.cbxUni01L01Eje04_op3);
        U1L1E4Respuesta04 = (TextView)findViewById(R.id.txtUni01Lite01_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U1L1E5aIngreso02 = (EditText)findViewById(R.id.txtUni01Lite01_Ingreso02);
        U1L1E5aRespuesta05a = (TextView)findViewById(R.id.txtUni01Lite01_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U1L1E5bIngreso03 = (EditText)findViewById(R.id.txtUni01Lite01_Ingreso03);
        U1L1E5bRespuesta05b = (TextView)findViewById(R.id.txtUni01Lite01_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje01 (View view) {

        if (U1L1E1rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L1E1Respuesta01.setText("Respuesta correcta. La oralidad es la expresión de la palabra hablada.");

        } else if (U1L1E1rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 11 del libro.");

        } else if (U1L1E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 11 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje02 (View view) {
        if (U1L1E2rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U1L1E2Respuesta02.setText("Respuesta correcta.");

        } else if (U1L1E2rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E2Respuesta02.setText("Respuesta incorrecta, revise la página 11 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje03 (View view){
        String respuesta01 = U1L1E3Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L1E3Ingreso01.requestFocus();
            U1L1E3Respuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L1E3Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("complementan")) || respuesta01.equals("complementan ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L1E3Respuesta03.setText("Respuesta correcta. La expresión oral puede ir acompañada de varios aspectos que la complementan.");

        } else if ((respuesta01.equals("dividen")) || respuesta01.equals("dividen ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E3Respuesta03.setText("*dividen* es una respuesta incorrecta, revise la página 11 del libro.");

        } else if ((respuesta01.equals("supervisan")) || respuesta01.equals("supervisan ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E3Respuesta03.setText("*supervisan* es una respuesta incorrecta, revise la página 11 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U1L1E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje04 (View view) {

        if ((U1L1E4cbxOp1.isChecked() == true && U1L1E4cbxOp2.isChecked() == true  && U1L1E4cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U1L1E4Respuesta04.setText("");

        }  else if ((U1L1E4cbxOp1.isChecked() == true && U1L1E4cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U1L1E4Respuesta04.setText("Respuestas correctas.");

        }  else if ((U1L1E4cbxOp1.isChecked() == true && U1L1E4cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E4Respuesta04.setText("Solo una opción es la correcta, revise la página 13 del libro.");

        }  else if ((U1L1E4cbxOp3.isChecked() == true && U1L1E4cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E4Respuesta04.setText("Solo una opción es la correcta, revise la página 13 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U1L1E4Respuesta04.setText("");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje05a (View view){
        String respuesta05a = U1L1E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L1E5aIngreso02.requestFocus();
            U1L1E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L1E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("maíz")) || respuesta05a.equals("maíz ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L1E5aRespuesta05a.setText("Respuesta correcta. El gallo encontró máiz en el basurero.");

        } else if ((respuesta05a.equals("maiz")) || respuesta05a.equals("maiz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E5aRespuesta05a.setText("*maiz* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta05a.equals("arroz")) || respuesta05a.equals("arroz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E5aRespuesta05a.setText("*arroz* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("cebada")) || respuesta05a.equals("cebada ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E5aRespuesta05a.setText("*cebada* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U1L1E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni01Lite01Eje05b (View view){
        String respuesta05b = U1L1E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U1L1E5bIngreso03.requestFocus();
            U1L1E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U1L1E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("al perro")) || respuesta05b.equals("al perro ")) {
            ToastBien("Excelente, respuesta correcta.");
            U1L1E5bRespuesta05b.setText("Respuesta correcta. El gallo dio las gracias al perro.");

        } else if ((respuesta05b.equals("al gato")) || respuesta05b.equals("al gato ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E5bRespuesta05b.setText("*al gato* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("la perro")) || respuesta05b.equals("la perro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U1L1E5bRespuesta05b.setText("*la perro* es una respuesta incorrecta, recuerde usar los artículos de manera adecuada.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U1L1E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Gallo = Ima_Gallo.getDrawable();
        ((Animatable) drawableIma_Gallo).stop();

        Drawable drawableIma_Perro = Ima_Perro.getDrawable();
        ((Animatable) drawableIma_Perro).stop();

        Drawable drawableIma_Maiz = Ima_Maiz.getDrawable();
        ((Animatable) drawableIma_Maiz).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
