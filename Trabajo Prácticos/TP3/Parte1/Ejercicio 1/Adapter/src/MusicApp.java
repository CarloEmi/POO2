import Modelo.MusicPlayer;
import Modelo.ThirdPartyAudioPlayer;
import Modelo.ThirdPartyAudioPlayerAdapter;

/**
 * Clase principal de la aplicación de música, que utiliza un reproductor de audio
 * compatible con la interfaz MusicPlayer para reproducir canciones.
 */
public class MusicApp {

    private MusicPlayer musicPlayer;

    /**
     * Constructor que inicializa la aplicación con un reproductor de música.
     *
     * @param musicPlayer El reproductor de música a utilizar.
     */
    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    /**
     * Reproduce una canción usando el reproductor de música de la aplicación.
     *
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    public void play(String fileName) {
        musicPlayer.playSong(fileName);
    }

    /**
     * Método principal que inicia la aplicación y reproduce una canción de ejemplo.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Usar ThirdPartyAudioPlayer con el adaptador
        ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();
        MusicPlayer adapter = new ThirdPartyAudioPlayerAdapter(thirdPartyAudioPlayer);

        MusicApp app = new MusicApp(adapter);
        app.play("mi_cancion.mp3");
    }
}
