package com.example.recuperatorio.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.recuperatorio.Estrenos;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<List<Estrenos>> mlista;
    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }
    public LiveData<List<Estrenos>> getMlista(){
        if(mlista==null){
            mlista= new MutableLiveData<>();
        }
        return mlista;
    }
    public LiveData<String> getText() {
        return mText;
    }

    public void cargarLista(){
        ArrayList<Estrenos> listaAux= new ArrayList<Estrenos>();
        listaAux.add(new Estrenos("Guardianes de la galaxia4","2h 23min","Ruffalo","2023"));
        listaAux.add(new Estrenos("Casi nada","1h 38min","Esteban Camilo","2022"));
        listaAux.add(new Estrenos("El dia del juicio","2h 46min","Joaho Cancelo","2020"));
        listaAux.add(new Estrenos("Minuto 0","1h 12min","Carlos Chaplin","2023"));
        listaAux.add(new Estrenos("El gran animal","1h 12min","Albert Bread","2021"));
        mlista.setValue(listaAux);

    }
}