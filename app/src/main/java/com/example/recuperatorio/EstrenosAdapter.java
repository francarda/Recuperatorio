package com.example.recuperatorio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EstrenosAdapter extends RecyclerView.Adapter<EstrenosAdapter.ViewHolder> {
    private List<Estrenos> estrenos;
    private Context context;
    private LayoutInflater li;

    public EstrenosAdapter(List<Estrenos> estrenos, Context context, LayoutInflater li) {
        this.estrenos = estrenos;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= li.inflate(R.layout.item_estrenos, parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText("Titulo: " + estrenos.get(position).getTitulo());
        holder.director.setText("Director: "+ estrenos.get(position).getDirector());

        holder.estreno= estrenos.get(position);


    }

    @Override
    public int getItemCount() {

        return estrenos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView director;
        private Estrenos estreno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo=itemView.findViewById(R.id.tvTitulo);
            director=itemView.findViewById(R.id.tvDirector);


            itemView.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onClick(View view) {
                    Bundle bundle= new Bundle();
                   //estreno= new Estrenos("La orca","3h","Aldo venturi","1978");
                    bundle.putSerializable("Mensaje", estreno);
                    //bundle.putSerializable("nota", "algo");
                    Navigation.findNavController(view).navigate(R.id.detallesEstrenos,bundle);


                }
            });

        }
    }

}
