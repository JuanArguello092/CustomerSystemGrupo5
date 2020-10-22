package py.com.progweb.fidelizacionclientes.patrones.state;

import py.com.progweb.fidelizacionclientes.model.Puntos;

public class PuntoEntregado extends EstadoCompra{
    public PuntoEntregado(Compra compra){
        super(compra);
    }

    public void agregaPunto(Puntos puntos) { }

    public void borra() { }

    public void suprimePunto(Puntos puntos) { }

    public EstadoCompra estadoSiguiente(){
        return this;
    }
}
