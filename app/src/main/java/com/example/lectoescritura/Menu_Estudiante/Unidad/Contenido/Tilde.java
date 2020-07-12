package com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.R;

public class Tilde extends AppCompatActivity {
    private TextView TildeRespuesta01, TildeRespuesta02, TildeRespuesta03, TildeRespuesta04,
            TildeRespuesta05, TildeRespuesta06, TildeRespuesta07, TildeRespuesta08;
    private EditText TildeIngreso01, TildeIngreso02, TildeIngreso03, TildeIngreso04,
            TildeIngreso05, TildeIngreso06, TildeIngreso07, TildeIngreso08;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilde);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------
        TildeIngreso01 = (EditText)findViewById(R.id.txtTildeIngreso01);
        TildeIngreso02 = (EditText)findViewById(R.id.txtTildeIngreso02);
        TildeIngreso03 = (EditText)findViewById(R.id.txtTildeIngreso03);
        TildeIngreso04 = (EditText)findViewById(R.id.txtTildeIngreso04);
        TildeIngreso05 = (EditText)findViewById(R.id.txtTildeIngreso05);
        TildeIngreso06 = (EditText)findViewById(R.id.txtTildeIngreso06);
        TildeIngreso07 = (EditText)findViewById(R.id.txtTildeIngreso07);
        TildeIngreso08 = (EditText)findViewById(R.id.txtTildeIngreso08);
        // DECLARACIÓN DE IDs PARA EL INGRESO --------------------------------------------------------------------

        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
        TildeRespuesta01 = (TextView)findViewById(R.id.txtTildeRes01);
        TildeRespuesta02 = (TextView)findViewById(R.id.txtTildeRes02);
        TildeRespuesta03 = (TextView)findViewById(R.id.txtTildeRes03);
        TildeRespuesta04 = (TextView)findViewById(R.id.txtTildeRes04);
        TildeRespuesta05 = (TextView)findViewById(R.id.txtTildeRes05);
        TildeRespuesta06 = (TextView)findViewById(R.id.txtTildeRes06);
        TildeRespuesta07 = (TextView)findViewById(R.id.txtTildeRes07);
        TildeRespuesta08 = (TextView)findViewById(R.id.txtTildeRes08);
        // DECLARACIÓN DE IDs PARA LAS RESPUESTAS ----------------------------------------------------------------
    }

    // TILDE - EJERCICIO 1 -----------------------------------------------------------------------------------
    public void TildeVeri01 (View view){
        String tilde01 = TildeIngreso01.getText().toString();

        if (tilde01.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso01.requestFocus();
            TildeRespuesta01.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso01, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde01.equals("cajón")) || tilde01.equals("cajón ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta01.setText("Respuesta correcta. *cajón* es una palabra aguda.");

        } else if ((tilde01.equals("cájon")) || tilde01.equals("cájon ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta01.setText("*cájon* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde01.equals("Cajón")) || tilde01.equals("Cajón ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta01.setText("*Cajón* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + tilde01 + "* no es una opción.");
            TildeRespuesta01.setText("");
        }
    }
    // TILDE - EJERCICIO 1 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 2 -----------------------------------------------------------------------------------
    public void TildeVeri02 (View view){
        String tilde02 = TildeIngreso02.getText().toString();

        if (tilde02.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso02.requestFocus();
            TildeRespuesta02.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso02, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde02.equals("sofá")) || tilde02.equals("sofá ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta02.setText("Respuesta correcta. *sofá* es una palabra aguda.");

        } else if ((tilde02.equals("sófa")) || tilde02.equals("sófa ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta02.setText("*sófa* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde02.equals("Sofá")) || tilde02.equals("Sofá ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta02.setText("*Sofá* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else if ((tilde02.equals("sofa")) || tilde02.equals("sofa ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta02.setText("*sofa* es una respuesta incorrecta, revise la sección de tildes.");

        }  else {
            ToastError("!ERROR¡ *" + tilde02 + "* no es una opción.");
            TildeRespuesta02.setText("");
        }
    }
    // TILDE - EJERCICIO 2 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 3 -----------------------------------------------------------------------------------
    public void TildeVeri03 (View view){
        String tilde03 = TildeIngreso03.getText().toString();

        if (tilde03.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso03.requestFocus();
            TildeRespuesta03.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso03, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde03.equals("árbol")) || tilde03.equals("árbol ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta03.setText("Respuesta correcta, *árbol* es una palabra grave.");

        } else if ((tilde03.equals("arból")) || tilde03.equals("arból ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta03.setText("*arból* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde03.equals("ARBOL")) || tilde03.equals("ARBOL ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta03.setText("*ARBOL* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else if ((tilde03.equals("arbol")) || tilde03.equals("arbol ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta03.setText("*arbol* es una respuesta incorrecta, revise la sección de tildes.");

        }  else {
            ToastError("!ERROR¡ *" + tilde03 + "* no es una opción.");
            TildeRespuesta03.setText("");
        }
    }
    // TILDE - EJERCICIO 3 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 4 -----------------------------------------------------------------------------------
    public void TildeVeri04 (View view){
        String tilde04 = TildeIngreso04.getText().toString();

        if (tilde04.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso04.requestFocus();
            TildeRespuesta04.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso04, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde04.equals("lápiz")) || tilde04.equals("lápiz ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta04.setText("Respuesta correcta, *lápiz* es una palabra grave.");

        } else if ((tilde04.equals("lapíz")) || tilde04.equals("lapíz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta04.setText("*lapíz* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde04.equals("lapiz")) || tilde04.equals("lapiz ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta04.setText("*lapiz* es una respuesta incorrecta, revise la imagen de acentos.");

        }  else {
            ToastError("!ERROR¡ *" + tilde04 + "* no es una opción.");
            TildeRespuesta04.setText("");
        }
    }
    // TILDE - EJERCICIO 4 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 5 -----------------------------------------------------------------------------------
    public void TildeVeri05 (View view){
        String tilde05 = TildeIngreso05.getText().toString();

        if (tilde05.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso05.requestFocus();
            TildeRespuesta05.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso05, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde05.equals("pájaro")) || tilde05.equals("pájaro ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta05.setText("Respuesta correcta, *pájaro* es una palabra esdrújula.");

        } else if ((tilde05.equals("pajaró")) || tilde05.equals("pajaró ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta05.setText("*pajaró* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde05.equals("Pájaro")) || tilde05.equals("Pájaro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta05.setText("*Pájaro* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else if ((tilde05.equals("pajaro")) || tilde05.equals("pajaro ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta05.setText("*pajaro* es una respuesta incorrecta, revise la imagen de acentos.");

        }  else {
            ToastError("!ERROR¡ *" + tilde05 + "* no es una opción.");
            TildeRespuesta05.setText("");
        }
    }
    // TILDE - EJERCICIO 5 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 6 -----------------------------------------------------------------------------------
    public void TildeVeri06 (View view){
        String tilde06 = TildeIngreso06.getText().toString();

        if (tilde06.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso06.requestFocus();
            TildeRespuesta06.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso06, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde06.equals("teléfono")) || tilde06.equals("teléfono ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta06.setText("Respuesta correcta, *teléfono* es una palabra esdrújula.");

        } else if ((tilde06.equals("telefóno")) || tilde06.equals("telefóno ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta06.setText("*telefóno* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde06.equals("telefono")) || tilde06.equals("telefono ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta06.setText("*telefono* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde06.equals("Teléfono")) || tilde06.equals("Teléfono ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta06.setText("*Teléfono* es una respuesta incorrecta, revise la sección de mayúsculas.");

        }  else {
            ToastError("!ERROR¡ *" + tilde06 + "* no es una opción.");
            TildeRespuesta06.setText("");
        }
    }
    // TILDE - EJERCICIO 6 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 7 -----------------------------------------------------------------------------------
    public void TildeVeri07 (View view){
        String tilde07 = TildeIngreso07.getText().toString();

        if (tilde07.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso07.requestFocus();
            TildeRespuesta07.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso07, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde07.equals("rápidamente")) || tilde07.equals("rápidamente ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta07.setText("Respuesta correcta, *rápidamente* es una palabra sobreesdrújula.");

        } else if ((tilde07.equals("rapidaménte")) || tilde07.equals("rapidaménte ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta07.setText("*rapidaménte* es una respuesta incorrecta, revise la imagen de acentos.");

        } else if ((tilde07.equals("rapídamente")) || tilde07.equals("rapídamente ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta07.setText("*rapídamente* es una respuesta incorrecta, revise la imagen de acentos.");

        }  else if ((tilde07.equals("rapidamente")) || tilde07.equals("rapidamente ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta07.setText("*rapidamente* es una respuesta incorrecta, revise la imagen de acentos.");

        }  else {
            ToastError("!ERROR¡ *" + tilde07 + "* no es una opción.");
            TildeRespuesta07.setText("");
        }
    }
    // TILDE - EJERCICIO 7 -----------------------------------------------------------------------------------

    // TILDE - EJERCICIO 8 -----------------------------------------------------------------------------------
    public void TildeVeri08 (View view){
        String tilde08 = TildeIngreso08.getText().toString();

        if (tilde08.equals("")){
            ToastError("Primero debe ingresar su respuesta.");
            TildeIngreso08.requestFocus();
            TildeRespuesta08.setText("");
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(TildeIngreso08, InputMethodManager.SHOW_IMPLICIT);

        } else if ((tilde08.equals("Pruébatelo")) || tilde08.equals("Pruébatelo ")) {
            ToastBien("Excelente, respuesta correcta. ");
            TildeRespuesta08.setText("Respuesta correcta, *Pruébatelo* es una palabra sobreesdrújula.");

        } else if ((tilde08.equals("pruébatelo")) || tilde08.equals("pruébatelo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta08.setText("*pruébatelo* es una respuesta incorrecta, revise la sección de mayúsculas.");

        } else if ((tilde08.equals("pruebatélo")) || tilde08.equals("pruebatélo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta08.setText("*pruebatélo* es una respuesta incorrecta, revise la imagen de acentos y la sección de mayúsucula.");

        }  else if ((tilde08.equals("Pruebatelo")) || tilde08.equals("Pruebatelo ")) {
            ToastMal("Mal, respuesta incorrecta.");
            TildeRespuesta08.setText("*Pruebatelo* es una respuesta incorrecta, revise la imagen de acentos.");

        }  else {
            ToastError("!ERROR¡ *" + tilde08 + "* no es una opción.");
            TildeRespuesta08.setText("");
        }
    }
    // TILDE - EJERCICIO 8 -----------------------------------------------------------------------------------


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
