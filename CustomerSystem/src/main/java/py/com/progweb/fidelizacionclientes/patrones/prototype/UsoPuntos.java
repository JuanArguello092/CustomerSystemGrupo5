package py.com.progweb.fidelizacionclientes.patrones.prototype;

import java.util.List;

public abstract class UsoPuntos {
    protected List<Punto> puntos;

    public List<Punto> getPuntos(){
        return puntos;
    }
}
