package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.CadastroOng;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "CadastroONG", path = "CadastroONG")
public interface CadastroOngCRUD extends CrudRepository <CadastroOng,Long>  {

}
