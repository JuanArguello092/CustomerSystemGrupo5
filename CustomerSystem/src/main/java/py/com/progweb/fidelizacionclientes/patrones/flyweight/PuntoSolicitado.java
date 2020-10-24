package py.com.progweb.fidelizacionclientes.patrones.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PuntoSolicitado {
    protected List<OpcionPunto> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<>();

    public void agregaOpciones(Integer monto, int precioDeVenta, FabricaOpcion fabrica){
        opciones.add(fabrica.getOpcion(monto));
        precioDeVentaOpciones.add(precioDeVenta);
    }

    public void muestraOpciones(){
        int indice, tamanho;
        tamanho = opciones.size();
        for (indice = 0; indice < tamanho; indice++){
            opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
        }
        System.out.println();
    }
}
