package py.com.progweb.fidelizacionclientes.patrones.observer;
/*
El patrón Observer tiene como objetivo construir una dependencia entre un sujeto y los
observadores de modo que cada modificación del sujeto sea notificada a los
observadores para que puedan actualizar su estado.
 */

/*Sujeto es la clase que incluye la asociación con los observadores así
como los métodos para agregar o suprimir observadores.*/

import java.util.ArrayList;
import java.util.List;

public class Sujeto {

    protected List<Observador> observadores = new ArrayList<>();
    private int punto;

    public void agrega(Observador observador){
        observadores.add(observador);
    }

    public void suprime(Observador observador){
        observadores.remove(observador);
    }

    private void notifica(){
        for (Observador observador: observadores) {
            observador.actualiza();
        }
    }

    public int getPunto() {
        return punto;
    }

    protected void setPunto(int punto) {
        this.punto = punto;
        this.notifica();
    }
}
