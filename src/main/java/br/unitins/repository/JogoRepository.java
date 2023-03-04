package br.unitins.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.model.Jogo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class JogoRepository implements PanacheRepository<Jogo> {

    public Jogo findByName(String nome) {
        return find("nome", nome).firstResult();
    }

    public List<Jogo> findByNameList(String nome) {
        return find("nome LIKE ?1", "%" + nome + "%").list();
    }
}
