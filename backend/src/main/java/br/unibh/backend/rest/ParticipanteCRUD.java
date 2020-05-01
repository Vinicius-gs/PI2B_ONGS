package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Participante;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Participante", path = "Participante")
public interface ParticipanteCRUD extends CrudRepository <Participante,Long>  {

}
