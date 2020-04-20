package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Evento;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Eventos", path = "Eventos")
public interface EventoCRUD extends CrudRepository <Evento,Long>   {

}
