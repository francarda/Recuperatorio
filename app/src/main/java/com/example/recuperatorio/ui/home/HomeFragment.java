package com.example.recuperatorio.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recuperatorio.Estrenos;
import com.example.recuperatorio.EstrenosAdapter;
import com.example.recuperatorio.R;
import com.example.recuperatorio.databinding.FragmentHomeBinding;

import java.util.List;

public class HomeFragment extends Fragment {
    private HomeViewModel vm;
    private RecyclerView rv;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       vm = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        vm.getMlista().observe(getViewLifecycleOwner(), new Observer<List<Estrenos>>() {
            @Override
            public void onChanged(List<Estrenos> estrenos) {
                rv= getActivity().findViewById(R.id.rvEstrenos);
                GridLayoutManager gl= new GridLayoutManager(getActivity(), estrenos.size(),GridLayoutManager.HORIZONTAL, false);
                rv.setLayoutManager(gl);
                EstrenosAdapter ea= new EstrenosAdapter(estrenos, getActivity(), getLayoutInflater());
                rv.setAdapter(ea);
            }
        });
        vm.cargarLista();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}