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

public class Uni2Lite1 extends AppCompatActivity {
    private ImageView Ima_Lobo, Ima_Disfraz, Ima_Oveja;
    private RadioButton U2L1E1rdnOpcion1, U2L1E1rdnOpcion2, U2L1E1rdnOpcion3;
    private TextView U2L1E1Respuesta01, U2L1E2Respuesta02, U2L1E3Respuesta03, U2L1E4aRespuesta04a,
            U2L1E4bRespuesta04b;
    private EditText U2L1E2Ingreso01, U2L1E4aIngreso02, U2L1E4bIngreso03;
    private CheckBox U2L1E3cbxOp1, U2L1E3cbxOp2, U2L1E3cbxOp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2_lite1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // GIF VALIDACIONES --------------------------------------------------------------------------------------
        Ima_Lobo = (ImageView)findViewById(R.id.IMAUni02Lobo);
        Ima_Disfraz = (ImageView)findViewById(R.id.IMAUni02Disfraz);
        Ima_Oveja = (ImageView)findViewById(R.id.IMAUni02Oveja);
        // GIF VALIDACIONES --------------------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.uni2lite1_lobo).into(Ima_Lobo);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite1_disfrazar).into(Ima_Disfraz);
        Glide.with(getBaseContext()).load(R.drawable.uni2lite1_oveja).into(Ima_Oveja);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // PREGUNTA 1 ------------------------------------------------------------------------------------------
        U2L1E1rdnOpcion1 = (RadioButton)findViewById(R.id.rdnUni02L01Eje01_op1);
        U2L1E1rdnOpcion2 = (RadioButton)findViewById(R.id.rdnUni02L01Eje01_op2);
        U2L1E1rdnOpcion3 = (RadioButton)findViewById(R.id.rdnUni02L01Eje01_op3);
        U2L1E1Respuesta01 = (TextView)findViewById(R.id.txtUni02Lite01_Eje01);
        // PREGUNTA 1 ------------------------------------------------------------------------------------------

        // PREGUNTA 2 ------------------------------------------------------------------------------------------
        U2L1E2Ingreso01 = (EditText)findViewById(R.id.txtUni02Lite01_Ingreso01);
        U2L1E2Respuesta02 = (TextView)findViewById(R.id.txtUni02Lite01_Eje02);
        // PREGUNTA 2 ------------------------------------------------------------------------------------------

        // PREGUNTA 3 ------------------------------------------------------------------------------------------
        U2L1E3cbxOp1 = (CheckBox)findViewById(R.id.cbxUni02L01Eje03_op1);
        U2L1E3cbxOp2 = (CheckBox)findViewById(R.id.cbxUni02L01Eje03_op2);
        U2L1E3cbxOp3 = (CheckBox)findViewById(R.id.cbxUni02L01Eje03_op3);
        U2L1E3Respuesta03 = (TextView)findViewById(R.id.txtUni02Lite01_Eje03);
        // PREGUNTA 3 ------------------------------------------------------------------------------------------

        // PREGUNTA 4a ------------------------------------------------------------------------------------------
        U2L1E4aIngreso02 = (EditText)findViewById(R.id.txtUni02Lite01_Ingreso02);
        U2L1E4aRespuesta04a = (TextView)findViewById(R.id.txtUni02Lite01_Eje04a);
        // PREGUNTA 4a ------------------------------------------------------------------------------------------

        // PREGUNTA 4b ------------------------------------------------------------------------------------------
        U2L1E4bIngreso03 = (EditText)findViewById(R.id.txtUni02Lite01_Ingreso03);
        U2L1E4bRespuesta04b = (TextView)findViewById(R.id.txtUni02Lite01_Eje04b);
        // PREGUNTA 4b ------------------------------------------------------------------------------------------

    }

    // EJERCICIO 1 ---------------------------------------------------------------------------------------------
    public void Uni02Lite01Eje01 (View view) {

        if (U2L1E1rdnOpcion2.isChecked() == true) {
            ToastBien("Excelente, respuesta correcta.");
            U2L1E1Respuesta01.setText("Respuesta correcta. Los inicios de la presencia de la población de origen africano en nuestro país tienen dos momentos históricos: el primero tiene que ver con los asentamientos en la provincia de Esmeraldas y el segundo con la población del Valle del Chota y de Mira.");

        } else if (U2L1E1rdnOpcion1.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 70 del libro.");

        } else if (U2L1E1rdnOpcion3.isChecked() == true){
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E1Respuesta01.setText("Respuesta incorrecta, revise la página 70 del libro.");

        } else {
            ToastError("!ERROR¡ Seleccione una opción.");
        }
    }
    // EJERCICIO 1 ---------------------------------------------------------------------------------------------

    // EJERCICIO 2 ---------------------------------------------------------------------------------------------
    public void Uni02Lite01Eje02 (View view){
        String respuesta01 = U2L1E2Ingreso01.getText().toString();

        if (respuesta01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L1E2Ingreso01.requestFocus();
            U2L1E2Respuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L1E2Ingreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta01.equals("1553")) || respuesta01.equals("1553 ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L1E2Respuesta02.setText("Respuesta correcta. La presencia afroecuatoriana se remonta al año 1553.");

        } else if ((respuesta01.equals("1663")) || respuesta01.equals("1663 ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E2Respuesta02.setText("*1663* es una respuesta incorrecta, revise la página 70 del libro.");

        } else if ((respuesta01.equals("1563")) || respuesta01.equals("1563 ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E2Respuesta02.setText("*1563* es una respuesta incorrecta, revise la página 70 del libro.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta01 + "* no es una opción.");
            U2L1E2Respuesta02.setText("");
        }
    }
    // EJERCICIO 2 ---------------------------------------------------------------------------------------------

    // EJERCICIO 3 ---------------------------------------------------------------------------------------------
    public void Uni02Lite01Eje03 (View view) {

        if ((U2L1E3cbxOp1.isChecked() == true && U2L1E3cbxOp2.isChecked() == true  && U2L1E3cbxOp3.isChecked() == true))  {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L1E3Respuesta03.setText("");

        }  else if ((U2L1E3cbxOp1.isChecked() == true && U2L1E3cbxOp3.isChecked() == true))  {
            ToastBien("Excelente, respuestas correctas.");
            U2L1E3Respuesta03.setText("Respuestas correctas.");

        }  else if ((U2L1E3cbxOp1.isChecked() == true && U2L1E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E3Respuesta03.setText("Solo una opción es la correcta, revise la página 71 del libro.");

        }  else if ((U2L1E3cbxOp3.isChecked() == true && U2L1E3cbxOp2.isChecked() == true))  {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E3Respuesta03.setText("Solo una opción es la correcta, revise la página 71 del libro.");

        }  else {
            ToastError("!ERROR¡ Debe seleccionar dos opciones.");
            U2L1E3Respuesta03.setText("");
        }
    }
    // EJERCICIO 3 ---------------------------------------------------------------------------------------------

    // EJERCICIO 4a ---------------------------------------------------------------------------------------------
    public void Uni02Lite01Eje04a (View view){
        String respuesta04a = U2L1E4aIngreso02.getText().toString();

        if (respuesta04a.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L1E4aIngreso02.requestFocus();
            U2L1E4aRespuesta04a.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L1E4aIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta04a.equals("disfraz")) || respuesta04a.equals("disfraz ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L1E4aRespuesta04a.setText("Respuesta correcta. El lobo se puso un disfraz.");

        } else if ((respuesta04a.equals("chaleco")) || respuesta04a.equals("chaleco ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E4aRespuesta04a.setText("*chaleco* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta04a.equals("sombrero")) || respuesta04a.equals("sombrero ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E4aRespuesta04a.setText("*sombrero* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else {
            ToastError("!ERROR¡ *" + respuesta04a + "* no es una opción.");
            U2L1E4aRespuesta04a.setText("");
        }
    }
    // EJERCICIO 4a ---------------------------------------------------------------------------------------------

    // EJERCICIO 4b ---------------------------------------------------------------------------------------------
    public void Uni02Lite01Eje04b (View view){
        String respuesta05b = U2L1E4bIngreso03.getText().toString();

        if (respuesta05b.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            U2L1E4bIngreso03.requestFocus();
            U2L1E4bRespuesta04b.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(U2L1E4bIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((respuesta05b.equals("ovejas")) || respuesta05b.equals("ovejas ")) {
            ToastBien("Excelente, respuesta correcta.");
            U2L1E4bRespuesta04b.setText("Respuesta correcta. En un corral de ovejas.");

        } else if ((respuesta05b.equals("abejas")) || respuesta05b.equals("abejas ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E4bRespuesta04b.setText("*abejas* es una respuesta incorrecta, lea nuevamente la lectura.");

        } else if ((respuesta05b.equals("lobos")) || respuesta05b.equals("lobos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            U2L1E4bRespuesta04b.setText("*lobos* es una respuesta incorrecta, lea nuevamente la lectura.");

        }  else {
            ToastError("!ERROR¡ *" + respuesta05b + "* no es una opción.");
            U2L1E4bRespuesta04b.setText("");
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
        Drawable drawableIma_Lobo = Ima_Lobo.getDrawable();
        ((Animatable) drawableIma_Lobo).stop();

        Drawable drawableIma_Disfraz = Ima_Disfraz.getDrawable();
        ((Animatable) drawableIma_Disfraz).stop();

        Drawable drawableIma_Oveja = Ima_Oveja.getDrawable();
        ((Animatable) drawableIma_Oveja).stop();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
