package py.com.progweb.fidelizacionclientes.rest;

import py.com.progweb.fidelizacionclientes.ejb.ClienteDAO;
import py.com.progweb.fidelizacionclientes.model.Cliente;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("cliente")
@Consumes("application/json")
@Produces("application/json")

public class ClienteREST {

    @Inject
    private ClienteDAO clienteDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(clienteDAO.lista()).build();
    }

    @POST
    @Path("/")
    public Response crear(Cliente c){
        this.clienteDAO.agregar(c);
    return Response.ok().build();

    }

    @PUT
    @Path("/{id}")
    public Response modificar(@PathParam("id") int id,Cliente c){
        this.clienteDAO.modificar(id,c);
        return Response.ok().build();
    }
}
