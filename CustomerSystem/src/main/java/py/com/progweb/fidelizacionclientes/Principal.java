package py.com.progweb.fidelizacionclientes;

import py.com.progweb.fidelizacionclientes.model.Puntos;
import py.com.progweb.fidelizacionclientes.model.Puntosextra;
import py.com.progweb.fidelizacionclientes.util.AbstractPuntos;
import py.com.progweb.fidelizacionclientes.util.AdaptadorIPuntos;
import py.com.progweb.fidelizacionclientes.util.DemoPuntosextra;
import py.com.progweb.fidelizacionclientes.util.interfaces.IPuntosInterfaz;

public class Principal {

    public static void main(String[] args) {

        IPuntosInterfaz puntos = new Puntos();
        puntos.setId_puntos(3);
        puntos.setConcepto("vale de compras");
        puntos.setPuntosRequeridos(30);

        System.out.println("-----Prueba Pattern Adapter para puntos-----");
        System.out.println("Puntos: " + puntos.getId_puntos()+"--" + puntos.getConcepto() +"--"+ puntos.getPuntosRequeridos());

        IPuntosInterfaz puntosextra = new AdaptadorIPuntos();
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

        AbstractPuntos p1 = DemoPuntosextra.getPuntosConcepto("vale de compras");
        AbstractPuntos p2 = DemoPuntosextra.getPuntosConcepto("promocionhalloween");
        AbstractPuntos p3 = DemoPuntosextra.getPuntosConcepto("promoweeknd");
        AbstractPuntos p4 = DemoPuntosextra.getPuntosConcepto("promonavidad");

        System.out.println("Prueba para puntos nulos Puntoextra 1\n");
        System.out.println(p1.verConcepto());
        System.out.println("Puntoextra 2\n");
        System.out.println(p2.verConcepto());
        System.out.println("Puntoextra 3\n");
        System.out.println(p3.verConcepto());
        System.out.println("Puntoextra 4\n");
        System.out.println(p4.verConcepto());



    }
}