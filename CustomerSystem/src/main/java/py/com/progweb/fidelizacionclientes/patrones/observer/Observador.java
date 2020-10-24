package py.com.progweb.fidelizacionclientes.patrones.observer;
/*
Observer: construye una dependencia entre un sujeto y sus observadores de
        modo que cada modificación del sujeto sea notificada a los observadores para
        que puedan actualizar su estado.
*/

/*Observador es la clase abstracta que es necesario implementar para recibir las
notificaciones (método actualiza)*/


public abstract class Observador {
    public Sujeto sujeto = null;
    public abstract String actualiza();
}
