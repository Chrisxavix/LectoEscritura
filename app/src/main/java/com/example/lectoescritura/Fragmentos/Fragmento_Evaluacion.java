package com.example.lectoescritura.Fragmentos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion1.eval_menu_evaluacion1;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion2.eval_menu_evaluacion2;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion3.eval_menu_evaluacion3;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Evaluacion4.eval_menu_evaluacion4;
import com.example.lectoescritura.Menu_Estudiante.Evaluacion.Simulacion.eval_menu_simulacion;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.unidad_mcontenido;
import com.example.lectoescritura.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmento_Evaluacion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmento_Evaluacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Evaluacion extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //DECLARAR IDs ----------------------------------------------------------------------------------------------
    View vista;
    ImageButton simulacion, evaluacion1, evaluacion2, evaluacion3, evaluacion4;
    //DECLARAR IDs ----------------------------------------------------------------------------------------------

    private OnFragmentInteractionListener mListener;

    public Fragmento_Evaluacion() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento_Evaluacion.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Evaluacion newInstance(String param1, String param2) {
        Fragmento_Evaluacion fragment = new Fragmento_Evaluacion();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_fragmento__evaluacion, container, false);
        simulacion = vista.findViewById(R.id.btnsimulacion);
        evaluacion1 = vista.findViewById(R.id.btnevaluacion1);
        evaluacion2 = vista.findViewById(R.id.btnevaluacion2);
        evaluacion3 = vista.findViewById(R.id.btnevaluacion3);
        evaluacion4 = vista.findViewById(R.id.btnevaluacion4);

        simulacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsimulacion = new Intent(Fragmento_Evaluacion.this.getActivity(), eval_menu_simulacion.class);
                startActivity(intentsimulacion);
            }
        });

        evaluacion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentevaluacion1 = new Intent(Fragmento_Evaluacion.this.getActivity(), eval_menu_evaluacion1.class);
                startActivity(intentevaluacion1);
            }
        });

        evaluacion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentevaluacion2 = new Intent(Fragmento_Evaluacion.this.getActivity(), eval_menu_evaluacion2.class);
                startActivity(intentevaluacion2);
            }
        });
        evaluacion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentevaluacion3 = new Intent(Fragmento_Evaluacion.this.getActivity(), eval_menu_evaluacion3.class);
                startActivity(intentevaluacion3);
            }
        });

        evaluacion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentevaluacion4 = new Intent(Fragmento_Evaluacion.this.getActivity(), eval_menu_evaluacion4.class);
                startActivity(intentevaluacion4);
            }
        });

        return vista;





    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
