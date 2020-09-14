package py.com.progweb.fidelizacionclientes.ejb;

import py.com.progweb.fidelizacionclientes.model.Bolsapuntos;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless


public class BolsapuntosDAO {
    @PersistenceContext(unitName = "customersystemPU")

    private EntityManager em;


    public void agregar(Bolsapuntos entidad) {
        this.em.persist(entidad);

    }


}