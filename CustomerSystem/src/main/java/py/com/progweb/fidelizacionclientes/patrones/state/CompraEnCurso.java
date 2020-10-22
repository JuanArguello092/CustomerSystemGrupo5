package py.com.progweb.fidelizacionclientes.patrones.state;

import py.com.progweb.fidelizacionclientes.model.Puntos;

public class CompraEnCurso extends EstadoCompra{
    public CompraEnCurso(Compra compra) {
        super(compra);
    }

    public void agregaPunto(Puntos puntos){
        compra.getPuntos().add(puntos);
    }

    public void borra(){
        compra.getPuntos().clear();
    }

    public void suprimePunto(Puntos puntos){
        compra.getPuntos().remove(puntos);

    }

    public EstadoCompra estadoSiguiente(){
        return new CompraValidado(compra);

    }

}
