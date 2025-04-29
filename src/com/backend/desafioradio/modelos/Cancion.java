package com.backend.desafioradio.modelos;

public class Cancion extends Audio implements IMostrar {
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
        System.out.println("🎵 Canción: " + getTitulo());
        System.out.println("👤 Cantante: " + getCantante());
        System.out.println("💿 Álbum: " + getAlbum());
        System.out.println("❤️ Me gusta: " + getTotalMeGusta());
        System.out.println("▶️ Reproducciones: " + getTotalReproducciones());
        System.out.println("-------------------------------");
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