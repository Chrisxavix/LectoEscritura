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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Uni4Lite1 extends AppCompatActivity {
    private ImageView Ima_Lago, Ima_Perro, Ima_Perro2;
    private RadioButton U4L1E1rdnOpcion1, U4L1E1rdnOpcion2, U4L1E1rdnOpcion3, U4L1E3rdnVerdadero, U4L1E3rdnFalso;
    private TextView U4L1E1Respuesta01, U4L1E2Respuesta02, U4L1E3Respuesta03, U4L1E4aRespuesta04a,
            U4L1E4bRespuesta04b;
    private EditText U4L1E2Ingreso01, U4L1E4aIngreso02, U4L1E4bIngreso03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni4_lite1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Lago = (ImageView)findViewById(R.id.IMAUni04Lago);
        Ima_Perro = (ImageView)findViewById(R.id.IMAUni04Perro);
        Ima_Perro2 = (ImageView)findViewById(R.id.IMAUni04Perro2);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni4lite1_lago).into(Ima_Lago);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite1_perro).into(Ima_Perro);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite1_perro2).into(Ima_Perro2);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U4L1E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni04L01Eje01_op1);
        U4L1E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni04L01Eje01_op2);
        U4L1E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni04L01Eje01_op3);
        U4L1E1Respuesta01 = (TextView)findViewById(R.id.txtUni04Lite01_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U4L1E2Ingreso01 = (EditText)findViewById(R.id.txtUni04Lite01_Ingreso01);
        U4L1E2Respuesta02 = (TextView)findViewById(R.id.txtUni04Lite01_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U4L1E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni04L01Eje03_op1);
        U4L1E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni04L01Eje03_op2);
        U4L1E3Respuesta03 = (TextView)findViewById(R.id.txtUni04Lite01_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U4L1E4aIngreso02 = (EditText)findViewById(R.id.txtUni04Lite01_Ingreso02);
        U4L1E4aRespuesta04a = (TextView)findViewById(R.id.txtUni04Lite01_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U4L1E4bIngreso03 = (EditText)findViewById(R.id.txtUni04Lite01_Ingreso03);
        U4L1E4bRespuesta04b = (TextView)findViewById(R.id.txtUni04Lite01_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni04Lite01Eje01 (View view) {

        if (U4L1E1rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L1E1Respuesta01.setText("Respuesta correcta. La lengua es el idioma que se emplea en una determinada comunidad y que permite el entendimiento entre los individuos que la constituyen.");

        } else if (U4L1E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 187 del libro.");

        } else if (U4L1E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 187 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni04Lite01Eje02 (View view){
        String respuesta01 = U4L1E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L1E2Ingreso01.requestFocus();
            U4L1E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L1E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("identidad")) || respuesta01.equals("identidad ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L1E2Respuesta02.setText("Respuesta correcta. Da identidad a todos quienes la usan.");

        } else if ((respuesta01.equals("realeza")) || respuesta01.equals("realeza ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E2Respuesta02.setText("*realeza* es una respuesta incorrecta, revise la página 187 del libro.");

        } else if ((respuesta01.equals("firmeza")) || respuesta01.equals("firmeza ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E2Respuesta02.setText("*firmeza* es una respuesta incorrecta, revise la página 187 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U4L1E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni04Lite01Eje03 (View view) {
        if (U4L1E3rdnVerdadero.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L1E3Respuesta03.setText("Respuesta correcta.");

        } else if (U4L1E3rdnFalso.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E3Respuesta03.setText("Respuesta incorrecta, revise la página 189 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni04Lite01Eje04a (View view){
        String respuesta04a = U4L1E4aIngreso02.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L1E4aIngreso02.requestFocus();
            U4L1E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L1E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("perro")) || respuesta04a.equals("perro ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L1E4aRespuesta04a.setText("Respuesta correcta. Le dieron un hueso al perro.");

        } else if ((respuesta04a.equals("gato")) || respuesta04a.equals("gato ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E4aRespuesta04a.setText("*gato* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("oso")) || respuesta04a.equals("oso ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E4aRespuesta04a.setText("*oso* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U4L1E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni04Lite01Eje04b (View view){
        String respuesta04b = U4L1E4bIngreso03.getText().toString();

        if (respuesta04b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L1E4bIngreso03.requestFocus();
            U4L1E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L1E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04b.equals("lago")) || respuesta04b.equals("lago ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L1E4bRespuesta04b.setText("Respuesta correcta. Se le cayó al lago.");

        } else if ((respuesta04b.equals("rio")) || respuesta04b.equals("rio ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E4bRespuesta04b.setText("*rio* es una respuesta incorrecta, lea nuevamente la lectura y recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta04b.equals("río")) || respuesta04b.equals("río ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E4bRespuesta04b.setText("*río* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else if ((respuesta04b.equals("riachuelo")) || respuesta04b.equals("riachuelo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L1E4bRespuesta04b.setText("*riachuelo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta04b + "* no es una opción.");
            U4L1E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Lago = Ima_Lago.getDrawable();
        ((Animatable) drawableIma_Lago).stop();

        Drawable drawableIma_Perro = Ima_Perro.getDrawable();
        ((Animatable) drawableIma_Perro).stop();

        Drawable drawableIma_Perro2 = Ima_Perro2.getDrawable();
        ((Animatable) drawableIma_Perro2).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
