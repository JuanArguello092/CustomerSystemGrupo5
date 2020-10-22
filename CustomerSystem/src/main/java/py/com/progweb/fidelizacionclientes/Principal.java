package py.com.progweb.fidelizacionclientes;

import py.com.progweb.fidelizacionclientes.ejb.PuntosDAO;
import py.com.progweb.fidelizacionclientes.model.Puntos;
import py.com.progweb.fidelizacionclientes.model.Puntosextra;
import py.com.progweb.fidelizacionclientes.util.AbstractPuntos;
import py.com.progweb.fidelizacionclientes.util.AdaptadorPuntos;
import py.com.progweb.fidelizacionclientes.util.interfaces.PuntosInterfaz;

public class Principal {

    public static void main(String[] args) {

        PuntosInterfaz puntos = new Puntos();
        puntos.setId_puntos(3);
        puntos.setConcepto("vale de compras");
        puntos.setPuntosRequeridos(30);

        System.out.println("-----Prueba Pattern Adapter para puntos-----");
        System.out.println("Puntos: " + puntos.getId_puntos()+"--" + puntos.getConcepto() +"--"+ puntos.getPuntosRequeridos());

        PuntosInterfaz puntosextra = new AdaptadorPuntos();
        puntosextra.setId_puntos(20);
        puntosextra.setConcepto("compras de productos en promocion");
        puntosextra.setPuntosRequeridos(10);

        System.out.println("-----Prueba Pattern Adapter para puntosextra-----");
        System.out.println("Puntos extra: " + puntosextra.getId_puntos() +"--"+ puntosextra.getConcepto()+"--" + puntosextra.getPuntosRequeridos());

        System.out.println("-----Prueba Pattern Strategy-----");
        Puntos puntos2 = new Puntos();
        puntos2.setId_puntos(4);
        puntos2.setPuntosRequeridos(10);
        puntos2.usarPuntos(2);

        System.out.println("Prueba para puntos  " +  puntos2.usarPuntos(2));
        Puntosextra puntos3 = new Puntosextra();
        puntos3.establecerId_puntos(4);
        puntos3.establecerPuntosRequeridos(10);
        puntos3.usarPuntos(2);

        System.out.println("Prueba para puntosextra  " +  puntos3.usarPuntos(2));

        System.out.println("-----Prueba Pattern Null Object-----");



    }
}
