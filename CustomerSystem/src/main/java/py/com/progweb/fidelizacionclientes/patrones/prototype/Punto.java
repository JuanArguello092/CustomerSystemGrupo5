package py.com.progweb.fidelizacionclientes.patrones.prototype;

import py.com.progweb.fidelizacionclientes.model.Puntos;

public abstract class Punto implements Cloneable{
    protected Puntos puntos;

    public Punto duplica(){
        Punto punto;
        try {
            punto = (Punto) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return punto;
    }

    public void cargar(Puntos puntos){
        this.puntos = puntos;
    }

    public abstract void imprime();
    public abstract void visualiza();

}
