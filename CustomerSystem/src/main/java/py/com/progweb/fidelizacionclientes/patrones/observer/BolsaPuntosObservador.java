package py.com.progweb.fidelizacionclientes.patrones.observer;
/*
Observer: construye una dependencia entre un sujeto y sus observadores de
        modo que cada modificación del sujeto sea notificada a los observadores para
        que puedan actualizar su estado.
*/


/*
ObservadorConcreto (VistaCliente) es una clase de implementación de un
observador. Mantiene una referencia hacia el sujeto e implementa el método
actualiza. Solicita a su sujeto información que forma parte de su estado durante
las actualizaciones invocando al método getEstado.*/


public class BolsaPuntosObservador extends Observador{


    public BolsaPuntosObservador(Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agrega(this);
    }

    @Override
    public String actualiza() {
        return "El puntaje reportado es "+sujeto.getPunto()+"\n";
    }
}
