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

import com.example.lectoescritura.Menu_Estudiante.Glosario.Alimentos.alimentos_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Animales.animales_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Colores.colores_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Cordialidades.cordialidades_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Deportes.deportes_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Dias.dias_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Familia.familia_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Frutas.frutas_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Meses.meses_contenido;
import com.example.lectoescritura.Menu_Estudiante.Glosario.Preguntas.preguntas_contenido;
import com.example.lectoescritura.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmento_Glosario.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmento_Glosario#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Glosario extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //DECLARAR IDs ----------------------------------------------------------------------------------------------
    View vista;
    ImageButton alimentos, animales, colores, cordialidades, deportes, dias, familia, frutas, meses, preguntas;
    //DECLARAR IDs ----------------------------------------------------------------------------------------------

    private OnFragmentInteractionListener mListener;

    public Fragmento_Glosario() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento_Glosario.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Glosario newInstance(String param1, String param2) {
        Fragmento_Glosario fragment = new Fragmento_Glosario();
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

        vista = inflater.inflate(R.layout.fragment_fragmento__glosario, container, false);

        alimentos = vista.findViewById(R.id.btnAlimentos);
        animales = vista.findViewById(R.id.btnAnimales);
        colores = vista.findViewById(R.id.btnColores);
        cordialidades = vista.findViewById(R.id.btnCordialidades);
        deportes = vista.findViewById(R.id.btnDeportes);
        dias = vista.findViewById(R.id.btnDias);
        familia = vista.findViewById(R.id.btnFamilia);
        frutas = vista.findViewById(R.id.btnFrutas);
        meses = vista.findViewById(R.id.btnMeses);
        preguntas = vista.findViewById(R.id.btnPreguntas);


        alimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentalimentos = new Intent(Fragmento_Glosario.this.getActivity(), alimentos_contenido.class);
                startActivity(intentalimentos);
            }
        });

        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentanimales = new Intent(Fragmento_Glosario.this.getActivity(), animales_contenido.class);
                startActivity(intentanimales);
            }
        });

        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcolores = new Intent(Fragmento_Glosario.this.getActivity(), colores_contenido.class);
                startActivity(intentcolores);
            }
        });

        cordialidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcordialidades = new Intent(Fragmento_Glosario.this.getActivity(), cordialidades_contenido.class);
                startActivity(intentcordialidades);
            }
        });

        deportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdeportes = new Intent(Fragmento_Glosario.this.getActivity(), deportes_contenido.class);
                startActivity(intentdeportes);
            }
        });

        dias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdias = new Intent(Fragmento_Glosario.this.getActivity(), dias_contenido.class);
                startActivity(intentdias);
            }
        });

        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfamilia = new Intent(Fragmento_Glosario.this.getActivity(), familia_contenido.class);
                startActivity(intentfamilia);
            }
        });

        frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfrutas = new Intent(Fragmento_Glosario.this.getActivity(), frutas_contenido.class);
                startActivity(intentfrutas);
            }
        });

        meses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmeses = new Intent(Fragmento_Glosario.this.getActivity(), meses_contenido.class);
                startActivity(intentmeses);
            }
        });

        preguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpreguntas = new Intent(Fragmento_Glosario.this.getActivity(), preguntas_contenido.class);
                startActivity(intentpreguntas);
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
