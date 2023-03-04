package br.unitins.resource;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.unitins.model.Jogo;
import java.util.List;
import javax.inject.Inject;
import br.unitins.repository.JogoRepository;

@Path("/Jogo")
public class JogoResource {

    JogoRepository repository;

    // Inserir
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Jogo insertJogo(Jogo jogo) {
        jogo.persist();

        return jogo;
    }

    // Alterar
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Jogo updateGame(@PathParam("id") Long id, Jogo jogo) {
        Jogo atualizado = Jogo.findById(id);

        atualizado.setNome(jogo.getNome());
        atualizado.setEstudio(jogo.getEstudio());
        atualizado.setClassificacao(jogo.getClassificacao());
        atualizado.setValor(jogo.getValor());
        atualizado.setLancamento(jogo.getLancamento());

        return atualizado;
    }

    // Deletar
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Jogo deleteJogo(@PathParam("id") Long id, Jogo jogo) {
        Jogo deletado = Jogo.findById(id);
        
        deletado.delete();

        return deletado;
    }

    // Consultar todos
    @GET
    @Path("/All")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Jogo> getAll() {
        return Jogo.findAll().list();
    }

    // Consultar por id
    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Jogo searchJogo(@PathParam("id") Long id) {
        return Jogo.findById(id);
    }

    // Consultar por nome repository
    @GET
    @Path("/{nome}")
    public Jogo searchNomeJogo(@PathParam("nome") String nome) {
        return repository.findByName(nome);
    }

    // Deletar por nome repository
    @DELETE
    @Path("/{nome}")
    @Transactional
    public Jogo deleteNomeJogo(@PathParam("nome") String nome) {
        Jogo delJogo = repository.findByName(nome);

        repository.delete(delJogo);

        return delJogo;
    }
}