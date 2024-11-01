package Modelo;

/**
 * ThirdPartyAudioPlayer representa un reproductor de audio externo.
 * Este reproductor tiene un método específico para iniciar la reproducción de un archivo de audio.
 */
public class ThirdPartyAudioPlayer {

    /**
     * Inicia la reproducción de un archivo de audio.
     *
     * @param file El nombre del archivo de audio a reproducir.
     */
    public void startAudio(String file) {
        System.out.println("Reproduciendo audio en ThirdPartyAudioPlayer: " + file);
    }
}
