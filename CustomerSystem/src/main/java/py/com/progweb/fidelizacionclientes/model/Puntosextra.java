package py.com.progweb.fidelizacionclientes.model;

import py.com.progweb.fidelizacionclientes.util.AbstractPuntos;
import py.com.progweb.fidelizacionclientes.util.interfaces.StrategyUsarPuntos;

import javax.persistence.*;

@Entity
@Table(name = "puntos_extra")
public class Puntosextra extends AbstractPuntos implements StrategyUsarPuntos {
    @Id
    @Column(name = "id_puntosextra")
    @Basic(optional = false)
    @GeneratedValue(generator = "puntos_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "puntos_id_seq", sequenceName = "puntos_id_seq", allocationSize = 0)
    private Integer id_puntos;

    @Column(name = "concepto", length = 45)
    @Basic (optional = false)
    private String concepto;

    @Column(name = "puntos_requeridos")
    @Basic (optional = false)
    private Integer puntosRequeridos;

    public Puntosextra() {

    }

    public Puntosextra(String concepto) {
        this.concepto = concepto;
    }

    public Integer obtenerId_puntos() {
        return id_puntos;
    }

    public void establecerId_puntos(Integer id_puntos) {
        this.id_puntos = id_puntos;
    }

    public String obtenerConcepto() {
        return concepto;
    }

    public void establecerConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer obtenerPuntosRequeridos() {
        return puntosRequeridos;
    }

    public void establecerPuntosRequeridos(Integer puntosRequeridos) {
        this.puntosRequeridos = puntosRequeridos;
    }

    @Override
    public String usarPuntos(Integer puntos) {
        return "No esta habilitado para usar puntos extra";
    }

    @Override
    public boolean esNulo() {
        return false;
    }

    @Override
    public String verConcepto() {
        return obtenerConcepto();
    }
}
