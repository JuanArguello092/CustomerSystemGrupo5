package py.com.progweb.fidelizacionclientes.patrones.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabricaOpcion {

    protected Map<Integer,OpcionPunto>opciones = new TreeMap<>();

    public OpcionPunto getOpcion(int monto){
        OpcionPunto resultado;
        if (opciones.containsKey(monto)){
            return opciones.get(monto);
        }else{
            resultado = new OpcionPunto(monto);
            opciones.put(monto, resultado);
        }
        return resultado;
    }
}
