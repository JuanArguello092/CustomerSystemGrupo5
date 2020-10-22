package py.com.progweb.fidelizacionclientes.patrones.state;
/*
State: permite a un objeto adaptar su comportamiento en función de su estado
interno.
 */
import py.com.progweb.fidelizacionclientes.model.Puntos;

import java.util.ArrayList;
import java.util.List;


/*
MáquinaEstados (Compra) es una clase concreta que describe los objetos que son
máquinas de estados, es decir que poseen un conjunto de estados que pueden ser
descritos mediante un diagrama de estados y transiciones. Esta clase mantiene
una referencia hacia una instancia de una subclase de Estado que define el
estado en curso.
 */
public class Compra {
    protected List<Puntos> puntos = new ArrayList<Puntos>();
    protected EstadoCompra estadoCompra;

    public Compra() {
        this.estadoCompra = new CompraEnCurso(this);
    }

    public void agregaPuntos(Puntos puntos){
        estadoCompra.agregaPunto(puntos);
    }

    public void suprimePunto(Puntos puntos){
        estadoCompra.suprimePunto(puntos);
    }

    public void borra(){
        estadoCompra.borra();
    }

    public void estadoSiguiente() {
        estadoCompra = estadoCompra.estadoSiguiente();
    }

    public List<Puntos> getPuntos(){
        return puntos;
    }
    public void visualiza(){
        System.out.println("Contenido de la Compra");
        for (Puntos puntos: puntos)
            System.out.println("Concepto :"+puntos.getConcepto()+"\t\t\tPuntaje: "+puntos.getPuntosRequeridos());
        System.out.println();

    }

}
