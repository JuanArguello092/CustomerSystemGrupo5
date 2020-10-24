package py.com.progweb.fidelizacionclientes.patrones.singleton;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import py.com.progweb.fidelizacionclientes.model.Bolsapuntos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/*
Singleton permite asegurar que de una clase concreta existe una única
instancia y proporciona un método único que la devuelve.
*/
public class Cliente {
    // Declaracion de variable private y de clase Cliente
    private static Cliente instanciaCliente;

    // para evitar instancia mediante el operador new se define un metodo private
    private Cliente(){
    }

    // Para obtener la instancia unicamente se debe invocar la clase con el metodo
    // static getInstance()
    public static Cliente getCliente(){
        if (instanciaCliente == null) {
            instanciaCliente = new Cliente();
        }
        return instanciaCliente;
    }


    private Integer id_cliente;
    private String nombre;
    private String apellido;
    private Integer numeroDocumento;
    private String tipoDocumento;
    private String nacionalidad;
    private String email;
    private String telefono;
    private Date fechaNacimiento;


    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
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

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }





}
