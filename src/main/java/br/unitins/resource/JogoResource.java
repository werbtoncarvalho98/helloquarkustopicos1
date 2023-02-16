package br.unitins.resource;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.unitins.model.Jogo;
import java.util.List;

@Path("/Jogo")
public class JogoResource {
    
    @GET
    @Path("/All")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Jogo> getAll() {
        return Jogo.findAll().list();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Jogo insertJogo(Jogo jogo) {
        jogo.persist();

        return jogo;
    }
}
