package br.unibh.backend.entities;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "tb_cadastro_ong")
public class CadastroOng {

	
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id_ong;

	@Column(nullable = false, length = 255)
	private String nome;
		
	@Column(nullable = true)
	private String cnpj;	
	
	@Column(nullable = false)
	private String cpf;	

	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private String password;
	
	/*@OneToMany(mappedBy = "CadastroOng")
	private Set<Cadastro> Cadastros;

	public Set<Cadastro> getCadastro() {
		return Cadastros;
	}

	public void setCadastro(Set<Cadastro> cadastro) {
		Cadastros = cadastro;
	}*/

	public Long getId_ong() {
		return id_ong;
	}

	public void setId_ong(Long id_ong) {
		this.id_ong = id_ong;
	}

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
