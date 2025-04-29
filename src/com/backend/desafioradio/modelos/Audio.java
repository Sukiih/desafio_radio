package com.backend.desafioradio.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public Audio(String titulo){
        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no puede estar vacío o nulo");
        }
        this.titulo = titulo;
    }

    public void meGusta(){
        this.totalMeGusta++;
    }

    public void reproduce(){
        this.totalReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
