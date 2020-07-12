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

public class Uni4Lite4 extends AppCompatActivity {
    private RadioButton U4L4E1rdnOpcion1, U4L4E1rdnOpcion2, U4L4E1rdnOpcion3, U4L4E3rdnVerdadero, U4L4E3rdnFalso,
            U4L4E4rdnOpcion1, U4L4E4rdnOpcion2, U4L4E4rdnOpcion3;
    private TextView U4L4E1Respuesta01, U4L4E2Respuesta02, U4L4E3Respuesta03, U4L4E4Respuesta04, U4L4E5aRespuesta05a,
            U4L4E5bRespuesta05b;
    private EditText U4L4E2Ingreso01, U4L4E5aIngreso02, U4L4E5bIngreso03;
    private ImageView Ima_Cerdo, Ima_Cerdo2, Ima_Oveja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni4_lite4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Cerdo = (ImageView)findViewById(R.id.IMAUni04Cerdo);
        Ima_Cerdo2 = (ImageView)findViewById(R.id.IMAUni04Cerdo2);
        Ima_Oveja = (ImageView)findViewById(R.id.IMAUni04Oveja);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni4lite4_cerdo).into(Ima_Cerdo);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite4_cerdo2).into(Ima_Cerdo2);
        Glide.with(getBaseContext()).load(R.drawable.uni4lite4_oveja).into(Ima_Oveja);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U4L4E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni04L04Eje01_op1);
        U4L4E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni04L04Eje01_op2);
        U4L4E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni04L04Eje01_op3);
        U4L4E1Respuesta01 = (TextView)findViewById(R.id.txtUni04Lite04_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U4L4E2Ingreso01 = (EditText)findViewById(R.id.txtUni04Lite04_Ingreso01);
        U4L4E2Respuesta02 = (TextView)findViewById(R.id.txtUni04Lite04_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U4L4E3rdnVerdadero = (RadioButton)findViewById(R.id.rdnUni04L04Eje03_op1);
        U4L4E3rdnFalso = (RadioButton)findViewById(R.id.rdnUni04L04Eje03_op2);
        U4L4E3Respuesta03 = (TextView)findViewById(R.id.txtUni04Lite04_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4 ------------------------------------------------------------------------------------------
        U4L4E4rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni04L04Eje04_op1);
        U4L4E4rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni04L04Eje04_op2);
        U4L4E4rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni04L04Eje04_op3);
        U4L4E4Respuesta04 = (TextView)findViewById(R.id.txtUni04Lite04_Eje04);
        // PREGUNTA 4 ------------------------------------------------------------------------------------------

        // PREGUNTA 5a ------------------------------------------------------------------------------------------
        U4L4E5aIngreso02 = (EditText)findViewById(R.id.txtUni04Lite04_Ingreso02);
        U4L4E5aRespuesta05a = (TextView)findViewById(R.id.txtUni04Lite04_Eje05a);
        // PREGUNTA 5a ------------------------------------------------------------------------------------------

        // PREGUNTA 5b ------------------------------------------------------------------------------------------
        U4L4E5bIngreso03 = (EditText)findViewById(R.id.txtUni04Lite04_Ingreso03);
        U4L4E5bRespuesta05b = (TextView)findViewById(R.id.txtUni04Lite04_Eje05b);
        // PREGUNTA 5b ------------------------------------------------------------------------------------------
    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje01 (View view) {

        if (U4L4E1rdnOpcion1.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E1Respuesta01.setText("Respuesta correcta. Un juego de roles no significa poner en escena un diálogo memorizado, sino uno en el que los estudiantes lo desarrollen según el escenario o situación comunicativa establecida con anterioridad.");

        } else if (U4L4E1rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 235 del libro.");

        } else if (U4L4E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 11 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje02 (View view){
        String respuesta01 = U4L4E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L4E2Ingreso01.requestFocus();
            U4L4E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L4E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("espontáneas")) || respuesta01.equals("espontáneas ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E2Respuesta02.setText("Respuesta correcta. Las representaciones en el juego de roles son totalmente espontáneas.");

        } else if ((respuesta01.equals("espontaneas")) || respuesta01.equals("espontaneas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E2Respuesta02.setText("*espontaneas* es una respuesta incorrecta, recuerde usar las tildes de manera adecuada.");

        } else if ((respuesta01.equals("ilustradas")) || respuesta01.equals("ilustradas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E2Respuesta02.setText("*ilustradas* es una respuesta incorrecta, revise la página 235 del libro.");

        }  else if ((respuesta01.equals("ensayadas")) || respuesta01.equals("ensayadas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E2Respuesta02.setText("*ensayada* es una respuesta incorrecta, revise la página 235 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U4L4E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje03 (View view) {
        if (U4L4E3rdnFalso.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E3Respuesta03.setText("Respuesta correcta. Ya que los jugadores tienen que imaginar qué haría un personaje concreto.");

        } else if (U4L4E3rdnVerdadero.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E3Respuesta03.setText("Respuesta incorrecta, revise la página 235 del libro.");

        }  else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4 ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje04 (View view) {

        if (U4L4E4rdnOpcion3.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E1Respuesta01.setText("Respuesta correcta. El juego de roles se juega en primera persona, de forma que se establece una empatía entre el jugador y su personaje.");

        } else if (U4L4E4rdnOpcion2.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 235 del libro.");

        } else if (U4L4E4rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E1Respuesta01.setText("Respuesta incorrecta, revise la página 11 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 4 ---------------------------------------------------------------------------------------------

    // EJERCICIO 5a ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje05a (View view){
        String respuesta05a = U4L4E5aIngreso02.getText().toString();

        if (respuesta05a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L4E5aIngreso02.requestFocus();
            U4L4E5aRespuesta05a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L4E5aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05a.equals("cerdo")) || respuesta05a.equals("cerdo ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E5aRespuesta05a.setText("Respuesta correcta. Atrapó al cerdo.");

        } else if ((respuesta05a.equals("gato")) || respuesta05a.equals("gato ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E5aRespuesta05a.setText("*gato* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05a.equals("gallo")) || respuesta05a.equals("gallo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E5aRespuesta05a.setText("*gallo* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05a + "* no es una opción.");
            U4L4E5aRespuesta05a.setText("");
        }
    }
    // EJERCICIO 5a ---------------------------------------------------------------------------------------------

    // EJERCICIO 5b ---------------------------------------------------------------------------------------------
    public void Uni04Lite04Eje05b (View view){
        String respuesta05b = U4L4E5bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U4L4E5bIngreso03.requestFocus();
            U4L4E5bRespuesta05b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U4L4E5bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("las ovejas")) || respuesta05b.equals("las ovejas ")) {
            ToastBien("Excelente, respuesta correcta.");
            U4L4E5bRespuesta05b.setText("Respuesta correcta. Estaban presumidas las ovejas.");

        } else if ((respuesta05b.equals("las abejas")) || respuesta05b.equals("las abejas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E5bRespuesta05b.setText("*las abejas* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("las arañas")) || respuesta05b.equals("las arañas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U4L4E5bRespuesta05b.setText("*las arañas* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U4L4E5bRespuesta05b.setText("");
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
        Drawable drawableIma_Cerdo = Ima_Cerdo.getDrawable();
        ((Animatable) drawableIma_Cerdo).stop();

        Drawable drawableIma_Cerdo2 = Ima_Cerdo2.getDrawable();
        ((Animatable) drawableIma_Cerdo2).stop();

        Drawable drawableIma_Oveja = Ima_Oveja.getDrawable();
        ((Animatable) drawableIma_Oveja).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
