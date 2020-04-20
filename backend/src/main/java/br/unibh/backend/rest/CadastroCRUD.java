package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Cadastro;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Cadastros", path = "Cadastros")
public interface CadastroCRUD extends CrudRepository <Cadastro,Long>  {

}
