import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
            Logger logger = Logger.getInstance();
            logger.logError("Error 1");

            logger.logInformacion("Informacion 1");

            logger.logAdvertencia("Advertencia 1");

            logger.close();




    }
}