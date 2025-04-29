package com.backend.desafioradio.modelos;

public class Podcast extends Audio implements IMostrar {
    private String presentador;
    private String descripcion;

    public Podcast(String titulo, String presentador){
        super(titulo);
        this.presentador = presentador;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("🎙️ Podcast: " + getTitulo());
        System.out.println("🎤 Presentador: " + getPresentador());
        System.out.println("❤️ Me gusta: " + getTotalMeGusta());
        System.out.println("▶️ Reproducciones: " + getTotalReproducciones());
    }


    @Override
    public int getClasificacion() {
        return (getTotalReproducciones() >= 1000 ? 9: 4);
    }

    public String getPresentador() {
        return presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
