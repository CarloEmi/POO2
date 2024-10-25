import java.util.*;
import java.io.*;
import Estado.*;

public class Semaforo implements Estado{
    private Estado estado;

    public Semaforo(){
        this.estado = new semaforoRojo();
    } 

    public void cambiar(){
        this.estado.cambiar();
    }

    public void setEstado(Estado estado){
        this.estado = estado;   
    }
}