package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion3.eval_evalua301;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion3.eval_menu_evaluacion3;
import com.example.lectoescritura.R;

public class eval_menu_evaluacion4 extends AppCompatActivity {
    private EditText evalu4_user, evalu4_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_menu_evaluacion4);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
        evalu4_user = (EditText)findViewById(R.id.txtEval4_usuario);
        evalu4_pass = (EditText)findViewById(R.id.txtEval4_clave);
        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
    }

    // INGRESO DE USUARIO Y CLAVE --------------------------------------------------------------------------------
    public void IngresarEvaluacion4 (View view){



        String Eval4_nombre = evalu4_user.getText().toString();
        String Eval4_clave = evalu4_pass.getText().toString();

        if(!Eval4_nombre.equals("") && Eval4_clave.equals("1932")) {
            Intent intentsimu = new Intent(eval_menu_evaluacion4.this, eval_evalua401.class);
            intentsimu.putExtra("usuario", Eval4_nombre);
            startActivity(intentsimu);
            finish();
            evalu4_user.setText("");
            evalu4_pass.setText("");

        } else if (Eval4_nombre.equals("") && Eval4_clave.equals("")  ){
            ToastError("Ingrese sus datos para continuar.");
            evalu4_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu4_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval4_nombre.equals("")){
            ToastError("Ingrese su nombre y apellido.");
            evalu4_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu4_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval4_clave.equals("")){
            ToastError("Ingrese la clave.");
            evalu4_pass.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu4_pass, InputMethodManager.SHOW_IMPLICIT);

        } else {
            ToastError("La clave es incorrecta.");
        }
    }
    // INGRESO DE USUARIO Y CLAVE --------------------------------------------------------------------------------

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
