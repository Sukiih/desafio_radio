package com.backend.desafioradio.modelos;

public class MisFavoritos {
    public void agrega(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        } else {
            System.out.println(audio.getTitulo() + " es una opción popular.");
        }
    }
}

