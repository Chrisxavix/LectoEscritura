package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion1;

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

import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Simulacion.eval_menu_simulacion;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Simulacion.eval_simu01;
import com.example.lectoescritura.R;

public class eval_menu_evaluacion1 extends AppCompatActivity {
    private EditText evalu1_user, evalu1_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_menu_evaluacion1);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
        evalu1_user = (EditText)findViewById(R.id.txtEval1_usuario);
        evalu1_pass = (EditText)findViewById(R.id.txtEval1_clave);
        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
    }

    // INGRESO DE USUARIO Y CLAVE --------------------------------------------------------------------------------
    public void IngresarEvaluacion (View view){

        String Eval1_nombre = evalu1_user.getText().toString();
        String Eval1_clave = evalu1_pass.getText().toString();

        if(!Eval1_nombre.equals("") && Eval1_clave.equals("1212")) {
            Intent intentsimu = new Intent(eval_menu_evaluacion1.this, eval_evalua01.class);
            intentsimu.putExtra("usuario", Eval1_nombre);
            startActivity(intentsimu);
            finish();
            evalu1_user.setText("");
            evalu1_pass.setText("");

        } else if (Eval1_nombre.equals("") && Eval1_clave.equals("")  ){
            ToastError("Ingrese sus datos para continuar.");
            evalu1_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu1_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval1_nombre.equals("")){
            ToastError("Ingrese su nombre y apellido.");
            evalu1_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu1_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Eval1_clave.equals("")){
            ToastError("Ingrese la clave.");
            evalu1_pass.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(evalu1_pass, InputMethodManager.SHOW_IMPLICIT);

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
