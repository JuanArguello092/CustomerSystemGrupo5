package py.com.progweb.fidelizacionclientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "puntos")
public class Puntos {
    @Id
    @Column(name = "id_puntos")
    @Basic (optional = false)
    @GeneratedValue(generator = "puntos_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "puntos_id_seq", sequenceName = "puntos_id_seq", allocationSize = 0)
    private Integer id_puntos;

    @Column(name = "concepto", length = 45)
    @Basic (optional = false)
    private String concepto;

    @Column(name = "puntos_requeridos")
    @Basic (optional = false)
    private Integer puntosRequeridos;

    @OneToOne(mappedBy = "puntos")
    private Vencimiento vencimiento;

    @OneToMany(mappedBy = "puntos")
    private List<Asignacion> listaAsignacion;


    public Puntos() {
    }

    public Integer getId_puntos() {
        return id_puntos;
    }

    public void setId_puntos(Integer id_puntos) {
        this.id_puntos = id_puntos;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }


   public List<Asignacion> getListaAsignacion() {
        return listaAsignacion;
    }

    public void setListaAsignacion(List<Asignacion> listaAsignacion) {
        this.listaAsignacion = listaAsignacion;
    }

    public Vencimiento getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Vencimiento vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getPuntosRequeridos() {
        return puntosRequeridos;
    }

    public void setPuntosRequeridos(Integer puntosRequeridos) {
        this.puntosRequeridos = puntosRequeridos;
    }
}
