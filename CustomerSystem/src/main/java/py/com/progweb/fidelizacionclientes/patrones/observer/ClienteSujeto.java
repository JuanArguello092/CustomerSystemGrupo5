package py.com.progweb.fidelizacionclientes.patrones.observer;
/*
Observer: construye una dependencia entre un sujeto y sus observadores de
        modo que cada modificación del sujeto sea notificada a los observadores para
        que puedan actualizar su estado.
*/



/*
    SujetoConcreto (Cliente) es una clase correspondiente a la implementación de
    un sujeto. Un sujeto envía una notificación cuando su estado se ha modificado.
*/

public class ClienteSujeto extends Sujeto{
    private static final int LIMITE_INFERIOR = 5000;
    private static final int LIMITE_SUPERIOR = 10000;
    private String nombre;
    private String apellido;
    private int monto;

    public ClienteSujeto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
        setPunto(calcularPunto(monto));
    }

    private int calcularPunto(int monto) {
        if (monto < LIMITE_INFERIOR)
            return 1;
        else if(monto < LIMITE_SUPERIOR && monto > LIMITE_INFERIOR)
            return 5;
        else
            return 10;
    }
}
