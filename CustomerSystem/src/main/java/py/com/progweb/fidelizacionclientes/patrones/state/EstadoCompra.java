package py.com.progweb.fidelizacionclientes.patrones.state;
/*
State: permite a un objeto adaptar su comportamiento en función de su estado
interno.
 */
import py.com.progweb.fidelizacionclientes.model.Puntos;


/*
Estado (EstadoCompra) es una clase abstracta que incluye los métodos ligados al
estado y que gestionan la asociación con la máquina de estados.
 */
public abstract class EstadoCompra {
    protected Compra compra;

    public EstadoCompra(Compra compra) {
        this.compra = compra;
    }

    public abstract void agregaPunto(Puntos puntos);
    public abstract void borra();
    public abstract void suprimePunto(Puntos puntos);
    public abstract EstadoCompra estadoSiguiente();
}
