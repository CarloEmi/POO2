package Modelo;

/**
 * Interfaz MusicPlayer define el método para reproducir canciones.
 * Esta interfaz es utilizada por la aplicación para gestionar la reproducción de audio.
 */
public interface MusicPlayer {

    /**
     * Reproduce una canción especificada por su nombre de archivo.
     *
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    void playSong(String fileName);
}
