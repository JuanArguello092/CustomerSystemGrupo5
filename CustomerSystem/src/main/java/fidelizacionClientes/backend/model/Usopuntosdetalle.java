package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "uso_puntos_detalle")
public class Usopuntosdetalle  implements Serializable {

    @Column(name = "puntaje_utilizado")
    @Basic (optional = false)
    private Integer puntaje_utilizado;

    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usopuntoscabecera id_cabecera;

    @Column(name = "puntaje_utilizado")
    @Basic (optional = false)
    private Integer puntaje_utilizado;

    JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Bolsapuntos id_bolsa_puntos;

    public Usopuntosdetalle() {
    }

    public Usopuntoscabecera getId_cabecera() {
        return id_cabecera;
    }

    public void setId_cabecera(Usopuntoscabecera id_cabecera) {
        this.id_cabecera = id_cabecera;
    }

    public Integer getPuntaje_utilizado() {
        return puntaje_utilizado;
    }

    public void setPuntaje_utilizado(Integer puntaje_utilizado) {
        this.puntaje_utilizado = puntaje_utilizado;
    }

    public Bolsapuntos getId_bolsa_puntos() {
        return id_bolsa_puntos;
    }

    public void setId_bolsa_puntos(Bolsapuntos id_bolsa_puntos) {
        this.id_bolsa_puntos = id_bolsa_puntos;
    }
}
