package py.com.progweb.fidelizacionclientes.patrones.state;

import py.com.progweb.fidelizacionclientes.model.Puntos;

public class CompraValidado extends EstadoCompra{
    public CompraValidado(Compra compra){
        super(compra);
    }

    public void agregaPunto(Puntos puntos) { }

    public void borra(){
        compra.getPuntos().clear();
    }

    public void suprimePunto(Puntos puntos) { }

    public EstadoCompra estadoSiguiente(){
         return new PuntoEntregado(compra);

    }
}
