package br.unibh.backend.entities;


import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_ong")
public class Ong {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id_ong;

	@Column(name = "nome_ong", length = 255)
	private String nome;
		
	@Column(name = "cnpj_ong")
	private String cnpj;	
	
	@Column(name = "cpf_ong")
	private String cpf;	

	@Column(name = "endereco_ong")
	private String endereco;
	
	@Column(name = "email_ong")
	private String email;
	
	@Column(name = "telefone_ong")
	private String telefone;
	
	@Column(name = "senha_ong")
	private String password;
	
    @OneToMany(mappedBy = "Ong")
    Set<Evento> Evento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
