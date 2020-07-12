package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion3;

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

import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion2.eval_evalua201;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion2.eval_menu_evaluacion2;
import com.example.lectoescritura.R;

public class eval_menu_evaluacion3 extends AppCompatActivity {
    private EditText evalu3_user, evalu3_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_menu_evaluacion3);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
        evalu3_user = (EditText)findViewById(R.id.txtEval3_usuario);
        evalu3_pass = (EditText)findViewById(R.id.txtEval3_clave);
        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
    }

    // INGRESO DE USUARIO Y CLAVE --------------------------------------------------------------------------------
    public void IngresarEvaluacion3 (View view){

        String Eval3_nombre = evalu3_user.getText().toString();
        String Eval3_clave = evalu3_pass.getText().toString();

        if(!Eval3_nombre.equals("") && Eval3_clave.equals("1828")) {
            Intent intentsimu = new Intent(eval_menu_evaluacion3.this, eval_evalua301.class);
            intentsimu.putExtra("usuario", Eval3_nombre);
            startActivity(intentsimu);
            finish();
            evalu3_user.setText("");
            evalu3_pass.setText("");

        } else if (Eval3_nombre.equals("") && Eval3_clave.equals("")  ){
            ToastError("Ingrese sus datos para continuar.");
            evalu3_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu3_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval3_nombre.equals("")){
            ToastError("Ingrese su nombre y apellido.");
            evalu3_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu3_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval3_clave.equals("")){
            ToastError("Ingrese la clave.");
            evalu3_pass.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu3_pass, InputMethodManager.SHOW_IMPLICIT);

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
