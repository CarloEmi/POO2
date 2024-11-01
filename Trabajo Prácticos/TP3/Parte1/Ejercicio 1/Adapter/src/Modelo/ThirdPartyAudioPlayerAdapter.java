package Modelo;

/**
 * Adaptador para ThirdPartyAudioPlayer que permite su uso con la interfaz MusicPlayer.
 * Esta clase adapta ThirdPartyAudioPlayer para que pueda integrarse en la aplicación
 * mediante la interfaz MusicPlayer.
 */
public class ThirdPartyAudioPlayerAdapter implements MusicPlayer {

    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    /**
     * Constructor que inicializa el adaptador con una instancia de ThirdPartyAudioPlayer.
     *
     * @param thirdPartyAudioPlayer El reproductor de audio externo a adaptar.
     */
    public ThirdPartyAudioPlayerAdapter(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    /**
     * Reproduce una canción mediante el reproductor externo adaptado.
     * Este método invoca internamente el método startAudio de ThirdPartyAudioPlayer.
     *
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    @Override
    public void playSong(String fileName) {
        thirdPartyAudioPlayer.startAudio(fileName);
    }
}
