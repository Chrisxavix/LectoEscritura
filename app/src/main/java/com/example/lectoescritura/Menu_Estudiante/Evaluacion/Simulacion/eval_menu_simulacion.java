package com.example.lectoescritura.Menu_Estudiante.Evaluacion.Simulacion;

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

import com.example.lectoescritura.R;

public class eval_menu_simulacion extends AppCompatActivity {
    private EditText simu_user, simu_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_menu_simulacion);

        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        // ICONO DE LIBROS EN LA BARRA PRINCIPAL -----------------------------------------------------------------

        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
        simu_user = (EditText)findViewById(R.id.txtSimu_usuario);
        simu_pass = (EditText)findViewById(R.id.txtSimu_clave);
        // DECLARACION IDs DE XML --------------------------------------------------------------------------------
    }

    // INGRESO DE USUARIO Y CLAVE --------------------------------------------------------------------------------
    public void IngresarSimulacion (View view){

        String Simu_nombre = simu_user.getText().toString();
        String Simu_clave = simu_pass.getText().toString();

        if(!Simu_nombre.equals("") && Simu_clave.equals("12345")) {
            Intent intentsimu = new Intent(eval_menu_simulacion.this, eval_simu01.class);
            intentsimu.putExtra("usuario", Simu_nombre);
            startActivity(intentsimu);
            finish();
            simu_user.setText("");
            simu_pass.setText("");

        } else if (Simu_nombre.equals("") && Simu_clave.equals("")  ){
            ToastError("Ingrese sus datos para continuar.");
            simu_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(simu_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Simu_nombre.equals("")){
            ToastError("Ingrese su nombre y apellido.");
            simu_user.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(simu_user, InputMethodManager.SHOW_IMPLICIT);

        } else if (Simu_clave.equals("")){
            ToastError("Ingrese la clave predeterminada.");
            simu_pass.requestFocus();
            InputMethodManager teclado = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            teclado.showSoftInput(simu_pass, InputMethodManager.SHOW_IMPLICIT);

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
