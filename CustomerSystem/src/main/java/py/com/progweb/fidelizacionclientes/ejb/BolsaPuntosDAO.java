package py.com.progweb.fidelizacionclientes.ejb;

import py.com.progweb.fidelizacionclientes.model.Bolsapuntos;
import py.com.progweb.fidelizacionclientes.model.Cliente;
import py.com.progweb.fidelizacionclientes.model.Puntos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class BolsaPuntosDAO {
  @PersistenceContext(unitName = "customersystemPU")
  private EntityManager entityManager;

  public void cargarpuntos(Bolsapuntos bolsapuntospuntos){
    this.entityManager.persist(bolsapuntospuntos);


  }


  public void actualizapuntos(Integer puntos,Integer id_cliente){
    Bolsapuntos bp = obtenerPorId(id_cliente);
    Integer puntofinal = bp.getPuntajeAsignado() - puntos;
    bp.setPuntajeUtilizado(puntos);
    bp.setPuntajeAsignado(puntofinal);
    bp.setSaldoPunto(puntofinal);
   this.entityManager.merge(bp);

  }

  public Bolsapuntos obtenerPorId(Integer id){
    Query q= entityManager
      .createQuery("select b from Bolsapuntos  b  WHERE b.cliente.id_cliente = :id")
      .setParameter("id", id);
    return (Bolsapuntos) q.getSingleResult();
  }

  public List<Bolsapuntos> consultaPor(Integer valor) {
    Query q= entityManager
      .createQuery("select b from Bolsapuntos  b  WHERE b.cliente.id_cliente = :id")
      .setParameter("id", valor);
    return (List<Bolsapuntos>) q.getResultList();
  }

  public List<Bolsapuntos> consultaPorPuntos(Integer valor) {
    Query q= entityManager
      .createQuery("select b from Bolsapuntos  b  WHERE b.puntajeAsignado <= :puntos and b.puntajeAsignado >= :puntos")
      .setParameter("puntos", valor);
    return (List<Bolsapuntos>) q.getResultList();
  }
}
