package com.example.recuperatorio;

import java.io.Serializable;

public class Estrenos implements Serializable {

    private String titulo, duaracion,director, año;

    public Estrenos() {
    }

    public Estrenos(String titulo, String duaracion, String director, String año) {
        this.titulo = titulo;
        this.duaracion = duaracion;
        this.director = director;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuaracion() {
        return duaracion;
    }

    public void setDuaracion(String duaracion) {
        this.duaracion = duaracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
}

