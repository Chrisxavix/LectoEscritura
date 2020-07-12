package com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido;

import androidx.appcompat.app.AppCompatActivity;

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

public class Mayuscula extends AppCompatActivity {
    private TextView MayusculaRespuesta01,MayusculaRespuesta02, MayusculaRespuesta03, MayusculaRespuesta04,
            MayusculaRespuesta05;
    private EditText MayusculaIngreso01,MayusculaIngreso02, MayusculaIngreso03, MayusculaIngreso04,
            MayusculaIngreso05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayuscula);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        MayusculaIngreso01 = (EditText)findViewById(R.id.txtMayuIngreso01);
        MayusculaIngreso02 = (EditText)findViewById(R.id.txtMayuIngreso02);
        MayusculaIngreso03 = (EditText)findViewById(R.id.txtMayuIngreso03);
        MayusculaIngreso04 = (EditText)findViewById(R.id.txtMayuIngreso04);
        MayusculaIngreso05 = (EditText)findViewById(R.id.txtMayuIngreso05);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        MayusculaRespuesta01 = (TextView)findViewById(R.id.txtMayuRes01);
        MayusculaRespuesta02 = (TextView)findViewById(R.id.txtMayuRes02);
        MayusculaRespuesta03 = (TextView)findViewById(R.id.txtMayuRes03);
        MayusculaRespuesta04 = (TextView)findViewById(R.id.txtMayuRes04);
        MayusculaRespuesta05 = (TextView)findViewById(R.id.txtMayuRes05);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------

    }

    // MAYÚSCULA - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void MayusVeri01 (View view){
        String mayu01 = MayusculaIngreso01.getText().toString();

        if (mayu01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            MayusculaIngreso01.requestFocus();
            MayusculaRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(MayusculaIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((mayu01.equals("Carlos")) || mayu01.equals("Carlos ")) {
            ToastBien("Excelente, respuesta correcta.");
            MayusculaRespuesta01.setText("Respuesta correcta. *Carlos* es el nombre de una persona y se escribe en mayúscula.");

        } else if ((mayu01.equals("CARLOS")) || mayu01.equals("CARLOS ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta01.setText("*CARLOS* es una respuesta incorrecta, revise la regla 1.");

        } else if ((mayu01.equals("carlos")) || mayu01.equals("carlos ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta01.setText("*carlos* es una respuesta incorrecta, revise la regla 1.");

        }  else {
            ToastError("!ERROR¡ *" + mayu01 + "* no es una opción.");
            MayusculaRespuesta01.setText("");
        }
    }
    // MAYÚSCULA - EJERCICIO 1 -----------------------------------------------------------------------------------

    // MAYÚSCULA - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void MayusVeri02 (View view){
        String mayu02 = MayusculaIngreso02.getText().toString();

        if (mayu02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            MayusculaIngreso02.requestFocus();
            MayusculaRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(MayusculaIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((mayu02.equals("El")) || mayu02.equals("El ")) {
            ToastBien("Excelente, respuesta correcta.");
            MayusculaRespuesta02.setText("Respuesta correcta. *El* da inicio un texto.");

        } else if ((mayu02.equals("EL")) || mayu02.equals("EL ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta02.setText("*EL* es una respuesta incorrecta, revise la regla 2.");

        } else if ((mayu02.equals("el")) || mayu02.equals("el ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta02.setText("*el* es una respuesta incorrecta, revise la regla 2.");

        }  else {
            ToastError("!ERROR¡ *" + mayu02 + "* no es una opción.");
            MayusculaRespuesta02.setText("");
        }
    }
    // MAYÚSCULA - EJERCICIO 2 -----------------------------------------------------------------------------------

    // MAYÚSCULA - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void MayusVeri03 (View view){
        String mayu03 = MayusculaIngreso03.getText().toString();

        if (mayu03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            MayusculaIngreso03.requestFocus();
            MayusculaRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(MayusculaIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((mayu03.equals("El")) || mayu03.equals("El ")) {
            ToastBien("Excelente, respuesta correcta.");
            MayusculaRespuesta03.setText("Respuesta correcta. *El* da inicio a un texto después de un punto.");

        } else if ((mayu03.equals("EL")) || mayu03.equals("EL ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta03.setText("*EL* es una respuesta incorrecta, revise la regla 3.");

        } else if ((mayu03.equals("el")) || mayu03.equals("el ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta03.setText("*el* es una respuesta incorrecta, revise la regla 3.");

        }  else {
            ToastError("!ERROR¡ *" + mayu03 + "* no es una opción.");
            MayusculaRespuesta03.setText("");
        }
    }
    // MAYÚSCULA - EJERCICIO 3 -----------------------------------------------------------------------------------

    // MAYÚSCULA - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void MayusVeri04 (View view){
        String mayu04 = MayusculaIngreso04.getText().toString();

        if (mayu04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            MayusculaIngreso04.requestFocus();
            MayusculaRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(MayusculaIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((mayu04.equals("Te")) || mayu04.equals("Te ")) {
            ToastBien("Excelente, respuesta correcta.");
            MayusculaRespuesta04.setText("Respuesta correcta. *Te* da inicio de un texto después de los dos puntos.");

        } else if ((mayu04.equals("TE")) || mayu04.equals("TE ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta04.setText("*TE* es una respuesta incorrecta, revise la regla 4.");

        } else if ((mayu04.equals("te")) || mayu04.equals("te ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta04.setText("*te* es una respuesta incorrecta, revise la regla 4.");

        }  else {
            ToastError("!ERROR¡ *" + mayu04 + "* no es una opción.");
            MayusculaRespuesta04.setText("");
        }
    }
    // MAYÚSCULA - EJERCICIO 4 -----------------------------------------------------------------------------------

    // MAYÚSCULA - EJERCICIO 5 -----------------------------------------------------------------------------------
    public void MayusVeri05 (View view){
        String mayu05 = MayusculaIngreso05.getText().toString();

        if (mayu05.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            MayusculaIngreso05.requestFocus();
            MayusculaRespuesta05.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(MayusculaIngreso05, InputMethodManager.SHOW_IMPLICIT);

        } else if ((mayu05.equals("Navidad")) || mayu05.equals("Navidad ")) {
            ToastBien("Excelente, respuesta correcta.");
            MayusculaRespuesta05.setText("Respuesta correcta. *Navidad* es la respuesta por ser una festividad.");

        } else if ((mayu05.equals("NAVIDAD")) || mayu05.equals("NAVIDAD ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta05.setText("*NAVIDAD* es una respuesta incorrecta, revise la regla 5.");

        } else if ((mayu05.equals("navidad")) || mayu05.equals("navidad ")) {
            ToastMal("Mal, respuesta incorrecta.");
            MayusculaRespuesta05.setText("*navidad* es una respuesta incorrecta, revise la regla 5.");

        }  else {
            ToastError("!ERROR¡ *" + mayu05 + "* no es una opción.");
            MayusculaRespuesta05.setText("");
        }
    }
    // MAYÚSCULA - EJERCICIO 5 -----------------------------------------------------------------------------------

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
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------

}
