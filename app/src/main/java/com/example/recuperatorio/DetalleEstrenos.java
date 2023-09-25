package com.example.recuperatorio;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recuperatorio.databinding.FragmentDetalleEstrenosBinding;


public class DetalleEstrenos extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentDetalleEstrenosBinding binding;
    private String mParam1;
    private String mParam2;
    private Estrenos estreno;
    public DetalleEstrenos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetalleEstrenos.
     */
    // TODO: Rename and change types and number of parameters
    public static DetalleEstrenos newInstance(String param1, String param2) {
        DetalleEstrenos fragment = new DetalleEstrenos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* if (getArguments() != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                estreno = getArguments().getSerializable("Estreno", Estrenos.class);
            }

        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       String direc= "juancito";
       estreno= new Estrenos("","","","");
       if (getArguments() != null) {

                 estreno = (Estrenos) getArguments().getSerializable("Mensaje");


        }
        binding = FragmentDetalleEstrenosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.DirectorDetalle.setText(estreno.getDirector());
        binding.tvAnioDetalle.setText(estreno.getAño());
        binding.tvDuracionDetalle.setText(estreno.getDuaracion());
        binding.tvTituloDetalle.setText(estreno.getTitulo());

        return root;
    }
}