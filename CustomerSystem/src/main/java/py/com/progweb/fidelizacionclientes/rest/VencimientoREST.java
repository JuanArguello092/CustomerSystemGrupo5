package py.com.progweb.fidelizacionclientes.rest;


import py.com.progweb.fidelizacionclientes.ejb.VencimientoDAO;
import py.com.progweb.fidelizacionclientes.model.Vencimiento;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path(value = "vencimiento")
public class VencimientoREST {

    @Inject
    private VencimientoDAO vencimientoDAO;

    @POST
    @Consumes("application/json")
    public void create(Vencimiento entity) {
        vencimientoDAO.agregar(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes("application/json")
    public void edit(@PathParam("id") Integer id, Vencimiento entity) {
        vencimientoDAO.modificar(id,entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        vencimientoDAO.borrar(id);
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Vencimiento find(@PathParam("id") Integer id) {
        return vencimientoDAO.listarPorId(id);
    }

    @GET
    @Produces("application/json")
    public List<Vencimiento> findAll() {
        return vencimientoDAO.listar();
    }


}
