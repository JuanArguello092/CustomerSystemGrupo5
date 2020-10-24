package py.com.progweb.fidelizacionclientes.patrones.flyweight;

public class OpcionPunto {
    private String nombre;
    private String descripcion;
    private int puntajeEstandar = 1;

    public OpcionPunto(int monto) {
        this.nombre = "Vale de puntos";
        this.descripcion = "Descripcion de "+nombre;
        this.puntajeEstandar = monto;
    }

    public void visualiza(int monto){
        System.out.println("Opción");
        System.out.println("Nombre: " + nombre);
        System.out.println(descripcion);
        System.out.println("Puntaje estándar: " +puntajeEstandar);
         System.out.println("Monto: " + monto);
    }
}
