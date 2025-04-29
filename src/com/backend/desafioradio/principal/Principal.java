package com.backend.desafioradio.principal;

import com.backend.desafioradio.modelos.Cancion;
import com.backend.desafioradio.modelos.MisFavoritos;
import com.backend.desafioradio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion("Moonstruck", "Enhypen", "ROMANCE: UNTOLD -daydream");
        Podcast miPodcast = new Podcast("Charla con Engenes", "Nishimura Riki");

        for (int i = 0; i < 850; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 1000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 600; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 1030; i++) {
            miPodcast.reproduce();
        }

        miCancion.mostrarFicha();
        miPodcast.mostrarFicha();


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agrega(miCancion);
        favoritos.agrega(miPodcast);
    }
}
