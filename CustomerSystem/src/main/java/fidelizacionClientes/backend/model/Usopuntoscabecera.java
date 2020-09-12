package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "uso_puntos_cabecera")
public class Usopuntoscabecera  implements Serializable {
    @Id
    @Column(name = "id")
    @Basic (optional = false)
    @GeneratedValue(generator = "uso_puntos_cabecera_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "uso_puntos_cabecera_id_seq", sequenceName = "uso_puntos_cabecera_id_seq", allocationSize = 0)
    private Integer id;

    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente id_cliente;

    @Column(name = "puntaje_utilizado")
    @Basic (optional = false)
    private Integer puntaje_utilizado;

    @Column(name = "fecha")
    @Basic (optional = false)
    private Date fecha;

    @Column(name = "concepto", length = 45)
    @Basic (optional = false)
    private String concepto;

    //lista de uso puntos detalle
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_cabecera")
    private List<Usopuntosdetalle> listapuntosdet;

    public Puntos() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getPuntaje_utilizado() {
        return puntaje_utilizado;
    }

    public void setPuntaje_utilizado(Integer puntaje_utilizado) {
        this.puntaje_utilizado = puntaje_utilizado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public List<Usopuntosdetalle> getListapuntosdet() {
        return listapuntosdet;
    }

    public void setListapuntosdet(List<Usopuntosdetalle> listapuntosdet) {
        this.listapuntosdet = listapuntosdet;
    }
}
