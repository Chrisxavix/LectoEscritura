package com.example.lectoescritura.Menu_Docente.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lectoescritura.R;

public class Docente_Logueo extends AppCompatActivity {
    private ImageView  Ima_docenteL;
    private EditText docente_clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente__logueo);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------
        Ima_docenteL = (ImageView)findViewById(R.id.ImaDocenteL);
        // VALIDACION DE LOS IDs DEL XML -------------------------------------------------------------------------

        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------
        Glide.with(getBaseContext()).load(R.drawable.menuprin_docente2).into(Ima_docenteL);
        // CARGADO DE LOS GIFS -----------------------------------------------------------------------------------

        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
        docente_clave = (EditText)findViewById(R.id.txtSimu_clave);
        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
    }

    public void IngresarDocente (View view){
        String clave = docente_clave.getText().toString();

        if(clave.equals("101ue")) {
            Intent intent = new Intent(Docente_Logueo.this, Docente_Menu.class);
            startActivity(intent);
            docente_clave.setText("");

        } else if (clave.equals("")){
            ToastError("Debe ingresar la clave.");
            docente_clave.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(docente_clave, InputMethodManager.SHOW_IMPLICIT);

        } else {
            ToastError("Clave incorrecta.");
        }
    }

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

    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
    @Override
    public void onBackPressed() {
        finish();
    }
    // BOTÓN DE ATRÁS DEL CELULAR/TABLET--------------------------------------------------------------------------
}
