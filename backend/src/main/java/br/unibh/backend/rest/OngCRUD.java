package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Ong;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "ONG", path = "ONG")
public interface OngCRUD extends CrudRepository <Ong,Long>  {

}
