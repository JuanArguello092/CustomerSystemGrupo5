package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "puntos")
public class Puntos  implements Serializable {
    @Id
    @Column(name = "id")
    @Basic (optional = false)
    @GeneratedValue(generator = "puntos_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "puntos_id_seq", sequenceName = "puntos_id_seq", allocationSize = 0)
    private Integer id;Puntos.java

    @Column(name = "concepto", length = 45)
    @Basic (optional = false)
    private String concepto;

    @OneToOne(cascade= CascadeType.ALL, mappedBy = "puntos")
    private Vencimiento vencimiento;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_puntos")
    private List<Asignacion> listaAsignacion;

    @JoinColumn(name='id',referencedColumnName = 'id')
    @OneToOne(optional='false')
    private Vencimiento vencimiento1;

    public Puntos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getPuntos_requeridos() {
        return puntos_requeridos;
    }

    public void setPuntos_requeridos(Integer puntos_requeridos) {
        this.puntos_requeridos = puntos_requeridos;
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

    public Vencimiento getVencimiento1() {
        return vencimiento1;
    }

    public void setVencimiento1(Vencimiento vencimiento1) {
        this.vencimiento1 = vencimiento1;
    }
}
