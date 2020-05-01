package br.unibh.backend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Eventokey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_participante")
	Long id_participante;
	 
	@Column(name = "id_ong")
	Long id_ong;
	
}
