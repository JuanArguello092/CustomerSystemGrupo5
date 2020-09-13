package py.com.progweb.fidelizacionclientes.ejb;


import py.com.progweb.fidelizacionclientes.model.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class ClienteDAO {
    @PersistenceContext(unitName = "customersystemPU")

    private EntityManager em;


    /*
    Cada vez que querramos persistir una persona, persistimos tb su agenda.
    Por cada persona, le pasamos la agenda.
    * */
    public void agregar(Cliente entidad) {
        this.em.persist(entidad);

    }

    public void modificar(Integer id_cliente, Cliente c ) {
        em.getTransaction().begin();
        Cliente cliente = em.find(Cliente.class, id_cliente);
        em.merge(cliente);
        em.getTransaction().commit();
    }

    public Object lista() {
        Query q=this.em.createQuery("select c  from Cliente c  left join fetch c.listaAsignacion");

        return (List<Cliente>) q.getResultList();
    }
}