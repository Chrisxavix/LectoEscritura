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

import com.example.lectoescritura.Menu_Estudiante.Unidad.Contenido.unidad_mcontenido;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad1.unidad_munidad1;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad2.unidad_munidad2;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad3.unidad_munidad3;
import com.example.lectoescritura.Menu_Estudiante.Unidad.Unidad4.unidad_munidad4;
import com.example.lectoescritura.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmento_Unidad.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmento_Unidad#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Unidad extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //DECLARAR IDs ----------------------------------------------------------------------------------------------
    View vista;
    ImageButton contenido, unidad1, unidad2, unidad3, unidad4;
    //DECLARAR IDs ----------------------------------------------------------------------------------------------

    private OnFragmentInteractionListener mListener;

    public Fragmento_Unidad() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento_Unidad.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Unidad newInstance(String param1, String param2) {
        Fragmento_Unidad fragment = new Fragmento_Unidad();
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

        vista = inflater.inflate(R.layout.fragment_fragmento__unidad, container, false);
        contenido = vista.findViewById(R.id.ImaUnidadContenido);
        unidad1 = vista.findViewById(R.id.ImaUnidad1);
        unidad2 = vista.findViewById(R.id.ImaUnidad2);
        unidad3 = vista.findViewById(R.id.ImaUnidad3);
        unidad4 = vista.findViewById(R.id.ImaUnidad4);

        contenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcontenido = new Intent(Fragmento_Unidad.this.getActivity(), unidad_mcontenido.class);
                startActivity(intentcontenido);
            }
        });

        unidad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad1 = new Intent(Fragmento_Unidad.this.getActivity(), unidad_munidad1.class);
                startActivity(intentunidad1);
            }
        });

        unidad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad2 = new Intent(Fragmento_Unidad.this.getActivity(), unidad_munidad2.class);
                startActivity(intentunidad2);
            }
        });

        unidad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad3 = new Intent(Fragmento_Unidad.this.getActivity(), unidad_munidad3.class);
                startActivity(intentunidad3);
            }
        });

        unidad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad4 = new Intent(Fragmento_Unidad.this.getActivity(), unidad_munidad4.class);
                startActivity(intentunidad4);
            }
        });

        return vista;


        /*
        vista = inflater.inflate(R.layout.fragment_fragmento__enlaces, container, false);
        unidad1 = vista.findViewById(R.id.ImaUnidad1);
        unidad2 = vista.findViewById(R.id.ImaUnidad2);
        unidad3 = vista.findViewById(R.id.ImaUnidad3);
        unidad4 = vista.findViewById(R.id.ImaUnidad4);

        unidad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad1 = new Intent(Fragmento_Enlaces.this.getActivity(), enlace_menu_unidad1.class);
                startActivity(intentunidad1);
            }
        });

        unidad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentunidad2 = new Intent(Fragmento_Enlaces.this.getActivity(), enlace_menu_unidad2.class);
                startActivity(intentunidad2);
            }
        });

        return vista;
         */
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
