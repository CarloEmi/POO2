import java.util.*;
import java.io.*;
import Estado.*;

public class SemaforoVerde implements Estado{
    @Override
    public void cambiar(){
        System.out.println("El semaforo cambio de color a VERDE");
    }   
}
