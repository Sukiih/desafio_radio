package com.backend.desafioradio.modelos;

public class Cancion extends Audio {
    private String album;
    private String cantante;
    private String genero;

    public Cancion (String titulo, String cantante, String album) {
        super(titulo);
        this.cantante = cantante;
        this.album = album;
    }

    //reescribo para mantener la base limpia
    @Override
    public void mostrarFicha() {
            super.mostrarFicha();
            System.out.println("Cantante: " + cantante);
            System.out.println("Album: " + album);
    }

    @Override
    public int getClasificacion() {
        return (getTotalMeGusta() > 5000) ? 8 : 4;
    }

    public String getAlbum() {
        return album;
    }

    public String getCantante() {
        return cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}