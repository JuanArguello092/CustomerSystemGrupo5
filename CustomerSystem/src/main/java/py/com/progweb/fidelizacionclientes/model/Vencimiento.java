package py.com.progweb.fidelizacionclientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "vencimiento")
public class Vencimiento{
    @Id
    @Column(name = "id_vencimiento")
    @Basic(optional = false )
    @GeneratedValue(generator = "vencimiento_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "vencimiento_id_seq", sequenceName = "vencimiento_id_seq", allocationSize = 0)
    private Integer id_vencimiento;

    @Column(name = "fecha_inicio_validez")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioValidez;

    @Column(name = "fecha_fin_validez")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFinValidez;

    @Column(name = "dias_duracion")
    @Basic (optional = false)
    private Integer diasDuracion;

    @JoinColumn(name="id_puntos",referencedColumnName = "id_puntos")
    @OneToOne
    private Puntos puntos;


    public Vencimiento() {
    }

    public Integer getId_vencimiento() {
        return id_vencimiento;
    }

    public void setId_vencimiento(Integer id_vencimiento) {
        this.id_vencimiento = id_vencimiento;
    }

    public Date getFechaInicioValidez() {
        return fechaInicioValidez;
    }

    public void setFechaInicioValidez(Date fechaInicioValidez) {
        this.fechaInicioValidez = fechaInicioValidez;
    }

    public Date getFechaFinValidez() {
        return fechaFinValidez;
    }

    public void setFechaFinValidez(Date fechaFinValidez) {
        this.fechaFinValidez = fechaFinValidez;
    }

    public Integer getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(Integer diasDuracion) {
        this.diasDuracion = diasDuracion;
    }

    public Puntos getPuntos() {
        return puntos;
    }

    public void setPuntos(Puntos puntos) {
        this.puntos = puntos;
    }

}
